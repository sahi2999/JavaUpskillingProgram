package Pkg220423;

interface Draw{
	void draw();
}
public class Drawable0 {

	public static void main(String[] args) {
		int width = 10;

//       Draw dr= new Draw(){
//    	   public void draw(){System.out.println("Drawing "+width);}  
//       };  

		Draw dr = () -> {
			System.out.println("Drawing " + width);
		};
		dr.draw();
	}
	}


