public class Hangman {
  private String answer;
  private String hits;
  private String misses;
  public static final int NUMBER_OF_TRIES = 7;


  public Hangman(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

  public boolean applyGuess(char c) {
       boolean isCorrect = false;
       if (hits.indexOf(c) != -1 || misses.indexOf(c) != -1) {
           throw new IllegalArgumentException("You already made this guess ");
       }
       if (answer.indexOf(c) != -1) {
           isCorrect = true;
           hits += c;
       } else {
           misses += c;
       }
       return isCorrect;
  }

}
