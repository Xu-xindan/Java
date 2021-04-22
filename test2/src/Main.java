import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(dayIntMonth(month));
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static int dayIntMonth(int month){
        int days;
        switch (month){
            case 2: days = 28;break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30;break;
            default:days = 31;
        }
        return days;
    }
}
