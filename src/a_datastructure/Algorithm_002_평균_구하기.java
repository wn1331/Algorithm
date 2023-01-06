package a_datastructure;

import java.util.Scanner;

public class Algorithm_002_평균_구하기 {
    public static void main(String[] args) {
        System.out.printf("시험을 본 과목의 개수를 입력하세요. : ");
        //스캐너객체생성
        Scanner sc = new Scanner(System.in);
        //N에 콘솔입력값 저장
        int N = sc.nextInt();
        //N만큼의 길이의 int배열 생성
        int A[] = new int[N];
        System.out.println();
        System.out.printf("각 과목의 시험 성적을 입력하세요. : ");
        //A 배열의 값을 콘솔에서 하나하나 입력받음.
        for(int i = 0; i<N;i++)A[i] = sc.nextInt();
        long sum = 0;
        long max = 0;
        for(int a : A){
            //최대값 갱신
            if(a>max)max=a;
            //총합 갱신
            sum+=a;
        }
        //총합*100/최고점수/과목의 수
        System.out.println(sum*100.0/max/N);


    }
}
