package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @Test
    void testUsernameCorrecteEsValid() {
        // Comprovem noms vàlids (inclosos els de 3 lletres exactes)
        assertTrue(validator.isValidUsername("Joan"), "Un nom normal ha de ser vàlid");
        assertTrue(validator.isValidUsername("abc"), "Un nom de 3 caràcters ha de ser vàlid");
    }

    @Test
    void testUsernameMassaCurt() {
        // Comprovem noms per sota del límit
        assertFalse(validator.isValidUsername("Jo"), "Un nom de 2 caràcters NO ha de ser vàlid");
        assertFalse(validator.isValidUsername(""), "Una cadena buida NO ha de ser vàlida");
    }

    @Test
    void testUsernameEsNul() {
        // Comprovem el cas on l'string és completament nul
        assertFalse(validator.isValidUsername(null), "Un nom nul NO ha de ser vàlid");
    }

    // ==========================================
    // 2. Proves per a isAdult (Casos límit: 17, 18, 19)
    // ==========================================

    @Test
    void testIsAdultLimits() {
        assertFalse(validator.isAdult(17), "Amb 17 anys no és adult");
        assertTrue(validator.isAdult(18), "Amb 18 anys ja és adult (Límit)");
        assertTrue(validator.isAdult(19), "Amb 19 anys és adult");
    }

    // ==========================================
    // 3. Prova d'excepció per a validateRequiredText
    // ==========================================

    @Test
    void testValidateRequiredTextAmbCadenaBuidaLlançaExcepció() {

        // Cas 1: Només espais en blanc
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText("   ");
        });

        // Cas 2: Valor nul
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText(null);
        });
    }
}
