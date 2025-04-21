package state;

public class YellowLightState implements TrafficLightState {
    public void changeState(TrafficLightContext context) {
        System.out.println("Yellow Light - GET READY");
        context.setState(new RedLightState());
    }
}

