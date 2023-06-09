package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataConsumptionApp {
    private String filePath;

    public DataConsumptionApp(String filePath) {
        this.filePath = filePath;
    }

    public void consumeData() {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(filePath))) {
            int no = inputStream.readInt();
            String stationId = inputStream.readUTF();
            String station = inputStream.readUTF();
            String district = inputStream.readUTF();
            String lastUpdated = inputStream.readUTF();
            double[] dailyRainfall = new double[6];
            for (int i = 0; i < 6; i++) {
                dailyRainfall[i] = inputStream.readDouble();
            }
            double rainfallFromMidnight = inputStream.readDouble();
            double totalOneHour = inputStream.readDouble();

            RainfallData data = new RainfallData(no, stationId, station, district, lastUpdated, dailyRainfall,
                    rainfallFromMidnight, totalOneHour);

            RainfallDataView dataView = new RainfallDataView();
            dataView.displayData(data);

            RainfallDataAnalyzer dataAnalyzer = new RainfallDataAnalyzer();
            double average = dataAnalyzer.computeAverage(data);
            System.out.println("Average rainfall: " + average);
        } catch (IOException e) {
            System.out.println("Error reading data from the file: " + filePath);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "rainfall_data.bin"; // Provide the file path where the data is stored

        DataConsumptionApp app = new DataConsumptionApp(filePath);
        app.consumeData();
    }
}
