package facade;
public class TemperatureControlSystem {
 public void setTemperature(int temperature) {
     System.out.println("Temperature set to " + temperature + " degrees.");
 }

 public void resetTemperature() {
     System.out.println("Temperature is reset to default.");
 }
}
