import java.util.Scanner;
import abstractfactory.*;
import factorymethod.*;
import application.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");
        String modeInput = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");
        String platformInput = scanner.nextLine().trim().toUpperCase();

        Logistics logistics = configureLogistics(modeInput);
        GUIFactory factory = configureGUI(platformInput);

        if (logistics != null && factory != null) {
            System.out.println("\n--- Application Execution ---");
            DeliveryApplication app = new DeliveryApplication(factory, logistics);
            app.executeApp("gummy bears", "Semey");
        } else {
            System.out.println("Application stopped due to invalid configuration.");
        }

        scanner.close();
    }

    private static Logistics configureLogistics(String mode) {
        return switch (mode) {
            case "ROAD" -> new RoadLogistics();
            case "SEA" -> new SeaLogistics();
            default -> {
                System.out.println("Error: Unsupported delivery mode -> " + mode);
                yield null;
            }
        };
    }

    private static GUIFactory configureGUI(String platform) {
        return switch (platform) {
            case "WINDOWS" -> new WindowsFactory();
            case "MACOS" -> new MacOSFactory();
            default -> {
                System.out.println("Error: Unsupported UI platform -> " + platform);
                yield null;
            }
        };
    }
}