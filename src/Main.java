import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/16/2023 4:37 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Lutfen oynimak istedigin boyutlari girininz");
        System.out.print("Satir sayi girninz : ");
        row = scan.nextInt();
        System.out.print("sutun sayisi girininz : ");
        col = scan.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(row, col);
        mayin.run();

    }


}
