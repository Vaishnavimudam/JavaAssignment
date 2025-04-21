package state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        currentState = new RedLightState(); 
    }

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void applyState() {
        currentState.changeState(this);
    }
}

