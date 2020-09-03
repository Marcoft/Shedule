package project.enter.shedule.db;

import java.util.ArrayList;
import java.util.List;

import project.enter.shedule.NotesActivity.ExampleItem;

public interface methodDbNotes {
    //Methods Notes
    public void addData(DateDbNotes dateDbNotes);
    public DateDbNotes getDate(String key);
    public List<DateDbNotes> getAllContacts();
    public boolean updateData(String key_old, String Name_k, String Name_t ,String Date,String DATE_EDIT);
    public ArrayList<ExampleItem> readData();
    public void deleteDate(String key);

}
