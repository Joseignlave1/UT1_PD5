//Parte 2
public class CountVocalsandConsonants {
    CharactersToCount charactersToCount;
    public enum CharactersToCount {
        VOWEL,
        CONSONANT,
    }
    private int vocalsCount;
    private int consonantCount;
    public CountVocalsandConsonants(CharactersToCount charactersToCount) {
        vocalsCount = 0;
        consonantCount = 0;
        this.charactersToCount = charactersToCount;
    }
    public int countPhrases(String phrase) {
        for(int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            switch (charactersToCount) {
                case VOWEL:
                    if(Character.isLetter(currentChar) && isVOWEL(currentChar)) {
                        vocalsCount++;
                    }
                break;
                case CONSONANT:
                    if(Character.isLetter(currentChar) && !isVOWEL(currentChar)) {
                        consonantCount++;
                    }
                break;
            }
        }
        System.out.println("Cantidad de vocales" + vocalsCount);
        System.out.println("Cantidad de consonantes" + consonantCount);
        return 0;
    }

    private boolean isVOWEL(char c) {
        String vocals = "AEIOUaeiou";
        String characterString = Character.toString(c);
        int index = vocals.indexOf(characterString);
        return index != -1; // sí c se encontró en el String vocals, retornamos true, false en caso contrario.
    }
    public static void main(String[] args) {
        CountVocalsandConsonants countVocalsandConsonants = new CountVocalsandConsonants(CharactersToCount.CONSONANT);
        System.out.println(countVocalsandConsonants.countPhrases("hola pf"));
        CountVocalsandConsonants countVocalsandConsonants1 = new CountVocalsandConsonants(CharactersToCount.VOWEL);
        System.out.println(countVocalsandConsonants1.countPhrases("Hola pf"));
    }
}

//indexOf() se utiliza para encontrar la posición de un carácter en una cadena.
// Devuelve el índice de la primera ocurrencia del carácter especificado en la cadena, o -1 si el
// carácter no se encuentra en la cadena.
