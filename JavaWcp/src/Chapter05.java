
public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 9223372036854775807L;
		double double1 = 1234567.89D;
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		Float float1 = Float.valueOf(0.123F);
		Integer integer1 = Integer.valueOf(5);
		Character character1 =  'A';
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);
		
		int[] array1 = new int[] { 0, 1, 2, 3, 4 };
		int int1 = array1[3];
		System.out.println(int1);
	}

}
