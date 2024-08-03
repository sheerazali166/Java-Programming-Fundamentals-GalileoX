package screencast_polymorphism;

public class BandMember extends Human implements Vocalist, Guitarist{

    public BandMember(String _name) {
        super(_name);
    }

    @Override
    public void sing() {
        System.out.println("la la la");
    }

    @Override
    public void playFavouriteSong() {
        Guitarist.super.playFavouriteSong();
    }

    @Override
    public void playSong(String songName) {
        Guitarist.super.playSong(songName);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("Band Member: " + name);
    }

}
