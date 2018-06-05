
public class Operators {

	public static void main(String[] args) {
		// % is the remainder and ++ increments by 1 and -- decreases result by 1
		
		int result = 1+2;
		System.out.println("1+2 = " +result);
		
		int previousResult = result;
		
		result = result - 1;
		System.out.println("The previous result = " +result);
		
		previousResult = result;
		
		result = result * 10;
		System.out.println("My result now is " +result);
		
		previousResult = result;
		result = result /5;
		
		System.out.println("Now it is " +result);
		
		previousResult = result;
		result = result %3;
		System.out.println("My result now is " +result);
		
		// ++ increases result by 1
		// -- decreases result by 1
		previousResult = result;
		result = result + 1;
		System.out.println("now it is " +result);
		result++;
		System.out.println("Result is now " +result);
		result--;
		System.out.println("Result is now "+result );
		
		//+= SHORTCUT: += increases by amount
		// *= multiplies by amount
		// += increases by amount
		// /= divides by amount
		result +=2;
		System.out.println("Result is now " +result);
		result *=10;
		System.out.println("Result is now " +result);
		result /=2;
		System.out.println("Result is now " +result);
		
		// = sets value to isAlien
		// == says that isAlien is false therefore it prints to It Is not an alien
		// if isAlien==true it would not print because isAlien is defined as false
		boolean isAlien =false;
		if (isAlien == false)
			System.out.println("It is not an alien.");
		
		// !not. if != is placed after topScore then no print because topScore set at 100.
		// if (topScore>100) then NO print because it is 100.
		// if (topScore=>100) PRINTS because it is EQUAL or greater than 100.
		// if (topScore<100) then NO print because it is LESS than 100.
		int topScore = 100;
		if(topScore==100)
			System.out.println("You win");
		
		//OR OPERATOR
		
		int secondTopScore =90;
		if ((topScore >990) ||(secondTopScore >100));
		System.out.println("win");
		
		//turnery operator
		boolean isCar = false;
		if(isCar==true)
			System.out.println("uh uh");
		
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if(wasCar)
			System.out.println("yep.");
		
		// 1.Create a double variable w the value of 20
		// 2. create a 2nd var double 80
		// 3. add and multiply by 25
		// 4. use remainder operator to figure out remainer from #3 divided by 40
		// 5. write an if statement / if remaining total equals 20 or less
		// SIDE NOTE: (fun + boring) brackets add first then multiply
		double fun = 20;
		double boring = 80;
		double sum = (fun + boring)*25;
		double total = sum % 40;
		if(total <= 20)
			System.out.println("If total over the limit");
					
			
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
