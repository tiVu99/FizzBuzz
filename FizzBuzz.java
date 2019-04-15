public class FizzBuzz {

	public static void main(String[] args) {
	Integer i;
	
		for(i = new Integer(1); i < 61; i++){
// number runs from 1 to 61, 61 is not included.

		if(i % 3 != 0 && i % 5 != 0)
		System.out.println(i);
		
// the number is not divisible by both 3 and 5 then printed that number

		if(i % 3 == 0 && i % 5 == 0)
		System.out.println("FizzBuzz");
	
		else if(i % 3 == 0)
		System.out.println("Fizz");

// the number is divisible by 3 then replaced by Fizz

		else if(i % 5 == 0)
		System.out.println("Buzz");
		
// the number is divisible by 5 then replaced by Buzz
		
		}
	}
}