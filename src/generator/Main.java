package generator;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Item> itemList = new LinkedList<Item>();

        Scanner listReader = null;
        try {
            File list = new File("The Lists - Base Sheet.tsv");
            listReader = new Scanner(list);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, could not find the source file to get the pre built items from.");
            System.exit(0);
        }

        while(listReader.hasNextLine()){
            String newLine = listReader.nextLine();
        }
    }
}
