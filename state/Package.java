package state;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }

    public String order(){
        this.state = orderedState;
        return this.state.getStatus() + "\n" + this.state.getETA();
    }

    public String mail(){
        this.state = inTransitState;
        return this.state.getStatus() + "\n" + this.state.getETA();
    }

    public String received(){
        this.state = deliveredState;
        return this.state.getStatus();
    }

    public String delay(){
        return this.state.delay();
    }

    public String getName(){
        return this.name;
    }
}
