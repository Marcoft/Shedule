package project.enter.shedule.NotesActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator;
import project.enter.shedule.R;
import project.enter.shedule.db.DBHelpers;
import project.enter.shedule.db.DateDbNotes;

public class Notes extends AppCompatActivity  {

    private ArrayList<ExampleItem> mExampleList;

    DBHelpers dbHelperS;

    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String NAME_K = ""; // from database
    String NAME_T = "";
    String DATE_CREATE = "";
    String DATE_EDITED = "";

    SearchView searchViewMain;

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        mExampleList = new ArrayList<>();
        dbHelperS = new DBHelpers(this);

        readDate();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerMain);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String key = mExampleList.get(position).getTextMain();
                DateDbNotes dateDbNotes = dbHelperS.getDate(key);

                NAME_K = key;
                NAME_T = dateDbNotes.getText_name();
                DATE_CREATE = dateDbNotes.getDate_create();
                DATE_EDITED = dateDbNotes.getDate_edit();

                searchViewMain.setQuery("", false);
                searchViewMain.clearFocus();

                Intent intent = new Intent(getApplicationContext(), Enter_text.class);
                intent.putExtra("add",2); // key for new note
                intent.putExtra("position", position);
                intent.putExtra("ketText", NAME_K);
                intent.putExtra("mainText", NAME_T);
                intent.putExtra("date", DATE_CREATE);
                intent.putExtra("date_edit", DATE_EDITED);
                startActivityForResult(intent, 2);

             }
            });

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(mRecyclerView);
        searchView();
    }

    //Swipe element
    ExampleItem deletedMovie = null;
    List<ExampleItem> archivedMovies = new ArrayList<ExampleItem>();

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, /*ItemTouchHelper.LEFT | */ ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull final RecyclerView.ViewHolder viewHolder, int direction) {

            final int position = viewHolder.getAdapterPosition();

            switch (direction) {
                case ItemTouchHelper.RIGHT:
                    deletedMovie = mExampleList.get(position);
                    deleteDateFromDb(position);
                    mExampleList.remove(position);
                    mAdapter.notifyItemRemoved(position);

                    final Snackbar snackbar = Snackbar.make(mRecyclerView, deletedMovie.getTextMain() + ", Видалено.", Snackbar.LENGTH_LONG);
                    snackbar.setAction("Скасувати", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mExampleList.add(position, deletedMovie);
                            mAdapter.notifyItemInserted(position);

                            returnDateInBd();
                        }
                    }).show();

                    break;

            }
        }

        @Override
        public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {

            new RecyclerViewSwipeDecorator.Builder(Notes.this, c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
                    .addSwipeRightBackgroundColor(ContextCompat.getColor(Notes.this, R.color.SwipeDecorator))
                    .addSwipeRightActionIcon(R.drawable.ic_delete)
                    //.addSwipeLeftBackgroundColor(ContextCompat.getColor(ChoiseTotalStats.this, R.color.colorPrimaryDark))
                    //.addSwipeLeftActionIcon(R.drawable.ic_archive_black_24dp)
                    .setActionIconTint(ContextCompat.getColor(recyclerView.getContext(), android.R.color.white))
                    .create()
                    .decorate();

            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        }

    };

    // Delete and Return date

    DateDbNotes saveDateDbNotesStats = null;
    String keyS;
    String textS;
    String dateCreatedS;
    String DateChangedS;

    private void deleteDateFromDb(int position){
        String PositionDontChange = "";

        PositionDontChange = mExampleList.get(position).getTextMain();

        saveDateDbNotesStats = dbHelperS.getDate(PositionDontChange);

        keyS = saveDateDbNotesStats.getKey_name();
        textS = saveDateDbNotesStats.getText_name();
        dateCreatedS = saveDateDbNotesStats.getDate_create();
        DateChangedS = saveDateDbNotesStats.getDate_edit();

        dbHelperS.deleteDate(PositionDontChange);
    }

    private void returnDateInBd(){
        dbHelperS.addData(new DateDbNotes(keyS,textS,dateCreatedS,DateChangedS));
    }

    private void readDate(){
        mExampleList.clear();
        mExampleList = dbHelperS.readData();
    }

    public void Add(View view) {
        Intent intent = new Intent(getApplicationContext(),Enter_text.class);
        intent.putExtra("add",1); // key for new note
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(data!= null){
                String save = data.getStringExtra("save");
                if (save != null && save.equalsIgnoreCase("saved")) {
                    String KeyText = data.getStringExtra("Key");
                    String MainText = data.getStringExtra("Text");
                    String DateCreate = data.getStringExtra("DateCreate");

                    mExampleList.add(new ExampleItem(DateCreate, KeyText));
                    mAdapter.notifyDataSetChanged();

                    dbHelperS.addData(new DateDbNotes(KeyText, MainText, DateCreate, DateCreate));
                }
            }
        }
        else if(requestCode == 2){
            if(data!= null){
                String save = data.getStringExtra("save");
                if (save != null && save.equalsIgnoreCase("saved")) {
                  String KeyText = data.getStringExtra("Key");
                  String key_old = data.getStringExtra("key_old");
                  String MainText = data.getStringExtra("Text");
                  String Date = data.getStringExtra("Date");
                  String formattedDate = data.getStringExtra("Date_EDIT");
                  int position = data.getIntExtra("position",-1);

                if (position != -1) {
                    changeItem(position,KeyText);
                    dbHelperS.updateData(key_old, KeyText, MainText, Date, formattedDate);
                }
             }
            }
        }
    }

    public void changeItem(int position,String text) {
        mExampleList.get(position).changeMainText(text);
        mAdapter.notifyItemChanged(position);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    private void searchView(){
        // Search View
        searchViewMain = findViewById(R.id.searchViewMain);
        searchViewMain.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchViewMain.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}