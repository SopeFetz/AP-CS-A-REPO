public class ScoreBoardGame {
    public static class ScoreBoard {
        // Initialize our variables.
        public String team_1, team_2, activeTeam;
        public int Score_1, Score_2;
        
        // This will always make the first team the active team when initializing the game
        public ScoreBoard(String t_1, String t_2) {
            team_1 = t_1;
            team_2 = t_2;
            activeTeam = team_1;
        }

        // The mechanism behind changing the activeTeam
        public void recordPlay(int score) {
            if (score > 0) {
                if (activeTeam == team_1) {
                    Score_1 += score; 
                } else {
                    Score_2 += score;
                }
            } else if ( score == 0) {
                if (activeTeam == team_1) {
                    activeTeam = team_2;
                } else {
                    activeTeam = team_1;
                }

                // This prevents the user from entering negative answers
            } else {
                System.out.println("Input a nonnegative integer");
            }
        }

        // Informs the user on how the game is going
        public String getScore() {
            return Score_1 + "-" + Score_2 + "-" + activeTeam;
        }
    }

    // A test run of the code
    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard("Eagles", "Tigers");

        System.out.println(sb.getScore()); // 0-0-Eagles
        sb.recordPlay(3);                  // Eagles score 3
        System.out.println(sb.getScore()); // 3-0-Eagles
        sb.recordPlay(0);                  // Eagles fail, switch to Tigers
        System.out.println(sb.getScore()); // 3-0-Tigers
        sb.recordPlay(2);                  // Tigers score 2
        System.out.println(sb.getScore()); // 3-2-Tigers
        }
}
