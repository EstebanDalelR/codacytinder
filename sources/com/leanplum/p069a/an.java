package com.leanplum.p069a;

import android.app.Activity;
import com.leanplum.LeanplumEditorMode;
import com.leanplum.LeanplumUIEditor;

/* renamed from: com.leanplum.a.an */
public final class an implements LeanplumUIEditor {
    /* renamed from: a */
    private static LeanplumUIEditor f12103a;
    /* renamed from: b */
    private static an f12104b;

    protected an() {
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
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
        r0 = 0;
        r1 = "com.leanplum.uieditor.LeanplumUIEditor";	 Catch:{ ClassNotFoundException -> 0x0008 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0008 }
        goto L_0x0009;
    L_0x0008:
        r1 = r0;
    L_0x0009:
        if (r1 == 0) goto L_0x003c;
    L_0x000b:
        r2 = "getInstance";	 Catch:{ NoSuchMethodException -> 0x0012 }
        r1 = r1.getMethod(r2, r0);	 Catch:{ NoSuchMethodException -> 0x0012 }
        goto L_0x0017;
    L_0x0012:
        r1 = move-exception;
        com.leanplum.p069a.bo.m9608a(r1);
        r1 = r0;
    L_0x0017:
        if (r1 == 0) goto L_0x003c;
    L_0x0019:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        r0 = r1.invoke(r0, r2);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        r0 = (com.leanplum.LeanplumUIEditor) r0;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        f12103a = r0;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        if (r0 == 0) goto L_0x0031;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
    L_0x0026:
        r0 = f12103a;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        r1 = com.leanplum.p069a.C2590h.f8067l;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
        r0.allowInterfaceEditing(r1);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x0032 }
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        com.leanplum.p069a.bo.m9608a(r0);
        goto L_0x003c;
    L_0x0037:
        r0 = move-exception;
        com.leanplum.p069a.bo.m9608a(r0);
        return;
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.an.<clinit>():void");
    }

    /* renamed from: a */
    public static an m14556a() {
        if (f12104b == null) {
            f12104b = new an();
        }
        return f12104b;
    }

    /* renamed from: b */
    public static boolean m14557b() {
        return f12103a != null;
    }

    public final void allowInterfaceEditing(Boolean bool) {
        if (f12103a != null) {
            f12103a.allowInterfaceEditing(bool);
        }
    }

    public final void applyInterfaceEdits(Activity activity) {
        if (f12103a != null && activity != null) {
            f12103a.applyInterfaceEdits(activity);
        }
    }

    public final void startUpdating() {
        if (f12103a != null) {
            f12103a.startUpdating();
        }
    }

    public final void stopUpdating() {
        if (f12103a != null) {
            f12103a.stopUpdating();
        }
    }

    public final void sendUpdate() {
        if (f12103a != null) {
            f12103a.sendUpdate();
        }
    }

    public final void sendUpdateDelayed(int i) {
        if (f12103a != null) {
            f12103a.sendUpdateDelayed(i);
        }
    }

    public final void sendUpdateDelayedDefault() {
        if (f12103a != null) {
            f12103a.sendUpdateDelayedDefault();
        }
    }

    public final LeanplumEditorMode getMode() {
        return f12103a != null ? f12103a.getMode() : null;
    }

    public final void setMode(LeanplumEditorMode leanplumEditorMode) {
        if (f12103a != null) {
            f12103a.setMode(leanplumEditorMode);
        }
    }
}
