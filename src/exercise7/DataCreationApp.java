package exercise7;

public class DataCreationApp {
    public static void main(String[] args) {
        String filePath = "rainfall_data.txt"; // Provide the file path where you want to save the data

        int no = 1;
        String stationId = "2421003";
        String station = "Simpang Ampat";
        String district = "Alor Gajah";
        String lastUpdated = "9/6/2023 10:00";
        double[] dailyRainfall = {4.0, 1.0, 0.0, 6.0, 19.0, 1.0};
        double rainfallFromMidnight = 0.0;
        double totalOneHour = 0.0;

        RainfallData data = new RainfallData(no, stationId, station, district, lastUpdated, dailyRainfall,
                rainfallFromMidnight, totalOneHour);

        RainfallDataWriter writer = new RainfallDataWriter(filePath);
        writer.writeToFile(data);
    }
}
