package TernaryAndRecursion;

public class EvenPrintOnly {
    public static void main(String[] args) {
        
        System.out.println("-----------Print Only Even Number Skip Odd Numbers------------");
        
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 ){
                continue;
            }
            System.out.print(i + " \n");
        }

    }
}
