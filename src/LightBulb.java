public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Bulb turned on....");
    }

    @Override
    public void turnOff() {
        System.out.println("bulb turned off....");
    }
}
