public class Commuter {

    private String name;
    private int age;
    private boolean hasTicket;

    public Commuter() {
    }

    public Commuter(String name, int age, boolean hasTicket) {
        this.name = name;
        this.age = age;
        this.hasTicket = hasTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasTicket() {
        return hasTicket;
    }

    public void setHasTicket(boolean hasTicket) {
        this.hasTicket = hasTicket;
    }

    public void buyTicket() {
        hasTicket = true;
    }

    public void printInfo() {
        System.out.println("Commuter: " + name + " | Age: " + age +
                " | Has ticket: " + hasTicket);
    }
}