package project.enter.shedule.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import project.enter.shedule.NotesActivity.ExampleItem;
import project.enter.shedule.Shedule.ExampleItemSchedule;

public class DBHelpers extends SQLiteOpenHelper
        implements methodDbNotes,methodDbSchedule
{

    // Database Name
    private static final String DATABASE_NAME = "Database";

    public static final String TABLE_NAME = "schedule_bd";
    public static final String ID_SCHEDULE = "id_schedule";
    public static final String START_TIME = "start_time";
    public static final String END_TIME = "end_time";
    public static final String NAME_SUBJECT = "name_subject";
    public static final String NAME_TEACHER = "name_teacher";
    public static final String NAME_ROOM = "name_room";
    public static final String TYPE_LESSON = "type_lesson";

    public static final String TABLE_CONTACTS = "notesTable";
    public static final String KEY_NAME_KEY = "key_name";
    public static final String KEY_NAME_TEXT = "text_name";
    public static final String KEY_DATE_CREATE = "date_create";
    public static final String KEY_DATE_EDITED = "date_edit";


    public DBHelpers(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE schedule_bd (" + DBHelpers.ID_SCHEDULE + " INTEGER PRIMARY KEY, " +
                 DBHelpers.START_TIME + " VARCHAR(30) , " +
                "" + DBHelpers.END_TIME + " VARCHAR(30), " +
                   DBHelpers.NAME_SUBJECT + " VARCHAR(50), " +
                DBHelpers.NAME_TEACHER + " VARCHAR(50), " +
                DBHelpers.NAME_ROOM + " VARCHAR(30), " +
                DBHelpers.TYPE_LESSON + " VARCHAR(30));");

        db.execSQL("CREATE TABLE notesTable (" + DBHelpers.KEY_NAME_KEY
                + " VARCHAR(30) PRIMARY KEY, " + DBHelpers.KEY_NAME_TEXT
                + " VARCHAR(200), " + DBHelpers.KEY_DATE_CREATE
                + " VARCHAR(30), " + DBHelpers.KEY_DATE_EDITED
                + " VARCHAR(30));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS notesTable");
        db.execSQL("DROP TABLE IF EXISTS shedule_bd");
        onCreate(db);
    }


    //TODO SCHEDULE

    @Override
    public void addDataSchedule(DateDbSchedule dateDb) {
        SQLiteDatabase db = null;

        try {
            db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(DBHelpers.ID_SCHEDULE, dateDb.getId());
            values.put(DBHelpers.START_TIME, dateDb.getStartTime());
            values.put(DBHelpers.END_TIME, dateDb.getEndTime());
            values.put(DBHelpers.NAME_SUBJECT, dateDb.getNameSubject());
            values.put(DBHelpers.NAME_TEACHER, dateDb.getNameTeacher());
            values.put(DBHelpers.NAME_ROOM, dateDb.getNameRoom());
            values.put(DBHelpers.TYPE_LESSON, dateDb.getTypeLesson());

            db.insert("schedule_bd", null, values);
            db.close();
        } catch (SQLiteException e) {
            if (db != null) {
                db.close();
            }
            e.printStackTrace();
        }
    }

    @Override
    public DateDbSchedule getDateSchedule(int id) {
        SQLiteDatabase db = null;
        try {
            db = this.getReadableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }

        Cursor cursor = null;
        if (db != null) {
            cursor = db.query("schedule_bd", new String[] {"id_schedule","start_time","end_time","name_subject","name_teacher","name_room","type_lesson"
                    }, "id_schedule =?", new String[]{String.valueOf(id)}
                    , null, null, null, null);
        }
        if (cursor != null){
            cursor.moveToFirst();
        }

        DateDbSchedule dateDbNotes = null;
        if (cursor != null) {
            dateDbNotes = new DateDbSchedule(cursor.getInt(0), cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6));
        }

        if (cursor != null) {
            cursor.close();
        }
        if (db != null) {
            db.close();
        }

        return dateDbNotes;
    }

    @Override
    public boolean updateDataSchedule(int id, String startTime, String endTime, String nameSubject, String nameTeacher, String nameRoom, String typeLesson) {
        SQLiteDatabase db = null;

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBHelpers.ID_SCHEDULE, id);
        values.put(DBHelpers.START_TIME, startTime);
        values.put(DBHelpers.END_TIME, endTime);
        values.put(DBHelpers.NAME_SUBJECT, nameSubject);
        values.put(DBHelpers.NAME_TEACHER, nameTeacher);
        values.put(DBHelpers.NAME_ROOM, nameRoom);
        values.put(DBHelpers.TYPE_LESSON, typeLesson);

        long result = db.update(DBHelpers.TABLE_NAME, values, "key_name = ?", new String[]{String.valueOf(id)});

        if (result == -1) {
            //Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            //Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    @Override
    public ArrayList<ExampleItemSchedule> readDataSchedule() {
        ArrayList<ExampleItemSchedule> mExampleList = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor2 = db.query(DBHelpers.TABLE_NAME,null,null,null,null,null,null);
        if(cursor2.moveToFirst()){
            int id = cursor2.getColumnIndex(DBHelpers.ID_SCHEDULE);
            int startTime = cursor2.getColumnIndex( DBHelpers.START_TIME);
            int endTime = cursor2.getColumnIndex(DBHelpers.END_TIME);
            int nameSubject = cursor2.getColumnIndex(DBHelpers.NAME_SUBJECT);
            int nameTeacher = cursor2.getColumnIndex(DBHelpers.NAME_TEACHER);
            int nameRoom = cursor2.getColumnIndex(DBHelpers.NAME_ROOM);
            int typeLesson = cursor2.getColumnIndex(DBHelpers.TYPE_LESSON);

            do{
                int Id = cursor2.getInt(id);
                String StartTime = cursor2.getString(startTime);
                String EndTime = cursor2.getString(endTime);
                String NameSubject = cursor2.getString(nameSubject);
                String NameTeacher = cursor2.getString(nameTeacher);
                String NameRoom = cursor2.getString(nameRoom);
                String TypeLesson = cursor2.getString(typeLesson);

                mExampleList.add(new ExampleItemSchedule(StartTime,EndTime,NameSubject,NameTeacher,NameRoom,TypeLesson));

            } while(cursor2.moveToNext());
        }
        cursor2.close();

        return mExampleList;
    }

    @Override
    public void deleteDateSchedule(int id) {
        SQLiteDatabase db = null;

        try {
            db = this.getWritableDatabase();
            String[] args = new String[]{String.valueOf(id)};
            db.delete("schedule_bd", "id_schedule" + "=?", args);

            db.close();
        } catch (SQLiteException e) {
            if (db != null) {
                db.close();
            }
            e.printStackTrace();
        }
    }


   //TODO NOTES
    @Override
    public void addData(DateDbNotes dateDbNotes) {
        SQLiteDatabase db = null;

        try {
            db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("key_name", dateDbNotes.getKey_name());
            values.put("text_name", dateDbNotes.getText_name());
            values.put("date_create", dateDbNotes.getDate_create());
            values.put("date_edit", dateDbNotes.getDate_edit());

            db.insert("notesTable", null, values);
            db.close();
        } catch (SQLiteException e) {
            if (db != null) {
                db.close();
            }
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateData(String key_old, String Name_k, String Name_t ,String Date,String DATE_EDIT){
        SQLiteDatabase db = null;

        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBHelpers.KEY_NAME_KEY,Name_k);
        contentValues.put(DBHelpers.KEY_NAME_TEXT,Name_t);
        contentValues.put(DBHelpers.KEY_DATE_CREATE,Date);
        contentValues.put(DBHelpers.KEY_DATE_EDITED,DATE_EDIT);

        long result = db.update(DBHelpers.TABLE_CONTACTS, contentValues, "key_name = ?", new String[]{ key_old });

        if (result == -1) {
            //Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            //Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    @Override
    public ArrayList<ExampleItem> readData(){
        ArrayList<ExampleItem> mExampleList = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor2 = db.query(DBHelpers.TABLE_CONTACTS,null,null,null,null,null,null);
        if(cursor2.moveToFirst()){
            int Name_KEY = cursor2.getColumnIndex(DBHelpers.KEY_NAME_KEY);
            int Name_TEXT = cursor2.getColumnIndex( DBHelpers.KEY_NAME_TEXT);
            int Date= cursor2.getColumnIndex(DBHelpers.KEY_DATE_CREATE);
            int Date_EDIT= cursor2.getColumnIndex(DBHelpers.KEY_DATE_EDITED);

            do{
                String NAME_K = cursor2.getString(Name_KEY);
                String NAME_T = cursor2.getString(Name_TEXT);
                String DATE_CREATE = cursor2.getString(Date);
                String DATE_EDITED = cursor2.getString(Date_EDIT);

                if(!NAME_K.equalsIgnoreCase("") && NAME_K!= null)
                    mExampleList.add(new ExampleItem(DATE_EDITED,NAME_K));
                else  mExampleList.add(new ExampleItem(DATE_EDITED,NAME_T));

            } while(cursor2.moveToNext());
        }
        cursor2.close();

        return mExampleList;
    }

    @Override
    public void deleteDate(String key) {
        SQLiteDatabase db = null;

        try {
            db = this.getWritableDatabase();
            String[] args = new String[]{key};
            db.delete("notesTable", "key_name" + "=?", args);

            db.close();
        } catch (SQLiteException e) {
            if (db != null) {
                db.close();
            }
            e.printStackTrace();
        }
    }

    @Override
    public DateDbNotes getDate(String key) {
        SQLiteDatabase db = null;
        try {
            db = this.getReadableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }

        Cursor cursor = null;
        if (db != null) {
            cursor = db.query("notesTable", new String[] {"key_name","text_name","date_create","date_edit"}, "key_name =?", new String[]{ key }
                            , null, null, null, null);
        }
        if (cursor != null){
            cursor.moveToFirst();
        }

        DateDbNotes dateDbNotes = null;
        if (cursor != null) {
            dateDbNotes = new DateDbNotes(cursor.getString(0), cursor.getString(1),cursor.getString(2),cursor.getString(3));
        }

        if (cursor != null) {
            cursor.close();
        }
        if (db != null) {
            db.close();
        }

        return dateDbNotes;
    }

    @Override
    public List<DateDbNotes> getAllContacts() {
        List<DateDbNotes> datelist = new ArrayList<DateDbNotes>();
        String selectQuery = "SELECT  * FROM " + "notesTable";

        SQLiteDatabase db = null;
        try {
            db = this.getReadableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(selectQuery, null);
        }

        if (cursor != null && cursor.moveToFirst()) {
            do {
                DateDbNotes date = new DateDbNotes();
                date.setKey_name(cursor.getString(0));
                date.setText_name(cursor.getString(1));
                date.setDate_create(cursor.getString(2));
                date.setDate_edit(cursor.getString(3));

                datelist.add(date);
            } while (cursor.moveToNext());
        }

        if (cursor != null) {
            cursor.close();
        }
        if (db != null) {
            db.close();
        }

        return datelist;
    }


}
