package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bu extends aav implements zzadk {
    public bu() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public static zzadk m27269a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof zzadk ? (zzadk) queryLocalInterface : new bv(iBinder);
    }

    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x009e in {2, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19, 22, 25, 26, 27, 28, 29, 31, 32} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r5 = r1.zza(r2, r3, r4, r5);
        r0 = 1;
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r5 = 34;
        if (r2 == r5) goto L_0x0096;
    L_0x000c:
        switch(r2) {
            case 1: goto L_0x0087;
            case 2: goto L_0x0083;
            case 3: goto L_0x0063;
            default: goto L_0x000f;
        };
    L_0x000f:
        switch(r2) {
            case 5: goto L_0x0058;
            case 6: goto L_0x0054;
            case 7: goto L_0x0050;
            case 8: goto L_0x004c;
            case 9: goto L_0x0040;
            case 10: goto L_0x0034;
            case 11: goto L_0x0028;
            case 12: goto L_0x001d;
            case 13: goto L_0x0014;
            default: goto L_0x0012;
        };
    L_0x0012:
        r2 = 0;
        return r2;
    L_0x0014:
        r2 = r3.readString();
        r1.setUserId(r2);
        goto L_0x0092;
    L_0x001d:
        r2 = r1.getMediationAdapterClassName();
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
    L_0x0028:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzd(r2);
        goto L_0x0092;
    L_0x0034:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzc(r2);
        goto L_0x0092;
    L_0x0040:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzb(r2);
        goto L_0x0092;
    L_0x004c:
        r1.destroy();
        goto L_0x0092;
    L_0x0050:
        r1.resume();
        goto L_0x0092;
    L_0x0054:
        r1.pause();
        goto L_0x0092;
    L_0x0058:
        r2 = r1.isLoaded();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x0063:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x006b;
    L_0x0069:
        r2 = 0;
        goto L_0x007f;
    L_0x006b:
        r3 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzadp;
        if (r5 == 0) goto L_0x0079;
    L_0x0075:
        r2 = r3;
        r2 = (com.google.android.gms.internal.zzadp) r2;
        goto L_0x007f;
    L_0x0079:
        r3 = new com.google.android.gms.internal.by;
        r3.<init>(r2);
        r2 = r3;
    L_0x007f:
        r1.zza(r2);
        goto L_0x0092;
    L_0x0083:
        r1.show();
        goto L_0x0092;
    L_0x0087:
        r2 = com.google.android.gms.internal.zzadv.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (com.google.android.gms.internal.zzadv) r2;
        r1.zza(r2);
    L_0x0092:
        r4.writeNoException();
        return r0;
    L_0x0096:
        r2 = com.google.android.gms.internal.aaw.m18807a(r3);
        r1.setImmersiveMode(r2);
        goto L_0x0092;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bu.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
