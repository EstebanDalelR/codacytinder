package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.C0593c;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.l */
public final class C0646l {
    /* renamed from: a */
    static final C0645d f1986a;

    /* renamed from: android.support.v4.widget.l$d */
    static class C0645d {
        /* renamed from: a */
        private static Method f1984a;
        /* renamed from: b */
        private static boolean f1985b;

        /* renamed from: a */
        public void mo3080a(PopupWindow popupWindow, boolean z) {
        }

        C0645d() {
        }

        /* renamed from: a */
        public void mo643a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0593c.m2313a(i3, ViewCompat.m2208f(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo3675a(android.widget.PopupWindow r7, int r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = f1985b;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x001d;
        L_0x0006:
            r0 = android.widget.PopupWindow.class;	 Catch:{ Exception -> 0x001b }
            r3 = "setWindowLayoutType";	 Catch:{ Exception -> 0x001b }
            r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001b }
            r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x001b }
            r4[r1] = r5;	 Catch:{ Exception -> 0x001b }
            r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x001b }
            f1984a = r0;	 Catch:{ Exception -> 0x001b }
            r0 = f1984a;	 Catch:{ Exception -> 0x001b }
            r0.setAccessible(r2);	 Catch:{ Exception -> 0x001b }
        L_0x001b:
            f1985b = r2;
        L_0x001d:
            r0 = f1984a;
            if (r0 == 0) goto L_0x002e;
        L_0x0021:
            r0 = f1984a;	 Catch:{ Exception -> 0x002e }
            r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x002e }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x002e }
            r2[r1] = r8;	 Catch:{ Exception -> 0x002e }
            r0.invoke(r7, r2);	 Catch:{ Exception -> 0x002e }
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.l.d.a(android.widget.PopupWindow, int):void");
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.widget.l$a */
    static class C2914a extends C0645d {
        C2914a() {
        }

        /* renamed from: a */
        public void mo643a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.widget.l$b */
    static class C4038b extends C2914a {
        /* renamed from: a */
        private static Field f12812a;

        C4038b() {
        }

        static {
            try {
                f12812a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f12812a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        /* renamed from: a */
        public void mo3080a(PopupWindow popupWindow, boolean z) {
            if (f12812a != null) {
                try {
                    f12812a.set(popupWindow, Boolean.valueOf(z));
                } catch (PopupWindow popupWindow2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", popupWindow2);
                }
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.widget.l$c */
    static class C4319c extends C4038b {
        C4319c() {
        }

        /* renamed from: a */
        public void mo3080a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: a */
        public void mo3675a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f1986a = new C4319c();
        } else if (VERSION.SDK_INT >= 21) {
            f1986a = new C4038b();
        } else if (VERSION.SDK_INT >= 19) {
            f1986a = new C2914a();
        } else {
            f1986a = new C0645d();
        }
    }

    /* renamed from: a */
    public static void m2591a(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        f1986a.mo643a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m2592a(@NonNull PopupWindow popupWindow, boolean z) {
        f1986a.mo3080a(popupWindow, z);
    }

    /* renamed from: a */
    public static void m2590a(@NonNull PopupWindow popupWindow, int i) {
        f1986a.mo3675a(popupWindow, i);
    }
}
