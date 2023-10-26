import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("你惯用的口头禅更接近那个选项？");
        System.out.println("A.这个、那个、差不多、都可以啊");
        System.out.println("B.讲真、老实说");
        System.out.println("C.我跟你讲、你先听我说");
        System.out.println("D.其实、我觉得、让我想想");
        Scanner input_selection=new Scanner(System.in);
        String Select=input_selection.next();
        if(Select.equals("A")){
            System.out.println("谨慎");
        } else if (Select.equals("B")) {
            System.out.println("行动派");
        } else if (Select.equals("C")) {
            System.out.println("控制欲");
        } else if (Select.equals("D")) {
            System.out.println("自我");
        }
    }
}
