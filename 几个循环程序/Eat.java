public class Eat {
    public static void main(String[] args) {
        //百僧吃百膜
        int Sum=100;
        for(int i=0;i<=100;i++){//i代表大和尚的人数
            for (int j=100-i;j<=100;j++)
            {
                if (j%3!=0)break;
                if((i*3+j/3)==Sum){
                    System.out.println("大和尚人数为:"+i+"人，小和尚人数为:"+j+"人。");
                }
            }//用j表示小和尚人数
        }//用i表示大和尚的人数
    }
}
