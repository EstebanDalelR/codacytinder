package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.Method;

@Deprecated
public class ActionBarDrawerToggle implements DrawerListener {
    /* renamed from: b */
    private static final int[] f8892b = new int[]{16843531};
    /* renamed from: a */
    final Activity f8893a;
    /* renamed from: c */
    private final Delegate f8894c;
    /* renamed from: d */
    private boolean f8895d;
    /* renamed from: e */
    private C0362b f8896e;
    /* renamed from: f */
    private final int f8897f;
    /* renamed from: g */
    private final int f8898g;
    /* renamed from: h */
    private C0361a f8899h;

    @Deprecated
    public interface Delegate {
        @Nullable
        Drawable getThemeUpIndicator();

        void setActionBarDescription(@StringRes int i);

        void setActionBarUpIndicator(Drawable drawable, @StringRes int i);
    }

    @Deprecated
    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    /* renamed from: android.support.v4.app.ActionBarDrawerToggle$a */
    private static class C0361a {
        /* renamed from: a */
        Method f1200a;
        /* renamed from: b */
        Method f1201b;
        /* renamed from: c */
        ImageView f1202c;

        C0361a(android.app.Activity r7) {
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
            r6.<init>();
            r0 = 0;
            r1 = 1;
            r2 = android.app.ActionBar.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r3 = "setHomeAsUpIndicator";	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0026 }
            r5 = android.graphics.drawable.Drawable.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0026 }
            r6.f1200a = r2;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = android.app.ActionBar.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r3 = "setHomeActionContentDescription";	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0026 }
            r5 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0026 }
            r6.f1201b = r2;	 Catch:{ NoSuchMethodException -> 0x0026 }
            return;
        L_0x0026:
            r2 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
            r7 = r7.findViewById(r2);
            if (r7 != 0) goto L_0x0030;
        L_0x002f:
            return;
        L_0x0030:
            r7 = r7.getParent();
            r7 = (android.view.ViewGroup) r7;
            r3 = r7.getChildCount();
            r4 = 2;
            if (r3 == r4) goto L_0x003e;
        L_0x003d:
            return;
        L_0x003e:
            r0 = r7.getChildAt(r0);
            r7 = r7.getChildAt(r1);
            r1 = r0.getId();
            if (r1 != r2) goto L_0x004d;
        L_0x004c:
            goto L_0x004e;
        L_0x004d:
            r7 = r0;
        L_0x004e:
            r0 = r7 instanceof android.widget.ImageView;
            if (r0 == 0) goto L_0x0056;
        L_0x0052:
            r7 = (android.widget.ImageView) r7;
            r6.f1202c = r7;
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ActionBarDrawerToggle.a.<init>(android.app.Activity):void");
        }
    }

    /* renamed from: android.support.v4.app.ActionBarDrawerToggle$b */
    private class C0362b extends InsetDrawable implements Callback {
        /* renamed from: a */
        final /* synthetic */ ActionBarDrawerToggle f1203a;
        /* renamed from: b */
        private final boolean f1204b;
        /* renamed from: c */
        private final Rect f1205c;
        /* renamed from: d */
        private float f1206d;
        /* renamed from: e */
        private float f1207e;

        /* renamed from: a */
        public void m1311a(float f) {
            this.f1206d = f;
            invalidateSelf();
        }

        /* renamed from: a */
        public float m1310a() {
            return this.f1206d;
        }

        public void draw(@NonNull Canvas canvas) {
            copyBounds(this.f1205c);
            canvas.save();
            int i = 1;
            Object obj = ViewCompat.m2208f(this.f1203a.f8893a.getWindow().getDecorView()) == 1 ? 1 : null;
            if (obj != null) {
                i = -1;
            }
            float width = (float) this.f1205c.width();
            canvas.translate((((-this.f1207e) * width) * this.f1206d) * ((float) i), 0.0f);
            if (!(obj == null || this.f1204b)) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public void onDrawerStateChanged(int i) {
    }

    public void onDrawerSlide(View view, float f) {
        view = this.f8896e.m1310a();
        if (f > 0.5f) {
            view = Math.max(view, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            view = Math.min(view, f * 2.0f);
        }
        this.f8896e.m1311a(view);
    }

    public void onDrawerOpened(View view) {
        this.f8896e.m1311a(1.0f);
        if (this.f8895d != null) {
            m10971a(this.f8898g);
        }
    }

    public void onDrawerClosed(View view) {
        this.f8896e.m1311a(0.0f);
        if (this.f8895d != null) {
            m10971a(this.f8897f);
        }
    }

    /* renamed from: a */
    private void m10971a(int i) {
        if (this.f8894c != null) {
            this.f8894c.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar;
        if (VERSION.SDK_INT >= 18) {
            actionBar = this.f8893a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        } else {
            if (this.f8899h == null) {
                this.f8899h = new C0361a(this.f8893a);
            }
            if (this.f8899h.f1200a != null) {
                try {
                    actionBar = this.f8893a.getActionBar();
                    this.f8899h.f1201b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                    actionBar.setSubtitle(actionBar.getSubtitle());
                } catch (int i2) {
                    Log.w("ActionBarDrawerToggle", "Couldn't set content description via JB-MR2 API", i2);
                }
            }
        }
    }
}
