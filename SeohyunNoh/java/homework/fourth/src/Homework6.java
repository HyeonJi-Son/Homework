import java.math.BigInteger;

public class Homework6 {
    public static void main(String[] args) {
        //45678911234라는 숫자를 BigInteger에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        /*
        45678911234
        arr[0]=4, arr[1]=3, arr[2]=2, arr[3]=1...arr[10]=4
        가 나와야함
         */

        //11자리수이므로 11개 배열 할당..?
        final int POSITION = 11;
        int [] arr = new int[POSITION];

        //BigInt에 숫자 배치
        BigInteger num = new BigInteger("45678911234");

        for(int i = 0 ; i < arr.length ; i++){
            //arr[i] = ......
            //arr[i]와 biginteger안의 숫자를
            //어떻게 연관지어야 할 지 모르겠다
        }






    }
}
