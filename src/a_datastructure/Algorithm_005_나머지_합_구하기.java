package a_datastructure;

import java.util.Scanner;

public class Algorithm_005_나머지_합_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //합 배열 생성
        long[] S = new long[N];
        //나머지를 카운트하는 배열 생성
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        //이전의 인덱스에 입력한 값을 더해서 배열에 값 대입
        for(int i = 0;i<N;i++)S[i]=S[i-1]+sc.nextInt();
        for(int i = 0;i<N;i++){
            int remainder = (int) (S[i] % M);
        }

    }
}
