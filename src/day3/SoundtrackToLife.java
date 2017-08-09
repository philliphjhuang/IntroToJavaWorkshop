package day3;


	import java.net.URI;

	import javax.swing.JOptionPane;

	public class SoundtrackToLife {

		public static void main(String[] args) {

			// 1. Adjust this pop-up to find out what mood the user is in.
			int userMood = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mood1", "Mood2", "Mood3" }, null);
			
			// 2. Their answer is stored in the userMood variable. Print it out.
if(userMood==2){
	

			// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
playVideo("bit.ly/video-for-happy");
			// 4. Play different songs for other moods.
if(userMood==1){
	playVideo("https://www.youtube.com/watch?v=J2X5mJ3HDYE");
	if(userMood==0){
		
	}
}
}
			// If you are seeing ads at the beginning of your videos, install Adblock.

		}

		static void playVideo(String youTubeLink) {
			try {
				URI uri = new URI(youTubeLink);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}