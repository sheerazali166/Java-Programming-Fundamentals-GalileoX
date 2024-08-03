package screencast_polymorphism;

public interface Guitarist extends PlaySong{

    public default void playFavouriteSong() {
        System.out.println("Playing my favourite song");
        playSong("My first song");
    }

}
