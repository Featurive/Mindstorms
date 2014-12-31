import lejos.nxt.Button;
import lejos.nxt.LCD;

public class Mindstorms {
    public static void main(String[] args) {
        LCD.clear();
        LCD.drawString("First Minecraft Program", 0, 0);
        Button.ENTER.waitForPress();
        LCD.clear();
        // to compile : nxjc Mindstorms.java | nxj -r -o Mindstorms.nxj Mindstorms
    }
}
