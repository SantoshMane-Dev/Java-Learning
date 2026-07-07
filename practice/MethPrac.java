public class MethPrac {
    public static void main(String[] args) {

        int result = add(2, 15);
        int square = square(12);
        isEven(15);

        System.out.println("Adding : " + result);
        System.out.println("Squaring : " + square);
        if (isEven(161)) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int square(int num1){
        return num1 * num1;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        else {
        return false;
        }
    }

}