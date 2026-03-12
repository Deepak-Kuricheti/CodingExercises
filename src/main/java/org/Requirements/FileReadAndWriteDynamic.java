package org.Requirements;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileReadAndWriteDynamic {

    static void main() {
        //we use Regex and Dynamic output file creation
        //input file, sploit with regex, dynamic output files

        String inputFile = "inputFolder/randomInput.txt";
        String outputFile = "outputFolder/";

        Map<Integer, BufferedWriter> writers = new HashMap<>();
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] str = line.split("[!,@,#,$,%,^,&,*, ,' ',?,_,-]"); //hello@world_welcome
                for (int i = 0; i < str.length; i++) {

                    //  writers.put(i,new BufferedWriter(new FileWriter(outputFile+i+1)));
                    BufferedWriter writer = writers.get(i);
                    if (writer == null) {
                        writer = new BufferedWriter(new FileWriter((outputFile + "File " + (i + 1)), true));
                        writers.put(i, writer);
                    }
                    writer.write(str[i]);
                    writer.newLine();

                }


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            for (BufferedWriter writer : writers.values()) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

