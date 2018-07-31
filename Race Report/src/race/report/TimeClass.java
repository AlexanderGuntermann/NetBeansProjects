/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race.report;

/**
 *
 * @author alexguntermann
 */
public class TimeClass {

    double seconds;

    public TimeClass() {
        seconds = 0.0;
    }

    public TimeClass(double seconds) {
        this.seconds = seconds;

    }

    public TimeClass(int hours, int minutes, double seconds) {
        seconds = (double) (hours * 3600 + minutes * 60) + seconds;
    }

    public double getTime() {
        return seconds;
    }

    public int getHours() {
        return (int) seconds / 3600;
    }

    public double getSeconds() {
        return seconds % 60.0;
    }

    public int getMinutes() {
        int remainingSeconds = (int) seconds % 3600;
        return remainingSeconds / 60;
    }

    @Override
    public String toString() {
        //5463 seconds is 1 hours, 31 minutes, and 3 seconds
        return getHours() + " hr : " + getMinutes() + " mins : " + String.format
        ("%.3f", getSeconds()) + " secs";
    }
    

    public TimeClass plus(TimeClass t) {
        return new TimeClass(seconds + t.seconds);
    }

    public TimeClass minus(TimeClass t) {
        return new TimeClass(seconds - t.seconds);
    }
   


}
