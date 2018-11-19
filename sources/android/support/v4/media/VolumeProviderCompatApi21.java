package android.support.v4.media;

import android.support.annotation.RequiresApi;

@RequiresApi(21)
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }
}
