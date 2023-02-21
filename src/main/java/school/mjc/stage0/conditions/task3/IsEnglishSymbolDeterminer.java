package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')){
            if (symbol == 'A' || symbol == 'a' ||
                    symbol == 'E' || symbol == 'e' ||
                    symbol == 'I' || symbol == 'i' ||
                    symbol == 'O' || symbol == 'o' ||
                    symbol == 'U' || symbol == 'u') System.out.println("Vowel");
            else System.out.println("Consonant");
        }
        else System.out.println("wrong alphabet!");
    }
}
