package pack2;

public class Test13Memory {
	
		public String name;
		String maker = "삼성";
		private int size;
		
		public Test13Memory() {
			
		}
		public Test13Memory(String name) {
			this.name=name;
		}
		public Test13Memory(String name, int size) {
			this.name=name;
			this.size = size;
		}
		

		
		public void setSize(int size) {
			this.size=size;
		}
		
		public void display() {
			System.out.println("name : " + name + ", size : " + size + ", maker : " + maker);
		}

		
	 public static void main(String[] args) {
		 	Test13Memory wow1= new Test13Memory();
			wow1.display();
			
			Test13Memory wow= new Test13Memory("민규");
			wow.display();
			
			Test13Memory w= new Test13Memory();
			w.setSize(17);
			w.display();
			
			Test13Memory w2= new Test13Memory("서호", 20);
			w2.display();
			w2.setSize(11);
			w2.display();
	 }
	 
	 
}
