public class Main {
    public static void main(String[] args) {
        int[] ar = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int b = 0, c = 0, d = 0;
        
        for (int i = 0; i < ar.length; i++) {
            b = 0; 
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    b++; 
                }
            }
            if (b > c) { 
                c = b;
                d = ar[i]; 
            }
        }

        System.out.println("Output " + d);
    }
}
