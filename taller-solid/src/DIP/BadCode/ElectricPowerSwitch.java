package DIP.BadCode;

import DIP.CorrectCode.Switch;

public class ElectricPowerSwitch implements Switch {
    public LigthBulb lb;
    public boolean on;
    public ElectricPowerSwitch(LigthBulb lb) {
        this.lb = lb;
        this.on= false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lb.apagar();;
            this.on = false;
        } else {
            lb.encender();
            this.on = true;
        }
    }

}
