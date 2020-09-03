package project.enter.shedule.NotesActivity;

public class ExampleItem {

    private String textDate;
    private String textMain;

    public ExampleItem(String textDate, String textMain) {
        this.textDate = textDate;
        this.textMain = textMain;
    }


    public void changeMainText(String text) {
        textMain = text;
    }

    public String getTextDate() {
        return textDate;
    }

    public String getTextMain() {
        return textMain;
    }
}
