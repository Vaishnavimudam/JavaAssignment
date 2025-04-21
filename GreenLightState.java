package state;

public class GreenLightState implements TrafficLightState {
    public void changeState(TrafficLightContext context) {
        System.out.println("Green Light - GO");
        context.setState(new YellowLightState());
    }
}

