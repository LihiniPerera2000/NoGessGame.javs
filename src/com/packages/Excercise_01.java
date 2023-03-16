package com.packages;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excercise_01 {
    public static void main (String[] args) {
        try {
            File f1 = new File("InputFile.txt");
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();


                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected error occured");
            exception.printStackTrace();
        }
    }
}

