package runningClub;

import java.util.ArrayList;

public class Club {

    private String clubName;
    private ArrayList<Runner> clubMembers;

    /**
     * Creates a Club object assigning clubName and clubMembers
     *
     * @param clubName
     * @param clubMembers
     */
    public Club(String clubName, ArrayList<Runner> clubMembers) {
        this.clubName = clubName;
        this.clubMembers = clubMembers;
    }

    /**
     * finds the fastest runner in a club
     *
     * @return fastest runner object
     */
    public Runner fastestRunner() {
        Runner fast = getClubMembers().get(0);

        for (Runner r : getClubMembers()) {
            if (r.getRaceTime() < fast.getRaceTime()) {
                fast = r;
            }
        }
        return fast;
    }

    /**
     * finds the average time for all the runners in a club
     *
     * @return average time for the club
     */
    public int clubAvgTime() {
        int count = getClubMembers().size();
        int total = 0;

        for (Runner r : getClubMembers()) {
            total += r.getRaceTime();
        }

        return total / count;
    }

    @Override
    public String toString() {

        String runners = "";

        for (Runner r : getClubMembers()) runners += (r.toString());

        return "Club name: " + getClubName() + "\n" + runners;
    }

    /*************** Getters & Setters *********************/
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public ArrayList<Runner> getClubMembers() {
        return clubMembers;
    }

    public void setClubMembers(ArrayList<Runner> clubMembers) {
        this.clubMembers = clubMembers;
    }
}
