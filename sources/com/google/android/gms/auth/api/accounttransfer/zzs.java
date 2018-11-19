package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzaxc;
import com.google.android.gms.internal.zzbgo;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzs extends zzaxc {
    public static final Creator<zzs> CREATOR = new C2425c();
    private static final HashMap<String, zzbgo<?, ?>> zzeea;
    private String mPackageName;
    private String zzaym;
    private int zzeck;
    private Set<Integer> zzeeb;
    private zzu zzeel;

    static {
        HashMap hashMap = new HashMap();
        zzeea = hashMap;
        hashMap.put("authenticatorInfo", zzbgo.zza("authenticatorInfo", 2, zzu.class));
        zzeea.put(ManagerWebServices.PARAM_SIGNATURE, zzbgo.zzl(ManagerWebServices.PARAM_SIGNATURE, 3));
        zzeea.put("package", zzbgo.zzl("package", 4));
    }

    public zzs() {
        this.zzeeb = new HashSet(3);
        this.zzeck = 1;
    }

    zzs(Set<Integer> set, int i, zzu zzu, String str, String str2) {
        this.zzeeb = set;
        this.zzeck = i;
        this.zzeel = zzu;
        this.zzaym = str;
        this.mPackageName = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        Set set = this.zzeeb;
        if (set.contains(Integer.valueOf(1))) {
            oj.a(parcel, 1, this.zzeck);
        }
        if (set.contains(Integer.valueOf(2))) {
            oj.a(parcel, 2, this.zzeel, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            oj.a(parcel, 3, this.zzaym, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            oj.a(parcel, 4, this.mPackageName, true);
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
        switch (zzbgo.zzalu()) {
            case 1:
                return Integer.valueOf(this.zzeck);
            case 2:
                return this.zzeel;
            case 3:
                return this.zzaym;
            case 4:
                return this.mPackageName;
            default:
                int zzalu = zzbgo.zzalu();
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Unknown SafeParcelable id=");
                stringBuilder.append(zzalu);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
