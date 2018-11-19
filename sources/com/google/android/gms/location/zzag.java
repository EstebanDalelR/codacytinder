package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Collections;
import java.util.List;

public final class zzag extends zzbfm {
    public static final Creator<zzag> CREATOR = new C4493n();
    private final String mTag;
    private final PendingIntent zzeeo;
    private final List<String> zzikp;

    zzag(@Nullable List<String> list, @Nullable PendingIntent pendingIntent, String str) {
        this.zzikp = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzeeo = pendingIntent;
        this.mTag = str;
    }

    public static zzag zzac(List<String> list) {
        ad.a(list, "geofence can't be null.");
        ad.b(list.isEmpty() ^ 1, "Geofences must contains at least one id.");
        return new zzag(list, null, "");
    }

    public static zzag zzb(PendingIntent pendingIntent) {
        ad.a(pendingIntent, "PendingIntent can not be null.");
        return new zzag(null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20110b(parcel, 1, this.zzikp, false);
        oj.m20096a(parcel, 2, this.zzeeo, i, false);
        oj.m20098a(parcel, 3, this.mTag, false);
        oj.m20088a(parcel, a);
    }
}
