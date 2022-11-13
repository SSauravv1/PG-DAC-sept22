import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cout = 0;
        char carr[] = str.toCharArray();
        if (carr[0] > 64 & carr[0] < 90) {
            cout = 0;
        } 
        else {
            for (int i = 1; i < carr.length; i++) {
                if (carr[i] > 64 & carr[i] < 90) {
                    cout++;
                }
            }
        }
        if (cout == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}