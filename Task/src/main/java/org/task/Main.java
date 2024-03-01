package org.task;

import java.util.*;

public class Main {

    public List<Robot> generateRobots(int countRobots, Random random, int activationUpperBound, int activationLowerBound, int deactivationUpperBound, int deactivationLowerBound) {
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < countRobots; i++) {
            int activationRound = random.nextInt(activationUpperBound - activationLowerBound) + activationLowerBound;
            int deactivationRound = random.nextInt(deactivationUpperBound - deactivationLowerBound) + deactivationLowerBound;
            robots.add(new Robot(i, activationRound, deactivationRound));

        }
        return robots;
    }

    public List<Controller> generateControllers(int countControllers, List<Robot> robots) {
        List<Controller> controllers = new ArrayList<>();
        int startRangeRobots = 0;
        for (int i = 0; i < countControllers; i++) {
            List<Robot> controllerRobots = new ArrayList<>();
            controllerRobots = robots.subList(startRangeRobots, startRangeRobots + 125);
            controllers.add(new Controller(i, controllerRobots));
            startRangeRobots += 125;
        }
        return controllers;
    }

    public Map<Integer, Controller> generateRobotsControllers(List<Controller> controllers) {
        Map<Integer, Controller> robotsControllers = new HashMap<>();
        for (Controller controller : controllers) {
            for (Robot robot : controller.getRobots()) {
                robotsControllers.put(robot.getSerialNumber(), controller);
            }
        }
        return robotsControllers;
    }

    public CommandCenter generateCommandCenter(int countRobots, List<Controller> controllers, Map<Integer, Controller> robotsControllers) {
        return new CommandCenter(countRobots, controllers, robotsControllers);
    }

    public static void main(String[] args) {

        Main main = new Main();
        Random random = new Random();

        int countRobots = 10000;
        int countControllers = 80;

        int activationUpperBound = 30;
        int activationLowerBound = 1;
        int deactivationUpperBound = 60;
        int deactivationLowerBound = 30;

        List<Robot> robots = main.generateRobots(countRobots, random, activationUpperBound, activationLowerBound, deactivationUpperBound, deactivationLowerBound);
        List<Controller> controllers = main.generateControllers(countControllers, robots);
        Map<Integer, Controller> robotsControllers = main.generateRobotsControllers(controllers);

        CommandCenter commandCenter = main.generateCommandCenter(countRobots, controllers, robotsControllers);

        Simulation simulation = new Simulation(robots, controllers, commandCenter);
        simulation.runSimulation(60);
    }
}