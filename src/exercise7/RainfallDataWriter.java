package exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class RainfallDataWriter {
    private String filePath;

    public RainfallDataWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(RainfallData data) {
        try (Writer writer = new FileWriter(filePath)) {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(String.valueOf(data.getNo()));
            bufferedWriter.newLine();
            bufferedWriter.write(data.getStationId());
            bufferedWriter.newLine();
            bufferedWriter.write(data.getStation());
            bufferedWriter.newLine();
            bufferedWriter.write(data.getDistrict());
            bufferedWriter.newLine();
            bufferedWriter.write(data.getLastUpdated());
            bufferedWriter.newLine();
            for (double rainfall : data.getDailyRainfall()) {
                bufferedWriter.write(String.valueOf(rainfall));
                bufferedWriter.newLine();
            }
            bufferedWriter.write(String.valueOf(data.getRainfallFromMidnight()));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(data.getTotalOneHour()));
            bufferedWriter.newLine();
            bufferedWriter.flush(); // Flush the buffered writer
            System.out.println("Data has been written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing data to the file: " + filePath);
            e.printStackTrace();
        }
    }
}
