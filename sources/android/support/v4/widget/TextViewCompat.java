package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StyleRes;
import android.support.v4.os.C0528a;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public final class TextViewCompat {
    /* renamed from: a */
    static final C0627g f1936a;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$g */
    static class C0627g {
        /* renamed from: a */
        private static Field f1932a;
        /* renamed from: b */
        private static boolean f1933b;
        /* renamed from: c */
        private static Field f1934c;
        /* renamed from: d */
        private static boolean f1935d;

        C0627g() {
        }

        /* renamed from: a */
        public void mo3077a(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: a */
        private static java.lang.reflect.Field m2511a(java.lang.String r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = android.widget.TextView.class;	 Catch:{ NoSuchFieldException -> 0x000c }
            r1 = r1.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x000c }
            r0 = 1;
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x000d }
            goto L_0x0028;
        L_0x000c:
            r1 = r0;
        L_0x000d:
            r0 = "TextViewCompatBase";
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Could not retrieve ";
            r2.append(r3);
            r2.append(r4);
            r4 = " field.";
            r2.append(r4);
            r4 = r2.toString();
            android.util.Log.e(r0, r4);
        L_0x0028:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.TextViewCompat.g.a(java.lang.String):java.lang.reflect.Field");
        }

        /* renamed from: a */
        private static int m2510a(java.lang.reflect.Field r2, android.widget.TextView r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = r2.getInt(r3);	 Catch:{ IllegalAccessException -> 0x0005 }
            return r3;
        L_0x0005:
            r3 = "TextViewCompatBase";
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Could not retrieve value of ";
            r0.append(r1);
            r2 = r2.getName();
            r0.append(r2);
            r2 = " field.";
            r0.append(r2);
            r2 = r0.toString();
            android.util.Log.d(r3, r2);
            r2 = -1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.TextViewCompat.g.a(java.lang.reflect.Field, android.widget.TextView):int");
        }

        /* renamed from: a */
        public int mo621a(TextView textView) {
            if (!f1935d) {
                f1934c = C0627g.m2511a("mMaxMode");
                f1935d = true;
            }
            if (f1934c != null && C0627g.m2510a(f1934c, textView) == 1) {
                if (!f1933b) {
                    f1932a = C0627g.m2511a("mMaximum");
                    f1933b = true;
                }
                if (f1932a != null) {
                    return C0627g.m2510a(f1932a, textView);
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo3959a(TextView textView, @StyleRes int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* renamed from: b */
        public Drawable[] mo3078b(@NonNull TextView textView) {
            return textView.getCompoundDrawables();
        }
    }

    @RequiresApi(16)
    /* renamed from: android.support.v4.widget.TextViewCompat$a */
    static class C2904a extends C0627g {
        C2904a() {
        }

        /* renamed from: a */
        public int mo621a(TextView textView) {
            return textView.getMaxLines();
        }
    }

    @RequiresApi(17)
    /* renamed from: android.support.v4.widget.TextViewCompat$b */
    static class C4035b extends C2904a {
        C4035b() {
        }

        /* renamed from: a */
        public void mo3077a(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            Drawable drawable5 = obj != null ? drawable3 : drawable;
            if (obj == null) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo3078b(@NonNull TextView textView) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            textView = textView.getCompoundDrawables();
            if (obj != null) {
                obj = textView[2];
                Object obj2 = textView[0];
                textView[0] = obj;
                textView[2] = obj2;
            }
            return textView;
        }
    }

    @RequiresApi(18)
    /* renamed from: android.support.v4.widget.TextViewCompat$c */
    static class C4318c extends C4035b {
        C4318c() {
        }

        /* renamed from: a */
        public void mo3077a(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo3078b(@NonNull TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.widget.TextViewCompat$d */
    static class C4433d extends C4318c {
        C4433d() {
        }

        /* renamed from: a */
        public void mo3959a(@NonNull TextView textView, @StyleRes int i) {
            textView.setTextAppearance(i);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.widget.TextViewCompat$e */
    static class C4454e extends C4433d {
        C4454e() {
        }
    }

    @RequiresApi(27)
    /* renamed from: android.support.v4.widget.TextViewCompat$f */
    static class C4460f extends C4454e {
        C4460f() {
        }
    }

    static {
        if (C0528a.m1951a()) {
            f1936a = new C4460f();
        } else if (VERSION.SDK_INT >= 26) {
            f1936a = new C4454e();
        } else if (VERSION.SDK_INT >= 23) {
            f1936a = new C4433d();
        } else if (VERSION.SDK_INT >= 18) {
            f1936a = new C4318c();
        } else if (VERSION.SDK_INT >= 17) {
            f1936a = new C4035b();
        } else if (VERSION.SDK_INT >= 16) {
            f1936a = new C2904a();
        } else {
            f1936a = new C0627g();
        }
    }

    /* renamed from: a */
    public static void m2518a(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        f1936a.mo3077a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static int m2516a(@NonNull TextView textView) {
        return f1936a.mo621a(textView);
    }

    /* renamed from: a */
    public static void m2517a(@NonNull TextView textView, @StyleRes int i) {
        f1936a.mo3959a(textView, i);
    }

    @NonNull
    /* renamed from: b */
    public static Drawable[] m2519b(@NonNull TextView textView) {
        return f1936a.mo3078b(textView);
    }
}
