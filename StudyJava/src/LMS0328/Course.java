package LMS0328;

public class Course {
    int courseId;
    String title;
    int duration;
    String category;
    String difficulty;
    int tuitionFee;

    public Course(){
    }

    public Course(int courseId, String title, int duration, String category, String difficulty, int tuitionFee) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
        this.tuitionFee = tuitionFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String toString(){
        return courseId + " / " + title + " / " + duration + "분" + category
                + " / " + difficulty + " / " + tuitionFee;
    }
}
