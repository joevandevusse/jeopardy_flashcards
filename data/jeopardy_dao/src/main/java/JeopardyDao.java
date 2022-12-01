import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JeopardyDao {
    public static List<Clue> getClues() {
        ResultSet rs = null;
        List<Clue> clues = new ArrayList<>();
        Integer count = 0;
        try {
            rs = getConnection().createStatement().executeQuery("select * from clues");
            while (rs.next() && count < 10) {
                Clue clue = new Clue();
                clue.setId(rs.getInt("id"));
                clue.setCategory(rs.getString("category"));
                clue.setClue(rs.getString("clue"));
                clue.setAnswer(rs.getString("answer"));
                clue.setValue(rs.getInt("value"));
                clue.setGameId(rs.findColumn("game_id"));
                clue.setGameDate(rs.getString("game_date"));
                clue.setAddedDate(rs.getString("added_date"));
                clue.setRound(rs.getString("round"));
                clue.setNumCorrect(rs.getInt("num_correct"));
                clue.setNumIncorrect(rs.getInt("num_incorrect"));
                clues.add(clue);
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clues;
    }

    public static Clue getRandomClue() {
        ResultSet rs = null;
        Clue clue = new Clue();
        try {
            rs = getConnection().createStatement().executeQuery("select * from clues order by RANDOM() limit 1");
            while (rs.next()) {
                clue.setId(rs.getInt("id"));
                clue.setCategory(rs.getString("category").replaceAll("\"\"", ""));
                clue.setClue(rs.getString("clue").replaceAll("\"\"", ""));
                clue.setAnswer(rs.getString("answer").replaceAll("\"\"", ""));
                clue.setValue(rs.getInt("value"));
                clue.setGameId(rs.findColumn("game_id"));
                clue.setGameDate(rs.getString("game_date"));
                clue.setAddedDate(rs.getString("added_date"));
                clue.setRound(rs.getString("round"));
                clue.setNumCorrect(rs.getInt("num_correct"));
                clue.setNumIncorrect(rs.getInt("num_incorrect"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clue;
    }

    public static Connection getConnection() throws SQLException {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/joevandevusse", "joevandevusse", "whombovb2508");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        //List<Clue> clues = getClues();
        //System.out.println(clues);
        Clue clue = getRandomClue();
        System.out.println(clue);
    }
}
