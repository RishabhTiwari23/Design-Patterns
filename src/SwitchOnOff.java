public class SwitchOnOff {
    private Switchable switchable;

    SwitchOnOff(Switchable switchable){
        this.switchable=switchable;
    }

    void operate(String function){
        if(function.equalsIgnoreCase("on")){
            switchable.turnOn();
        } else if (function.equalsIgnoreCase("off")) {
            switchable.turnOff();
        }else {
            throw new IllegalArgumentException("Either on || Off");
        }
    }
}
