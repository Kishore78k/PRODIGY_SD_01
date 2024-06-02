import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                double fahrenheitFromCelsius = celsiusToFahrenheit(temp);
                double kelvinFromCelsius = celsiusToKelvin(temp);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", temp, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case 'F':
                double celsiusFromFahrenheit = fahrenheitToCelsius(temp);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temp);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", temp, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case 'K':
                double celsiusFromKelvin = kelvinToCelsius(temp);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temp);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", temp, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }
}
