import java.util.Scanner;

public class PsychologicalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到心理测试程序！");
        System.out.println("请回答以下问题：");

        System.out.println("问题1: 你喜欢独自工作还是与他人合作？（单独输入 1 或者 2）");
        int answer1 = scanner.nextInt();

        System.out.println("问题2: 你更倾向于安静的活动还是充满活力的活动？（单独输入 1 或者 2）");
        int answer2 = scanner.nextInt();

        // 分析回答并给出结论
        if (answer1 == 1 && answer2 == 1) {
            System.out.println("根据你的回答，你可能是一个喜欢独立工作且安静活动的人。");
        } else if (answer1 == 1 && answer2 == 2) {
            System.out.println("根据你的回答，你可能是一个喜欢独立工作但也喜欢充满活力的活动的人。");
        } else if (answer1 == 2 && answer2 == 1) {
            System.out.println("根据你的回答，你可能是一个喜欢与他人合作且喜欢安静活动的人。");
        } else if (answer1 == 2 && answer2 == 2) {
            System.out.println("根据你的回答，你可能是一个喜欢与他人合作且喜欢充满活力的活动的人。");
        } else {
            System.out.println("你的回答无效，无法给出结论。");
        }

        System.out.println("谢谢参与心理测试！");
        scanner.close();
    }
}

