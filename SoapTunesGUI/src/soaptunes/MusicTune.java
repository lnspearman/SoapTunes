/* This class functions like a cassette player for the soap dispenser;
 * Each specific MusicTune can be played (playTune()) or stopped (stopTune())
 * 
 *
 */
package soaptunes;

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
            misc2URI = MusicTune.class.getResource("Magic Wand Noise-SoundBible.com-375928671.mp3").toString();
    
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
