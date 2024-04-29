import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trube implements Instrument{

    private double diametr;


    @Override
    public void play() {
        System.out.println("playing trube with " + this.toString());
    }
}
