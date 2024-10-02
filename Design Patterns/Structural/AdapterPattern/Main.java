// File: AdapterPattern/Main.java
package AdapterPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new MP3Player();
        MediaPlayer mediaAdapter = new MediaAdapter();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for audio type and file name
        System.out.print("Enter audio type (mp3 or mp4): ");
        String audioType = scanner.nextLine();

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        // Playing the audio file based on user input
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.play(audioType, fileName);  // Output: Playing mp3 file.
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter.play(audioType, fileName);  // Output: Playing mp4 file.
        } else {
            System.out.println("Invalid media type. Please enter 'mp3' or 'mp4'.");
        }

        // Close the scanner
        scanner.close();
    }
}
