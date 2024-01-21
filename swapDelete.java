import java.util.Scanner;
public class swapDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 

        while (t-- > 0) {
            String s = scanner.nextLine();
            long z = 0, a = 0;

            for (int p = 0; p < s.length(); p++) {
                z += (s.charAt(p) == '0' ? 1 : 0);
                a += (s.charAt(p) == '1' ? 1 : 0);
            }

            long ans = 0;
            for (int p = 0; ans == 0 && p < s.length(); p++) {
                if (s.charAt(p) == '1') {
                    if (z > 0) {
                        z--;
                    } else {
                        ans = s.length() - p;
                        break;
                    }
                } else if (s.charAt(p) == '0') {
                    if (a > 0) {
                        a--;
                    } else {
                        ans = s.length() - p;
                        break;
                    }
                }
            }

            System.out.println(ans);
        }   
        
    }
    
}
