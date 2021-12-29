import java.util.Scanner;

public class P01 {
    // 1, 2, 4, 8 ... 의 등비수열
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍
    // int를 사용

    public static void main(String[] args) {

        final int MAX = 31;
        final int START_IDX = 0;
        final int BASE = 2; // BASE의 등비수열

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열의 항은 ? : ");
        int idx = scan.nextInt();
        int[] seq = new int[idx];

        if(idx > MAX){
            System.out.println("값이 너무 큽니다.");
        }
        else{
            for(int i = START_IDX; i < idx; i++) {
                seq[i] = (int)Math.pow(BASE, i);
            }
            System.out.printf("등비수열의 %d 번째 항 : %d\n", idx, seq[idx - 1]);
        }
    }
}
