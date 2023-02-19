import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Team {
    public static Random rnd = new Random();
        ArrayList<String> teams = new ArrayList<>();

        Set<String> playedMatchesFirstRound = new LinkedHashSet<>();
        Set<String> playedMatchesSecondRound = new LinkedHashSet<>();
        ArrayList<String> coupleTeams = new ArrayList<>();

        public void printLeagueFixture(){
            if (teams.size() % 2 != 0){
                teams.add("Bay");
            }

            System.out.println("Takımlar : ");
            for (String team : teams){
                System.out.println(team + "  ");
            }
            System.out.println("\n");

            matchRound();
        }

        public void matchRound(){
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();

            for (int i = 0; i < teams.size() -1; i++){
                home.clear();
                away.clear();

                while(home.size() < teams.size() / 2){
                    String homeTeam = teams.get(rnd.nextInt(teams.size()));
                    String awayTeam = teams.get(rnd.nextInt(teams.size()));

                    if ((! homeTeam.equals(awayTeam))){
                        if (coupleTeams.contains(homeTeam + awayTeam) == false && coupleTeams.contains(awayTeam + homeTeam) == false){
                            if (home.contains(homeTeam) == false && away.contains(awayTeam) == false){
                                home.add(homeTeam);
                                away.add(awayTeam);
                                coupleTeams.add(awayTeam+homeTeam);
                                coupleTeams.add(homeTeam+awayTeam);

                                playedMatchesFirstRound.add(homeTeam + "VS" + awayTeam);
                                playedMatchesSecondRound.add(awayTeam  + "VS" + homeTeam);
                            }
                        }
                    }
                }
            }

            int brace = 0;
            int week = 1;

            System.out.println("-----İlk Maçlar-----");
            System.out.println(week + ". Hafta Maçları : ");
            for (String s : playedMatchesFirstRound){
                System.out.println(s);
                brace++;
                if (brace == teams.size() / 2){
                    System.out.println();
                    brace = 0;
                    week++;
                    System.out.println(week + ". Hafta Maçları : ");
                }
            }
            System.out.println("----Rövanş Maçları----");
            for (String s : playedMatchesSecondRound){
                System.out.println(s);
                brace++;
                if (brace == teams.size() / 2){
                    System.out.println();
                    brace = 0;
                    week++;
                }if (week <= (teams.size()-1)*2){
                    System.out.println(week + ". Hafta Maçları : ");
                }
            }
        }
    }

