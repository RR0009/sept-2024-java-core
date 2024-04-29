import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument{

  private int strune;

    @Override
    public void play() {
      System.out.println("Playing Guitar");

    }
}
