public class OutputMaxInArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
		int max_int = m[0];
		int m_length = m.length;
		int i = 1;
	   	while (i < m_length) {
			if (m[i] > max_int) {
				max_int = m[i];
			}
			i += 1; 
		}
		return max_int; 
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }
}