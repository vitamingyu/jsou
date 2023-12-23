package pack2;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	//키보드로 임의 정수를 입력받아 1부터 해당 수까지 합을 출력
	
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.print("양의 정수 입력 : ");
		int no=sc.nextInt();
		if(no<1) {
			System.out.println("1보다 큰 정수를 입력하시오");
			break;
		}
		int n=1, hap=0;
		while(n<=no) {
			hap+=n;
			n++;
		}
		System.out.println(no+"가지의 합은"+hap);
		int cc=sc.nextInt();
		if (cc==0) {
			break;
		}
	}
		
}
}