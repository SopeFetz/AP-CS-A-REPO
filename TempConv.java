// This import gets input from user.
import java.util.Scanner;

// The following imports aids in rouding up the celsius value.
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempConv {
    public static void main(String[] args) {
        
        //Displays program name and prompts the user  for input.
        System.out.println("Temperaure Converter");
        Scanner tempInput = new Scanner(System.in);
        System.out.print("Enter Temperature In Fahrenheit: ");
        
        // The conversion occurs here.
        double tempFahren = tempInput.nextDouble();
        double tempCelsius = (5.0 / 9.0 )*(tempFahren - 32);

        // This rounds the celsius value to 2 decimal places.
        BigDecimal roundedCelsuis = new BigDecimal(tempCelsius).setScale(2, RoundingMode.HALF_UP);

        // Prints the rounded celsius value.
        System.out.println("Temperature in Celsius = " + roundedCelsuis);

        tempInput.close();
    }
}