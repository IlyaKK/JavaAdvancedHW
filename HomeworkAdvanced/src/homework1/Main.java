package homework1;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill1 = new Treadmill(50);
        Treadmill treadmill2 = new Treadmill(100);
        Treadmill treadmill3 = new Treadmill(150);
        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(4);
        Wall wall3 = new Wall(6);
        Obstacles[] obstacles = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};
        Cat cat1 = new Cat("Кот1",50, 2);
        Cat cat2 = new Cat("Кот2",100, 4);
        Cat cat3 = new Cat("Кот3",150, 6);
        Robot robot1 = new Robot("Робот1",50, 2);
        Robot robot2 = new Robot("Робот2",100, 4);
        Robot robot3 = new Robot("Робот3",150, 6);
        Human human1 = new Human("Человек1",50,2);
        Human human2 = new Human("Человек2",100, 4);
        Human human3 = new Human("Человек3",150, 6);
        Participant[] participants = {cat1, cat2, cat3, robot1, robot2, robot3, human1, human2, human3};
        for (Participant participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if(!obstacle.acting(participant)){
                    break;
                }
            }
        }
    }
}
