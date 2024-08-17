public class OutputMaxInArray_Ex3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int m_length = m.length;
	   int m_max = m[0];
	   for (int i = 1; i < m_length; i += 1) {
			if (m[i] > m_max) {
				m_max = m[i];
			}
		}
	   return m_max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
	  System.out.println(forMax(numbers));      
    }
}