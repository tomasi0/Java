package LMS0328;

public class Review {
    int reviewId;
    int rating;
    String text;
    String userId;
    int courseId;

    public Review(int reviewId, int rating, String text, String userId, int courseId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.text = text;
        this.userId = userId;
        this.courseId = courseId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
    public String toString(){
        return userId + ", " + courseId + ", " + rating + ", " + text;
    }
}


