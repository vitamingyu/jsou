package pack3;

public class Test25ProductMain {

	public static void main(String[] args) {
	
	  // 다형성
      Test25ElecProduct product=null; //product 객체를 만들기 위해서 만들었지만 굳이 새로운 ~을 만들필요가 없어서 저거만 함
		      
      Test25Radio radio=new Test25Radio();
      radio.setVolume(5);
      System.out.println(radio.getVolume()); //5
      radio.volumeControl(); //라디오 소리 조절 후 5
		      
	  System.out.println();
	  Test25Tv tv=new Test25Tv();
	  tv.setVolume(7);
	  tv.volumeControl();
	  tv.tvShow();
		      
	  System.out.println("----------중요-----------");
	  product=radio; //product은 radio의 주소도 가지게 됨
	  product.volumeControl();
	  System.out.println();
      product = tv;
      product.volumeControl();
      //product.tvshow
		      
		      
		      


	}

}
