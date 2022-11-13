import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char carr[] = str.toCharArray();
        int couth = 0 ;
        int coutv = 0 ;
        for(int i = 0;i<carr.length;i++){
            if(carr[i]=='L'){couth++;};
            if(carr[i]=='R'){couth--;};
            if(carr[i]=='U'){coutv++;};
            if(carr[i]=='D'){coutv--;};
        }
        if (coutv == 0 && couth == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
