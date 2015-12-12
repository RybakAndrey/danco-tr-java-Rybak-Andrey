import java.util.Random;

public class Operation {
	
	public void getSumOfRandomValue(){
		
		Random random = new Random();
		int randomValue = random.nextInt(999-99+1)+99;
		
		int firstNumber = randomValue/100;
		int secondNumber = ((randomValue/10)%10);
		int thirdNumber =  randomValue%10;
		
		int summOfDigits = firstNumber + secondNumber + thirdNumber;
		
		System.out.println("Random value: "+randomValue);
		System.out.println("Summ of digits: "+ summOfDigits);
		
	}
}
