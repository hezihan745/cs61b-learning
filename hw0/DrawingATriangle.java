 public class DrawingATriangle {
     public static void main(String[] args) {
     	int i = 1;
		int j = 0;
		while (i < 6) {
  			j = i;
			while (j > 0) {
				System.out.print("*");
				j = j - 1;
			}
			System.out.println("");
			i = i + 1;  
     	}
	}
 }

/*
1. All code in Java must be part of a class.
2. We delimit the beginning and end of segments of code using { and }.
3. All statements in Java must end in a semi-colon.
4. For code to run we need public static void main(String[] args)
*/