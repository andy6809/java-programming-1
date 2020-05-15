/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class Timer {
    private int hundreths;
    private int seconds;
    
    public Timer() {
        this.hundreths = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundreths++;
        if (this.hundreths == 100) {
            this.hundreths = 0;
            this.seconds++;
        }
        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }
    
    public String toString() {
        String m1 = String.valueOf(this.hundreths);
        String m2 = String.valueOf(this.seconds);
        if (this.hundreths < 10) {
            m1 = "0" + m1;
        }
        if (this.seconds < 10) {
            m2 = "0" + m2;
        }
        return m2 + ":" + m1;
    }
    
}
