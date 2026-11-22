package PraktikumInterface;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar; 

    public void naikkanVolume() {
        volume += 1;
    }

    public void turunkanVolume() {
        volume -= 1;
    }
}
