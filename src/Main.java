public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("A12", 40, "Route 1");
        Bus bus2 = new Bus("B55", 55, "Route 3");
        Bus bus3 = new Bus("C20", 30, "Route 5");

        Bus[] allBuses = { bus1, bus2, bus3 };

        TransportService service = new TransportService("City Transport", allBuses);

        Commuter c1 = new Commuter("Arman", 20, false);
        Commuter c2 = new Commuter("Dina", 18, true);

        c1.buyTicket();
        c1.printInfo();
        c2.printInfo();

        System.out.println();

        bus1.boardPassenger();
        bus1.boardPassenger();
        bus1.printInfo();

        System.out.println();

        service.printAllBuses();

        System.out.println();

        Bus largest = service.findLargestBus();
        System.out.println("Bus with largest capacity: " +
                largest.getBusNumber() + " (" + largest.getCapacity() + " seats)");

        if (bus1.getCapacity() > bus2.getCapacity()) {
            System.out.println("Bus " + bus1.getBusNumber() + " is bigger than " + bus2.getBusNumber());
        } else {
            System.out.println("Bus " + bus2.getBusNumber() + " is bigger than " + bus1.getBusNumber());
        }
    }
}
