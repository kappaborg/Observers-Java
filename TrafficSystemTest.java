package Observers;

public class TrafficSystemTest {
    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        TrafficObserver trafficObserver1 = new TrafficObserverImpl("Observer 1");
        TrafficObserver trafficObserver2 = new TrafficObserverImpl("Observer 2");
        traffic.addObserver(trafficObserver1);
        traffic.addObserver(trafficObserver2);
        traffic.notifyObservers();
        readAndDisplaySensorData();
    }
    private static void readAndDisplaySensorData() {
        System.out.println("SYSTEM DEFAULT MESSAGE HIGHWAY SPEED LIMIT IS 140 kph");
        //Sensor camera = new TrafficCamera();
        //Sensor loopSensor = new InductiveLoopSensor();
        //Sensor radar = new RadarSensor();
        //Sensor laser = new LaserSensor();
        Sensor gps = new GPSSensor();
        Sensor bluetooth = new BluetoothBeacon();
        Sensor trafficlight = new TrafficLightSensor();
        System.out.println("Don't forget to check your tiers before drive.\n Always use seatbelt");
        Sensor weather = new WeatherSensor();
        // Read data from sensors
        //TrafficData cameraData = camera.readData();
        //TrafficData loopSensorData = loopSensor.readData();
        //TrafficData radarData = radar.readData();
        //TrafficData laserData = laser.readData();
        TrafficData gpsData = gps.readData();
        TrafficData bluetoothData = bluetooth.readData();
        TrafficData trafficlightData = trafficlight.readData();
        TrafficData weatherData = weather.readData();
        // Display sensor data
        System.out.println("GPS data: " + gpsData);
        System.out.println("Bluetooth data :" +bluetoothData);
        System.out.println("TrafficLight Data :" + trafficlightData);
        System.out.println("Weather data :" + weatherData);
        //System.out.println("Camera data: " + cameraData);
        //System.out.println("Inductive loop sensor data: " + loopSensorData);
        //System.out.println("Radar data: " + radarData);
        //System.out.println("Laser data: " + laserData);
    }
}
class TrafficObserverImpl implements TrafficObserver {
    private String name;
    public TrafficObserverImpl(String name) {
        this.name = name;
    }
    public void update(TrafficData trafficData) {
        System.out.println(name + " received traffic data: " + trafficData);
    }
}
