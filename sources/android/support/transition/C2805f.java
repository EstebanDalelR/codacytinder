package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.transition.Transition.TransitionListener;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.f */
public class C2805f extends Transition {
    /* renamed from: g */
    private static final String[] f8877g = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    /* renamed from: h */
    private static final Property<Drawable, PointF> f8878h = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        /* renamed from: a */
        private Rect f1155a = new Rect();

        public /* synthetic */ Object get(Object obj) {
            return m1270a((Drawable) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1271a((Drawable) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1271a(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1155a);
            this.f1155a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1155a);
        }

        /* renamed from: a */
        public PointF m1270a(Drawable drawable) {
            drawable.copyBounds(this.f1155a);
            return new PointF((float) this.f1155a.left, (float) this.f1155a.top);
        }
    };
    /* renamed from: i */
    private static final Property<C0342a, PointF> f8879i = new Property<C0342a, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF m1272a(C0342a c0342a) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m1272a((C0342a) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1273a((C0342a) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1273a(C0342a c0342a, PointF pointF) {
            c0342a.m1283a(pointF);
        }
    };
    /* renamed from: j */
    private static final Property<C0342a, PointF> f8880j = new Property<C0342a, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF m1274a(C0342a c0342a) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m1274a((C0342a) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1275a((C0342a) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1275a(C0342a c0342a, PointF pointF) {
            c0342a.m1284b(pointF);
        }
    };
    /* renamed from: k */
    private static final Property<View, PointF> f8881k = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF m1276a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m1276a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1277a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1277a(View view, PointF pointF) {
            am.m1251a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    /* renamed from: l */
    private static final Property<View, PointF> f8882l = new Property<View, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF m1278a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m1278a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1279a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1279a(View view, PointF pointF) {
            am.m1251a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    /* renamed from: m */
    private static final Property<View, PointF> f8883m = new Property<View, PointF>(PointF.class, "position") {
        /* renamed from: a */
        public PointF m1280a(View view) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m1280a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1281a((View) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m1281a(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            pointF = Math.round(pointF.y);
            am.m1251a(view, round, pointF, view.getWidth() + round, view.getHeight() + pointF);
        }
    };
    /* renamed from: q */
    private static C0352s f8884q = new C0352s();
    /* renamed from: n */
    private int[] f8885n = new int[2];
    /* renamed from: o */
    private boolean f8886o = false;
    /* renamed from: p */
    private boolean f8887p = false;

    /* renamed from: android.support.transition.f$a */
    private static class C0342a {
        /* renamed from: a */
        private int f1171a;
        /* renamed from: b */
        private int f1172b;
        /* renamed from: c */
        private int f1173c;
        /* renamed from: d */
        private int f1174d;
        /* renamed from: e */
        private View f1175e;
        /* renamed from: f */
        private int f1176f;
        /* renamed from: g */
        private int f1177g;

        C0342a(View view) {
            this.f1175e = view;
        }

        /* renamed from: a */
        void m1283a(PointF pointF) {
            this.f1171a = Math.round(pointF.x);
            this.f1172b = Math.round(pointF.y);
            this.f1176f++;
            if (this.f1176f == this.f1177g) {
                m1282a();
            }
        }

        /* renamed from: b */
        void m1284b(PointF pointF) {
            this.f1173c = Math.round(pointF.x);
            this.f1174d = Math.round(pointF.y);
            this.f1177g++;
            if (this.f1176f == this.f1177g) {
                m1282a();
            }
        }

        /* renamed from: a */
        private void m1282a() {
            am.m1251a(this.f1175e, this.f1171a, this.f1172b, this.f1173c, this.f1174d);
            this.f1176f = 0;
            this.f1177g = 0;
        }
    }

    @Nullable
    /* renamed from: a */
    public String[] mo338a() {
        return f8877g;
    }

    /* renamed from: d */
    private void m10931d(C0358z c0358z) {
        View view = c0358z.f1197b;
        if (ViewCompat.m2234z(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c0358z.f1196a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c0358z.f1196a.put("android:changeBounds:parent", c0358z.f1197b.getParent());
            if (this.f8887p) {
                c0358z.f1197b.getLocationInWindow(this.f8885n);
                c0358z.f1196a.put("android:changeBounds:windowX", Integer.valueOf(this.f8885n[0]));
                c0358z.f1196a.put("android:changeBounds:windowY", Integer.valueOf(this.f8885n[1]));
            }
            if (this.f8886o) {
                c0358z.f1196a.put("android:changeBounds:clip", ViewCompat.m2170B(view));
            }
        }
    }

    /* renamed from: a */
    public void mo336a(@NonNull C0358z c0358z) {
        m10931d(c0358z);
    }

    /* renamed from: b */
    public void mo339b(@NonNull C0358z c0358z) {
        m10931d(c0358z);
    }

    /* renamed from: a */
    private boolean m10930a(View view, View view2) {
        if (!this.f8887p) {
            return true;
        }
        C0358z b = m1209b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == b.f1197b) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public Animator mo335a(@NonNull ViewGroup viewGroup, @Nullable C0358z c0358z, @Nullable C0358z c0358z2) {
        C2805f c2805f = this;
        C0358z c0358z3 = c0358z;
        C0358z c0358z4 = c0358z2;
        if (c0358z3 != null) {
            if (c0358z4 != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0358z3.f1196a.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) c0358z4.f1196a.get("android:changeBounds:parent");
                if (viewGroup2 != null) {
                    if (viewGroup3 != null) {
                        View view = c0358z4.f1197b;
                        int i;
                        int i2;
                        int i3;
                        Animator ofObject;
                        if (m10930a(viewGroup2, viewGroup3)) {
                            Rect rect = (Rect) c0358z3.f1196a.get("android:changeBounds:bounds");
                            Rect rect2 = (Rect) c0358z4.f1196a.get("android:changeBounds:bounds");
                            int i4 = rect.left;
                            int i5 = rect2.left;
                            int i6 = rect.top;
                            int i7 = rect2.top;
                            int i8 = rect.right;
                            int i9 = rect2.right;
                            i = rect.bottom;
                            int i10 = rect2.bottom;
                            int i11 = i8 - i4;
                            i2 = i - i6;
                            int i12 = i9 - i5;
                            int i13 = i10 - i7;
                            View view2 = view;
                            Rect rect3 = (Rect) c0358z3.f1196a.get("android:changeBounds:clip");
                            Rect rect4 = (Rect) c0358z4.f1196a.get("android:changeBounds:clip");
                            if ((i11 == 0 || i2 == 0) && (i12 == 0 || i13 == 0)) {
                                i3 = 0;
                            } else {
                                if (i4 == i5) {
                                    if (i6 == i7) {
                                        i3 = 0;
                                        if (!(i8 == i9 && i == i10)) {
                                            i3++;
                                        }
                                    }
                                }
                                i3 = 1;
                                i3++;
                            }
                            if (!(rect3 == null || rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                                i3++;
                            }
                            if (i3 > 0) {
                                Animator a;
                                Rect rect5 = rect4;
                                Rect rect6 = rect3;
                                if (c2805f.f8886o) {
                                    Animator animator;
                                    Rect rect7;
                                    final View view3;
                                    view = view2;
                                    am.m1251a(view, i4, i6, Math.max(i11, i12) + i4, Math.max(i2, i13) + i6);
                                    if (i4 == i5) {
                                        if (i6 == i7) {
                                            animator = null;
                                            if (rect6 != null) {
                                                i = 0;
                                                rect7 = new Rect(0, 0, i11, i2);
                                            } else {
                                                i = 0;
                                                rect7 = rect6;
                                            }
                                            if (rect7.equals(rect5 != null ? new Rect(i, i, i12, i13) : rect5)) {
                                                ViewCompat.m2182a(view, rect7);
                                                ofObject = ObjectAnimator.ofObject(view, "clipBounds", f8884q, new Object[]{rect7, r2});
                                                view3 = view;
                                                rect = rect5;
                                                i13 = i5;
                                                i11 = i7;
                                                i4 = i9;
                                                i5 = i10;
                                                ofObject.addListener(new AnimatorListenerAdapter(c2805f) {
                                                    /* renamed from: g */
                                                    final /* synthetic */ C2805f f1169g;
                                                    /* renamed from: h */
                                                    private boolean f1170h;

                                                    public void onAnimationCancel(Animator animator) {
                                                        this.f1170h = true;
                                                    }

                                                    public void onAnimationEnd(Animator animator) {
                                                        if (this.f1170h == null) {
                                                            ViewCompat.m2182a(view3, rect);
                                                            am.m1251a(view3, i13, i11, i4, i5);
                                                        }
                                                    }
                                                });
                                            } else {
                                                ofObject = null;
                                            }
                                            a = C0357y.m1305a(animator, ofObject);
                                        }
                                    }
                                    animator = C0344h.m1285a(view, f8883m, m1224l().mo332a((float) i4, (float) i6, (float) i5, (float) i7));
                                    if (rect6 != null) {
                                        i = 0;
                                        rect7 = rect6;
                                    } else {
                                        i = 0;
                                        rect7 = new Rect(0, 0, i11, i2);
                                    }
                                    if (rect5 != null) {
                                    }
                                    if (rect7.equals(rect5 != null ? new Rect(i, i, i12, i13) : rect5)) {
                                        ofObject = null;
                                    } else {
                                        ViewCompat.m2182a(view, rect7);
                                        ofObject = ObjectAnimator.ofObject(view, "clipBounds", f8884q, new Object[]{rect7, r2});
                                        view3 = view;
                                        rect = rect5;
                                        i13 = i5;
                                        i11 = i7;
                                        i4 = i9;
                                        i5 = i10;
                                        ofObject.addListener(/* anonymous class already generated */);
                                    }
                                    a = C0357y.m1305a(animator, ofObject);
                                } else {
                                    view = view2;
                                    am.m1251a(view, i4, i6, i8, i);
                                    if (i3 != 2) {
                                        if (i4 == i5) {
                                            if (i6 == i7) {
                                                a = C0344h.m1285a(view, f8881k, m1224l().mo332a((float) i8, (float) i, (float) i9, (float) i10));
                                            }
                                        }
                                        a = C0344h.m1285a(view, f8882l, m1224l().mo332a((float) i4, (float) i6, (float) i5, (float) i7));
                                    } else if (i11 == i12 && i2 == i13) {
                                        a = C0344h.m1285a(view, f8883m, m1224l().mo332a((float) i4, (float) i6, (float) i5, (float) i7));
                                    } else {
                                        final C0342a c0342a = new C0342a(view);
                                        ObjectAnimator a2 = C0344h.m1285a(c0342a, f8879i, m1224l().mo332a((float) i4, (float) i6, (float) i5, (float) i7));
                                        ObjectAnimator a3 = C0344h.m1285a(c0342a, f8880j, m1224l().mo332a((float) i8, (float) i, (float) i9, (float) i10));
                                        Animator animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(new Animator[]{a2, a3});
                                        animatorSet.addListener(new AnimatorListenerAdapter(c2805f) {
                                            /* renamed from: b */
                                            final /* synthetic */ C2805f f1162b;
                                            private C0342a mViewBounds = c0342a;
                                        });
                                        a = animatorSet;
                                    }
                                }
                                if (view.getParent() instanceof ViewGroup) {
                                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                                    af.m1232a(viewGroup4, true);
                                    mo359a(new C2810u(c2805f) {
                                        /* renamed from: a */
                                        boolean f12755a = null;
                                        /* renamed from: c */
                                        final /* synthetic */ C2805f f12757c;

                                        public void onTransitionCancel(@NonNull Transition transition) {
                                            af.m1232a(viewGroup4, false);
                                            this.f12755a = true;
                                        }

                                        public void onTransitionEnd(@NonNull Transition transition) {
                                            if (!this.f12755a) {
                                                af.m1232a(viewGroup4, false);
                                            }
                                            transition.mo364b((TransitionListener) this);
                                        }

                                        public void onTransitionPause(@NonNull Transition transition) {
                                            af.m1232a(viewGroup4, false);
                                        }

                                        public void onTransitionResume(@NonNull Transition transition) {
                                            af.m1232a(viewGroup4, true);
                                        }
                                    });
                                }
                                return a;
                            }
                        }
                        i2 = ((Integer) c0358z3.f1196a.get("android:changeBounds:windowX")).intValue();
                        int intValue = ((Integer) c0358z3.f1196a.get("android:changeBounds:windowY")).intValue();
                        i = ((Integer) c0358z4.f1196a.get("android:changeBounds:windowX")).intValue();
                        i3 = ((Integer) c0358z4.f1196a.get("android:changeBounds:windowY")).intValue();
                        if (i2 == i) {
                            if (intValue != i3) {
                            }
                        }
                        ViewGroup viewGroup5 = viewGroup;
                        viewGroup5.getLocationInWindow(c2805f.f8885n);
                        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
                        view.draw(new Canvas(createBitmap));
                        Drawable bitmapDrawable = new BitmapDrawable(createBitmap);
                        float c = am.m1255c(view);
                        am.m1249a(view, 0.0f);
                        am.m1247a(viewGroup).mo342a(bitmapDrawable);
                        PropertyValuesHolder a4 = C0348n.m1290a(f8878h, m1224l().mo332a((float) (i2 - c2805f.f8885n[0]), (float) (intValue - c2805f.f8885n[1]), (float) (i - c2805f.f8885n[0]), (float) (i3 - c2805f.f8885n[1])));
                        ofObject = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{a4});
                        final ViewGroup viewGroup6 = viewGroup5;
                        final Drawable drawable = bitmapDrawable;
                        final View view4 = view;
                        final float f = c;
                        ofObject.addListener(new AnimatorListenerAdapter(c2805f) {
                            /* renamed from: e */
                            final /* synthetic */ C2805f f1160e;

                            public void onAnimationEnd(Animator animator) {
                                am.m1247a(viewGroup6).mo343b(drawable);
                                am.m1249a(view4, f);
                            }
                        });
                        return ofObject;
                        return null;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
