package demo;
import java.util.Scanner;

public class TowerOfHanno {
    static int m =0;
    public static void move(int disks,char N,char M)
    {
        System.out.println("第" + (m++) +" 次移动 : " +" 把 "+ disks+" 号圆盘从 " + N +" ->移到->  " + M);
    }
    public static void hanno(int n,char A,char B,char C)
    {
        if(n == 1)
            TowerOfHanno.move(1, A, C);
        else
        {
            hanno(n - 1, A, C, B);
            TowerOfHanno.move(n, A, C);
            hanno(n - 1, B, A, C);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.print("请输入圆盘的个数：");
        int disks = input.nextInt();
        TowerOfHanno.hanno(disks, A, B, C);
        System.out.println("移动了" + m + "次，把A上的圆盘都移动到了C上");
        input.close();
    }

}

