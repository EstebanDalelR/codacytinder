package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: android.support.v4.media.e */
class C0507e {

    /* renamed from: android.support.v4.media.e$a */
    static class C0506a {
        /* renamed from: a */
        public static Object m1871a() {
            return new Builder();
        }

        /* renamed from: a */
        public static void m1877a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m1876a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: b */
        public static void m1878b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1879c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m1873a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1874a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1875a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m1872a(Object obj) {
            return ((Builder) obj).build();
        }
    }

    /* renamed from: a */
    public static String m1881a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: b */
    public static CharSequence m1883b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m1884c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m1885d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m1886e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1887f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m1888g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: a */
    public static void m1882a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m1880a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
