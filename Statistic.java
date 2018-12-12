import java.util.Scanner;

public class Statistic{
    public static void main(String[] args){
        System.out.print("请输入一串字符：");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        count(str);
    }
    private static void count(String str){
        String E1 = "[\u4e00-\u9fa5]";/*\u4e00-\u9fa5是用来判断是不是中文的一个条件，采用的是unicode编码查了下中文的unicode的中文编码表第一个“4e00”最后一个“9fa0”总共有20901个汉字，中国文化果然博大精深啊。*/
        String E2 = "[a-zA-Z]";
        String E3 = "[0-9]";
        String E4 = "\\s";
        int countChinese = 0;
        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;
        char[] array_Char = str.toCharArray();
        String[] array_String = new String[array_Char.length];
        for(int i=0;i<array_Char.length;i++)
            array_String[i] = String.valueOf(array_Char[i]);
        for(String s:array_String){
            if(s.matches(E1))
                countChinese++;
            else if(s.matches(E2))
                countLetter++;
            else if(s.matches(E3))
                countNumber++;
            else if(s.matches(E4))
                countSpace++;
            else
                countOther++;
        }
        System.out.println("输入的汉字个数："+countChinese);
        System.out.println("输入的字母个数："+countLetter);
        System.out.println("输入的数字个数："+countNumber);
        System.out.println("输入的空格个数："+countSpace);
        System.out.println("输入的其它字符个数："+countOther);
    }

}
