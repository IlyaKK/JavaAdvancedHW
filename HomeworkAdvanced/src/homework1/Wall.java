package homework1;

public class Wall implements Obstacles{
    private int high = 0;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public boolean acting(Participant participant) {
        participant.jump();
        if(high <= participant.getMaxHigh()){
            System.out.println(participant.getName() + " смог перепрыгнуть");
            return true;
        }else {
            System.out.println(participant.getName() + " не смог перепрыгнуть " + ". Ограничение " + participant.getMaxHigh());
        }
        return false;
    }
}
