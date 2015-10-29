package org.robockets.tshirtcannon.sensors;

import edu.wpi.first.wpilibj.AnalogInput;
import org.robockets.tshirtcannon.sensors.DistanceSensor;

/**
 * Class that represents the distance sensor that keeps everyone safe.
 * Currently a GP2D120XJ00F until we know what it will really be.
 * @deprecated GP2D120XJ00F until it exists IRL
 */
@Deprecated
public class SafetySensor extends DistanceSensor {
    public SafetySensor(AnalogInput sensor) {
        super(sensor);
    }

    public double getDistance() {
        double voltage = sensor.getVoltage();
        double distance = 17.298 * Math.pow(voltage, 2) - 66.8913 * voltage + 58.504; //TODO: not use exponents

        if (distance < 0) { // Filter out values less than 0
            return 0;
        }

        return distance;
    }

    public double getVoltage () {
        return sensor.getVoltage();
    }
}
