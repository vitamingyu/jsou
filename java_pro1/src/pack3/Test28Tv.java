package pack3;
public class Test28Tv implements Test28Volume{
	private int level;
	public Test28Tv() {
		level=0;
	}
	
	
	@Override
	public void volumeUp(int level) {
		this.level += level;
		System.out.println("tv소리 올린 후: " + this.level);
	}
	
	@Override
	public void volumeDown(int level) {
		this.level -= level;
		System.out.println("tv소리 내린 후: " + this.level);
	}
}

