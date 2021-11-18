package domain;
import data.SaveFile;

import java.util.ArrayList;

public class ValidateAsHaiku {

    char[] vowels = {'a', 'e', 'i', 'o', 'u','æ', 'ø', 'å'};
    String name;
    int ID;

    public ValidateAsHaiku (String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void validate(ArrayList<String> lines) {
        if(lines.size() != 4) {
            System.out.println("Not a valid haiku poem");
        } else {
            int syllablesLine1 = numberOfSyllables(lines.get(0));
            int syllablesLine2 = numberOfSyllables(lines.get(1));
            int syllablesLine3 = numberOfSyllables(lines.get(2));
            if (syllablesLine1 == 5 && syllablesLine2 == 7 && syllablesLine3 == 5) {
                System.out.println("The poem is a valid Haiku poem, and has been written to a file.");
                SaveFile save = new SaveFile(lines.get(0), lines.get(1), lines.get(2), name, ID);
            } else {
                System.out.println("Not a valid haiku poem2");
            }
        }
    }
    public int numberOfSyllables(String line) {
        int syllables = 0;
        char[] lineArray = line.toCharArray();
        for(int i = 0; i < lineArray.length; i++) {
            for (int u = 0; u < 8; u++) {
                if(lineArray[i] == vowels[u]) {
                    syllables++;
                }
            }
        }
        return syllables;
    }
}
