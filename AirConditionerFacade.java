package facade;

public class AirConditionerFacade {
 private CoolingSystem coolingSystem;
 private FanSystem fanSystem;
 private TemperatureControlSystem temperatureControlSystem;
 
 public AirConditionerFacade(CoolingSystem coolingSystem, FanSystem fanSystem, TemperatureControlSystem temperatureControlSystem) {
     this.coolingSystem = coolingSystem;
     this.fanSystem = fanSystem;
     this.temperatureControlSystem = temperatureControlSystem;
 }

 public void turnOnAC(int temperature) {
     System.out.println("Turning on the AC...");
     coolingSystem.turnOnCooling();
     fanSystem.turnOnFan();
     temperatureControlSystem.setTemperature(temperature);
 }

 public void turnOffAC() {
     System.out.println("Turning off the AC...");
     coolingSystem.turnOffCooling();
     fanSystem.turnOffFan();
     temperatureControlSystem.resetTemperature();
 }
}
