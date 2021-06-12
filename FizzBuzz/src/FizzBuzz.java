
public class FizzBuzz {
	public String fizzBuzz(int num) {
		String sum;
		
		if(num%3 == 0){
			sum = "Fizz";
				
			}else if(num %5 == 0) {
				sum = "Buzz";
				
			}else if(((num%3) == 0) && ((num%5) == 0)) {
			sum = "FizzBuzz"; 
		} else {
			sum = String.valueOf(num);
			}
		return sum;
		}
		
	

}

