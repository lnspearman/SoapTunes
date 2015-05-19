/* This class functions like a cassette player for the soap dispenser;
 * Each specific MusicTune can be played (playTune()) or stopped (stopTune())
 * 
 *
 */
package soaptunes;

import java.applet.AudioClip;

/**
 *
 * @author lspear5
 */
public class MusicTune
{
    private AudioClip tune;
    
    public MusicTune(AudioClip sound)
    {
        tune = sound;
    }
    
    public void playTune()
    {
        if (tune != null)
        {
            tune.play();
        }
    }
    
    public void stopTune()
    {
        if (tune != null) // "silence" may be a null pointer
        {
            tune.stop();
        }
    }
}
