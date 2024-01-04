import java.util.Scanner;

public class Main{
    public static void main(String[] args) {        // main 메소드는 각각의 기능을 수행하는 메소드를 호출하는 역할을 한다.
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());        // int n = sc.nextInt();
        int M = N;                                  // int m = n;
        int cntStage = 1;
        int cntBlank;                               // int cntBlank = 0;
        
        for(int i = 0; i < 2 * N - 1; i++) {
            cntBlank = N - M;
            for(int j = 0; j < cntBlank; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * M - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            cntStage++;
            if(cntStage <= N) {
                M = M - 1;
            }                                       // else
            if(cntStage > N) {
                M = M + 1;
            }
        }
    }
}