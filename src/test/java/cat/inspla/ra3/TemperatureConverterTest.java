package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    // ==========================================
    // 1. Prova parametritzada: Celsius a Fahrenheit
    // ==========================================
    @ParameterizedTest
    @CsvSource({
            "0.0, 32.0",      // Punt de congelació de l'aigua
            "100.0, 212.0",   // Punt d'ebullició de l'aigua
            "-40.0, -40.0",   // Punt on les dues escales coincideixen
            "37.0, 98.6"      // Temperatura corporal humana (extra)
    })
    void testConvertCelsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        double actualFahrenheit = converter.convertCelsiusToFahrenheit(celsius);

        // Utilitzem un delta de 0.001 per tolerar petits errors decimals
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "Error en la conversió a Fahrenheit");
    }

    // ==========================================
    // 2. Prova parametritzada: Fahrenheit a Celsius
    // ==========================================
    @ParameterizedTest
    @CsvSource({
            "32.0, 0.0",
            "212.0, 100.0",
            "-40.0, -40.0",
            "98.6, 37.0"
    })
    void testConvertFahrenheitToCelsius(double fahrenheit, double expectedCelsius) {
        double actualCelsius = converter.convertFahrenheitToCelsius(fahrenheit);

        // Utilitzem un delta de 0.001 per tolerar petits errors decimals
        assertEquals(expectedCelsius, actualCelsius, 0.001, "Error en la conversió a Celsius");
    }
}