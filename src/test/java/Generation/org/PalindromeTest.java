package Generation.org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Pruebas de Palindrome.isPalindrome")
class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void init() {
        palindrome = new Palindrome();
    }

    // Casos exactos que marcaste en tu captura
    @Test
    @DisplayName("Casos básicos solicitados")
    void basicCases() {
        assertEquals(true,  palindrome.isPalindrome("Oso"));
        assertEquals(false, palindrome.isPalindrome("Ver"));
        assertEquals(false, palindrome.isPalindrome("Hola"));
        assertEquals(false, palindrome.isPalindrome("Ocho"));
        assertEquals(false, palindrome.isPalindrome("Veronica"));
        assertEquals(true,  palindrome.isPalindrome("Anita lava la tina"));
    }

    // Parametrizados (más compactos y escalables)
    @ParameterizedTest(name = "''{0}'' ¿palíndromo? -> {1}")
    @CsvSource({
        "Oso, true",
        "Ver, false",
        "Hola, false",
        "Ocho, false",
        "Veronica, false",
        "'Anita lava la tina', true",
        "'¿Acaso hubo búhos acá?', true",
        "'A mamá Roma le aviva el amor a papá y a papá Roma le aviva el amor a mamá', true"
    })
    void csvCases(String input, boolean expected) {
        assertEquals(expected, palindrome.isPalindrome(input));
    }

    @ParameterizedTest
    @DisplayName("Ignora mayúsculas, espacios y signos")
    @ValueSource(strings = {
        "Anita lava la tina",
        "Anita   lava   la   tina",
        "ANITA LAVA LA TINA",
        "aNiTa, lAvA; lA tiNa!"
    })
    void ignoresCaseSpacesAndPunctuation(String s) {
        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    @DisplayName("Quita acentos/diacríticos")
    void removesAccents() {
        assertTrue(palindrome.isPalindrome("¿Acasó hubó búhós acá?"));
    }

    @Test
    @DisplayName("Casos borde: null y vacío")
    void edgeCases() {
        assertFalse(palindrome.isPalindrome(null));
        assertFalse(palindrome.isPalindrome(""));          // tras limpiar queda vacío
        assertFalse(palindrome.isPalindrome("   , . !"));  // solo signos/espacios
    }
}
