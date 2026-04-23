package cat.inspla.ra3;

public class TemperatureConverter {

    public double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
