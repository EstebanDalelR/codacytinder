package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;
import android.support.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: android.support.v4.media.g */
class C0508g {
    /* renamed from: a */
    public static void m1890a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m1889a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }
}
