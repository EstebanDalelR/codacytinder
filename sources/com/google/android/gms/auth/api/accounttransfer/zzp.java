package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzaxc;
import com.google.android.gms.internal.zzbgo;
import java.util.List;
import java.util.Map;

public class zzp extends zzaxc {
    public static final Creator<zzp> CREATOR = new C2424b();
    private static final C2880a<String, zzbgo<?, ?>> zzeef;
    private int zzeck;
    private List<String> zzeeg;
    private List<String> zzeeh;
    private List<String> zzeei;
    private List<String> zzeej;
    private List<String> zzeek;

    static {
        C2880a c2880a = new C2880a();
        zzeef = c2880a;
        c2880a.put("registered", zzbgo.zzm("registered", 2));
        zzeef.put("in_progress", zzbgo.zzm("in_progress", 3));
        zzeef.put("success", zzbgo.zzm("success", 4));
        zzeef.put("failed", zzbgo.zzm("failed", 5));
        zzeef.put("escrowed", zzbgo.zzm("escrowed", 6));
    }

    public zzp() {
        this.zzeck = 1;
    }

    zzp(int i, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<String> list5) {
        this.zzeck = i;
        this.zzeeg = list;
        this.zzeeh = list2;
        this.zzeei = list3;
        this.zzeej = list4;
        this.zzeek = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.b(parcel, 2, this.zzeeg, false);
        oj.b(parcel, 3, this.zzeeh, false);
        oj.b(parcel, 4, this.zzeei, false);
        oj.b(parcel, 5, this.zzeej, false);
        oj.b(parcel, 6, this.zzeek, false);
        oj.a(parcel, i);
    }

    protected final boolean zza(zzbgo zzbgo) {
        return true;
    }

    public final Map<String, zzbgo<?, ?>> zzaav() {
        return zzeef;
    }

    protected final Object zzb(zzbgo zzbgo) {
        switch (zzbgo.zzalu()) {
            case 1:
                return Integer.valueOf(this.zzeck);
            case 2:
                return this.zzeeg;
            case 3:
                return this.zzeeh;
            case 4:
                return this.zzeei;
            case 5:
                return this.zzeej;
            case 6:
                return this.zzeek;
            default:
                int zzalu = zzbgo.zzalu();
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Unknown SafeParcelable id=");
                stringBuilder.append(zzalu);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
