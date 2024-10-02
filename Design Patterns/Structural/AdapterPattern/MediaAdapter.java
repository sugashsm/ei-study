// File: AdapterPattern/MediaAdapter.java
package AdapterPattern;

// Adapter class that adapts MP4Player to MediaPlayer interface
public class MediaAdapter implements MediaPlayer {
    private MP4Player mp4Player;

    public MediaAdapter() {
        mp4Player = new MP4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMP4(fileName);
        } else {
            System.out.println("Invalid media. Adapter only supports mp4 files.");
        }
    }
}
