package homework1;

public class Robot implements Participant{
    private final int maxLength;
    private final int maxHigh;
    private final String NAME;

    public Robot(String name, int maxLength, int maxHigh) {
        this.maxLength = maxLength;
        this.maxHigh = maxHigh;
        this.NAME = name;
    }

    public void jump() {
        System.out.println(NAME + " прыгает");
    }

    public void run() {
        System.out.println(NAME + " бежит");
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
        return NAME;
    }
}
