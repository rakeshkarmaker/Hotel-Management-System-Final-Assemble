package com.fileio;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class FileHandling {

    private File tempFile = new File(System.getProperty("user.dir") + "\\file\\Temp.txt");
    private File file = new File(System.getProperty("user.dir") + "\\file\\Create.txt");

    private String getDataFromFile(String search) {
        String currentData = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {

                currentLine = currentLine.trim();
                String[] trimLine = currentLine.split("!");
                if (trimLine[0].equals(search.trim())) {
                    currentData = trimLine[0];
                }
            }
            writer.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentData;
    }

    public void editLineFromFile(String Search, String lineToAdd) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;
            String currentData;
            String updatedAt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            while ((currentLine = reader.readLine()) != null) {
                currentLine = currentLine.trim();
                String[] trimLine = currentLine.split("!");
                if (trimLine[0].equals(Search.trim())) {
                    writer.write(lineToAdd + "!" + updatedAt + "\n");
                    continue;
                }
                writer.write(currentLine + "\n");
            }
            writer.close();
            reader.close();
            BufferedWriter BW = new BufferedWriter(new FileWriter(file));
            BufferedReader BR = new BufferedReader(new FileReader(tempFile));

            while ((currentData = BR.readLine()) != null) {
                BW.write(currentData + "!\n");
            }
            BW.close();
            BR.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
