import java.util.ArrayList;
import java.util.List;

public class StudentsGrader {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades)
            roundedGrades.add(roundIfApplicable(grade));
        return roundedGrades;
    }

    private static int roundIfApplicable(int grade) {
        if (grade < 38 || isMultipleOf5(grade)) return grade;
        else return round(grade);
    }

    private static int round(int grade) {
        int nextMultipleOf5 = getNextMultipleOf5(grade);
        int diff = nextMultipleOf5 - grade;
        if (diff < 3) return nextMultipleOf5;
        else return grade;
    }

    private static int getNextMultipleOf5(int grade) {
        int nextMultipleOf5 = grade;
        while (nextMultipleOf5 % 5 != 0)
            nextMultipleOf5++;
        return nextMultipleOf5;
    }

    private static boolean isMultipleOf5(int grade) {
        return grade % 5 == 0;
    }
}
