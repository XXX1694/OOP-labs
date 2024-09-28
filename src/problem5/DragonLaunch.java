package problem5;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public void willDragonEatOrNot() {
        int i = 0;
        while (i < kidnappedPeople.size() - 1) {
            Person first = kidnappedPeople.get(i);
            Person second = kidnappedPeople.get(i + 1);

            if (first.getGender() == Gender.BOY && second.getGender() == Gender.GIRL) {
                kidnappedPeople.remove(i);
                kidnappedPeople.remove(i);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        System.out.println("Remaining people:");
        for (Person person : kidnappedPeople) {
            System.out.println(person);
        }

        if (kidnappedPeople.isEmpty()) {
            System.out.println("No one is left for the dragon lunch!");
        } else {
            System.out.println("Dragon will eat remaining people.");
        }
    }

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person("Aliya", Gender.GIRL));
        launch.kidnap(new Person("Abzal", Gender.BOY));
        launch.kidnap(new Person("Ola", Gender.GIRL));
        launch.kidnap(new Person("Askar", Gender.BOY));
        launch.kidnap(new Person("Fatima", Gender.GIRL));

        launch.willDragonEatOrNot();
    }
}
