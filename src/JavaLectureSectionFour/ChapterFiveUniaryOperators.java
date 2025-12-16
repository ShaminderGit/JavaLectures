package JavaLectureSectionFour;

public class ChapterFiveUniaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        int e = 9;
        // Prefix increment: increases 'a' before using it
        System.out.println("a = " + ++a);
        // Postfix increment: uses 'b' first, then increases it
        System.out.println("b = " + b++);
        // Prefix decrement: decreases 'c' before using it
        System.out.println("c = " + --c);
        // Unary minus: changes the sign of 'd'
        System.out.println("d = " + -d);
        // Postfix increment: prints 'e' first, then increases it
        System.out.println("e = " + e++);
        // Print updated value of 'e' after increment
        System.out.println("e = " + e);

    }
}
