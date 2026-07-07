package fundamentalsPractice;

import java.util.Scanner;

public class mulTableFunctn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        mulTable(num);

        sc.close();
    }

    public static void mulTable(int num) {
        int i = 1;
        while(i <=10 ) {
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
}

}


