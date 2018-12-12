import java.util.Scanner;

public class BallReround{
    public static void main(String[] args){
        System.out.print("请输入小球落地时的高度和求解的次数：");
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        distance(h,n);
    }
    private static void distance(int h,int n){
        double length = 0;
        for(int i=0;i<n;i++){
            length = length+h;
            h = h/=2;
        }
        System.out.println("经过第"+n+"次反弹后，小球共经过"+length+"米，"+"第"+n+"次反弹高度为"+h+"米");
    }
}
