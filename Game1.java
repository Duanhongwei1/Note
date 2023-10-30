import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的用户名:");
        String input_name=scanner.next();
        System.out.println("请选择你的策略:1.剪刀 2.石头 3.布");
        int select_1=scanner.nextInt();
        while (select_1!=0)//利用while循环可以进行多次游戏 推出条件为0
        {
            int select_2= (int)(Math.random()*3+1);//用random随机生成电脑的策略(1~3)
            System.out.print("你选择的策略为:"+select_1);
            switch (select_1){
                case 1:
                    System.out.println("剪刀");
                    break;
                case 2:
                    System.out.println("石头");
                    break;
                case 3:
                    System.out.println("布");
                    break;
                default:
                    System.out.println("策略错误");
            }
            System.out.print("机器选择的策略为:"+select_2);
            switch (select_2){
                case 1:
                    System.out.println("剪刀");
                    break;
                case 2:
                    System.out.println("石头");
                    break;
                case 3:
                    System.out.println("布");
                    break;
                default:
                    System.out.println("策略错误");
            }
            //比较用户和电脑的策略
            if(select_1>=1&&select_1<=3)
            {
                switch (select_1-select_2){
                    case 1://当用户的策略比电脑策略大1的时候，用户赢 2-1 3-2 1-3
                        System.out.println("恭喜"+input_name+"赢得了本局");
                        break;
                    case 2://当用户的策略为 1-2 2-3 3-1 时 用户输
                        System.out.println("很遗憾"+input_name+"输掉了本局");
                        break;
                    case -1:
                        System.out.println("很遗憾"+input_name+"输掉了本局");
                        break;
                    case -2:
                        System.out.println("恭喜"+input_name+"赢得了本局");
                        break;
                    default:
                        System.out.println("平局");
                }
            }else System.out.println("你选的的策略错误!");
            System.out.println("请输入您的策略(退出请输入0):");
            select_1=scanner.nextInt();
        }
    }
}
