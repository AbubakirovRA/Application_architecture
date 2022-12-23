import java.util.Scanner;

public class Summ{
	public static void main(String[] args){
    	int A = 0;
        int B = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = str.length(); i <= 0; i--) {
            StringBuilder sb = new StringBuilder();
            String a = sb.append(str(i));
            if  (str.charAt(i) == 32){
                i += 1;
                A = (int)a;
            }
        B = (int)a;
        System.out.println(A + B);
        }
        
        
    }
}
