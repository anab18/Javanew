package HomeWork.Abstract;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer [] M={new MP3Player("MP3 Player",15),
                new CDPlayer("CD Player ",25),
                new StreamingPlayer("Streaming Player",5)};
        for(MusicPlayer MP:M){
            MP.printInfo();
            MP.play();
            MP.pause();
            MP.stop();
            System.out.println("   ****************************    ");
        }
    }
}
