package com.google.android.gms.common.internal;

import com.google.android.gms.internal.zzbfm;

public abstract class DowngradeableSafeParcel extends zzbfm implements ReflectedParcelable {
    private static final Object zzfzn = new Object();
    private static ClassLoader zzfzo;
    private static Integer zzfzp;
    private boolean zzfzq = false;

    private static ClassLoader zzalf() {
        synchronized (zzfzn) {
        }
        return null;
    }

    protected static Integer zzalg() {
        synchronized (zzfzn) {
        }
        return null;
    }

    protected static boolean zzgh(String str) {
        zzalf();
        return true;
    }
}
