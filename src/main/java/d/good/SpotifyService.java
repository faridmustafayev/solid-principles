package d.good;

public class SpotifyService implements MusicService{
    @Override
    public void playSong(String song) {
        System.out.println("playing " + song + " from spotify ) ");
    }
}
