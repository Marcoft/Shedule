package project.enter.shedule.TeachersActivity;

public class ExampleItemTeachers {

    private String PIB;
    private String speciality;
    private String subject;
    private int teachersPhoto;

    public ExampleItemTeachers(String PIB, String speciality, String subject, int teachersPhoto) {
        this.PIB = PIB;
        this.speciality = speciality;
        this.subject = subject;
        this.teachersPhoto = teachersPhoto;
    }

    public String getPIB() {
        return PIB;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getSubject() {
        return subject;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeachersPhoto() {
        return teachersPhoto;
    }

    public void setTeachersPhoto(int teachersPhoto) {
        this.teachersPhoto = teachersPhoto;
    }
}
