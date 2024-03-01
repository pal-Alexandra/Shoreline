package org.task;

import java.util.*;

/**
 * This class models a command center.
 */
public class CommandCenter {

    private int countRobots;

    private Map<Integer, Controller> robotsControllers;
    private List<Controller> controllers;


    public CommandCenter(int countRobots, List<Controller> controllers, Map<Integer, Controller> robotsControllers) {
        this.countRobots = countRobots;
        this.controllers = controllers;
        this.robotsControllers = robotsControllers;
    }

    /**
     * This method calls only the controllers that have robots that are unhealthy.
     *
     * @param robotsIds: serial numbers of the unhealthy robots
     * @return the points consumed by the controllers
     */
    public int repairRobots(List<Integer> robotsIds) {
        Set<Integer> healingControllers = new HashSet<>();
        int effort = 0;
        for (int illRobotId : robotsIds) {
            Controller controller = robotsControllers.get(illRobotId);
            int healingControllerId = controller.getControllerId();
            if (!healingControllers.contains(healingControllerId)) {

                effort -= 20;
                controller.repairRobots();
                controller.setInteractionCount(0);

                healingControllers.add(healingControllerId);

            }
        }

        return effort;
    }
}