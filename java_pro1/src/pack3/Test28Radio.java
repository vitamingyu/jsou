package pack3;

public class Test28Radio implements Test28Volume{
private int volLevel;

public Test28Radio() { //기본 생성자
	volLevel=0;
}

@Override
public void volumeUp(int level) {
	volLevel += level;
	System.out.println("라디오 볼륨 올리면" + volLevel);
}

@Override
public void volumeDown(int level) {
	volLevel -= level;
	System.out.println("라디오 볼륨 내리면" + volLevel);
}
	
	
}
