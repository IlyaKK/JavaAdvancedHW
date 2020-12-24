package homework1;

public class Treadmill implements Obstacles{
    private final int LENGTH;

    public Treadmill(int length) {
        this.LENGTH = length;
    }

    @Override
    public boolean acting(Participant participant) {
        participant.run();
        if(LENGTH <= participant.getMaxLength()){
            System.out.println(participant.getName() + " смог пробежать");
            return true;
        }else {
            System.out.println(participant.getName() + " не смог пробежать " + LENGTH + ". Ограничение " + participant.getMaxLength());
        }
        return false;
    }
}
