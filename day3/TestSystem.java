import java.util.Scanner;
public class TestSystem {
    public static void main(String[] args) {
        //定义变量 第一个变量Scanner
        Scanner scanner= new Scanner(System.in);
        //第二个变量姓名 考号
        String name;
        String no;
        //成绩初始为0
        int Grade=0;
//        1.登录 准考证号 密码
//        输入设备Scanner   (不考虑合法性)
        System.out.println("请输入姓名:");
        name=scanner.next();
        System.out.println("请输入考号");
        no=scanner.next();
        //indexOf()判断字符中是否有这样的字符串
        if (no.indexOf("~")!=-1&&no.indexOf("@")!=-1&&no.indexOf("#")!=-1) {
//        2.考试界面(1.数学、2.英语)
//        选择科目
            System.out.println("*********************************");
            System.out.println("              考试系统            ");
            System.out.println("          ----1.数学----");
            System.out.println("          ----2.英语----");
            System.out.println("*********************************");
            System.out.println("请选择考试科目的序号:");
            String select_no = scanner.next();
            //判断选择的科目序号，用equals（）
            if (select_no.equals("1")) {
                //        3.系统出题限定选择题
                System.out.println("第一题:请选择f(x,y)=2x+3y在(0,0)点的对x,对y的偏导数的值");
                System.out.println("A.1,1  B.0,0  C.2,3  D.3,2 ");
                //        4.输入答案
                String ans1 = scanner.next();
                if (ans1.equals("C") || ans1.equals("c")) {
                    Grade += 10;
                }
                System.out.println("第二题:2-6*1/2-(2+1)=");
                System.out.println("A.0  B.-4  C.4  D.-5");
                String ans2 = scanner.next();
                if (ans2.equals("B") || ans2.equals("b")) {
                    Grade += 10;
                }
                //        5.限定每个科目两个题，输出总分。
                System.out.println("姓名:" + name + "学号:" + no + "的得分为:" + Grade);
            } else if (select_no.equals("2")) {
                //        3.系统出题限定选择题
                System.out.println("第二题:a b c d _ f");
                System.out.println("A.b  B.c  C.d  D.e ");
                //        4.输入答案
                String ans1 = scanner.next();
                if (ans1.equals("D") || ans1.equals("d")) {
                    Grade += 10;
                }
                System.out.println("第二题:Hello ______");
                System.out.println("A.world  B.cosmic  C.hell  D.heaven");
                String ans2 = scanner.next();
                if (ans2.equals("A") || ans2.equals("a")) {
                    Grade += 10;
                }
                //        5.限定每个科目两个题，输出总分。
                System.out.println("姓名:" + name + "学号:" + no + "的得分为:" + Grade);
            } else {
                System.out.println("退出考试系统");
            }
        }else {
            System.out.println("学号或姓名格式错误");
        }
        //底部必须有两大括号
    }
}
