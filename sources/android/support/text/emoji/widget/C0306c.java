package android.support.text.emoji.widget;

import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.Editable.Factory;

/* renamed from: android.support.text.emoji.widget.c */
final class C0306c extends Factory {
    /* renamed from: a */
    private static final Object f1059a = new Object();
    @GuardedBy("sInstanceLock")
    /* renamed from: b */
    private static volatile Factory f1060b;
    @Nullable
    /* renamed from: c */
    private static Class<?> f1061c;

    @android.annotation.SuppressLint({"PrivateApi"})
    private C0306c() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = "android.text.DynamicLayout$ChangeWatcher";	 Catch:{ Throwable -> 0x0013 }
        r1 = r2.getClass();	 Catch:{ Throwable -> 0x0013 }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x0013 }
        r0 = r1.loadClass(r0);	 Catch:{ Throwable -> 0x0013 }
        f1061c = r0;	 Catch:{ Throwable -> 0x0013 }
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.text.emoji.widget.c.<init>():void");
    }

    /* renamed from: a */
    public static Factory m1149a() {
        if (f1060b == null) {
            synchronized (f1059a) {
                if (f1060b == null) {
                    f1060b = new C0306c();
                }
            }
        }
        return f1060b;
    }

    public Editable newEditable(@NonNull CharSequence charSequence) {
        if (f1061c != null) {
            return C0316j.m1167a(f1061c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
