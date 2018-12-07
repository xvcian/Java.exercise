import java.util.Scanner;

    public class Purchase {

    private double groundPrice;
    private int groundCount;
    private int numberBought;
    private String name;/*定义了几个变量，整数型，浮点数型，字符串型*/

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(int count, double costForCount) {
        if ((count <= 0) || (costForCount <=  0)) {
            System.out.println("");
            System.exit(0);
        } else {
            groundCount = count;
            groundPrice = costForCount;
        }
    }/*错误处理:输入的数据小于0，则输出空*/

    public void setNumberBought(int number) {
        if (number <= 0) {
            System.out.println("");
            System.exit(0);/*错误处理，同上*/
        } else
            numberBought = number;
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of item you are purchasing: ");
        name = keyboard.nextLine();
        System.out.println("Enter price of item as two numbers.");
        System.out.println("For example, 3 for $2.99 is entered as");
        System.out.println("3 2.99");
        System.out.println("Enter price of item as two numbers, now:");
        groundCount = keyboard.nextInt();
        groundPrice = keyboard.nextDouble();/*读取你要买的物件名称，数量和单价*/
        while (groundCount <= 0 && groundPrice <= 0) {
            System.out.println("Both numvers must be positive. Try again.");
            System.out.println("Enter price of item as two numbers.");
            System.out.println("For example, 3 for $2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now:");
            groundCount = keyboard.nextInt();
            groundPrice = keyboard.nextDouble();
        }/*错误处理:当输入的单价和物件数目都小于零时，输出再试一次*/

        System.out.println("please enter the number bought");
        numberBought = keyboard.nextInt();
        while (numberBought <= 0) {
            System.out.println("");
            System.out.println("");
            numberBought = keyboard.nextInt();
        }/*读取一个数并进行错误处理*/
        writeOutput();/*定义一个输出函数*/
    }

    public void writeOutput() {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groundCount + "for $" + groundPrice);
    }/*输出要买的数量和商品名称*/

    public String getName() {
        return name;
    }

    public double getTotalCost() {
        return ((groundPrice / groundCount) * numberBought);
    }

    public double getUnitCost() {
        return (groundPrice / groundCount);
    }

    public int getNumberBought() {
        return numberBought;
    }

/*求得总价，成本，购买数量*/
