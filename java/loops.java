public class loops {
    public static void main(String[] args) {

        int i = 1;
        while(i < 8) {
            System.out.println(i + " ");
            i++;
        }

        for(int j=0; j<5; j++) {
            System.out.print(j + " ");
        }

         System.out.print("\n");
        // foreach
        String[] todo = {"walk dog", "wash clothes", "buy grocerries"};
        for(String x: todo) {
            System.out.println(x);
        } 

        // break & cont
        int y = 0;
        while (y < 10) {
          System.out.println(y);
          y++;
          if (y == 4) {
            break;
          }
        }

        int z = 0;
        while (z < 6) {
            if (z == 4) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;
          
        }
    }
}
