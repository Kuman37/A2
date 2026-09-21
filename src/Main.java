import java.util.Scanner;
import factorymethod.*;
import abstractfactory.*;
import application.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Delivery mode (ROAD/SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        System.out.print("UI platform (WINDOWS/MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();

        Logistics logistics;

        if (deliveryMode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid delivery mode.");
            return;
        }

        GUIFactory guiFactory;

        if (platform.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Invalid UI platform.");
            return;
        }

        DeliveryApplication app =
                new DeliveryApplication(guiFactory, logistics);

        app.run();
    }
}