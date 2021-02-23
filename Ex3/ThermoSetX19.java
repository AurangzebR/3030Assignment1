
import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;

public class ThermoSetX19 implements Thermostat{
    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature;

    public ThermoSetX19(){
        FrontEnd t = new FrontEnd(this);
        t.pack();
        t.setVisible(true);
    }

    public void newTemperature(int i) { this.temperature=i; }

    public ControllerInterface getController() {
        return this.c;
    }

    public void setController(ControllerInterface c) {
        this.c = c;
    }

    public String getID() { return this.ID; }

    public void setID(String ID) { this.ID = ID; }

    public boolean enabled() {
            return this.enabled;
        }

    public void enable() {
            this.enabled = true;
        }

    public void disable() {
            this.enabled = false;
        }

    public int getReading() { return this.temperature;}
}
