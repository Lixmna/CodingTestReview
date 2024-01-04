import java.util.Scanner;

public class Main {

	public String solution(int n){
		String answer = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				answer += " ";
			}
			for(int k = 0; k < (2 * n -1) - (2 * i); k++) { // 	for(int k = 0; k < 2 * (n - i) - 1; k++) { 
				answer += "*";
			}
			answer += "\n";
		}

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n - i - 1; j++){
				answer += " ";
			}
			for(int k = 0; k < i * 2 + 1; k++){             
				answer += "*";
			}
			answer += "\n";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}