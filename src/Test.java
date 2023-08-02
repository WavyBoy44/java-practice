public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int num = 5;
		System.out.println(num);
		
		//2
		int ten = num + 10;
		System.out.println(ten);
		
		//3
		System.out.println(Sub4(10, 5, 2, 1));
		
		//4
		System.out.println(remainder(10, 5));
		
		//5
		System.out.println(adder(10, 10));
		
		//6
		System.out.println(multiplier(4, 5, 2));
		
		//7
		System.out.println(divider(6, 2));
		
		//8
		System.out.println(CtoF(27));
		
		//9
		System.out.println(cond(45, 20));
		
		//10
		System.out.println(cond2(1, 3, 3));
		
		//11
		String[] movies = {"Spider-Man", "Spider-Man 2", "Spider-Man 3"};
		
		//12
		String movie1 = movies[0];
		
		//13
		int length = movies.length;
		
		//14
		String lastMovie = movies[length - 1];
		
		//15
		for(String movie : movies) {
			System.out.println(movie);
		}
		
		//16
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		for(int i = 0; i < nums.length; i++) {
			int placeHolder = nums[i];
			placeHolder += 3;
			nums[i] = placeHolder;
		}
		
		//17
		int total = 0;
		for(int number : nums) {
			total += number;
		}
		System.out.println(total / nums.length);	
		
		
	}
	
	public static double Sub4(int one, int two, int three, int four) {
		return one - two - three - four;
	}
	
	public static double remainder(int one, int two) {
		return one % two;
	}
	
	public static int adder(int one, int two) {
		return one + two;
	}
	public static int multiplier(int one, int two, int three) {
		return one * two * three;
	}
	public static double divider(double one, double two) {
		return one / two;
	}
	public static double CtoF(double c) {
		return (c * (9/5)) + 32;
	}
	public static String cond(int one, int two) {
		if(adder(one, two) > 50) {
			return "Jumanji";
		}
		return "Not Jumanji";
	}
	public static String cond2(int one, int two, int three) {
		if(multiplier(one, two, three) % 3 == 0) {
			return "Zebra";
		}
		return "Not Zebra";
	}

}

