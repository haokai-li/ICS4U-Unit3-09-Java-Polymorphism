/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-30
*
*/

/**
* This is the standard "lock" program.
*/
public class Vehicle {
    /**
    * Colour.
    */
    private String colour;
    /**
    * Speed.
    */
    private int speed;
    /**
    * MaxSpeed.
    */
    private int maxSpeed;
    /**
    * Tires.
    */
    private int tires;

    /**
    * Read Only Property.
    *
    * @param speedInput speed
    * @param maxSpeedInput maxspeed
    * @param tiresInput tires
    */
    public Vehicle(final int speedInput,
                   final int maxSpeedInput,
                   final int tiresInput) {
        this.speed = speedInput;
        this.maxSpeed = maxSpeedInput;
        this.tires = tiresInput;
    }

    /**
    * Set colour.
    *
    * @param colourInput colour
    *
    */
    public void setColour(final String colourInput) {
        this.colour = colourInput;
    }

    /**
    * Get color.
    *
    * @return getColour
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Get tires.
    *
    * @return getTires
    */
    public int getTires() {
        return this.tires;
    }

    /**
    * Getting speed.
    *
    * @return getSpeed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getting max speed.
    *
    * @return getMaxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Add stack.
    *
    * @param speedAdd add
    */
    public void accelerate(final int speedAdd) {
        if (speedAdd < 0) {
            this.speed += 0;
        } else if (speedAdd > this.maxSpeed) {
            this.speed += this.maxSpeed;
        } else {
            this.speed += speedAdd;
        }
    }

    /**
    * Minus stack.
    *
    * @param speedMinus minus
    */
    public void brake(final int speedMinus) {
        if (speedMinus < 0) {
            this.speed -= 0;
        } else if (speedMinus > this.speed) {
            this.speed -= this.speed;
        } else {
            this.speed -= speedMinus;
        }
    }
}

