package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.util.C0546b;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzaxc;
import com.google.android.gms.internal.zzbgo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzu extends zzaxc {
    public static final Creator<zzu> CREATOR = new C2426d();
    private static final HashMap<String, zzbgo<?, ?>> zzeea;
    private int zzcbc;
    private int zzeck;
    private Set<Integer> zzeeb;
    private String zzeem;
    private byte[] zzeen;
    private PendingIntent zzeeo;
    private DeviceMetaData zzeep;

    static {
        HashMap hashMap = new HashMap();
        zzeea = hashMap;
        hashMap.put("accountType", zzbgo.zzl("accountType", 2));
        zzeea.put("status", zzbgo.zzj("status", 3));
        zzeea.put("transferBytes", zzbgo.zzn("transferBytes", 4));
    }

    public zzu() {
        this.zzeeb = new C0546b(3);
        this.zzeck = 1;
    }

    zzu(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.zzeeb = set;
        this.zzeck = i;
        this.zzeem = str;
        this.zzcbc = i2;
        this.zzeen = bArr;
        this.zzeeo = pendingIntent;
        this.zzeep = deviceMetaData;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        Set set = this.zzeeb;
        if (set.contains(Integer.valueOf(1))) {
            oj.a(parcel, 1, this.zzeck);
        }
        if (set.contains(Integer.valueOf(2))) {
            oj.a(parcel, 2, this.zzeem, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            oj.a(parcel, 3, this.zzcbc);
        }
        if (set.contains(Integer.valueOf(4))) {
            oj.a(parcel, 4, this.zzeen, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            oj.a(parcel, 5, this.zzeeo, i, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            oj.a(parcel, 6, this.zzeep, i, true);
        }
        oj.a(parcel, a);
    }

    protected final boolean zza(zzbgo zzbgo) {
        return this.zzeeb.contains(Integer.valueOf(zzbgo.zzalu()));
    }

    public final /* synthetic */ Map zzaav() {
        return zzeea;
    }

    protected final Object zzb(zzbgo zzbgo) {
        int i;
        switch (zzbgo.zzalu()) {
            case 1:
                i = this.zzeck;
                break;
            case 2:
                return this.zzeem;
            case 3:
                i = this.zzcbc;
                break;
            case 4:
                return this.zzeen;
            default:
                i = zzbgo.zzalu();
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Unknown SafeParcelable id=");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return Integer.valueOf(i);
    }
}
