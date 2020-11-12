package DIP.CorrectCode;

public class Tv implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("TV: TV turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("TV: TV turned off...");
    }
}
