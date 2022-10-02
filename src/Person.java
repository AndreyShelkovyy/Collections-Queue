public class Person {
    protected String name;
    protected String sureName;
    protected int quantityTickets;

    public Person(String name, String sureName, int quantityTickets) {
        this.name = name;
        this.sureName = sureName;
        this.quantityTickets = quantityTickets;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }

}
