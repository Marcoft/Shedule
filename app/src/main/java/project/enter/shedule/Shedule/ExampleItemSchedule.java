package project.enter.shedule.Shedule;

public class ExampleItemSchedule {

    private String startTime;
    private String endTime;
    private String nameSubject;
    private String nameRoom;
    private String nameTeacher;
    private String typeLesson;

    public ExampleItemSchedule(String startTime, String endTime, String nameSubject, String nameRoom, String nameTeacher, String typeLesson) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.nameSubject = nameSubject;
        this.nameRoom = nameRoom;
        this.nameTeacher = nameTeacher;
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

    public String getNameRoom() {
        return nameRoom;
    }

    public String getNameTeacher() {
        return nameTeacher;
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

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getTypeLesson() {
        return typeLesson;
    }

    public void setTypeLesson(String typeLesson) {
        this.typeLesson = typeLesson;
    }
}
