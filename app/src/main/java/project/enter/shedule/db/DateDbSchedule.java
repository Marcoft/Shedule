package project.enter.shedule.db;

public class DateDbSchedule {

    int id;
    String startTime;
    String endTime;
    String nameSubject;
    String nameTeacher;
    String nameRoom;
    String typeLesson;

    public DateDbSchedule(){

    }

    public DateDbSchedule(int id, String startTime, String endTime, String nameSubject, String nameTeacher, String nameRoom, String typeLesson) {
        this.startTime = startTime;
        this.id = id;
        this.endTime = endTime;
        this.nameSubject = nameSubject;
        this.nameTeacher = nameTeacher;
        this.nameRoom = nameRoom;
        this.typeLesson = typeLesson;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public String getTypeLesson() {
        return typeLesson;
    }

    public int getId() {
        return id;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public void setTypeLesson(String typeLesson) {
        this.typeLesson = typeLesson;
    }

    public void setId(int id) {
        this.id = id;
    }
}
