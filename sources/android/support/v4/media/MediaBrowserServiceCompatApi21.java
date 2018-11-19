package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class MediaBrowserServiceCompatApi21 {

    public interface ServiceCompatProxy {
        C0489a onGetRoot(String str, int i, Bundle bundle);

        void onLoadChildren(String str, C0490b<List<Parcel>> c0490b);
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$a */
    static class C0489a {
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$b */
    static class C0490b<T> {
    }
}
