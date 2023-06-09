package exercise5;

public class RainfallDataView {
    public void displayData(RainfallData data) {
        System.out.println("No.\tStation ID\tStation\tDistrict\tLast Updated\tDaily Rainfall\tRainfall from Midnight\tTotal 1 Hour");
        System.out.print(data.getNo() + "\t");
        System.out.print(data.getStationId() + "\t\t");
        System.out.print(data.getStation() + "\t");
        System.out.print(data.getDistrict() + "\t");
        System.out.print(data.getLastUpdated() + "\t");
        for (double rainfall : data.getDailyRainfall()) {
            System.out.print(rainfall + "\t\t");
        }
        System.out.print(data.getRainfallFromMidnight() + "\t\t\t");
        System.out.print(data.getTotalOneHour() + "\n");
    }
}
