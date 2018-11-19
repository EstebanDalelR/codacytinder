package com.google.android.gms.internal;

public abstract class ajh extends aav implements zzkk {
    public ajh() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
        r1 = this;
        r5 = r1.zza(r2, r3, r4, r5);
        r0 = 1;
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        switch(r2) {
            case 1: goto L_0x0038;
            case 2: goto L_0x002d;
            case 3: goto L_0x0022;
            case 4: goto L_0x001d;
            case 5: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = com.google.android.gms.internal.zzjj.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (com.google.android.gms.internal.zzjj) r2;
        r3 = r3.readInt();
        r1.zza(r2, r3);
        goto L_0x0043;
    L_0x001d:
        r2 = r1.zzcp();
        goto L_0x0031;
    L_0x0022:
        r2 = r1.isLoading();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x002d:
        r2 = r1.getMediationAdapterClassName();
    L_0x0031:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
    L_0x0038:
        r2 = com.google.android.gms.internal.zzjj.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (com.google.android.gms.internal.zzjj) r2;
        r1.zzd(r2);
    L_0x0043:
        r4.writeNoException();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ajh.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
