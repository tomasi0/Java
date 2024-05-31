package LMS0328;

public class CourseTeacher {
    String teacherId;
    String courseId;
    public CourseTeacher(){
    }
    public CourseTeacher(String teacherId, String courseId) {
        this.teacherId = teacherId;
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
