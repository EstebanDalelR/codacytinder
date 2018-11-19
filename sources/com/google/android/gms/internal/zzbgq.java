package com.google.android.gms.internal;

public abstract class zzbgq extends pa implements zzbfq {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        pa paVar = (pa) obj;
        for (zzbgo zzbgo : zzaav().values()) {
            if (zza(zzbgo)) {
                if (!paVar.zza(zzbgo) || !zzb(zzbgo).equals(paVar.zzb(zzbgo))) {
                    return false;
                }
            } else if (paVar.zza(zzbgo)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (zzbgo zzbgo : zzaav().values()) {
            if (zza(zzbgo)) {
                i = (i * 31) + zzb(zzbgo).hashCode();
            }
        }
        return i;
    }

    public Object zzgo(String str) {
        return null;
    }

    public boolean zzgp(String str) {
        return false;
    }
}
