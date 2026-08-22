package Learning_Programs.CollectionsAndGenerics;

public class VarArgs {
    public static void main(String[] args) {
        // System.out.println(sum(5, 04, 4,4,2,5,6,345));

        concatStrings("Santosh", "Mane", "Is", "Living", "Being");
    }

    public static int sum(int num1, int num2, int... a) {
        int sum = num1 + num2;

        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void concatStrings(String... str) {
        for (String read : str) {
            System.out.printf("%s ", read.toString());
        }
        System.out.println();
    }
}
