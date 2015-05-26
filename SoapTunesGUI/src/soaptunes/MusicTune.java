/* This class functions like a cassette player for the soap dispenser;
 * Each specific MusicTune can be played (playTune()) or stopped (stopTune())
 * 
 *
 */
package soaptunes;

import java.util.ArrayList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 *
 * @author lspear5
 */
public class MusicTune
{
    private static final String 
            swotrURI = MusicTune.class.getResource("swotrWAV.wav").toString(),
            freshURI = MusicTune.class.getResource("freshWAV.wav").toString(),
            misc1URI = MusicTune.class.getResource("Music_Box-Big_Daddy-1389738694.mp3").toString(),
            misc2URI = MusicTune.class.getResource("Magic Wand Noise-SoundBible.com-375928671.mp3").toString(),
            misc3URI = MusicTune.class.getResource("Laugh.mp3").toString(),
            misc4URI = MusicTune.class.getResource("Sparkling.mp3").toString(),
            misc5URI = MusicTune.class.getResource("Tinkle.mp3").toString(),
            mewURI = MusicTune.class.getResource("Meow.mp3").toString();
    
    private static final String[] rng = {misc1URI, misc2URI, misc3URI, misc4URI, misc5URI, mewURI};
    
    private Media audioMedia;
    private MediaPlayer amp;
    
    public MusicTune()
    {
        audioMedia = null;
        amp = null;
    }
    
    public void newSilence()
    {
        audioMedia = null;
        amp = null;
    }
    
    public void newSwotr()
    {
        audioMedia = new Media(swotrURI);
        amp = new MediaPlayer(audioMedia);
    }
    
    public void newFresh()
    {
        audioMedia = new Media(freshURI);
        amp = new MediaPlayer(audioMedia);
    }
    
    public void newMew()
    {
        audioMedia = new Media(miscURI());
        amp = new MediaPlayer(audioMedia);
    }
    
        public String miscURI()
        {
            return (rng[(int)(Math.random() * rng.length)]);
        }

    
    public void playTune()
    {
        if (amp != null)
        {
            amp.stop();
            amp.play();
        }
    }
    
    public void stopTune()
    {
        if (amp != null)
        {
            amp.stop();
        }
    }
}
