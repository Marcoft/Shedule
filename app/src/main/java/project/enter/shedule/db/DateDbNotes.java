package project.enter.shedule.db;

public class DateDbNotes {

    //Date Notes
    String key_name;
    String text_name;
    String date_create;
    String date_edit;

    public DateDbNotes(){

    }

    public DateDbNotes(String key_name, String text_name, String date_create, String date_edit) {
        this.key_name = key_name;
        this.text_name = text_name;
        this.date_create = date_create;
        this.date_edit = date_edit;
    }

    public String getKey_name() {
        return key_name;
    }

    public String getText_name() {
        return text_name;
    }

    public String getDate_create() {
        return date_create;
    }

    public String getDate_edit() {
        return date_edit;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public void setDate_edit(String date_edit) {
        this.date_edit = date_edit;
    }
}
