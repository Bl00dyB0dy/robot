public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(1, 1, Direction.UP);
        moveRobot(robot, 3, 0);
    }
    private static void moveRobot(Robot robot, int toX, int toY) {

        int sourceX = robot.getX();
        int sourceY = robot.getY();
        if (sourceX <= toX) { //перемещение по оси x
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (sourceX != toX) {
                robot.stepForward();
                sourceX++;
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (sourceX != toX) {
                robot.stepForward();
                sourceX--;
            }
        }
        if (sourceY <= toY) { //перемещение по оси y
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (sourceY != toY) {
                robot.stepForward();
                sourceY++;
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (sourceY != toY) {
                robot.stepForward();
                sourceY--;
            }
        }
    }
}