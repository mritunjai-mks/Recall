package com.in.edleFile;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class EdlEntry {
    String startTime;
    String endTime;

    public EdlEntry(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Start Time: " + startTime + ", End Time: " + endTime;
    }
}

public class EdlParser {
    public static void main(String[] args) {
        String filePath = "C:/Users/Mritunjai Sharma/Downloads/eldFilePath/edlfile.edl";// Replace with your actual file path
        List<EdlEntry> entries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            Pattern pattern = Pattern.compile("\\d+\\s+AX\\s+AA/V\\s+C\\s+(\\d{2}:\\d{2}:\\d{2}:\\d{2})\\s+(\\d{2}:\\d{2}:\\d{2}:\\d{2})");

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String startTime = matcher.group(1);
                    String endTime = matcher.group(2);
                    entries.add(new EdlEntry(startTime, endTime));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print extracted start & end times
        for (EdlEntry entry : entries) {
            System.out.println(entry);
        }
    }
}
