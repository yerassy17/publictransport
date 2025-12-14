public class TransportService {

    private String serviceName;
    private Bus[] buses;

    public TransportService() {
    }

    public TransportService(String serviceName, Bus[] buses) {
        this.serviceName = serviceName;
        this.buses = buses;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Bus[] getBuses() {
        return buses;
    }

    public void setBuses(Bus[] buses) {
        this.buses = buses;
    }

    public void printAllBuses() {
        System.out.println("=== " + serviceName + " Bus List ===");
        for (Bus bus : buses) {
            bus.printInfo();
        }
    }

    public Bus findLargestBus() {
        Bus largest = buses[0];

        for (int i = 1; i < buses.length; i++) {
            if (buses[i].getCapacity() > largest.getCapacity()) {
                largest = buses[i];
            }
        }

        return largest;
    }
}

