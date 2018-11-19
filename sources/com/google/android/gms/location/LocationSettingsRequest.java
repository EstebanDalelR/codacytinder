package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends zzbfm {
    public static final Creator<LocationSettingsRequest> CREATOR = new C4489j();
    private final List<LocationRequest> zzhhm;
    private final boolean zzika;
    private final boolean zzikb;
    private zzz zzikc;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C4482a {
        /* renamed from: a */
        private final ArrayList<LocationRequest> f16718a = new ArrayList();
        /* renamed from: b */
        private boolean f16719b = false;
        /* renamed from: c */
        private boolean f16720c = false;
        /* renamed from: d */
        private zzz f16721d = null;

        /* renamed from: a */
        public final C4482a m20347a(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f16718a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final C4482a m20348a(boolean z) {
            this.f16719b = z;
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest m20349a() {
            return new LocationSettingsRequest(this.f16718a, this.f16719b, this.f16720c, null);
        }
    }

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzz zzz) {
        this.zzhhm = list;
        this.zzika = z;
        this.zzikb = z2;
        this.zzikc = zzz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20112c(parcel, 1, Collections.unmodifiableList(this.zzhhm), false);
        oj.m20101a(parcel, 2, this.zzika);
        oj.m20101a(parcel, 3, this.zzikb);
        oj.m20096a(parcel, 5, this.zzikc, i, false);
        oj.m20088a(parcel, a);
    }
}
