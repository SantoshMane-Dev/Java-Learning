public class StarPattern1 {
    public static void main(String[] args) {


        System.out.println();
        for (int row = 5; row > 0; row--) {
            
            for (int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println("@ ");
        }
    }
}