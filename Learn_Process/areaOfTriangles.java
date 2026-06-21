package Learn_Process;

import java.util.Scanner;

public class areaOfTriangles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        double areaOfTriangle = 0.5 * base * height;

        System.out.println("Area Of Triangle: " +areaOfTriangle);

        sc.close();
    }
}
