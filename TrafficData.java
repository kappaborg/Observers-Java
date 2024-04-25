package Observers;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class TrafficData {
    private String roadName;
    private String trafficCondition;
    private int congestionLevel;
    private long timestamp;
}
 class Traffic implements SubjectData {
    private List<TrafficObserver> observers;
    public Traffic() {
        this.observers = new ArrayList<>();
    }
    public void addObserver(TrafficObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(TrafficObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        TrafficData trafficData = readTrafficData();
        for (TrafficObserver observer : observers) {
            observer.update(trafficData);
        }
    }
    public Object getState() {
        // This method may not be needed depending on the application
        return null;
    }
    private TrafficData readTrafficData() {
        return new TrafficData();
    }
}
abstract class TrafficCamera implements Sensor {
    public TrafficData readData() {
            System.out.println("Enter camera type as(speed camera, safety belt camera, average speed camera)");
            Scanner kappa = new Scanner(System.in);
            String a = kappa.nextLine();
            String b = kappa.nextLine();
            String c = kappa.nextLine();
            if(a.equals(1)){
                 System.out.println("You have selected Speed Camera");
            }
            return new TrafficData();
    }
}
class InductiveLoopSensor implements Sensor {
    public TrafficData readData() {
        
        return new TrafficData();
    }
}
class RadarSensor implements Sensor {
    public TrafficData readData() {

        Scanner kappa = new Scanner(System.in);
        long x = kappa.nextLong(); // Our speed value(kph)
        long y = 140;
        if(x>=y){
            System.out.println("Decrese your speed");
        }
        return new TrafficData();
    }
}
class LaserSensor implements Sensor {
    @Override
    public TrafficData readData() {
        // Implementation to read traffic data from a laser sensor
        return new TrafficData();
    }
}
class GPSSensor implements Sensor {
    public TrafficData readData() {
        System.out.println("Enter latitude and longitude");
        Scanner kappa = new Scanner(System.in);
        long latitude = kappa.nextLong();
        long longitude = kappa.nextLong();
        long GPS1 = latitude; 
        long GPS2 = longitude;
        System.out.println("Latitude is : " + GPS1 + "Longitude is : " + GPS2);
        return new TrafficData();
    }
}
class BluetoothBeacon implements Sensor {
    public TrafficData readData() {
        return new TrafficData();
    }
}
 class TrafficLightSensor implements Sensor {
    public TrafficData readData() {
    System.out.println("Enter a light color(green,yellow,red)");
    Scanner kappa = new Scanner(System.in);
    String light = kappa.nextLine();
    String green2 = "green";
    String green3 = "red";
    String green4 = "yellow";
       if(light.equals(green2)){
           System.out.println("The Light is Green you can go");
    }
    if(light.equals(green3)){
        System.out.println("The Light is Red you need to stop");
    }
    if(light.equals(green4)){
        System.out.println("The Light is Yellow ");
    }
    else{
        System.out.println("You have entered undefined color");
    }
    return new TrafficData();
}
}
class WeatherSensor implements Sensor {
    public TrafficData readData() {
        System.out.println("Enter weather condition(sunny,rainy,windy,cloudy,snowy,foggy)");
        Scanner kappa = new Scanner(System.in);
        String weather = kappa.nextLine();
        String Sunny = "sunny";
        String Rainy = "rainy";
        String Windy = "windy";
        String Snowy = "snowy";
        String Foggy = "foggy";
        String Cloudy = "cloudy";
        if(weather.equals(Sunny)){
            System.out.println("Be careful about sunshine. Don't forget to use sunglasses");
        }
        if(weather.equals(Rainy)){
            System.out.println("Enter your speed");
            long x = kappa.nextLong();
            if(x>=140){
                System.out.println("WARNING! Decrease your speed");
            }
            else{
                System.out.println("WARNING! *RAINY* Be careful on road");
            }
        }
        if(weather.equals(Windy)){
            System.out.println("Be careful against tossing the vehicle");
        }
        if(weather.equals(Snowy)){
        System.out.println("Enter your tier type(summer tire,all season tire, snow tire)");
        String CheckTire = kappa.nextLine();
        String SummerTire = "summertire";
        String SummerTire1 = "summer tire";
            if(CheckTire.equals(SummerTire)||CheckTire.equals(SummerTire1)){
                System.out.println("Please use chain for you tire and change as soon as possible");
            }else{
            System.out.println("Your tire selection is true be careful on road");
        }
        }
        if(weather.equals(Foggy)){
            System.out.println("Turn on the fog lights");
        }
        if(weather.equals(Cloudy)){
            System.out.println("Weather is cloudy be careful about lightning");
        }
        return new TrafficData();
    }
}
 
