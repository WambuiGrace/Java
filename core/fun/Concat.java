public class Concat {
    public static void main(String[] args) {
        String one = "Hello ";
        String two = "World";

        String three = new StringBuilder(one).append(two).toString();
        System.out.println(three);
        System.out.println("------------------------------------------------------------------------");

        int index = one.indexOf("World");
        System.out.println("Show index:");
        System.out.println(index);
        System.out.println("------------------------------------------------------------------------");

        String compare_one = "abc";
        String compare_two = "ABC";
        String compare_three = "def";
        String compare_four = "abc";

        System.out.println("Compare strings:");
        System.out.println(compare_four.equals(compare_one));
        System.out.println(compare_three.equals(compare_four));
        System.out.println(compare_two.equals(compare_three));
        System.out.println("------------------------------------------------------------------------");

        String start_end = "This is a good day to code";

        System.out.println( start_end.startsWith("This")    );
        System.out.println( start_end.startsWith("This", 5) );

        System.out.println( start_end.endsWith  ("code")    );
        System.out.println( start_end.endsWith  ("shower")  );
        System.out.println("------------------------------------------------------------------------");

        String text = "    This is a trimmed text.";
        String trimmed = text.trim();
        System.out.println(trimmed);
        System.out.println("------------------------------------------------------------------------");

        String   source = "A man drove with a car.";
        String[] occurrences = source.split("a");
        System.out.println(occurrences);
        System.out.println("------------------------------------------------------------------------");

    }
}
