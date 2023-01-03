import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String swap = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = swap;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[1]);
        System.out.println(array3[2]);

    }
}
