package screencast_polymorphism;

public interface PlaySong {

    public default void playSong(String songName) {
        System.out.println("Playing: " + songName);
    }
}
