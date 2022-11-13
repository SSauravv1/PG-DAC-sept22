import java.util.*;
public class Q8 {
    static int check(String jwel,String stone){
        int cout = 0;
        for(int i = 0;i<jwel.length();i++){
            for(int j = 0;j<stone.length();j++){
                if(jwel.charAt(i)==stone.charAt(j)){
                     cout++;
                }
            }
        }
        return cout;

    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("jewels = ");
        String jwel = sc.next();
        System.out.println("stones = ");
        String stone = sc.next();
        System.out.println(check(jwel,stone));
    }
}
