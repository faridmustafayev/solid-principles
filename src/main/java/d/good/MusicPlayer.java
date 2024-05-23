package d.good;

public class MusicPlayer {
    private MusicService musicService;

    public MusicPlayer(MusicService musicService) {
        this.musicService = musicService;
    }

    public void play(String song) {
        musicService.playSong(song);
    }
}
