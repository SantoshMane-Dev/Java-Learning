package Matrix;

import Matrix.MyMatrix;

public class Main {
    public static void main(String[] args) {
        
        MyMatrix m1 = new MyMatrix(2, 2);

        try { 

            m1.set(0, 0, 12);
            m1.set(0, 1, 31);
            m1.set(1, 0, 42);
            m1.set(1, 1, 53);

        } catch(Exception e) {
            
        }

        try { 

            System.out.println(m1.get(0, 0));
            System.out.println(m1.get(0, 1));
            System.out.println(m1.get(1, 0));
            System.out.println(m1.get(1, 1));

        } catch(Exception e) {

        }


    }
}
