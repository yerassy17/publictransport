public class Bus {

    private String busNumber;
    private int capacity;
    private int passengers;
    private String route;

    public Bus() {
    }

    public Bus(String busNumber, int capacity, String route) {
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.route = route;
        this.passengers = 0;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void boardPassenger() {
        if (passengers < capacity) {
            passengers++;
        } else {
            System.out.println("Bus " + busNumber + " is full!");
        }
    }

    public void exitPassenger() {
        if (passengers > 0) {
            passengers--;
        }
    }

    public void printInfo() {
        System.out.println("Bus " + busNumber + " | Route: " + route +
                " | Passengers: " + passengers + "/" + capacity);
    }
}

