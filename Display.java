package Observers;
class Display implements Observer 
{
    public void update(float temperature,float humidity, float pressure){
        System.out.println("Weather Report:");
        System.out.println("Temperature: " + temperature + "F");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + "Pa");
        System.out.println();
    }
}
