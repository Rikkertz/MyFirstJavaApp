import java.util.Random;
public class Lamp {
    public boolean isAan;
    public Lamp() {
        Random random = new Random();
        this.isAan = random.nextBoolean();
    }

    public boolean isAan() {
        return isAan;
    }
}

