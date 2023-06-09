package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RainfallDataReader {
    private String filePath;

    public RainfallDataReader(String filePath) {
        this.filePath = filePath;
    }

    public RainfallData readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int no = Integer.parseInt(reader.readLine());
            String stationId = reader.readLine();
            String station = reader.readLine();
            String district = reader.readLine();
            String lastUpdated = reader.readLine();
            
            String[] rainfallValues = reader.readLine().split(",");
            double[] dailyRainfall = new double[rainfallValues.length];
            for (int i = 0; i < rainfallValues.length; i++) {
                dailyRainfall[i] = Double.parseDouble(rainfallValues[i]);
            }

            double rainfallFromMidnight = Double.parseDouble(reader.readLine());
            double totalOneHour = Double.parseDouble(reader.readLine());

            return new RainfallData(no, stationId, station, district, lastUpdated,
                                    dailyRainfall, rainfallFromMidnight, totalOneHour);
        } catch (IOException e) {
            System.out.println("Error reading data from the file: " + filePath);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing numeric value from the file: " + filePath);
            e.printStackTrace();
        }

        return null;
    }

}
