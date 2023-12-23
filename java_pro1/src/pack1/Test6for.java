package pack1;

public class Test6for {

	public static void main(String[] args) {
		// 반복문 for
		int sum = 0; // 지역변수는 초기화 시켜라
		int a;
		for (a = 1; a <= 5; a++) {// for(초기치; 목적치; 증가치){반복할 수행문} a++은 1씩 증가 a=1 말고 int a=1이라 지정하면 반복문 for에서만 쓰이는
									// 지역 변수 그러면 } 벗어나는 탈출 후 a값은 6이 나올 수 없음
			System.out.println("출력" + a); // 블록이 참인 경우만 수행, 블록이 거짓이면 블록을 벗어남 ... a+=2쓰면 2씩 증가. 1씩 증가땐 a++로 써주는게 기본
			// a=9 처럼 for 블록 안에서 변수를 지정하거나 바꾸면 안됨. 이와같은 경우는 무한 반복이 됨
			sum += a; // 누적이 됨 위 a값을 크게 할 수는 있으나 int 때문에 4바이트. 21억이 최대 숫자다

		}
		System.out.println("탈출 후 a : " + a);
		System.out.println("합은 " + sum);

		System.out.println();
		for (int i = 65; i <= 90; i++) {
			// System.out.println((char)i+" "); //아스키 코드 숫자를 문자화
		}
		System.out.println();
		for (int i = 'A'; i <= 'Z'; i++) {
			// System.out.println(i+" ");
		}

		System.out.println();
		for (int i = 10; i > 1; i -= 2) {
			System.out.println(i + " ");
		}

		System.out.println();
		for (int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) {
			System.out.println(ytn + " " + tvn);
		}
		System.out.println();
		int aa = 1;
		for (; aa <= 5; aa++) {
			System.out.println(aa);
		}
		System.out.println("다중 for");
		// 위까지는 단순 for문. 이제부터는 다중 for문
		for (int m = 1; m <= 3; m++) {
			System.out.println("m : " + m);
			for (int n = 0; n <= 4; n++) {
				System.out.println("n : " + n + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (char i = 65; i <= 90; i++) {
			System.out.print(i + ":");
			for (char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int k = 1; k < 2 * (5 - i); k++) {
				System.out.print("*");
			}
		}
		System.out.println();

		// 구구단 출력
		for (int count = 1; count < 10; count++) {
			System.out.println("3 * " + count + " = " + (3 * count));
		}

		System.out.println();
		// continue, break
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 5)
				continue; // 컨티뉴를 만나면 자기와 대응대는 for로 올라감. 이 아래로는 다 스킵. 그래서 3이랑 5는 안 찍힘
			if (i == 7)
				break; // for문 탈출
			// if(i==7) return; //method의 종료
			// if(i==7) System.exit(0); // program 실행 종료
			System.out.println(i);
		}
		// *********** break 와 return의 차이. return은 함수 자체를 종료해버리고 break는 블록({})만 벗어난다.
		System.out.println();
		int kk = 0;
		for (;;) { // 무한루핑
			kk++;
			System.out.println("출력");
			if (kk == 3)
				break;
		}

		System.out.println(); // 거의 만날 일 없는 특수 경우
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j + " ");
				// if(j==3) continue aa;
				if (j == 3)
					break aa;
			}
			System.out.println("***");
		}

		// 문제 1 : 구구단 2~9단 출력
		// 2*1=2 ~ 2*9=18
		// ..
		// 9*1=9 ~ 9*9=81
		for (int d = 2; d < 10; d++) {
			for (int c = 1; c < 10; c++) {
				System.out.println(d + "*" + c + "=" + (d * c));
			}
			System.out.println();
		}

		// 문제2 : 1~100 사이의 정수 중 3의 배수이면서 5의 배수인 경우 값 출력, 그들의 합도 출력
		int sum2 = 0;
		for (int p = 1; p <= 100; p++) {
			if (p % 3 == 0 && p % 5 == 0) {
				System.out.println(p);
				sum2 += p;
			}

		}
		System.out.println("합 : " + sum2);

	}
}