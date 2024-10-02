// File: AdapterPattern/MP3Player.java
package AdapterPattern;

// Concrete Target (Plays MP3 files)
public class MP3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. MP3 player can only play mp3 files.");
        }
    }
}
