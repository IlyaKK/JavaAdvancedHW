package homework1;

public class Human implements Participant{
    private final int maxLength;
    private final int maxHigh;
    private String name;

    public Human(String name, int maxLength, int maxHigh) {
        this.maxHigh = maxHigh;
        this.maxLength = maxLength;
        this.name = name;
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public String getName() {
        return name;
    }
}
