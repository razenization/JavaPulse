package hw01;

// import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // String request = scan.nextLine();
        CVehicle[] cVehicles = new CVehicle[3];
        cVehicles[0] = new CShip(51, 4421);
        cVehicles[1] = new CCar();
        cVehicles[1].setPrice(25000);
        cVehicles[1].setReleaseYear(2016);
        cVehicles[1].setSpeed(150);
        cVehicles[2] = new CPlane(155, 2000);
        for (CVehicle i : cVehicles) {
            System.out.println(i);
        }
    }
}