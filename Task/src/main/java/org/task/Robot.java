package org.task;

import java.util.Random;

/**
 * This class models a robot.
 */
public class Robot {

    private int serialNumber;
    private int activationRound;
    private int deactivationRound;
    private boolean activated;
    private boolean healthStatus;

    public Robot(int serialNumber, int activationRound, int deactivationRound) {
        this.serialNumber = serialNumber;
        this.activationRound = activationRound;
        this.deactivationRound = deactivationRound;
        this.activated = false;
        this.healthStatus = true;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getActivationRound() {
        return activationRound;
    }

    public int getDeactivationRound() {
        return deactivationRound;
    }

    public boolean isActivated() {

        return activated;
    }

    public boolean isHealthStatus() {
        return healthStatus;
    }


    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setHealthStatus(boolean healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * This method generates a workload for the robot.
     *
     * @param r a random number generator
     * @return the workload
     */
    public int generateWorkload(Random r) {
        int low = 1;
        int high = 100;
        return r.nextInt(high - low) + low;
    }

    @Override
    public String toString() {
        return "Robot: " + serialNumber + " activation round: " + activationRound + " deactivation round: " + deactivationRound + " activated: " + activated + " healthStatus: " + healthStatus;
    }
}
