package exercise6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RainfallDataWriter {
    private String filePath;

    public RainfallDataWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(RainfallData data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.valueOf(data.getNo()));
            writer.newLine();
            writer.write(data.getStationId());
            writer.newLine();
            writer.write(data.getStation());
            writer.newLine();
            writer.write(data.getDistrict());
            writer.newLine();
            writer.write(data.getLastUpdated());
            writer.newLine();
            for (double rainfall : data.getDailyRainfall()) {
                writer.write(String.valueOf(rainfall));
                writer.newLine();
            }
            writer.write(String.valueOf(data.getRainfallFromMidnight()));
            writer.newLine();
            writer.write(String.valueOf(data.getTotalOneHour()));
            writer.newLine();
            System.out.println("Data has been written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing data to the file: " + filePath);
            e.printStackTrace();
        }
    }
}

