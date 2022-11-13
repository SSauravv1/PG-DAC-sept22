import java.util.*;
public class Q6 {
    public String longestCommonPrefix(String[] str) {
		if (str.length == 0) return "";
		String prefix = str[0];
		for (int i = 1; i < str.length; i++)
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}        
		return prefix;
	}
    public static void main(String args[]){
        Q6 ob = new Q6();
        Scanner sc = new Scanner(System.in);
        System.out.println("No of inputs: ");
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i = 0;i <n;i++){
            str[i] = sc.next();     
        }
        System.out.println(ob.longestCommonPrefix(str));

    }
}

