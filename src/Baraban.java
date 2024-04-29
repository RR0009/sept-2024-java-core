import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Baraban implements Instrument{

    private int size;



    @Override
    public void play() {
        System.out.println("playing Baraban");

    }
}
