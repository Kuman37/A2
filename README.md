# Logistics Delivery and UI Component Application

## Project Purpose
This Java application demonstrates the implementation of the **Factory Method** and **Abstract Factory** design patterns. It simulates a logistics system capable of planning road and sea deliveries, combined with a cross-platform GUI system that renders either Windows or macOS UI components. The application strictly adheres to Clean Code principles and Object-Oriented design contracts.

## Package Structure
All files are organized in the root directory (or default package) for simplicity, but logically divided into domain areas:
- **Logistics Domain (Factory Method)**: `Transport.java`, `Truck.java`, `Ship.java`, `Logistics.java`, `RoadLogistics.java`, `SeaLogistics.java`
- **UI Domain (Abstract Factory)**: `GUIFactory.java`, `Button.java`, `Checkbox.java`, `WindowsFactory.java`, `MacOSFactory.java`, along with their concrete product classes.
- **Client & Execution**: `DeliveryApplication.java`, `Main.java`

## Prerequisites
- Java Development Kit (JDK) 17 or higher.

## Build and Run Instructions
1. Open a terminal or command prompt and navigate to the directory containing the source files.
2. Compile all Java files using the following command:
   ```bash
   javac *.java
   ```
3. Run the application using the following command:
   ```bash
   java Main
   ```

## Supported Input Values
When prompted, you must enter one value from each category:
- **Delivery mode**: `ROAD` or `SEA` (case-insensitive)
- **UI platform**: `WINDOWS` or `MACOS` (case-insensitive)

## Sample Run
```text
Enter delivery mode (ROAD or SEA): ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS

--- Application Execution ---
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse by road.
```
## UML

PlantUML source files are in `uml/`:
- `factory-method.puml`<img width="650" height="357" alt="{F4CA43D3-F4B6-416B-B633-D50A66563D02}" src="https://github.com/user-attachments/assets/0019e63a-28de-471a-8be9-8810e11b4041" />

- `abstract-factory.puml`<img width="1071" height="332" alt="{564DE17C-1A75-4C5F-A6FF-7ED8729BDFAD}" src="https://github.com/user-attachments/assets/05536038-d600-483a-b2b8-a12736bc1daf" />
