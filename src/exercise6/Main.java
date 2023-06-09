package exercise6;

public class Main {
    public static void main(String[] args) {
        String filePath = "rainfall_data.txt"; // Provide the file path where you want to save the data

        int no = 1;
        String stationId = "2421003";
        String station = "Simpang Ampat";
        String district = "Simpang Ampat";
        String lastUpdated = "09/06/2023 10:00:00"; 
        double[] dailyRainfall = {0.5, 0.2, 0.8, 1.0, 0.5, 0.7};
        double rainfallFromMidnight = 0.0;
        double totalOneHour = 0.0;

        RainfallData data = new RainfallData(no, stationId, station, district, lastUpdated, dailyRainfall, rainfallFromMidnight, totalOneHour);

        RainfallDataWriter writer = new RainfallDataWriter(filePath);
        writer.writeToFile(data);
      

    }
}



