package runningClub;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubIO {

    public static Club club = new Club("", new ArrayList<>());
    private static String searchedClub;

    public static void main(String[] args) throws IOException {
        menu();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        while (Integer.parseInt(choice) < 5) {
            switch (choice) {
                case "1":
                    System.out.println("Enter club name");
                    searchedClub = sc.nextLine();
                    club.setClubName(searchedClub);
                    break;
                case "2":
                    fileReading("C:\\Users\\c1034696\\IdeaProjects\\RunningClub\\src\\runningClub\\race.csv");
                    break;
                case "3":
                    System.out.println("Fastest runner:\n" + club);
                    break;
                case "4":
                    System.out.println(club.fastestRunner());
                    System.out.println("Club average time: " + Runner.timeConvert(club.clubAvgTime()));
                    break;
            }
            menu();
            choice = sc.nextLine();
        }
    }

    /**
     * prints out a menu of options in the console to the user
     */
    public static void menu() {
        System.out.println("Please enter the number of your choice:\n" +
                "1. Enter name of club\n" +
                "2. Read in a file of runners and times\n" +
                "3. Print summary of club members\n" +
                "4. Print club's average time and fastest Runner\n" +
                "5. Quit");
    }

    /**
     * Reads a csv file of memberID, runner name, and time
     * creates relevant runner objects and adds them to a club
     *
     * @param fileName
     * @throws IOException
     */
    public static void fileReading(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            club.getClubMembers().add(new Runner(data[0], data[1], Integer.parseInt(data[2])));
        }
    }
}

