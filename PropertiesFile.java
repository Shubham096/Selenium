import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
        readPropertiesFile();
    }

    public static void readPropertiesFile() {

        try {
            InputStream input = new FileInputStream("C:\\Users\\DeLL\\IdeaProjects\\Practice\\src\\config.properties");
            prop.load(input);
            System.out.println(prop.getProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writePropertiesFile() {
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\DeLL\\IdeaProjects\\Practice\\src\\config.properties");
            prop.setProperty("browser", "Chrome");
            // prop.setProperty("result", "pass");
            prop.store(output, "changed");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
