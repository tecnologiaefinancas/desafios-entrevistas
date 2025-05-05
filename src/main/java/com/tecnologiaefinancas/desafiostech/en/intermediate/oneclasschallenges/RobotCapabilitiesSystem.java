package com.tecnologiaefinancas.desafiostech.en.intermediate.oneclasschallenges;

public class RobotCapabilitiesSystem {

    /*
    Challenge:
    Create a program where different types of robots (e.g., CleanerRobot, CookRobot, and GuardRobot)
    implement an interface called RobotCapabilities. Each type of robot should perform a specific task
    based on its abilities. Use the instanceof operator to identify the type of robot and execute the
    appropriate action.
     */
    static void executeRobotTask(RobotCapabilities robot) {
        robot.performTask(); // Common method for all robots

        // Using instanceof to identify the specific robot type
        if (robot instanceof CleanerRobot) {
            System.out.println("This is a Cleaner Robot.");
            ((CleanerRobot) robot).chargeBattery();
        } else if (robot instanceof CookRobot) {
            System.out.println("This is a Cooking Robot.");
            ((CookRobot) robot).serveFood();
        } else if (robot instanceof GuardRobot) {
            System.out.println("This is a Guard Robot.");
            ((GuardRobot) robot).soundAlarm();
        } else {
            System.out.println("Unknown robot type!");
        }
    }


    public static void main(String[] args) {
        //Creating different types of robots
        RobotCapabilities cleaner = new CleanerRobot();
        RobotCapabilities cook = new CookRobot();
        RobotCapabilities guard = new GuardRobot();

        //Executing tasks for each robot
        executeRobotTask(cleaner);
        executeRobotTask(cook);
        executeRobotTask(guard);
    }

}

interface RobotCapabilities{
    void performTask();
}

class CleanerRobot implements RobotCapabilities{
    @Override
    public void performTask(){
        System.out.println("🧹 The cleaner robot is cleaning the house!");
    }

    public void chargeBattery(){
        System.out.println("🔋 The cleaner robot is recharging its battery!");
    }
}

class CookRobot implements RobotCapabilities{
    @Override
    public void performTask(){
        System.out.println("🍳 The cooking robot is preparing a meal!");
    }

    public void serveFood(){
        System.out.println("🍴 The cooking robot is serving food!");

    }
}

class GuardRobot implements RobotCapabilities{
    @Override
    public void performTask(){
        System.out.println("🛡️ The guard robot is patrolling the area!");

    }

    public void soundAlarm(){
        System.out.println("🚨 The guard robot is sounding the alarm!");
    }
}

