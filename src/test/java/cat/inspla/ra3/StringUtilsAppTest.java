package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'hola    món', 'hola món'",           // Espais múltiples al mig
            "'  test  ', 'test'",                  // Espais al principi i al final
            "'java   is   fun', 'java is fun'",    // Múltiples separacions grans
            "'paraula', 'paraula'"                 // Sense espais extra (es queda igual)
    })
    void testNormalizeSpacesRedueixEspaisMultiples(String input, String expected) {
        // Cridem el mètode i comprovem que el resultat coincideix amb l'esperat
        String resultat = utils.normalizeSpaces(input);
        assertEquals(expected, resultat, "El text no s'ha normalitzat correctament");
    }
}