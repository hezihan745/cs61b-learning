 public class DrawTriangle_hw0 {
	public static void drawTriangle (int N) {
		int i = 1;
		int j = 0;
		while (i < N + 1) {
  			j = i;
			while (j > 0) {
				System.out.print("*");
				j = j - 1;
			}
			System.out.println("");
			i = i + 1;  
     	}
	}


     public static void main(String[] args) {
		drawTriangle(10);
	}
 }