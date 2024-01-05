package HomeWork.Abstract;
/*
Task1) Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with their unique implementations of the play() method
(e.g., streaming from the internet, playing from a CD)
 */
 public abstract class MusicPlayer {
    private String currentTrack;
    private int volume;

    public MusicPlayer(String currentTrack, int volume) {
        this.currentTrack = currentTrack;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println(currentTrack + " " + volume);
    }

    public abstract void play();

    public  void pause(){
        System.out.println("Paused the music");
    }

     public void stop(){
         System.out.println("Stopped the music");
     }

}
   class MP3Player extends MusicPlayer {
       public MP3Player(String currentTrack, int volume) {
           super(currentTrack, volume);
       }
@Override
       public void play() {
           System.out.println("Playing music from the CD");
       }
@Override
       public void pause() {
           System.out.println("Pause from the CD");
       }
@Override
       public void stop() {
           System.out.println("stop from CD");
       }
   }
    class CDPlayer extends MusicPlayer {
        public CDPlayer(String currentTrack, int volume) {
            super(currentTrack, volume);
        }
@Override
        public void play() {
            System.out.println("playing from CD Player");
        }
@Override
        public void pause() {
            System.out.println("pause from CD Player");
        }
@Override
        public void stop() {
            System.out.println("stop from CD Player");
        }
    }
class StreamingPlayer extends MusicPlayer {
    public StreamingPlayer(String currentTrack, int volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("not playing");
    }
 }


