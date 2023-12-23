package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Test8array {

	public static void main(String[] args) {
		// 배열(array)
		// 성격(크기)이 일치하는 여러 개의 기억장소에 대해 대표명을 하나 부여하고, 각 기억장소는 대표명[첨자]로 표현하기
		// 여러 개의 기억장소를 한번에 호출하기 쉽고, 반복처리가 효과적
		
		int abc=0; //한 개의 기억장소를 선언
		System.out.println(abc); //0
		int [] ar; //int ar=[]; 배열을 선언한 것
		ar=new int[5];
		//int a[] = new int[5]; //위와 같은 말
		System.out.println(ar); //[I@515f550a
		System.out.println("ar의 크기 : "+ar.length);
		ar[0]=10; //각 기억장소는 첨자(index)로 구분. 첨자는 0부터 출발
		ar[2]=20;
		ar[4]=ar[0]+ar[1]+ar[2]; //배열에서 값을 주지 않으면 int타입이니 0을 넣게 됨 ar[1]에는 0이 들어감. 결국 10+0+20
		System.out.println("ar[4] : "+ar[4]);
		//ar[5]=50; //5가 없는데 넣으려니 에러가 남. 근데 문법엔 오류가 없음(syntax에러가 아니라는 말임). 이와 같은 경우는 실행에러, 런타임 에러임
		int a=4, b=2;
		ar[a]=ar[0]+ar[1]+ar[2];
		System.out.println("ar[4] : "+ar[b+2]); //첨자는 변수로 써도 됨, 첨자는 실수 안되고 정수만 가능(양수만)
		
		System.out.println();
		int[]ar1= {1,2,3,4,5}; //대괄호 있으면 배열이구나. 초기치 5가지 배열의 방에 각 12345가 들어가있는거
		System.out.println(ar1+ " "+ar1[0]+ " " + ar1.length);
		System.out.println(ar1[0]+" " + ar1[1] + " " + ar1[2]+ " " + ar1[3] + " " +ar1[4]);
		
		
		//반복문으로 해볼게요
		for(int i=0;i< ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		for(int i:ar1) {
			System.out.println(i); //향상된 for, enhanced for : 배열, 컬렉션에서 사용 가능
		}
	
		System.out.println();
		String[] city = {"서울","대전","대구","부산","광주"}; //배우진 않았는데 그냥 보여줌 => city의 0번째는 서울
		for(String my:city) { //city에서 하나씩 빠져나와서 my에 저장
			System.out.println("도시명 : "+my); //=>도시명 : 서울	도시명 : 대전	도시명 : 대구	도시명 : 부산 도시명 : 광주			
		}
		
		System.out.println();
		int ar2[]=new int[5];
		for(int i=0; i < ar2.length; i++) {
			ar2[i] = i+ 1;
		}
		int tot=0;
		for(int i=0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
			tot += ar2[i];
			
		}
		System.out.println("tot : " + tot); 
		//지금까지의 배열은 1차원배열 : 열로 구성
		
		System.out.println("다차원 배열");
		//2차원 배열은 행과 열로 구성
		//jum[행첨자][열첨자]
		int su1[][]=new int[3][4]; //12개의 첨자를 잡음
		System.out.println(su1.length + " " + su1[0].length + " " + su1[1].length);
		su1[0][0]=100;
		System.out.println(su1[0][0]);
		int num =0;
		for(int i=0; i< su1.length; i++) {
			for(int j=0; j<su1[i].length;j++) {
				su1[i][j]=++num;  //num++ 치환 후 값을 연산 앞에는 연산 후 치환
			}
		}
		System.out.println(su1[0][0]);
		for(int i=0; i< su1.length; i++) {
			for(int j=0; j<su1[i].length;j++) {
				System.out.print(su1[i][j] + " ");
			}
			System.out.println();
		}
		
		//키보드로 5개의 시험 점수를 입력받아 등수 출력
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[5]; //5명의 시험 점수
		int[] rank = new int[5]; //등수(순위)
		int index = 0;
		for (int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번 점수는 ");
			score[i] = scanner.nextInt();
			rank[i] = 1;
		}
		System.out.println(Arrays.toString(score));  //array 컨트롤 스페이스해서 arrays해주면 위에 import됨
		System.out.println(Arrays.toString(rank));
		
		for (int i = 0; i < score.length; i++) { //for 컨스 유스인덱스
			for (int j = 0; j < score.length; j++) {
				if(score[j] > score[i]) {
					rank[i] += 1;
					
				}
			}
		}
		System.out.println("결과는 ");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(score[i] + "점은 " + rank[i] + "등"); 
		}
		
		
		
		
		
		
	}

}
