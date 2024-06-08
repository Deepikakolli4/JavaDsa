public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {52, -91, 72};
        int largestAltitude = largestAltitude(gain);
        System.out.println(largestAltitude);
    }

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            highestAltitude = Math.max(currentAltitude, highestAltitude);
        }
        return highestAltitude;
    }
}