import java.util.*;
public class Q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str = "";
        for(int i = 0;i<str1.length();i++){
            for(int j = 0;j<str2.length();j++){
            if(i%2==0)
                str=str + str1.charAt(i);
            if(j%2!=0)
                str = str + str2.charAt(j);
            }
        }

        System.out.println(str);
    }
}
