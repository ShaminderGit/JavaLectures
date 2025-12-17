package JavaLectureSectionFour;

public class ChapterEightLogicalOperators {

    public static void main(String[] args) {
        int age = 20;
        boolean citizen = true;

        // AND operator
        if (age >= 18 && citizen) {
            System.out.println("Eligible to vote");
        }

        // OR operator
        if (age < 18 || !citizen) {
            System.out.println("Not eligible to vote");
        }

        // NOT operator
        boolean isMinor = !(age >= 18);
        System.out.println("Is minor: " + isMinor);
    }
}
