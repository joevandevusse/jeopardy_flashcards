public class Clue {
    Integer id;
    String category;
    String clue;
    String answer;
    Integer value;
    Integer gameId;
    String gameDate;
    String addedDate;
    String round;
    Integer numCorrect;
    Integer numIncorrect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameDate() {
        return gameDate;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Integer getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(Integer numCorrect) {
        this.numCorrect = numCorrect;
    }

    public Integer getNumIncorrect() {
        return numIncorrect;
    }

    public void setNumIncorrect(Integer numIncorrect) {
        this.numIncorrect = numIncorrect;
    }

    public Clue() {

    }

    public Clue(Integer id, String category, String clue, String answer, Integer value, Integer gameId,
                String gameDate, String addedDate, String round, Integer numCorrect, Integer numIncorrect) {
        this.id = id;
        this.category = category;
        this.clue = clue;
        this.answer = answer;
        this.value = value;
        this.gameId = gameId;
        this.gameDate = gameDate;
        this.addedDate = addedDate;
        this.round = round;
        this.numCorrect = numCorrect;
        this.numIncorrect = numIncorrect;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Round: " + this.getRound() + "\n");
        sb.append("Value: $" + this.getValue() + "\n");
        sb.append("Category: " + this.getCategory() + "\n");
        sb.append("Clue: " + this.getClue() + "\n");
        sb.append("Answer: " + this.getAnswer() + "\n");
        return sb.toString();
    }
}
