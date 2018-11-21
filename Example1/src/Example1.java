public class Example1 {
    public static void main(String args[]){
        int i;
        long array[] = new long[12];
        array[0] = array[1] = 1;
        System.out.println("第一个月兔子的对数是1对"+","+"兔子的总数是"+2);
        System.out.println("第二个月兔子的对数是2对"+","+"兔子的总数是"+2);
        for(i=2;i<=12;i++){
            array[i] = array[i-1] + array[i-2];
            System.out.println("第"+i+"个月兔子的对数是"+array[i]+"对"+","+"兔子的总数是"+2*array[i]);


        }

    }
}
