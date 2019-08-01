/**
 * TestFitnessTracker
 */
public class TestFitnessTracker {

    public static void main(String[] args) {
        FitnessTracker trackerOne = new FitnessTracker();
        FitnessTracker trackerTwo = new FitnessTracker("Swimming", 45, "01/03/2019");

        trackerOne.displayActivity();
        trackerOne.displayTime();
        trackerOne.displayDate();

        trackerTwo.displayActivity();
        trackerTwo.displayTime();
        trackerTwo.displayDate();

    }
}