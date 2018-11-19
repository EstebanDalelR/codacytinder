package com.google.android.gms.internal;

public abstract class arz extends aav implements zzva {
    public arz() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:76:0x0221 in {2, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20, 26, 27, 28, 29, 31, 32, 33, 34, 35, 36, 42, 43, 44, 50, 51, 52, 53, 54, 56, 59, 62, 63, 64, 65, 67, 73, 74, 75} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r9 = this;
        r13 = r9.zza(r10, r11, r12, r13);
        r0 = 1;
        if (r13 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r13 = 0;
        switch(r10) {
            case 1: goto L_0x01e2;
            case 2: goto L_0x01d7;
            case 3: goto L_0x01a6;
            case 4: goto L_0x019f;
            case 5: goto L_0x019b;
            case 6: goto L_0x0158;
            case 7: goto L_0x011e;
            case 8: goto L_0x0119;
            case 9: goto L_0x0114;
            case 10: goto L_0x00ed;
            case 11: goto L_0x00dc;
            case 12: goto L_0x00d7;
            case 13: goto L_0x00cc;
            case 14: goto L_0x0085;
            case 15: goto L_0x007f;
            case 16: goto L_0x0079;
            case 17: goto L_0x006e;
            case 18: goto L_0x0069;
            case 19: goto L_0x0064;
            case 20: goto L_0x004f;
            case 21: goto L_0x0042;
            case 22: goto L_0x003c;
            case 23: goto L_0x0023;
            case 24: goto L_0x001d;
            case 25: goto L_0x0014;
            case 26: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        r10 = 0;
        return r10;
    L_0x000e:
        r10 = r9.getVideoController();
        goto L_0x01db;
    L_0x0014:
        r10 = com.google.android.gms.internal.aaw.m18807a(r11);
        r9.setImmersiveMode(r10);
        goto L_0x01a2;
    L_0x001d:
        r10 = r9.zzmj();
        goto L_0x01db;
    L_0x0023:
        r10 = r11.readStrongBinder();
        r10 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r13 = r11.readStrongBinder();
        r13 = com.google.android.gms.internal.cq.m27274a(r13);
        r11 = r11.createStringArrayList();
        r9.zza(r10, r13, r11);
        goto L_0x01a2;
    L_0x003c:
        r10 = r9.zzmi();
        goto L_0x00d0;
    L_0x0042:
        r10 = r11.readStrongBinder();
        r10 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r9.zzg(r10);
        goto L_0x01a2;
    L_0x004f:
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r10 = (com.google.android.gms.internal.zzjj) r10;
        r13 = r11.readString();
        r11 = r11.readString();
        r9.zza(r10, r13, r11);
        goto L_0x01a2;
    L_0x0064:
        r10 = r9.zzmh();
        goto L_0x0072;
    L_0x0069:
        r10 = r9.getInterstitialAdapterInfo();
        goto L_0x0072;
    L_0x006e:
        r10 = r9.zzmg();
    L_0x0072:
        r12.writeNoException();
        com.google.android.gms.internal.aaw.m18809b(r12, r10);
        return r0;
    L_0x0079:
        r10 = r9.zzmf();
        goto L_0x01db;
    L_0x007f:
        r10 = r9.zzme();
        goto L_0x01db;
    L_0x0085:
        r10 = r11.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r3 = r10;
        r3 = (com.google.android.gms.internal.zzjj) r3;
        r4 = r11.readString();
        r5 = r11.readString();
        r10 = r11.readStrongBinder();
        if (r10 != 0) goto L_0x00a6;
    L_0x00a4:
        r6 = r13;
        goto L_0x00b9;
    L_0x00a6:
        r13 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        r13 = r10.queryLocalInterface(r13);
        r1 = r13 instanceof com.google.android.gms.internal.zzvd;
        if (r1 == 0) goto L_0x00b3;
    L_0x00b0:
        r13 = (com.google.android.gms.internal.zzvd) r13;
        goto L_0x00a4;
    L_0x00b3:
        r13 = new com.google.android.gms.internal.asc;
        r13.<init>(r10);
        goto L_0x00a4;
    L_0x00b9:
        r10 = com.google.android.gms.internal.zzpe.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r7 = r10;
        r7 = (com.google.android.gms.internal.zzpe) r7;
        r8 = r11.createStringArrayList();
        r1 = r9;
        r1.zza(r2, r3, r4, r5, r6, r7, r8);
        goto L_0x01a2;
    L_0x00cc:
        r10 = r9.isInitialized();
    L_0x00d0:
        r12.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r12, r10);
        return r0;
    L_0x00d7:
        r9.showVideo();
        goto L_0x01a2;
    L_0x00dc:
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r10 = (com.google.android.gms.internal.zzjj) r10;
        r11 = r11.readString();
        r9.zzc(r10, r11);
        goto L_0x01a2;
    L_0x00ed:
        r10 = r11.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r3 = r10;
        r3 = (com.google.android.gms.internal.zzjj) r3;
        r4 = r11.readString();
        r10 = r11.readStrongBinder();
        r5 = com.google.android.gms.internal.cq.m27274a(r10);
        r6 = r11.readString();
        r1 = r9;
        r1.zza(r2, r3, r4, r5, r6);
        goto L_0x01a2;
    L_0x0114:
        r9.resume();
        goto L_0x01a2;
    L_0x0119:
        r9.pause();
        goto L_0x01a2;
    L_0x011e:
        r10 = r11.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r3 = r10;
        r3 = (com.google.android.gms.internal.zzjj) r3;
        r4 = r11.readString();
        r5 = r11.readString();
        r10 = r11.readStrongBinder();
        if (r10 != 0) goto L_0x013f;
    L_0x013d:
        r6 = r13;
        goto L_0x0153;
    L_0x013f:
        r11 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        r11 = r10.queryLocalInterface(r11);
        r13 = r11 instanceof com.google.android.gms.internal.zzvd;
        if (r13 == 0) goto L_0x014d;
    L_0x0149:
        r13 = r11;
        r13 = (com.google.android.gms.internal.zzvd) r13;
        goto L_0x013d;
    L_0x014d:
        r13 = new com.google.android.gms.internal.asc;
        r13.<init>(r10);
        goto L_0x013d;
    L_0x0153:
        r1 = r9;
        r1.zza(r2, r3, r4, r5, r6);
        goto L_0x01a2;
    L_0x0158:
        r10 = r11.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r10 = com.google.android.gms.internal.zzjn.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r3 = r10;
        r3 = (com.google.android.gms.internal.zzjn) r3;
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r4 = r10;
        r4 = (com.google.android.gms.internal.zzjj) r4;
        r5 = r11.readString();
        r6 = r11.readString();
        r10 = r11.readStrongBinder();
        if (r10 != 0) goto L_0x0182;
    L_0x0180:
        r7 = r13;
        goto L_0x0196;
    L_0x0182:
        r11 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        r11 = r10.queryLocalInterface(r11);
        r13 = r11 instanceof com.google.android.gms.internal.zzvd;
        if (r13 == 0) goto L_0x0190;
    L_0x018c:
        r13 = r11;
        r13 = (com.google.android.gms.internal.zzvd) r13;
        goto L_0x0180;
    L_0x0190:
        r13 = new com.google.android.gms.internal.asc;
        r13.<init>(r10);
        goto L_0x0180;
    L_0x0196:
        r1 = r9;
        r1.zza(r2, r3, r4, r5, r6, r7);
        goto L_0x01a2;
    L_0x019b:
        r9.destroy();
        goto L_0x01a2;
    L_0x019f:
        r9.showInterstitial();
    L_0x01a2:
        r12.writeNoException();
        return r0;
    L_0x01a6:
        r10 = r11.readStrongBinder();
        r10 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r1 = com.google.android.gms.internal.zzjj.CREATOR;
        r1 = com.google.android.gms.internal.aaw.m18803a(r11, r1);
        r1 = (com.google.android.gms.internal.zzjj) r1;
        r2 = r11.readString();
        r11 = r11.readStrongBinder();
        if (r11 != 0) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01d3;
    L_0x01c1:
        r13 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        r13 = r11.queryLocalInterface(r13);
        r3 = r13 instanceof com.google.android.gms.internal.zzvd;
        if (r3 == 0) goto L_0x01ce;
    L_0x01cb:
        r13 = (com.google.android.gms.internal.zzvd) r13;
        goto L_0x01d3;
    L_0x01ce:
        r13 = new com.google.android.gms.internal.asc;
        r13.<init>(r11);
    L_0x01d3:
        r9.zza(r10, r1, r2, r13);
        goto L_0x01a2;
    L_0x01d7:
        r10 = r9.getView();
    L_0x01db:
        r12.writeNoException();
        com.google.android.gms.internal.aaw.m18804a(r12, r10);
        return r0;
    L_0x01e2:
        r10 = r11.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r10);
        r10 = com.google.android.gms.internal.zzjn.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r3 = r10;
        r3 = (com.google.android.gms.internal.zzjn) r3;
        r10 = com.google.android.gms.internal.zzjj.CREATOR;
        r10 = com.google.android.gms.internal.aaw.m18803a(r11, r10);
        r4 = r10;
        r4 = (com.google.android.gms.internal.zzjj) r4;
        r5 = r11.readString();
        r10 = r11.readStrongBinder();
        if (r10 != 0) goto L_0x0208;
    L_0x0206:
        r6 = r13;
        goto L_0x021c;
    L_0x0208:
        r11 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        r11 = r10.queryLocalInterface(r11);
        r13 = r11 instanceof com.google.android.gms.internal.zzvd;
        if (r13 == 0) goto L_0x0216;
    L_0x0212:
        r13 = r11;
        r13 = (com.google.android.gms.internal.zzvd) r13;
        goto L_0x0206;
    L_0x0216:
        r13 = new com.google.android.gms.internal.asc;
        r13.<init>(r10);
        goto L_0x0206;
    L_0x021c:
        r1 = r9;
        r1.zza(r2, r3, r4, r5, r6);
        goto L_0x01a2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arz.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
