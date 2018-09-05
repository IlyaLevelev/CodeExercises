package sample;
/**
 *  Solve the questions or exercises! :)
 */
public class IfExercises {

	public static void main(String[] args) {

		// 1- Define a `price` variable and set some value,
		// then discount some amount if the price is greater than 1000

		double price = 1200;
		if (price > 1000) {
			price = price * 0.8;
		}

		// 2- Define and set an `age` variable, then just define a `cinemaPrice` variable.
		// If the person is adult (18 years or more), the price of cinema should be 10, otherwise it should be 5

		int age = 16;
		double cinemaPrice;
		if (age >= 18) {
			cinemaPrice = 10;
		}
		else {
			cinemaPrice = 5;
		}



		// 3- Now let's say that adults pay 10, teenagers pay 7 and kids pay 5.
		// Use if / else if / else to set the right price for each age

		if(age>= 18) {
			cinemaPrice = 10;
		}else if (age >= 12) {
			cinemaPrice = 7;
		}else
			cinemaPrice = 5;



		// I'm going to introduce two things we'll see in next class.
		// You can try these exercises if you want.
		// If you don't understand don't worry, let me know and I can send more exercises like the previous ones.


		// -- Nested blocks --
		// Notice that inside an `if` you can put any instructions, even another `if`:

		int somePrice = 100;

		if (somePrice > 10) {

			// price is not small, let's see if it's very big or not

			// This is a nested "if" (it's inside another "if")
			if (somePrice > 1000) {
				// big price
			} else {
				// normal price
			}

		} else {
			// small price
		}


		// 4- Knowing that, let's say you have some price and age variables, with some values.
		// If the person is adult, you want to check the price, and if it's huge (more than 1000) you
		// want to apply a discount (but only if person is adult).
		// On the other side, if the person is not an adult, you check if the price is small (less than 10);
		// in that case you just give the product for free (set price to 0).

		if (age >= 18) {
			if (price > 1000) {
				price = price * 0.8;
			}
		} else {
			if (price < 10) {
				price = 0;
			}
		}

		// Another thing we will introduce in next class:
		// -- Check multiple conditions at the same time ---

		// You can check two conditions by joining them with this operator: `&&`
		// That operator is called "AND" (like in "one thing AND another thing")



		// So let's say you want to check if price is big:
		boolean isBigPrice = somePrice > 1000;
		// Also if person is adult:
		int age2 = 15;
		boolean isAdult = age2 >= 18;

		// Now I want to offer a discount for adults that pay a big price so
		// I check both conditions:
		if (isAdult && isBigPrice) {      // if is adult AND is big price ...
			somePrice = somePrice - 100;
		}



		// 5- Knowing that, try the exercise 4 using the `&&` operator

		if (age >= 18 && price > 1000) {
			price = price * 0.8;
		}
		else if (age < 18 && price < 10) {
			price = 0;
		}



		// 6- Let's say you have to calculate if a workout exercise is difficult or not
		// You know if the person is `male`, you know the `repetitions` of the exercise and
		// the `weight` to lift.
		// For men, an exercise is difficult if it has more than 10 repetitions and weight is more than 30 kg.
		// For women, it's diffcult if it has more than 15 repetitions and weight is more than 20 kg.
		// How could you display if an exercise is difficult given the 3 variables?


		boolean male = true;
		int repetitions = 100;
		int weight = 41;

		if (male && repetitions > 10 && weight > 30 ){
			System.out.println("is Difficult For Men");
		}else if (!male && repetitions > 15 && weight > 20){
			System.out.println("is Difficult For Women");
		}


		// 7- This is the most difficult: can you think of an exercise where you need conditions?
		// Think of some subject you like (sports, cinema, biology, books, economics, etc.) and try
		// to "solve a problem" like the ones in the previous examples. Describe the situation and
		// try to code the solution.
		
		// Calculate which team will win a volleyball match. 
		// If the players are taller than 180cm and (experienced or train more than 5 times a week they will win).
		// If the players are smaller than 180cm but experienced and train more than 5 days a week they will win.
		// In all the other cases the team will lose.
		
		int height = 179;
		boolean experienced = true;
		int trainingsperWeek = 4;

		if ((height > 180 && experienced) || trainingsperWeek > 5){
			System.out.println("This team is winning");
		} else if (experienced && trainingsperWeek > 5) {
			System.out.println("This team is winning");
		} else {
			System.out.println("This team is losing");
		}
	}


}