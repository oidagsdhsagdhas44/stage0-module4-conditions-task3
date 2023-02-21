package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!(character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) System.out.println("English");
        else System.out.println("Non English");
    }
}
