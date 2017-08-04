import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  hangman hangman
  @Test
    public void choosingACharacterInTheAnswerReturnsTrue() throws Exception {
        assertTrue(hangman.applyGuess('c'));
    }
}
