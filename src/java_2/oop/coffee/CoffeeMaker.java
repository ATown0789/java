package java_2.oop.coffee;

class CoffeeMaker {
//	In addition to the functions of any Machine, the CoffeeMachine also has an ability to brew coffee.

	/*
		Properties :
			-brand (coffee machine brand)
			-type (drip, cold brew, espresso, stove top etc.)
			-on (if the Coffee Maker is powered on or not)

		Methods :
			-brew(CoffeeBean, Cup);
			-Any additional functions of a machine. (Use the Machine abstraction for this CoffeeMaker).
 	*/

	Cup brew(CoffeeBeans coffee, Cup cup) {

		/*
			if the Coffee Maker is not powered on, do not brew any coffee.
			check if the coffee has been roasted or not.  If the coffee bean hasn't been roasted, throw an exception or print an error message to the console, indicating the beans must be roasted before brewing.

			also check if the cup is full or empty.  if it's full, indicate to the user to insert an empty cup.

			mark the coffee as being brewed, and fill the cup to capacity.  return the Cup to the user.
		*/

		return cup;
	}

}
