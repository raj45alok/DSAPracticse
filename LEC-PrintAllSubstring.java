package Strings;
import java.util.Scanner;
public class PrintAllSubsring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        for (int i = 0; i < len-1; i++) {
            for (int j = i; j<len; j++) {


                System.out.println(str.substring(i, (j+1)));



            }


        }
    }
}
