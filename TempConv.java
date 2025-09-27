// This import gets input from user.
import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        
        // Displays program name and prompts the user for input.
        System.out.println("Temperaure Converter");
        Scanner tempInput = new Scanner(System.in);
        System.out.print("Enter Temperature In Fahrenheit: ");
        
        // The conversion occurs here.
        double tempFahren = tempInput.nextDouble();
        double tempCelsius = (5.0 / 9.0 )*(tempFahren - 32);

        // This rounds the celsius value to 2 decimal places.
        double roundCelsius = Math.round(tempCelsius * 100.0) / 100.0;

        // Prints the rounded celsius value.
        System.out.println("Temperature in Celsius = " + roundCelsius );

        tempInput.close();
    }
}