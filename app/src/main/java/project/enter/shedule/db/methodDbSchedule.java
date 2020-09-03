package project.enter.shedule.db;

import java.util.ArrayList;

import project.enter.shedule.Shedule.ExampleItemSchedule;

public interface methodDbSchedule {
    //Methods Schedule
    public void addDataSchedule(DateDbSchedule dateDb);
    public DateDbSchedule getDateSchedule(int id);
    public boolean updateDataSchedule(int id, String startTime, String endTime, String nameSubject, String nameTeacher, String nameRoom, String typeLesson);
    public ArrayList<ExampleItemSchedule> readDataSchedule();
    public void deleteDateSchedule(int id);
}
