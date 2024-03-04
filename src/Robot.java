public class Robot {
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;
    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
        }
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        switch (getDirection()) {
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
        }
        System.out.println("Поворот направо");
    }

    public void stepForward() {
        switch (getDirection()) {
            case DOWN:
                y--;
                break;
            case UP:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
        System.out.println("Шаг");
    }
}

