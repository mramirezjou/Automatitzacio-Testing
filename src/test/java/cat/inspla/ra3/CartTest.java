package cat.inspla.ra3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {


    private Cart cart;

    @BeforeEach
    void setUp() {

        cart = new Cart();
    }

    @Test
    void testCartNovaTeTotalZero() {
        // Una cistella acabada de crear ha de tenir total 0 i 0 elements
        assertEquals(0.0, cart.getTotal(), 0.001, "El total inicial ha de ser 0");
        assertEquals(0, cart.getItemCount(), "La cistella inicial no ha de tenir articles");
    }

    @Test
    void testAfegirArticleIncrementaTotal() {
        // Afegim articles
        cart.addItem("Llibre", 15.50);
        cart.addItem("Bolígraf", 1.20);

        // Comprovem que el total s'ha sumat bé i que hi ha 2 articles
        assertEquals(16.70, cart.getTotal(), 0.001, "El total no s'ha incrementat correctament");
        assertEquals(2, cart.getItemCount(), "El comptador d'articles no és correcte");
    }

    @Test
    void testClearDeixaCistellaBuida() {
        // 1. Preparem l'estat afegint un article
        cart.addItem("Ordinador", 999.99);

        // 2. Executem l'acció que volem provar
        cart.clear();

        // 3. Verifiquem que ha quedat totalment neta
        assertEquals(0.0, cart.getTotal(), 0.001, "El total ha de ser 0 després de fer clear");
        assertEquals(0, cart.getItemCount(), "No hi ha d'haver cap article després de fer clear");
    }
}