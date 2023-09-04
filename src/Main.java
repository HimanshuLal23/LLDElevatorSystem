// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ElevatorHelper elevatorHelper = new ElevatorHelper();
        elevatorHelper.createFloors();
        try {
            elevatorHelper.execute();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}