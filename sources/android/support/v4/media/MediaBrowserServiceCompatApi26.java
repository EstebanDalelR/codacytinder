package android.support.v4.media;

import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;
import android.support.annotation.RequiresApi;
import android.util.Log;
import java.lang.reflect.Field;

@RequiresApi(26)
class MediaBrowserServiceCompatApi26 {
    /* renamed from: a */
    private static Field f1599a;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi26$a */
    static class C0491a {
    }

    public interface ServiceCompatProxy extends android.support.v4.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(String str, C0491a c0491a, Bundle bundle);
    }

    static {
        try {
            f1599a = Result.class.getDeclaredField("mFlags");
            f1599a.setAccessible(true);
        } catch (Throwable e) {
            Log.w("MBSCompatApi26", e);
        }
    }
}
