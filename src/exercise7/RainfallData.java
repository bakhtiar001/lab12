package exercise7;

public class RainfallData {
    private int no;
    private String stationId;
    private String station;
    private String district;
    private String lastUpdated;
    private double[] dailyRainfall;
    private double rainfallFromMidnight;
    private double totalOneHour;

    public RainfallData(int no, String stationId, String station, String district, String lastUpdated,
            double[] dailyRainfall, double rainfallFromMidnight, double totalOneHour) {
        this.no = no;
        this.stationId = stationId;
        this.station = station;
        this.district = district;
        this.lastUpdated = lastUpdated;
        this.dailyRainfall = dailyRainfall;
        this.rainfallFromMidnight = rainfallFromMidnight;
        this.totalOneHour = totalOneHour;
    }

    // Getters and setters

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double[] getDailyRainfall() {
        return dailyRainfall;
    }

    public void setDailyRainfall(double[] dailyRainfall) {
        this.dailyRainfall = dailyRainfall;
    }

    public double getRainfallFromMidnight() {
        return rainfallFromMidnight;
    }

    public void setRainfallFromMidnight(double rainfallFromMidnight) {
        this.rainfallFromMidnight = rainfallFromMidnight;
    }

    public double getTotalOneHour() {
        return totalOneHour;
    }

    public void setTotalOneHour(double totalOneHour) {
        this.totalOneHour = totalOneHour;
    }
}
