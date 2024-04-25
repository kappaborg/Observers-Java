package Observers;
public class Main
{
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        Display display1 = new Display();
        Display display2 = new Display();
        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);
        weatherData.setMeasurements(75,65,30.4f);
        weatherData.setMeasurements(80,70,29.4f);
    }
}
