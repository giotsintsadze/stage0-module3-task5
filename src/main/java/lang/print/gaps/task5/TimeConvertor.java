package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = minutes * 60; // 1 minute = 60 seconds
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds");
    }
}
