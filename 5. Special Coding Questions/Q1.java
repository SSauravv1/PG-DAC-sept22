import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

        char carr[] = str.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            if (carr[i] > 64 & carr[i] < 90) {
                carr[i] = (char) (carr[i] + 32);
            }
            if (carr[i] > 96 & carr[i] < 123) {
                res = res + carr[i];
            }
        }
        str = "";
        for (int i = (res.length()-1);i>=0;i--){
            str = str + res.charAt(i);
        }
        System.out.println(res.equals(str));
        sc.close();
    }
}
