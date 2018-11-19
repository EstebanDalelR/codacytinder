package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

@RequiresApi(23)
class MediaSessionCompatApi23 {

    public interface Callback {
        void onPlayFromUri(Uri uri, Bundle bundle);
    }
}
