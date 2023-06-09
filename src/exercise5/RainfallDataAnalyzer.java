package exercise5;

public class RainfallDataAnalyzer {
    public double computeAverage(RainfallData data) {
        double sum = 0;
        double[] dailyRainfall = data.getDailyRainfall();
        for (double rainfall : dailyRainfall) {
            sum += rainfall;
        }
        return sum / dailyRainfall.length;
    }
}
