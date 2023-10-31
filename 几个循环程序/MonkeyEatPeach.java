public class MonkeyEatPeach {
    public static void main(String[] args) {
        //猴子吃桃 一堆桃，第一天，猴子吃其中的一半多一个，第二天吃其中剩下的一半多一个，以此类推到第十天剩下一桃子，原先有多少桃？
        int sum=1;//第十天剩下一个
        //每天多吃一半多一个
        for (int i=1;i<=9;i++){//吃了九天 所以i=9 第十天还没吃 发现只剩一个了
            sum=(sum+1)*2;
        }
        System.out.println("原先有桃:"+sum+"个。");
    }
}
