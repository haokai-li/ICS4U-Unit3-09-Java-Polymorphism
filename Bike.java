/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-30
*
*/

/**
* This is the standard "Bike" program.
*/
public class Bike extends Vehicle {
    /**
    * Cadence.
    */
    private int cadence;

    /**
    * Read Only Property.
    *
    * @param speedInput speed
    * @param maxSpeedInput maxspeed
    * @param tiresInput tires
    */
    public Bike(final int speedInput,
                final int maxSpeedInput,
                final int tiresInput) {
        super(speedInput, maxSpeedInput, tiresInput);
    }

    /**
    * Getting cadence.
    *
    * @return getCadence
    */
    public int getSpeed() {
        return super.getSpeed();
    }

    /**
    * Setting Cadence.
    *
    * @param cadenceAdd set
    */
    public void setSpeed(final int cadenceAdd) {
        this.cadence = cadenceAdd;
        if (this.cadence > 0) {
            accelerate(this.cadence);
        } else if (this.cadence < 0) {
            brake(this.cadence);
        }
    }

    /**
    * Ring Bell.
    *
    * @param ringBellAdd set
    */
    public void ringBell(final String ringBellAdd) {
        if ("y".equals(ringBellAdd)) {
            System.out.println("Bicycle bell on.");
        } else {
            System.out.println("Bicycle bell off.");
        }
    }
}
