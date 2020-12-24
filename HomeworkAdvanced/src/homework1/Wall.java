package homework1;

public class Wall implements Obstacles{
    private final int HIGH;

    public Wall(int high) {
        this.HIGH = high;
    }

    @Override
    public boolean acting(Participant participant) {
        participant.jump();
        if(HIGH <= participant.getMaxHigh()){
            System.out.println(participant.getName() + " смог перепрыгнуть");
            return true;
        }else {
            System.out.println(participant.getName() + " не смог перепрыгнуть " + ". Ограничение " + participant.getMaxHigh());
        }
        return false;
    }
}
