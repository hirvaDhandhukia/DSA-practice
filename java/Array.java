import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }

        // multidimentional
        int[][] arr = {{1,2,3}, {4,5,6,7}};
        System.out.println(arr[1][2]);


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) { //i=0&1
           for(int j = 0; j < myNumbers[i].length; ++j) { //when i=0, j ma loop; i=1, j ma again loop 
              System.out.println(myNumbers[i][j]);
           }
        }

        // basics of arrays
        int[] marks = new int[3];
        marks[0] = 92;
        marks[1] = 98;
        marks[2] = 95;
        
        // length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(marks[2]);
    }
}
