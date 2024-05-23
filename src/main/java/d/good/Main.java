package d.good;

public class Main {
    public static void main(String[] args) {

        MusicService musicService = new SpotifyService();

        MusicPlayer musicPlayer = new MusicPlayer(musicService);
        musicPlayer.play("On my way");


    }
}
