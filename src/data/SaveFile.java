package data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class SaveFile {

    private String firstLine;
    private String secondLine;
    private String thirdLine;
    private String name;
    private int ID;

    public SaveFile(String firstLine, String secondLine, String thirdLine, String name, int ID) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        this.name = name;
        this.ID = ID;
        getFile();
    }

    private void getFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/Haiku"));
            writer.write(firstLine);
            writer.write("\n" + secondLine);
            writer.write("\n" + thirdLine);
            writer.write("\n\t\tAuthor: " + name);
            writer.write("\n\t\tID: " + ID);
            writer.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
