package org.task;

import java.util.Collections;
import java.util.List;

/**
 * This class models a controller.
 */
public class Controller {

    int controllerId;
    private List<Robot> robots;

    private int interactionCount;

    private static int MAX_INTERACTIONS = 100;

    public Controller(int controllerId, List<Robot> robots) {
        this.controllerId = controllerId;
        this.robots = robots;
        this.interactionCount = 0;
    }

    public int getControllerId() {
        return controllerId;
    }

    public List<Robot> getRobots() {
        return robots;
    }


    public void setInteractionCount(int interactionCount) {
        this.interactionCount = interactionCount;
    }


    /**
     * This method checks if the controller can still interact with robots.
     */
    private boolean canInteract() {
        return interactionCount < MAX_INTERACTIONS;
    }

    /**
     * This method repairs the robots that controller is monitoring.
     */
    public void repairRobots() {
        Collections.shuffle(this.robots);
        for (Robot robot : robots) {
            if (!canInteract()) {
                break;
            }
            if (robot.isActivated()) {
                interactionCount++;
                if (!canInteract()) {
                    break;
                }
                if (!robot.isHealthStatus()) {
                    interactionCount++;
                    if (!canInteract()) {
                        break;
                    }
                    robot.setHealthStatus(true);
                    interactionCount++;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Controller: " + controllerId;
    }
}
