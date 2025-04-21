package state;

public class RedLightState implements TrafficLightState {
    public void changeState(TrafficLightContext context) {
        System.out.println("Red Light - STOP");
        context.setState(new GreenLightState());
    }
}

