package jdbc_ipl_oct_23;

import java.util.List;
import java.util.Scanner;

public class IplMainApp {

    public static void main(String[] args) {

        System.out.println("Welcome to IPL.com");

        PlayerOperation playersOps = new PlayerOperation();
        Scanner sc = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n========== IPL MENU ==========");
            System.out.println("1. Get All Players of All Teams");
            System.out.println("2. Get All Players of Given Team");
            System.out.println("3. Get All Batters of All Teams");
            System.out.println("4. Get All Batters of Given Team");
            System.out.println("5. Get All Bowlers of All Teams");
            System.out.println("6. Get All Bowlers of Given Team");
            System.out.println("7. Get All Rounders of All Teams");
            System.out.println("8. Get All Rounders of Given Team");
            System.out.println("9. Player with Highest Runs");
            System.out.println("10. Player with Lowest Runs");
            System.out.println("11. Player with Highest Wickets");
            System.out.println("12. Player with Lowest Wickets");
            System.out.println("13. Player with Highest Catches");
            System.out.println("14. Players with Runs Above 1000");
            System.out.println("15. Players with Wickets Above 10");
            System.out.println("16. Players with Wickets Above 10 of Given Team");
            System.out.println("17. Total Players");
            System.out.println("18. Get Player by Name");
            System.out.println("19. Get Players by Category");
            System.out.println("20. Total Players of Given Team");
            System.out.println("21. Players with Runs Above 500");
            System.out.println("22. Get Players by Category and Team");
            System.out.println("23. Players Whose Name Starts with Given Letter");
            System.out.println("24. Count Players with Runs Above 500");
            System.out.println("25. Total Runs of All Players");
            System.out.println("26. Exit");
            System.out.println("===============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                List<Player> allPlayersList = playersOps.getAllPlayers();
                allPlayersList.forEach(System.out::println);
                break;

            case 2:
                System.out.print("Enter team name: ");
                String team2 = sc.next();
                playersOps.allPlayersGivenTeamName(team2)
                        .forEach(System.out::println);
                break;

            case 3:
                playersOps.getAllBatters()
                        .forEach(System.out::println);
                break;

            case 4:
                System.out.print("Enter team name: ");
                String team4 = sc.next();
                playersOps.getAllBatters(team4)
                        .forEach(System.out::println);
                break;

            case 5:
                playersOps.getAllBowlers()
                        .forEach(System.out::println);
                break;

            case 6:
                System.out.print("Enter team name: ");
                String team6 = sc.next();
                playersOps.getAllBowlers(team6)
                        .forEach(System.out::println);
                break;

            case 7:
                playersOps.getAllRounders()
                        .forEach(System.out::println);
                break;

            case 8:
                System.out.print("Enter team name: ");
                String team8 = sc.next();
                playersOps.getAllRounders(team8)
                        .forEach(System.out::println);
                break;

            case 9:
                System.out.println(
                        playersOps.getPlayerWithHighestRuns());
                break;

            case 10:
                System.out.println(
                        playersOps.getPlayerWithLowestRuns());
                break;

            case 11:
                System.out.println(
                        playersOps.getPlayerWithHighestWickets());
                break;

            case 12:
                System.out.println(
                        playersOps.getPlayerWithLowestWickets());
                break;

            case 13:
                System.out.println(
                        playersOps.getPlayerWithHighestCatches());
                break;

            case 14:
                playersOps.getPlayersRunsAbove1000()
                        .forEach(System.out::println);
                break;

            case 15:
                playersOps.getPlayersWicketsAbove10()
                        .forEach(System.out::println);
                break;

            case 16:
                System.out.print("Enter team name: ");
                String team16 = sc.next();
                playersOps.getPlayersWicketsAbove10GivenTeam(team16)
                        .forEach(System.out::println);
                break;

            case 17:
                System.out.println("Total Players: "
                        + playersOps.getTotalPlayers());
                break;

            case 18:
                sc.nextLine();
                System.out.print("Enter player name: ");
                String name = sc.nextLine();
                System.out.println(
                        playersOps.getPlayerByName(name));
                break;

            case 19:
                System.out.print("Enter category: ");
                String category = sc.next();
                playersOps.getPlayersByCategory(category)
                        .forEach(System.out::println);
                break;

            case 20:
                System.out.print("Enter team name: ");
                String team20 = sc.next();
                System.out.println("Total Players: "
                        + playersOps.getTotalPlayersByTeam(team20));
                break;

            case 21:
                playersOps.getPlayersRunsAbove500()
                        .forEach(System.out::println);
                break;

            case 22:
                System.out.print("Enter category: ");
                String category22 = sc.next();

                System.out.print("Enter team name: ");
                String team22 = sc.next();

                playersOps.getPlayersByCategoryAndTeam(
                        category22, team22)
                        .forEach(System.out::println);
                break;

            case 23:
                System.out.print("Enter first letter: ");
                char letter = sc.next().charAt(0);
                playersOps.getPlayersByFirstLetter(letter)
                        .forEach(System.out::println);
                break;

            case 24:
                System.out.println("Count of Players: "
                        + playersOps.countPlayersRunsAbove500());
                break;

            case 25:
                System.out.println("Total Runs: "
                        + playersOps.getTotalRuns());
                break;

            case 26:
                System.out.println(
                        "Thank you for using IPL.com!");
                break;

            default:
                System.out.println(
                        "Invalid choice! Please enter 0 to 25.");
            }
        }

        sc.close();
    }
}
