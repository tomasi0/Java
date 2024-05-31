package LMS0328;

public class Teacher{
    private String teacherName;
    private String teacherId;
    public Teacher(){
    }
    public Teacher(String teacherName, String teacherId) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String toString(){
        return teacherName + " , " + teacherId;
    }
}
