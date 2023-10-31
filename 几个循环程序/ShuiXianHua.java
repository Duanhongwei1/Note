public class ShuiXianHua {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int num=i,j=0;
            int[] _num=new int[3];
            while (num!=0)
            {
                _num[j++]=num%10;
                num/=10;
            }
            if (_num[0]*_num[0]*_num[0]+_num[1]*_num[1]*_num[1]+_num[2]*_num[2]*_num[2]==i) System.out.println(i);
        }
    }
}
