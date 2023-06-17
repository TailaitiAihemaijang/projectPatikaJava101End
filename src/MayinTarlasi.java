import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: MayinTarlasi
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/17/2023 4:23 PM
 * @Version 1.0
 */
public class MayinTarlasi {

    int row, col, size,success = 0;
    int[][] map;
    int[][] borad;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    boolean game = true;

    MayinTarlasi(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new int[row][col];
        this.borad = new int[row][col];
        this.size = row * col;

    }
    public void run(){
        int row,col,success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun basladi !");
        while (game){
            print(borad);
            System.out.print("Satir : ");
            row = scan.nextInt();
            System.out.print("Sutun : ");
            col = scan.nextInt();
            if (map[row][col] != -1){
                check(row,col);
                success++;
                if (success ==(size - (size/4)) ){
                    System.out.println("Basarli");
                    break;
                }
            }else{
                game = false;
                System.out.println("Game Over !");
            }
        }
    }
    public void check(int r,int c){
        if (map[r][c] == 0){
            if ((c < col -1) && map[r][c+1] == -1){
                borad[r][c]++;
            }
            if ((r < row -3) && map[r+1][c] == -1){
                borad[r][c]++;
            }
            if ((r > 0) && (map[r-1][c] == -1)){
                borad[r][c]++;
            }
            if ((c > 0)&& (map[r][c-1] == -1)){
                borad[r][c]++;
            }
            if (borad[r][c] == 0){
                borad[r][c] = -2;
            }
       }
    }
    public void prepareGame(){
        int randRow,ranCol,conut = 0;
        while (conut != (size / 4)){
            randRow = rand.nextInt(row);
            ranCol = rand.nextInt(row);
            if (map[randRow][ranCol] != -1){
                map[randRow][ranCol] = -1;
                conut++;
            }
        }
    }
    public void print(int[][] arr){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[0].length;j++){
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                    System.out.print(arr[i][j] + " ");
            } System.out.println();
        }
    }
}
