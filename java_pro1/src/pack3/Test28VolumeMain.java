package pack3;

public class Test28VolumeMain {

	public static void main(String[] args) {
	
		Test28Volume ad = null;
		
		Test28Radio radio = new Test28Radio();
		Test28Tv tv = new Test28Tv();
		
		ad=radio;
		ad.volumeUp(5);
		ad.volumeDown(3);
		
	}

}
