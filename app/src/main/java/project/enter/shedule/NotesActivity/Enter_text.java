package project.enter.shedule.NotesActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import project.enter.shedule.R;
import project.enter.shedule.db.DBHelpers;


public class Enter_text extends AppCompatActivity {

    EditText edtKey;
    EditText edtText;
    TextView textDate;
    TextView text;
    DBHelpers dbHelperS;
    int add = 0, position = 0;

    String key_old;

    String KeyText,MainText,DateCreate,formattedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_text);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        edtKey = (EditText)findViewById(R.id.edtKey);
        edtText= (EditText)findViewById(R.id.edtText);
        textDate= (TextView)findViewById(R.id.textDate);
        text= (TextView)findViewById(R.id.text);

        dbHelperS = new DBHelpers(this);

        Intent intent = getIntent();
        if(intent!= null){
            add = intent.getIntExtra("add",-1); // new note
            if(add == 2){
                position = intent.getIntExtra("position",0);
                KeyText = intent.getStringExtra("ketText");
                key_old = intent.getStringExtra("ketText");
                MainText = intent.getStringExtra("mainText");
                DateCreate = intent.getStringExtra("date");
                formattedDate = intent.getStringExtra("date_edit");
                edtKey.setText(KeyText);
                edtText.setText(MainText);
                textDate.setText(DateCreate);
            }
        }

        if(add == 1) {
            Date c = Calendar.getInstance().getTime();
            SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
            String formattedDate = df.format(c);
            DateCreate = formattedDate;
            textDate.setText(formattedDate);
        }
    }

    public void Save(View view) {
        if(add == 1){
            if(!edtKey.getText().toString().equalsIgnoreCase("")) {
                if(edtKey.getText().toString().length() <= 10) {
                    Intent intent1 = new Intent();
                    intent1.putExtra("Key", edtKey.getText().toString());
                    intent1.putExtra("Text", edtText.getText().toString());
                    intent1.putExtra("DateCreate", DateCreate);
                    intent1.putExtra("save", "saved");
                    setResult(RESULT_OK, intent1);
                    finish();
                } else {
                    Toast.makeText(this, "Назва замітки повинна мати не більше 10 символів", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Введіть назву замітки", Toast.LENGTH_SHORT).show();
            }
        } else if(add == 2){
            if(!edtKey.getText().toString().equalsIgnoreCase("")) {
                if(edtKey.getText().toString().length() <= 10) {
                        Date c = Calendar.getInstance().getTime();
                        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                        String formattedDate = df.format(c);

                        Intent intent1 = new Intent();
                        intent1.putExtra("Key", edtKey.getText().toString());
                        intent1.putExtra("key_old", key_old);
                        intent1.putExtra("Text", edtText.getText().toString());
                        intent1.putExtra("Date", DateCreate);
                        intent1.putExtra("Date_EDIT", formattedDate);
                        intent1.putExtra("position", position);
                        intent1.putExtra("save", "saved");
                        setResult(RESULT_OK, intent1);
                        finish();
                } else {
                    Toast.makeText(this, "Назва замітки повинна мати не більше 10 символів", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Введіть назву замітки", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent1 = new Intent();
        intent1.putExtra("save", "Notsave");
        setResult(RESULT_OK, intent1);
        finish();
    }
}
