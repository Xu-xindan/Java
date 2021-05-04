import java.util.Scanner;

public class BC11student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split("[,;]");
        String a=String.format("%.2f",Double.parseDouble((strings[1])));
        String b = String.format("%.2f", Double.parseDouble((strings[2])));
        String c = String.format("%.2f", Double.parseDouble((strings[3])));
        System.out.println("The each subject score of  No. " + strings[0] + " is " + a + ", " + b + ", " + c + ".");
    }
}
