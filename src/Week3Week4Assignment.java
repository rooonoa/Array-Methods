import java.util.Arrays;

public class Week3Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1 Creating an Array of integers called ages
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //create an Array of ages 
		
		// Subtracting the last value from the first value in the ages array
		
		int results = ages[ages.length-1] - ages[0];
		System.out.println(results);
		
		// Adding a new age to the age array 
		
		ages = Arrays.copyOf(ages, ages.length+1); //creates an new array that has one element more than the original 
		//and then copy the values of the old array to the new one.Finally assigns the reference of the new array to ages.
		ages[ages.length - 1] = 55; // assigning value to new element at the end of the array
		results =ages [ages.length-1]-ages[0];
		System.out.println(results);
		
		//calculating the average age 
		
		double sumAges = 0; //declare and initializing a variable 
		for (int i =0; i < ages.length; i+=1) {sumAges += ages[i];}//initialize to 0, the loop condition and loop increment expression.
		// the the code accesses each element of the ages[i] and add the value to the sumAges
		System.out.println(sumAges);
		double average = sumAges / ages.length;
		 System.out.println(average);
		 
		
		 
		 // Q2a Creating an array of string called names and calculating the average of letters per word 
		 
		 String[] names = {"Sam", "Tommy", "Tim", "sallly", "Buck", "Bob"}; //create a string array
		 int sumLetters = 0;  //declare and initialize a variable
		 for (int i = 0; i < names.length; i++) {sumLetters += names[i].length();} //initialize to 0, the loop condition and loop increment expression.
			// the the code accesses each element of the names[i] and add the value to the sumAges
		 System.out.println(sumLetters);
		 
		 double averageLetterNames = sumLetters / names.length;
		 System.out.println(averageLetterNames);
		 
		 // Q2b concatenating all the names array
		 String concaNames = ""; //creates a new string and initializes it with an empty string
		 
		 for (String name:names) { concaNames += name + " ";} //Iterates over all the elements of the 'names' array and concatenates them 
		 //into a single string with a space character between each name. results are stored in the concaNames
		 System.out.println(concaNames);
		 
		 //Q3 For an array string [] names, we can access the last element as: lastElement = names [names.Length -1];
		 //Q4 For an array String [] names, we access the first element as: firstElement = names [0];
		 
		 // Q5 Creating a new array of integer called nameLenghts
		 int [] nameLengths = new int [names.length]; //creating a new array integer array called nameLegnths 
		 for (int i = 0; i < names.length; i++ ) {nameLengths[i] = names[i].length();}// inside the {} the code accesses each element of the 'names' 
		 //array using names[i] and calls the length() method to get the length of the string. 
		 //The resulting integer is value is stored in the elements of 'nameLength'
		 System.out.println(Arrays.toString(nameLengths)); // Array.toString() returns a string that for the contents in nameLength and prints  
		 
		 
		 // Q6 calculating the sum of all the elements in nameLength array
		 
		 int sumElements = 0; // declares and initializes the variable
		 for (int i = 0; i < nameLengths.length; i++) {sumElements+= nameLengths[i];}// calculate the sum of all the elements of 'nameLength' array
		 System.out.println(sumElements);
		 	 	 
	}
// Q7 method that takes in a string word and an integer n and return the word concatenated to itself
	
	public static String repeatword (String word, int n) {  //method named repeatword and parameter String and integer. return data type is String 
		String results = " ";
		for (int i = 0; i < n; i++) {        
			results += word;} // within the for loop, the code concatenates the input 'word' to the 'results' variable using '+=' 
		return results;
	}

	//Q8 method that takes in first and last name and returns full name 
	
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Q9 This method takes an Array of int and returns true if the sum of int is >100
	
	public static boolean  intArray (int [] numbers) {
		int sum = 0;               //declares this variable and initialize it to zero
		for (int i =0; i < numbers.length; i++) {
			sum += numbers[i];     //
		}
		return sum > 100;
	}
	
	
	//Q10 This method takes an array of double and returns the average of all the elements in the array 
	
	public static double averageOfElements (double [] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}
	
	//Q11 This method takes in two arrays of double and returns the average of elements if the 1st array is > the average of he elements in the second array
	
	public static boolean averageElement (double [] arrayOne, double [] arrayTwo) {
		double totalArrayone = 0;
		double totalArraytwo = 0;
		for (double num : arrayOne) {totalArrayone += num;
	}
	
	for (double num : arrayTwo) {totalArraytwo += num;}
	
	double  average1 = totalArrayone / arrayOne.length;
	double average2 = totalArraytwo / arrayTwo.length;
	
	return average1 >average2;
	}
	
	//Q12 This method takes in a boolean and a double and returns true if it is hot outside and if the money in the pocket is > 10.50
	
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
			
		}
	
	
	//Q13 This method takes an Array of doubles and returns true if the sum of double is > 30.37
		
		public static boolean  doubleArry (double [] number) {
			double sum = 0;
			for (double num : number) {
				sum += num;
			}
			return sum > 30.37;
		}
		

	
	
	
}

