package java_pro1other;

import pack2.Test14Bank;

public class Test14BankMain3 {

   public static void main(String[] args) {
      // project가 다른 곳에서 내가 만든 클래스를 참조
      // ***.jar를 만들어 build path 한다. 
      Test14Bank suji = new Test14Bank();
      System.out.println("suji 고객의 예금액 : "+suji.getMoney());

   }
   
   // API (Application Programming Interface)
   // Interface : 사용자와 컴퓨터 간 또는 프로그램 간의 소통을 가능하게 하는 것
   // 응용 프로그램을 작성할 수 있도록 누군가에 의해 제공된 클래스 등의 명령어를 사용할 수 있도록 안내해 주는 역할
   // JAVA Api

}