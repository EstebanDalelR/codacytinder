package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzcfs;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest extends zzbfm {
    public static final Creator<GeofencingRequest> CREATOR = new C4499w();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final String mTag;
    private final List<zzcfs> zzijj;
    private final int zzijk;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C4481a {
        /* renamed from: a */
        private final List<zzcfs> f16715a = new ArrayList();
        /* renamed from: b */
        private int f16716b = 5;
        /* renamed from: c */
        private String f16717c = "";

        /* renamed from: a */
        public final C4481a m20343a(int i) {
            this.f16716b = i & 7;
            return this;
        }

        /* renamed from: a */
        public final C4481a m20344a(Geofence geofence) {
            ad.a(geofence, "geofence can't be null.");
            ad.b(geofence instanceof zzcfs, "Geofence must be created using Geofence.Builder.");
            this.f16715a.add((zzcfs) geofence);
            return this;
        }

        /* renamed from: a */
        public final C4481a m20345a(List<Geofence> list) {
            if (list == null || list.isEmpty()) {
                return this;
            }
            for (Geofence geofence : list) {
                if (geofence != null) {
                    m20344a(geofence);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final GeofencingRequest m20346a() {
            ad.b(this.f16715a.isEmpty() ^ 1, "No geofence has been added to this request.");
            return new GeofencingRequest(this.f16715a, this.f16716b, this.f16717c);
        }
    }

    GeofencingRequest(List<zzcfs> list, int i, String str) {
        this.zzijj = list;
        this.zzijk = i;
        this.mTag = str;
    }

    public List<Geofence> getGeofences() {
        List<Geofence> arrayList = new ArrayList();
        arrayList.addAll(this.zzijj);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzijk;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeofencingRequest[");
        stringBuilder.append("geofences=");
        stringBuilder.append(this.zzijj);
        int i = this.zzijk;
        StringBuilder stringBuilder2 = new StringBuilder(30);
        stringBuilder2.append(", initialTrigger=");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder.append(stringBuilder2.toString());
        String str = "tag=";
        String valueOf = String.valueOf(this.mTag);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20112c(parcel, 1, this.zzijj, false);
        oj.m20091a(parcel, 2, getInitialTrigger());
        oj.m20098a(parcel, 3, this.mTag, false);
        oj.m20088a(parcel, i);
    }
}
