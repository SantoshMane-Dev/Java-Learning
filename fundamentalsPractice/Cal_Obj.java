package fundamentalsPractice;

class calculator 
    {
        public int add(int num1, int num2){
            return num1 + num2;
        }

        public int sub(int num1, int num2){
            return num1 - num2;
        }

        public int multiply(int num1, int num2){
            return num1 * num2;
        }

        public int division(int num1, int num2){
            return num1 / num2;
        }

    }

public class Cal_Obj {
    public static void main(String[] args) {

        calculator calc = new calculator();
        int addResult= calc.add(23, 35);
        int subResult= calc.sub(23, 35);
        int MultiplyResult= calc.multiply(23, 35);
        int DivResult= calc.division(23, 35);

        System.out.println("Adiition: " + addResult);
        System.out.println("Subtraction: " + subResult);
        System.out.println("multiplication: " + MultiplyResult);
        System.out.println("division: " + DivResult);

    }
}
