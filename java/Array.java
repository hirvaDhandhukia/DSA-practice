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
    }
}
