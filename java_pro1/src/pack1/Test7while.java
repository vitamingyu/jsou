package pack1;

import java.util.Scanner;

public class Test7while {

	public static void main(String[] args) {
		// 반복문 while
		// while(조건){참인 동안 반복}
		int w=1;
		while(w <= 5) {
			System.out.print("w:"+ w +", ");
			w++; //w+=1; 같은 말
		}
		System.out.println("\n반복문 수행 후 w: "+w);
		System.out.println();
		
		int count=0;
		while(count < 10) {
			count++;
			System.out.println("count = "+count);
			if(count == 5) {
				System.out.println("아하 count가 5구만~");
			}
		}
		System.out.println();
		w=0;
		while (true) { //무한 루핑, for문으로는 잘 안해줌
			w++;
			if(w==10)break;
			if(w % 2==0)continue;
			System.out.println("w="+w);
		}
		
		System.out.println();
		
		int a=1;
		while(a<=3) {
			System.out.print("a:"+a);
			int b=1;
			while(b<=4){
				System.out.println("b:"+b);
				b++;
			}
			System.out.println();
			a++;
		}
		
		System.out.println();		
		w=1;
		do { //최소 1회 이상 수행. 왜? 조건은 나중에 적용되기 때문에
			System.out.println("do while의 w:"+w);
			w++;
		}while(w<=5); // 조건이 됨. 조건 보고 do로 올라감

		
		//문1 : 1~100 사이의 숫자 중 3의 배수 이지만 2의 배수가 아닌 수를 출력하고 합과 갯수 출력
		//문2 : -1, 3, -5, 7, -9, 11 ~ 99 까지의 합 출력
		
		int c=1, su=0, ct=0;
		while (c<=100) {
			if(c % 3 == 0 && c %2 !=0){
				System.out.println(c);
				su+=c;
				ct++;
			}
			c++;
		}
		System.out.println("합 : "+su+" 갯수 : "+ct);
		
		/* 문2 내가 푼거
		int d=0;

		while(true) {
			d++;
			if(d==100)break;
			if(d % 2 == 0)continue;
			System.out.println(d);
		}
		*/
		int i=1, cnt=1, sum=0;   //변수지정시 카멜 표기법. myKorSummer 낙타 등 처럼 대소문자 섞어서, 이것은 카멜 표기법. my_kor_summer 스네이크 표기법
		while(i < 100) {
			if(cnt % 2 ==0) { //짝수 지역
				sum +=i;
			}else { //홀수지역
				int imsi = i * -1;
				sum += imsi;
			}
			cnt++;
			i+=2;
			
		}
		System.out.println("sum : "+sum);
		
		
		//키보드로 임의 정수를 입력받아 1부터 해당 수까지의 합을 출력.
		//위 작업은 계속 반복됨. 반복할까요? 0을 누르면 처리 종료.
		
		System.out.println("내가 풀었다------");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("정수를 입력하세요");
			int et = scan.nextInt();
			if (et < 1) {
				System.out.println("1미만의 정수 입력? 탈락");
				break;
			}
			int j=1, summ=0;		
			while ( j <= et) {
				summ += j;
				j++;
			}
			System.out.println(summ);
			System.out.println("반복할까요?");
			et = scan.nextInt();
			if(et==0)
			break;
			}
		
		Scanner sc = new Scanner(System.in); //Scanner가 키보드 입력값이네. 적당히 쓰고 컴트롤 스페이스바 눌러야 위에 import scanner됨
		while(true) {
			System.out.print("양의 정수 입력 : ");
			int no=sc.nextInt();
			if(no < 1 ) {
				System.out.println("1보다 큰 정수를 입력하시오");
				break;
			}
			int n=1, hap = 0;
			while(n<=no) {
				hap += n;
				n++;
			}
			System.out.println(no+"까지의 합은 "+hap);
			System.out.println("계속할까요?(0을 입력하면 종료)");
			int cc=sc.nextInt();
			if(cc==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		//제어문 수업 끝
		
		
		
		
		
		
		
		
		
		
	}

}
