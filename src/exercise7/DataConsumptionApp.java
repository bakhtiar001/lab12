package exercise7;

public class DataConsumptionApp {
    public static void main(String[] args) {
        String filePath = "rainfall_data.txt"; // Provide the file path where the data is stored

        RainfallDataReader reader = new RainfallDataReader(filePath);
        RainfallData data = reader.readFromFile();

        if (data != null) {
            RainfallDataView view = new RainfallDataView();
            view.displayData(data);

            RainfallDataAnalyzer analyzer = new RainfallDataAnalyzer();
            double averageRainfall = analyzer.computeAverage(data);
            System.out.println("Average Rainfall: " + averageRainfall);
        }
    }
}
