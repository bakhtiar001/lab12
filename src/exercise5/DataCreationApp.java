package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataCreationApp {
    private String filePath;

    public DataCreationApp(String filePath) {
        this.filePath = filePath;
    }

    public void createData() {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeInt(1);
            outputStream.writeUTF("2421003");
            outputStream.writeUTF("Simpang Ampat");
            outputStream.writeUTF("Alor Gajah");
            outputStream.writeUTF("9/6/2023 10:00");
            outputStream.writeDouble(4);
            outputStream.writeDouble(1);
            outputStream.writeDouble(0);
            outputStream.writeDouble(6);
            outputStream.writeDouble(19);
            outputStream.writeDouble(1);
            outputStream.writeDouble(0);
            outputStream.writeDouble(0);
            
            System.out.println("Data has been created and written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing data to the file: " + filePath);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "rainfall_data.bin"; // Provide the file path where you want to save the data

        DataCreationApp app = new DataCreationApp(filePath);
        app.createData();
    }
}
