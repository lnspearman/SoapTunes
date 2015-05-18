/*
 */
package soaptunes;

import java.applet.AudioClip;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author lspear5
 */
public abstract class MusicTune
{
    private MediaPlayer tune;
    
    public MusicTune(MediaPlayer sound)
    {
        tune = sound;
    }
    
    public void playTune() // clips should be short
    {
        if (tune != null)
        {
            tune.play();
        }
    }
}
