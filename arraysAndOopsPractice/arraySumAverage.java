package arraysAndOopsPractice;

public class arraySumAverage {
    public static void main(String[] args) {
        System.out.println("-----------------Finding Sum And Average Of Numbers----------------");

        int[] numArray = ArrayUtility.inputArray();

        double sum = sum(numArray);
        long average = average(numArray);
        System.out.println("Sum Of The Numbers Is : "+ sum);
        System.out.println("Average Of The Numbers Is : "+ average);
    

    }    public static double sum(int[] numArray) {
        long sum = 0;
        int i = 0;

        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray) {
        double sum = sum(numArray);

        return (int)sum/numArray.length;
    }
}