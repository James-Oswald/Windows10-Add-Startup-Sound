

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.Random;
import javafx.embed.swing.JFXPanel;

public class sound
{	
	private final String[] names = {"7", "95", "98", "2000", "NT", "NT5", "vistaBeta", "XP"};

	public sound() throws Exception{
		new JFXPanel(); //Dont ask me why, but i get an illegal state exception from MediaPlayer constructor if this isn't included.
		Random random = new Random();
		Media[] sounds = new Media[names.length];
		for(int i = 0; i < names.length; i++){
			String uri = getClass().getResource("sounds/" + names[i] + ".mp3").toString();
			sounds[i] = new Media(uri);
		}
		MediaPlayer mediaPlayer = new MediaPlayer(sounds[random.nextInt(names.length)]);
		mediaPlayer.setOnEndOfMedia(()->{System.exit(0);});
		mediaPlayer.play();
		java.lang.Thread.sleep(10000);
		System.exit(0);
	}
	
	public static void main(String[] args){
		try{
			new sound();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}