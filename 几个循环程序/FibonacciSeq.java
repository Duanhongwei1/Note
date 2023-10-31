public class FibonacciSeq {
    /* *******
    段宏威 Date:2023/10/31
     */
    public static int  Fibonacci(int n){
        if(n==1||n==2){return 1;}
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        //斐波那契数列: 1 1 2 3 5 8 13...
        //特点:从第三项开始 每一项都为前两项的和
        //输出十个斐波那契数列
        for(int i=1;i<=10;i++){
            System.out.print(Fibonacci(i)+"      ");
        }
    }
}
