package week04;

public class _04_loops_Ocean_Levels {

    public static void main(String[] args) {

        float level = 0;
        int year = 25;
        float oceanLevel = 1.5F;
        float sum = 0;
        for (int i = 0; i < year; i++) {
            sum += oceanLevel;
            System.out.println("Year #" + (i+1) + "ocean level has risen by" + sum);
        }
    }
}
