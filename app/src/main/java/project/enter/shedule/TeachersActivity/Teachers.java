package project.enter.shedule.TeachersActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import project.enter.shedule.R;

public class Teachers extends AppCompatActivity  {

    RecyclerView recyclerView;

    private ArrayList<ExampleItemTeachers> mExampleList;
    private ExampleAdapterTeachers mAdapter;
    private LinearLayoutManager mLayoutManager;


    SearchView searchViewMain;


    // Запуск активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        // Обьявляем переменные
        recyclerView = findViewById(R.id.recyclerView);
        searchViewMain = findViewById(R.id.searchViewMain);
        // Сосздаем список для преподователей
        mExampleList = new ArrayList<>();
        mExampleList.clear();

        // Создаем ячейку для меню
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            // Добавляем в меню кнопку назад
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        insertTeachers();

        // Настраиваем список
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager.setReverseLayout(true);
        //mLayoutManager.setStackFromEnd(true);
        mAdapter = new ExampleAdapterTeachers(mExampleList);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        searchView();


    }

    // Переопределяем кнопку назад в Меню, чтобы закрыть активити
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


    // Настраиваем фильтр поисковой строки
    private void searchView(){
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


    // Заполняем список преподователями
    private void insertTeachers() {
        mExampleList.add(new ExampleItemTeachers("Баранов Георгій Леонідович", "професор", "Кафедра інформаційних систем і технологій",R.drawable.baranov));
        mExampleList.add(new ExampleItemTeachers("Безверхий Олександр Ігорович", "професор", "Кафедра інформаційних систем і технологій", R.drawable.bezverhij));
        mExampleList.add(new ExampleItemTeachers("Вітер Михайло Богданович", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.viter));
        mExampleList.add(new ExampleItemTeachers("Гавриленко Валерій Володимирович", "професор", "Кафедра інформаційних систем і технологій", R.drawable.gavrilenko));
        mExampleList.add(new ExampleItemTeachers("Донець Вероніка Василівна", "старший викладач", "Кафедра інформаційних систем і технологій", R.drawable.donec));
        mExampleList.add(new ExampleItemTeachers("Зубрецька Наталія Анатоліївна", "професор", "Кафедра інформаційних систем і технологій", R.drawable.zubreckaya));
        mExampleList.add(new ExampleItemTeachers("Ковальчук Оксана Петрівна", "старший викладач", "Кафедра інформаційних систем і технологій", R.drawable.kovalchuk11));
        mExampleList.add(new ExampleItemTeachers("Котетунов Віктор Юрійович", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.kotetunov));
        mExampleList.add(new ExampleItemTeachers("Лагодіна Людмила Петрівна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.lagodina));
        mExampleList.add(new ExampleItemTeachers("Парохненко Любов Михайлівна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.porohnenko));
        mExampleList.add(new ExampleItemTeachers("Сватко Віталій Володимирович", "старший викладач", "Кафедра інформаційних систем і технологій", R.drawable.svatko));
        mExampleList.add(new ExampleItemTeachers("Силенок Ганна Анатоліївна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.silenok));
        mExampleList.add(new ExampleItemTeachers("Сисак Катерина Ярославівна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.sysak));
        mExampleList.add(new ExampleItemTeachers("Сілантьєва Юлія Олександрівна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.silantieva));
        mExampleList.add(new ExampleItemTeachers("Тітова Наталія Володимирівна", "професор", "Кафедра інформаційних систем і технологій", R.drawable.titova));
        mExampleList.add(new ExampleItemTeachers("Топольськов Євген Олександрович", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.topolskov));
        mExampleList.add(new ExampleItemTeachers("Федін Сергій Сергійович", "професор", "Кафедра інформаційних систем і технологій", R.drawable.fedin));
        mExampleList.add(new ExampleItemTeachers("Харитонова Леся Василівна", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.haritonova));
        mExampleList.add(new ExampleItemTeachers("Шумейко Олексій Андрійович", "доцент", "Кафедра інформаційних систем і технологій", R.drawable.shumejko));
        mExampleList.add(new ExampleItemTeachers("Щербак Тетяна Миколаївна", "старший викладач", "Кафедра інформаційних систем і технологій", R.drawable.cherbak));
    }


    // Переопределяем кнопку назад, чтобы при нажатии на нее, активность закрылась
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


}