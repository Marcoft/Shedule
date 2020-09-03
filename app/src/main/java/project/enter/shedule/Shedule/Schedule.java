package project.enter.shedule.Shedule;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import project.enter.shedule.R;
import project.enter.shedule.TeachersActivity.ExampleAdapterTeachers;
import project.enter.shedule.TeachersActivity.ExampleItemTeachers;
import project.enter.shedule.db.DBHelpers;
import project.enter.shedule.db.DateDbSchedule;

public class Schedule extends AppCompatActivity  {

    RecyclerView recyclerView;

    private ArrayList<ExampleItemSchedule> mExampleList;
    private ExampleAdapterSchedule mAdapter;
    private LinearLayoutManager mLayoutManager;

    DBHelpers dbHelpersl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        recyclerView = findViewById(R.id.recyclerView);
        mExampleList = new ArrayList<>();
        mExampleList.clear();

        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager.setReverseLayout(true);
        //mLayoutManager.setStackFromEnd(true);
        mAdapter = new ExampleAdapterSchedule(mExampleList);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        dbHelpersl = new DBHelpers(this);

        loadActivityPreferences();
        mExampleList.clear();
        day = "monday";
        loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList, mAdapter);

    }

    String faculty = "";
    String course = "";
    String group = "";

    String day = "";
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    mExampleList.clear();
                    switch (item.getItemId()) {
                        case R.id.monday:
                            day = "monday";
                            loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList, mAdapter);
                            break;
                        case R.id.tuesday:
                            day = "tuesday";
                            loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList,mAdapter);
                            break;
                        case R.id.wednesday:
                            day = "wednesday";
                            loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList, mAdapter);
                            break;
                        case R.id.thursday:
                            day = "thursday";
                            loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList , mAdapter);
                            break;
                        case R.id.friday:
                            day = "friday";
                            loadDateToSchedule.loadDate(faculty,course,group, day, dbHelpersl, mExampleList, mAdapter);
                            break;
                    }

                    return true;
                }
            };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    protected void loadActivityPreferences() {
        SharedPreferences activityPreferences = getSharedPreferences("SaveTypeSchelder",Activity.MODE_PRIVATE);
        faculty = activityPreferences.getString("facylty", "" );
        course = activityPreferences.getString("course", "" );
        group = activityPreferences.getString("group", "" );
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}