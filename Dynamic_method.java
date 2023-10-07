    public class Dynamic_method {
        public void check_pass(String input) {
          int[] check_arr = new int[]{67, 22, 16, 62, 47, 102, 71, 19, 11, 15, 29, 32, 26, 42, 20, 9, 13, 33, 57, 8, 36, 32, 72, 85, 15, 39, 19, 36, 7, 27, 31, 94, 120, 18, 50, 28, 55, 41, 45, 112, 104, 39};
          int tmp = 0;
          if (input.length() == 42 && input.charAt(0) == 'C') {
             for(int i = 1; i < 42; ++i) {
                tmp = i ^ input.charAt(i) ^ input.charAt(i - 1);
                if (tmp != check_arr[i]) {
                   System.out.println("Incorrect password!");
                   System.exit(1);
                }
             }
    
             System.out.println("Good job!");
          } else {
             System.out.println("Incorrect password!");
          }
    
       }
    }

