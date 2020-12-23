package homework1;

public class Treadmill implements Obstacles{
    private int length = 0;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean acting(Participant participant) {
        participant.run();
        if(length <= participant.getMaxLength()){
            System.out.println(participant.getName() + " смог пробежать");
            return true;
        }else {
            System.out.println(participant.getName() + " не смог пробежать " + length + ". Ограничение " + participant.getMaxLength());
        }
        return false;
    }
}
