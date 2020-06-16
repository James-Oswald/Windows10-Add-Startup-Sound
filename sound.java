import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.*;
import java.util.Random;
import javafx.embed.swing.JFXPanel;

public class sound
{	

	public static void main(String[] args)
	{
		JFXPanel j = new JFXPanel(); 
		Random random = new Random();
		File folder = new File("sounds");
		File[] files = folder.listFiles();
		int numfiles = files.length;
		String[] names = new String[numfiles];
		for (int i = 0; i < numfiles; i++)
		{
			names[i] = files[i].getName();
		}
		Media[] sounds = new Media[numfiles];
		for(int i = 0; i < numfiles; i++)
		{
			sounds[i] = new Media("file:///C:/Users/James/Desktop/Programing/Java/StartSound/sounds/" + names[i]);
		}
		MediaPlayer mediaPlayer = new MediaPlayer(sounds[random.nextInt(numfiles)]);
		mediaPlayer.play();
		try
		{
			java.lang.Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.exit(0);
	}
}