import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳의 개수만큼 저장할 배열 생성 (알파벳은 총 26개)
        int[] arr = new int[26]; 

        // 입력 받은 문자열을 읽음
        String input = br.readLine();

        // 입력 받은 문자열을 순회하면서 각 알파벳의 개수를 세는 과정
        for(int i = 0; i < input.length(); i++) {
            char alphabet = input.charAt(i); // 문자열의 각 문자를 char로 가져옴
            // 해당 알파벳의 개수를 배열에 증가시킴
            // 알파벳 'a'는 배열 인덱스 0에 해당하므로, 'a'를 만나면 arr[0]이 증가하고,
            // 알파벳 'b'는 배열 인덱스 1에 해당하므로, 'b'를 만나면 arr[1]이 증가하는 식으로 진행됨
            arr[alphabet - 'a']++;
        }

        // 알파벳 배열의 값을 공백으로 구분하여 출력
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " "); // 각 알파벳의 개수 출력
        }
    }
}
