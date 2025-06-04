package BrainTeasers;

public class BulbSwitcher {
   public int bulbSwitch(int n) {
        return (int)Math.abs(Math.sqrt(n));
    }
    public static void main(String[] args) {
        BulbSwitcher bs = new BulbSwitcher();
        int n = 10; // Example input
        System.out.println("Number of bulbs that are on after " + n + " rounds: " + bs.bulbSwitch(n));
    } 
}
