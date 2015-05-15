/*
 */
package soaptunes;

import java.applet.AudioClip;

/**
 *
 * @author lspear5
 */
public abstract class MusicTune
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
            // no need to STOP because the clips SHOULD BE SHORT
    }
}
