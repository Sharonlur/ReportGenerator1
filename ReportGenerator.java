import java.util.HashMap;

public class ReportGenerator {

    public static void main(String[] args) {
        // Sample data: Student grades
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Life Orientation", 86);
        grades.put("Mathematics", 68);
        grades.put("Physical Sciences", 55);
        grades.put("Life Sciences", 47);
        grades.put("Additional Language", 33);
        grades.put("Geography", 24);
        grades.put("Home Language", 71);

        // Generate report
        generateReport(grades);
    }

    public static void generateReport(HashMap<String, Integer> grades) {
        System.out.println("===== Report =====");
        for (String student : grades.keySet()) {
            int grade = grades.get(student);
            String comment = generateComment(grade);
            System.out.println(student + " - Grade: " + grade + " - Comment: " + comment);
        }
    }

    public static String generateComment(int grade) {
        if (grade >=80) {
            return "Outstanding Achievement";
        } else if (grade >=70 ) {
            return "Meritorious Achievement";
        } else if (grade >=60) {
            return "Substantial Achievement";
        } else if (grade >=50) {
            return "Moderate Achievement";
        } else if (grade >=40) {
            return "Adequate Achievement";
        } if (grade >=30) {
            return "Elementary Achievement";
        } else if (grade >=0) {
            return "Not achieved";
       
    }
        return null;
       
}}