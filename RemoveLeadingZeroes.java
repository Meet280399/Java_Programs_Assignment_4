package Assignment_4;
import java.util.Scanner;

public class RemoveLeadingZeroes {
        public static String removeLeadingZeroes(String str) {
            String strPattern = "^0+(?!$)";
            str = str.replaceAll(strPattern, "");
            return str;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            String num = sc.next();
            String result = RemoveLeadingZeroes.removeLeadingZeroes(num);
            System.out.println(result);
        }
    }

