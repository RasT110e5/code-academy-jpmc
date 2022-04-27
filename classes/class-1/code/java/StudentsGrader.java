import java.util.ArrayList;
import java.util.List;

// Every student receives a grade in the inclusive range from 0 to 100.
// Any grade less than 40 is a failing grade.

// Sam is a professor at the university and likes to round each student's according to these rules:
//     - If the difference between the grade and the next multiple of is less than 3, round up to the next multiple of 5.
//     - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. 
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
