import java.util.ArrayList;

public class Chromosome implements Comparable<Chromosome> {

    // implement checkValidChromosome

    private ArrayList<Route> routes;
    private int totalDistance;
    private ArrayList<Customer> restCustomers;

    public Chromosome() {
        this.routes = new ArrayList<>();
        this.restCustomers = new ArrayList<>();
    }

    @Override
    public String toString() {
        this.calculateTotalDistance();
        return ""+this.getTotalDistance();
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void addRoute(Route route){
        if (!this.routes.contains(route)){
            this.routes.add(route);
        }
    }

    public void calculateTotalDistance() {
        int distance = 0;
        for (Route route : this.routes) {
                distance += route.calculateRoute();
            }
        this.totalDistance = distance;
    }

    public ArrayList<Customer> getRestCust() {
        return restCustomers;
    }

    public void addRestCustomer(Customer customer) {
        this.restCustomers.add(customer);
    }

    public ArrayList<Customer> getRestCustomers(){
        return this.restCustomers;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int compareTo(Chromosome o1) {
        return (this.totalDistance - o1.totalDistance);
    }
}
