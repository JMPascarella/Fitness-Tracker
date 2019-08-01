import javax.swing.JOptionPane;

/**
 * FitnessTracker
 */
public class FitnessTracker {

    private String fitnessActivity;
    private int minutesParticipating;
    private String activityDate;

    public FitnessTracker() {
        this("running", 0, "01/01/2019");
    }

    public FitnessTracker(String activity, int time, String date) {
        fitnessActivity = activity;
        minutesParticipating = time;
        activityDate = date;
    }

    public void displayActivity() {
        JOptionPane.showMessageDialog(null, "The selected activity is " + fitnessActivity);
    }

    public void displayTime() {
        JOptionPane.showMessageDialog(null, "The time spent participating was " + minutesParticipating + " minute(s)");
    }

    public void displayDate() {
        JOptionPane.showMessageDialog(null, "The activity took place on " + activityDate);
    }
}