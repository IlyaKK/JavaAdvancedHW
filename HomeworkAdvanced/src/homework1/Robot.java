package homework1;

public class Robot implements Running, Jumping, Participant{
    private final int maxLength;
    private final int maxHigh;
    private String name;

    public Robot(String name, int maxLength, int maxHigh) {
        this.maxLength = maxLength;
        this.maxHigh = maxHigh;
        this.name = name;
    }

    public void jump(Obstacles obstacle) {
        System.out.println(name + " прыгает");
    }

    public void run(Obstacles obstacle) {
        System.out.println(name + " бежит");
    }

    @Override
    public int getMaxHigh() {
        return maxHigh;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public String getName() {
        return name;
    }
}
