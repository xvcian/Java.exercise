import java.util.Scanner;

    public class Purchase {

    private double groundPrice;
    private int groundCount;
    private int numberBought;
    private String name;/*�����˼��������������ͣ��������ͣ��ַ�����*/

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
    }/*������:���������С��0���������*/

    public void setNumberBought(int number) {
        if (number <= 0) {
            System.out.println("");
            System.exit(0);/*������ͬ��*/
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
        groundPrice = keyboard.nextDouble();/*��ȡ��Ҫ���������ƣ������͵���*/
        while (groundCount <= 0 && groundPrice <= 0) {
            System.out.println("Both numvers must be positive. Try again.");
            System.out.println("Enter price of item as two numbers.");
            System.out.println("For example, 3 for $2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now:");
            groundCount = keyboard.nextInt();
            groundPrice = keyboard.nextDouble();
        }/*������:������ĵ��ۺ������Ŀ��С����ʱ���������һ��*/

        System.out.println("please enter the number bought");
        numberBought = keyboard.nextInt();
        while (numberBought <= 0) {
            System.out.println("");
            System.out.println("");
            numberBought = keyboard.nextInt();
        }/*��ȡһ���������д�����*/
        writeOutput();/*����һ���������*/
    }

    public void writeOutput() {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groundCount + "for $" + groundPrice);
    }/*���Ҫ�����������Ʒ����*/

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

/*����ܼۣ��ɱ�����������*/
