package Generation.org;

import java.text.Normalizer;

public class Palindrome {

    /**
     * Retorna true si el texto es palíndromo.
     * Reglas:
     *  - Ignora mayúsculas/minúsculas
     *  - Ignora espacios y signos de puntuación
     *  - Quita acentos/diacríticos (opcional pero útil)
     */
    public boolean isPalindrome(String text) {
        if (text == null) return false;

        // Normaliza: quita acentos y caracteres no alfanuméricos, y pasa a minúsculas
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")               // quita diacríticos (á -> a)
                .replaceAll("[^0-9A-Za-z]", "")         // deja solo letras y números
                .toLowerCase();

        if (normalized.isEmpty()) return false;

        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
}
