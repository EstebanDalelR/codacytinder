package android.support.v4.media;

import android.media.AudioAttributes;
import android.support.annotation.RequiresApi;
import android.util.Log;
import java.lang.reflect.Method;

@RequiresApi(21)
/* renamed from: android.support.v4.media.a */
class C0497a {
    /* renamed from: a */
    private static Method f1609a;

    /* renamed from: android.support.v4.media.a$a */
    static final class C0496a {
        /* renamed from: a */
        private AudioAttributes f1608a;

        /* renamed from: a */
        public AudioAttributes m1853a() {
            return this.f1608a;
        }
    }

    /* renamed from: a */
    public static int m1854a(C0496a c0496a) {
        c0496a = c0496a.m1853a();
        try {
            if (f1609a == null) {
                f1609a = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return ((Integer) f1609a.invoke(null, new Object[]{c0496a})).intValue();
        } catch (C0496a c0496a2) {
            Log.w("AudioAttributesCompat", "getLegacyStreamType() failed on API21+", c0496a2);
            return -1;
        }
    }
}
