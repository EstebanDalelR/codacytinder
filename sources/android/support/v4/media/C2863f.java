package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import android.support.v4.media.C0507e.C0506a;

@RequiresApi(23)
/* renamed from: android.support.v4.media.f */
class C2863f extends C0507e {

    /* renamed from: android.support.v4.media.f$a */
    static class C2862a extends C0506a {
        /* renamed from: b */
        public static void m11309b(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m11310h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
