package org.Requirements;

import java.io.*;

public class SimpleFileReadAndWrite {

    // Read an input txt file from one folder nd split to two txt files nd paste in another folder based on delimeters
    // input location, outputlocation, reader class, writer class, string split

    static void main() {

        //input and output location
        String inputFile = "inputFolder/names.txt";
        String outputFile1 = "outputFolder/husband.txt";
        String outputFile2 = "outputFolder/wife.txt";

        //using try with resources to use reader and writer classes
        if (new File(inputFile).exists()) {
            System.out.println("Input file exists");
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer1 = new BufferedWriter(new FileWriter(outputFile1));
                    BufferedWriter writer2 = new BufferedWriter(new FileWriter(outputFile2));
            ) {
                String line;
                while((line = reader.readLine())!=null){
                    String[] names = line.split("@");
                    if(names.length == 2) {
                        writer1.write(names[0]);
                        writer1.newLine();

                        writer2.write(names[1]);
                        writer2.newLine();
                    }
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
