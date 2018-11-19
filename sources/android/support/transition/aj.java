package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

@RequiresApi(14)
class aj implements al {
    /* renamed from: a */
    protected C0328a f8873a;

    /* renamed from: android.support.transition.aj$a */
    static class C0328a extends ViewGroup {
        /* renamed from: a */
        static Method f1145a;
        /* renamed from: b */
        ViewGroup f1146b;
        /* renamed from: c */
        View f1147c;
        /* renamed from: d */
        ArrayList<Drawable> f1148d = null;
        /* renamed from: e */
        aj f1149e;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = android.view.ViewGroup.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r1 = "invalidateChildInParentFast";	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = 3;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 0;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 1;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 2;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x001c }
            f1145a = r0;	 Catch:{ NoSuchMethodException -> 0x001c }
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.aj.a.<clinit>():void");
        }

        C0328a(Context context, ViewGroup viewGroup, View view, aj ajVar) {
            super(context);
            this.f1146b = viewGroup;
            this.f1147c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1149e = ajVar;
        }

        /* renamed from: a */
        public void m1236a(Drawable drawable) {
            if (this.f1148d == null) {
                this.f1148d = new ArrayList();
            }
            if (!this.f1148d.contains(drawable)) {
                this.f1148d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void m1239b(Drawable drawable) {
            if (this.f1148d != null) {
                this.f1148d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        protected boolean verifyDrawable(@NonNull Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                if (this.f1148d == null || this.f1148d.contains(drawable) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void m1237a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1146b || viewGroup.getParent() == null || !ViewCompat.m2171C(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1146b.getLocationOnScreen(iArr2);
                    ViewCompat.m2205d(view, iArr[0] - iArr2[0]);
                    ViewCompat.m2202c(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: b */
        public void m1240b(View view) {
            super.removeView(view);
            if (m1238a() != null) {
                this.f1146b.removeView(this);
            }
        }

        /* renamed from: a */
        boolean m1238a() {
            return getChildCount() == 0 && (this.f1148d == null || this.f1148d.size() == 0);
        }

        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1146b.getLocationOnScreen(iArr);
            this.f1147c.getLocationOnScreen(iArr2);
            int i = 0;
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f1147c.getWidth(), this.f1147c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f1148d == null ? 0 : this.f1148d.size();
            while (i < size) {
                ((Drawable) this.f1148d.get(i)).draw(canvas);
                i++;
            }
        }

        /* renamed from: a */
        private void m1235a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1146b.getLocationOnScreen(iArr2);
            this.f1147c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1146b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f1146b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m1235a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }
    }

    aj(Context context, ViewGroup viewGroup, View view) {
        this.f8873a = new C0328a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static ViewGroup m10909c(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    static aj m10910d(View view) {
        ViewGroup c = m10909c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C0328a) {
                return ((C0328a) childAt).f1149e;
            }
        }
        return new ac(c.getContext(), c, view);
    }

    /* renamed from: a */
    public void mo342a(@NonNull Drawable drawable) {
        this.f8873a.m1236a(drawable);
    }

    /* renamed from: b */
    public void mo343b(@NonNull Drawable drawable) {
        this.f8873a.m1239b(drawable);
    }
}
