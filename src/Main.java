//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Switchable fanSwitch=new Fan();
        SwitchOnOff fanSwitchOnOff =new SwitchOnOff(fanSwitch);
        fanSwitchOnOff.operate("ON");
        fanSwitchOnOff.operate("Off");

        Switchable lightSwitch =new LightBulb();
        SwitchOnOff lightSwitchOnOff=new SwitchOnOff(lightSwitch);
        lightSwitchOnOff.operate("ON");
        lightSwitchOnOff.operate("Off");
    }
}