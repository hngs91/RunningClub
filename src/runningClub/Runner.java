package runningClub;

public class Runner {

    private String memberId;
    private String name;
    private int raceTime;

    /**
     * Creates a Runner object assigning memberID, name, and raceTime
     *
     * @param memberId
     * @param name
     * @param raceTime
     */
    public Runner(String memberId, String name, int raceTime) {
        this.memberId = memberId;
        this.name = name;
        this.raceTime = raceTime;
    }

    /**
     * Declared static to be used by other classes without having to create a runner object
     * @param raceTime
     * @return average time in mins and secs
     */
    public static String timeConvert(int raceTime) {
        int min = raceTime / 60;
        int sec = raceTime % 60;
        return min + "m " + sec + "s";
    }

    @Override
    public String toString() {
        return "Member ID: " + getMemberId() + " Name: " + getRunnerName() + " Time: " + timeConvert(getRaceTime()) + "\n";
    }

    /*************** Getters & Setters *********************/
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getRunnerName() {
        return name;
    }

    public void setRunnerName(String name) {
        this.name = name;
    }

    public int getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }
}
