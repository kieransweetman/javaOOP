package entities;

public class Theater {

    String name;
    int maxOccupants;
    int totalClients;
    double totalRevenue;

    public Theater(String name, int maxOccupants, int totalClients, double totalRevenue) {
        this.name = name;
        this.maxOccupants = maxOccupants;
        this.totalClients = totalClients;
        this.totalRevenue = totalRevenue;

        System.out.println("total clients possible: " + this.maxOccupants);

    }

    public void signUp(int numOfClients, double price) {
        if (this.totalClients == maxOccupants || reachedMaxOcc(numOfClients))
            throw new Error(
                    "\nReached max occupancy: " + this.totalClients + ".\nTried to add " + numOfClients
                            + " client(s). \nMax is " + this.maxOccupants);

        this.setTotalClients(numOfClients);
        this.setTotalRevenu(price + this.getTotalRevenu());
    }

    public void setTotalClients(int clients) {
        this.totalClients += clients;
    }

    public double getTotalRevenu() {
        return this.totalRevenue;
    }

    public void setTotalRevenu(double revenu) {
        this.totalRevenue = revenu;
    }

    private boolean reachedMaxOcc(int clientsToAdd) {
        return clientsToAdd + this.totalClients >= this.maxOccupants;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nadded clients. New number of clients is now: " + this.totalClients + "\nnew revenu total: "
                + this.getTotalRevenu();

    }
}
