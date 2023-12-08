import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
		System.out.print("Enter any degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit
			+ " Fahrenheit"); 
        
    }
}
