package LMS0328;

public class CourseRegistrations {
    String userId;
    int courseId;

    public CourseRegistrations() {
    }

    public CourseRegistrations(String userId, int courseId) {
        this.userId = userId;
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
