package DIP;

import DIP.BadCode.ElectricPowerSwitch;
import DIP.CorrectCode.LightBulb;
import DIP.CorrectCode.Switch;
import DIP.CorrectCode.Switchable;
import DIP.CorrectCode.Tv;

public class Main {
        public static void main(String[] args) {
            Switchable switchbulb = new LightBulb();
            Switch bulbswitch = new ElectricPowerSwitch(switchbulb);
            bulbswitch.press();
            bulbswitch.press();


            Switchable switchTV=new Tv();
            Switch TVPowerSwitch=new ElectricPowerSwitch(switchTV);
            switchTV.press();
            switchTV.press();
        }


}
