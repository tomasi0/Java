package LMS0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos() {
        User user1 = new User("Steve", "hero11", "cktmdgus"
                , "010-0000-0001", "steave@email.com", "연무", "student"
                , LocalDate.of(1998, 12, 20));
        User user2 = new User("Tomasi", "MilanKundera", "ghkddlscks"
                , "010-0000-0002", "tomasi@email.com", "세종", "student"
                , LocalDate.of(1998, 8, 21));
        User user3 = new User("Seabbak", "LeeSeabbak", "dltpgud"
                , "010-0000-0003", "seabbak@email.com", "당진", "instructor"
                , LocalDate.of(1999, 7, 29));
        User user4 = new User("KuakBob", "Dalsup", "rhkranstjq"
                , "010-0000-0004", "kuakbob@email.com", "신탄진", "student"
                , LocalDate.of(1998, 11, 16));
        User user5 = new User("JeaHun", "Cutyhun", "gkswogns"
                , "010-0000-0005", "jeahun@email.com", "파주", "student"
                , LocalDate.of(1998, 1, 12));

        Course course1 = new Course(1, "Java", 100, "Programing", "beginner", 1000);
        Course course2 = new Course(2, "Spring", 80, "Programing", "intermediate", 800);
        Course course3 = new Course(3, "Javascript", 70, "Programing", "beginner", 700);

        ArrayList<CourseRegistrations> courseRegistrations = new ArrayList<>();
        CourseRegistrations courseRegistrations1 = new CourseRegistrations("hero11", 1);
        courseRegistrations.add(courseRegistrations1);
        CourseRegistrations courseRegistrations2 = new CourseRegistrations("MilanKundera", 2);
        courseRegistrations.add(courseRegistrations2);
        CourseRegistrations courseRegistrations3 = new CourseRegistrations("LeeSeabbak", 1);
        courseRegistrations.add(courseRegistrations3);
        CourseRegistrations courseRegistrations4 = new CourseRegistrations("Dalsup", 3);
        courseRegistrations.add(courseRegistrations4);
        CourseRegistrations courseRegistrations5 = new CourseRegistrations("Cutyhun", 1);
        courseRegistrations.add(courseRegistrations5);

        System.out.println(courseRegistrations);
    }
}