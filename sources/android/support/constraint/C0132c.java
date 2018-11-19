package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0136e.C0135b;
import android.support.constraint.Constraints.LayoutParams;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.c */
public class C0132c {
    /* renamed from: a */
    private static final int[] f383a = new int[]{0, 4, 8};
    /* renamed from: c */
    private static SparseIntArray f384c = new SparseIntArray();
    /* renamed from: b */
    private HashMap<Integer, C0131a> f385b = new HashMap();

    /* renamed from: android.support.constraint.c$a */
    private static class C0131a {
        /* renamed from: A */
        public int f331A;
        /* renamed from: B */
        public int f332B;
        /* renamed from: C */
        public int f333C;
        /* renamed from: D */
        public int f334D;
        /* renamed from: E */
        public int f335E;
        /* renamed from: F */
        public int f336F;
        /* renamed from: G */
        public int f337G;
        /* renamed from: H */
        public int f338H;
        /* renamed from: I */
        public int f339I;
        /* renamed from: J */
        public int f340J;
        /* renamed from: K */
        public int f341K;
        /* renamed from: L */
        public int f342L;
        /* renamed from: M */
        public int f343M;
        /* renamed from: N */
        public int f344N;
        /* renamed from: O */
        public int f345O;
        /* renamed from: P */
        public int f346P;
        /* renamed from: Q */
        public float f347Q;
        /* renamed from: R */
        public float f348R;
        /* renamed from: S */
        public int f349S;
        /* renamed from: T */
        public int f350T;
        /* renamed from: U */
        public float f351U;
        /* renamed from: V */
        public boolean f352V;
        /* renamed from: W */
        public float f353W;
        /* renamed from: X */
        public float f354X;
        /* renamed from: Y */
        public float f355Y;
        /* renamed from: Z */
        public float f356Z;
        /* renamed from: a */
        boolean f357a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public int ar;
        public int as;
        public int[] at;
        /* renamed from: b */
        public int f358b;
        /* renamed from: c */
        public int f359c;
        /* renamed from: d */
        int f360d;
        /* renamed from: e */
        public int f361e;
        /* renamed from: f */
        public int f362f;
        /* renamed from: g */
        public float f363g;
        /* renamed from: h */
        public int f364h;
        /* renamed from: i */
        public int f365i;
        /* renamed from: j */
        public int f366j;
        /* renamed from: k */
        public int f367k;
        /* renamed from: l */
        public int f368l;
        /* renamed from: m */
        public int f369m;
        /* renamed from: n */
        public int f370n;
        /* renamed from: o */
        public int f371o;
        /* renamed from: p */
        public int f372p;
        /* renamed from: q */
        public int f373q;
        /* renamed from: r */
        public int f374r;
        /* renamed from: s */
        public int f375s;
        /* renamed from: t */
        public int f376t;
        /* renamed from: u */
        public float f377u;
        /* renamed from: v */
        public float f378v;
        /* renamed from: w */
        public String f379w;
        /* renamed from: x */
        public int f380x;
        /* renamed from: y */
        public int f381y;
        /* renamed from: z */
        public float f382z;

        private C0131a() {
            this.f357a = false;
            this.f361e = -1;
            this.f362f = -1;
            this.f363g = -1.0f;
            this.f364h = -1;
            this.f365i = -1;
            this.f366j = -1;
            this.f367k = -1;
            this.f368l = -1;
            this.f369m = -1;
            this.f370n = -1;
            this.f371o = -1;
            this.f372p = -1;
            this.f373q = -1;
            this.f374r = -1;
            this.f375s = -1;
            this.f376t = -1;
            this.f377u = 0.5f;
            this.f378v = 0.5f;
            this.f379w = null;
            this.f380x = -1;
            this.f381y = 0;
            this.f382z = 0.0f;
            this.f331A = -1;
            this.f332B = -1;
            this.f333C = -1;
            this.f334D = -1;
            this.f335E = -1;
            this.f336F = -1;
            this.f337G = -1;
            this.f338H = -1;
            this.f339I = -1;
            this.f340J = 0;
            this.f341K = -1;
            this.f342L = -1;
            this.f343M = -1;
            this.f344N = -1;
            this.f345O = -1;
            this.f346P = -1;
            this.f347Q = 0.0f;
            this.f348R = 0.0f;
            this.f349S = 0;
            this.f350T = 0;
            this.f351U = 1.0f;
            this.f352V = false;
            this.f353W = 0.0f;
            this.f354X = 0.0f;
            this.f355Y = 0.0f;
            this.f356Z = 0.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ah = false;
            this.ai = false;
            this.aj = 0;
            this.ak = 0;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = 1.0f;
            this.aq = 1.0f;
            this.ar = -1;
            this.as = -1;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m380a();
        }

        /* renamed from: a */
        public C0131a m380a() {
            C0131a c0131a = new C0131a();
            c0131a.f357a = this.f357a;
            c0131a.f358b = this.f358b;
            c0131a.f359c = this.f359c;
            c0131a.f361e = this.f361e;
            c0131a.f362f = this.f362f;
            c0131a.f363g = this.f363g;
            c0131a.f364h = this.f364h;
            c0131a.f365i = this.f365i;
            c0131a.f366j = this.f366j;
            c0131a.f367k = this.f367k;
            c0131a.f368l = this.f368l;
            c0131a.f369m = this.f369m;
            c0131a.f370n = this.f370n;
            c0131a.f371o = this.f371o;
            c0131a.f372p = this.f372p;
            c0131a.f373q = this.f373q;
            c0131a.f374r = this.f374r;
            c0131a.f375s = this.f375s;
            c0131a.f376t = this.f376t;
            c0131a.f377u = this.f377u;
            c0131a.f378v = this.f378v;
            c0131a.f379w = this.f379w;
            c0131a.f331A = this.f331A;
            c0131a.f332B = this.f332B;
            c0131a.f377u = this.f377u;
            c0131a.f377u = this.f377u;
            c0131a.f377u = this.f377u;
            c0131a.f377u = this.f377u;
            c0131a.f377u = this.f377u;
            c0131a.f333C = this.f333C;
            c0131a.f334D = this.f334D;
            c0131a.f335E = this.f335E;
            c0131a.f336F = this.f336F;
            c0131a.f337G = this.f337G;
            c0131a.f338H = this.f338H;
            c0131a.f339I = this.f339I;
            c0131a.f340J = this.f340J;
            c0131a.f341K = this.f341K;
            c0131a.f342L = this.f342L;
            c0131a.f343M = this.f343M;
            c0131a.f344N = this.f344N;
            c0131a.f345O = this.f345O;
            c0131a.f346P = this.f346P;
            c0131a.f347Q = this.f347Q;
            c0131a.f348R = this.f348R;
            c0131a.f349S = this.f349S;
            c0131a.f350T = this.f350T;
            c0131a.f351U = this.f351U;
            c0131a.f352V = this.f352V;
            c0131a.f353W = this.f353W;
            c0131a.f354X = this.f354X;
            c0131a.f355Y = this.f355Y;
            c0131a.f356Z = this.f356Z;
            c0131a.aa = this.aa;
            c0131a.ab = this.ab;
            c0131a.ac = this.ac;
            c0131a.ad = this.ad;
            c0131a.ae = this.ae;
            c0131a.af = this.af;
            c0131a.ag = this.ag;
            c0131a.ah = this.ah;
            c0131a.ai = this.ai;
            c0131a.aj = this.aj;
            c0131a.ak = this.ak;
            c0131a.al = this.al;
            c0131a.am = this.am;
            c0131a.an = this.an;
            c0131a.ao = this.ao;
            c0131a.ap = this.ap;
            c0131a.aq = this.aq;
            c0131a.ar = this.ar;
            c0131a.as = this.as;
            if (this.at != null) {
                c0131a.at = Arrays.copyOf(this.at, this.at.length);
            }
            c0131a.f380x = this.f380x;
            c0131a.f381y = this.f381y;
            c0131a.f382z = this.f382z;
            return c0131a;
        }

        /* renamed from: a */
        private void m376a(C0129b c0129b, int i, LayoutParams layoutParams) {
            m375a(i, layoutParams);
            if ((c0129b instanceof C2732a) != 0) {
                this.as = 1;
                C2732a c2732a = (C2732a) c0129b;
                this.ar = c2732a.getType();
                this.at = c2732a.getReferencedIds();
            }
        }

        /* renamed from: a */
        private void m375a(int i, LayoutParams layoutParams) {
            m374a(i, (ConstraintLayout.LayoutParams) layoutParams);
            this.f351U = layoutParams.an;
            this.f354X = layoutParams.aq;
            this.f355Y = layoutParams.ar;
            this.f356Z = layoutParams.as;
            this.aa = layoutParams.at;
            this.ab = layoutParams.au;
            this.ac = layoutParams.av;
            this.ad = layoutParams.aw;
            this.ae = layoutParams.ax;
            this.af = layoutParams.ay;
            this.ag = layoutParams.az;
            this.f353W = layoutParams.ap;
            this.f352V = layoutParams.ao;
        }

        /* renamed from: a */
        private void m374a(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f360d = i;
            this.f364h = layoutParams.f301d;
            this.f365i = layoutParams.f302e;
            this.f366j = layoutParams.f303f;
            this.f367k = layoutParams.f304g;
            this.f368l = layoutParams.f305h;
            this.f369m = layoutParams.f306i;
            this.f370n = layoutParams.f307j;
            this.f371o = layoutParams.f308k;
            this.f372p = layoutParams.f309l;
            this.f373q = layoutParams.f313p;
            this.f374r = layoutParams.f314q;
            this.f375s = layoutParams.f315r;
            this.f376t = layoutParams.f316s;
            this.f377u = layoutParams.f323z;
            this.f378v = layoutParams.f272A;
            this.f379w = layoutParams.f273B;
            this.f380x = layoutParams.f310m;
            this.f381y = layoutParams.f311n;
            this.f382z = layoutParams.f312o;
            this.f331A = layoutParams.f288Q;
            this.f332B = layoutParams.f289R;
            this.f333C = layoutParams.f290S;
            this.f363g = layoutParams.f300c;
            this.f361e = layoutParams.f298a;
            this.f362f = layoutParams.f299b;
            this.f358b = layoutParams.width;
            this.f359c = layoutParams.height;
            this.f334D = layoutParams.leftMargin;
            this.f335E = layoutParams.rightMargin;
            this.f336F = layoutParams.topMargin;
            this.f337G = layoutParams.bottomMargin;
            this.f347Q = layoutParams.f277F;
            this.f348R = layoutParams.f276E;
            this.f350T = layoutParams.f279H;
            this.f349S = layoutParams.f278G;
            this.ah = layoutParams.f291T;
            this.ai = layoutParams.f292U;
            this.aj = layoutParams.f280I;
            this.ak = layoutParams.f281J;
            this.ah = layoutParams.f291T;
            this.al = layoutParams.f284M;
            this.am = layoutParams.f285N;
            this.an = layoutParams.f282K;
            this.ao = layoutParams.f283L;
            this.ap = layoutParams.f286O;
            this.aq = layoutParams.f287P;
            if (VERSION.SDK_INT >= 17) {
                this.f338H = layoutParams.getMarginEnd();
                this.f339I = layoutParams.getMarginStart();
            }
        }

        /* renamed from: a */
        public void m381a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.f301d = this.f364h;
            layoutParams.f302e = this.f365i;
            layoutParams.f303f = this.f366j;
            layoutParams.f304g = this.f367k;
            layoutParams.f305h = this.f368l;
            layoutParams.f306i = this.f369m;
            layoutParams.f307j = this.f370n;
            layoutParams.f308k = this.f371o;
            layoutParams.f309l = this.f372p;
            layoutParams.f313p = this.f373q;
            layoutParams.f314q = this.f374r;
            layoutParams.f315r = this.f375s;
            layoutParams.f316s = this.f376t;
            layoutParams.leftMargin = this.f334D;
            layoutParams.rightMargin = this.f335E;
            layoutParams.topMargin = this.f336F;
            layoutParams.bottomMargin = this.f337G;
            layoutParams.f321x = this.f346P;
            layoutParams.f322y = this.f345O;
            layoutParams.f323z = this.f377u;
            layoutParams.f272A = this.f378v;
            layoutParams.f310m = this.f380x;
            layoutParams.f311n = this.f381y;
            layoutParams.f312o = this.f382z;
            layoutParams.f273B = this.f379w;
            layoutParams.f288Q = this.f331A;
            layoutParams.f289R = this.f332B;
            layoutParams.f277F = this.f347Q;
            layoutParams.f276E = this.f348R;
            layoutParams.f279H = this.f350T;
            layoutParams.f278G = this.f349S;
            layoutParams.f291T = this.ah;
            layoutParams.f292U = this.ai;
            layoutParams.f280I = this.aj;
            layoutParams.f281J = this.ak;
            layoutParams.f284M = this.al;
            layoutParams.f285N = this.am;
            layoutParams.f282K = this.an;
            layoutParams.f283L = this.ao;
            layoutParams.f286O = this.ap;
            layoutParams.f287P = this.aq;
            layoutParams.f290S = this.f333C;
            layoutParams.f300c = this.f363g;
            layoutParams.f298a = this.f361e;
            layoutParams.f299b = this.f362f;
            layoutParams.width = this.f358b;
            layoutParams.height = this.f359c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f339I);
                layoutParams.setMarginEnd(this.f338H);
            }
            layoutParams.m365a();
        }
    }

    /* renamed from: c */
    private String m386c(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    static {
        f384c.append(C0135b.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f384c.append(C0135b.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f384c.append(C0135b.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f384c.append(C0135b.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f384c.append(C0135b.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f384c.append(C0135b.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f384c.append(C0135b.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f384c.append(C0135b.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f384c.append(C0135b.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f384c.append(C0135b.ConstraintSet_layout_editor_absoluteX, 6);
        f384c.append(C0135b.ConstraintSet_layout_editor_absoluteY, 7);
        f384c.append(C0135b.ConstraintSet_layout_constraintGuide_begin, 17);
        f384c.append(C0135b.ConstraintSet_layout_constraintGuide_end, 18);
        f384c.append(C0135b.ConstraintSet_layout_constraintGuide_percent, 19);
        f384c.append(C0135b.ConstraintSet_android_orientation, 27);
        f384c.append(C0135b.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f384c.append(C0135b.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f384c.append(C0135b.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f384c.append(C0135b.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginLeft, 13);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginTop, 16);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginRight, 14);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginBottom, 11);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginStart, 15);
        f384c.append(C0135b.ConstraintSet_layout_goneMarginEnd, 12);
        f384c.append(C0135b.ConstraintSet_layout_constraintVertical_weight, 40);
        f384c.append(C0135b.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f384c.append(C0135b.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f384c.append(C0135b.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f384c.append(C0135b.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f384c.append(C0135b.ConstraintSet_layout_constraintVertical_bias, 37);
        f384c.append(C0135b.ConstraintSet_layout_constraintDimensionRatio, 5);
        f384c.append(C0135b.ConstraintSet_layout_constraintLeft_creator, 64);
        f384c.append(C0135b.ConstraintSet_layout_constraintTop_creator, 64);
        f384c.append(C0135b.ConstraintSet_layout_constraintRight_creator, 64);
        f384c.append(C0135b.ConstraintSet_layout_constraintBottom_creator, 64);
        f384c.append(C0135b.ConstraintSet_layout_constraintBaseline_creator, 64);
        f384c.append(C0135b.ConstraintSet_android_layout_marginLeft, 24);
        f384c.append(C0135b.ConstraintSet_android_layout_marginRight, 28);
        f384c.append(C0135b.ConstraintSet_android_layout_marginStart, 31);
        f384c.append(C0135b.ConstraintSet_android_layout_marginEnd, 8);
        f384c.append(C0135b.ConstraintSet_android_layout_marginTop, 34);
        f384c.append(C0135b.ConstraintSet_android_layout_marginBottom, 2);
        f384c.append(C0135b.ConstraintSet_android_layout_width, 23);
        f384c.append(C0135b.ConstraintSet_android_layout_height, 21);
        f384c.append(C0135b.ConstraintSet_android_visibility, 22);
        f384c.append(C0135b.ConstraintSet_android_alpha, 43);
        f384c.append(C0135b.ConstraintSet_android_elevation, 44);
        f384c.append(C0135b.ConstraintSet_android_rotationX, 45);
        f384c.append(C0135b.ConstraintSet_android_rotationY, 46);
        f384c.append(C0135b.ConstraintSet_android_rotation, 60);
        f384c.append(C0135b.ConstraintSet_android_scaleX, 47);
        f384c.append(C0135b.ConstraintSet_android_scaleY, 48);
        f384c.append(C0135b.ConstraintSet_android_transformPivotX, 49);
        f384c.append(C0135b.ConstraintSet_android_transformPivotY, 50);
        f384c.append(C0135b.ConstraintSet_android_translationX, 51);
        f384c.append(C0135b.ConstraintSet_android_translationY, 52);
        f384c.append(C0135b.ConstraintSet_android_translationZ, 53);
        f384c.append(C0135b.ConstraintSet_layout_constraintWidth_default, 54);
        f384c.append(C0135b.ConstraintSet_layout_constraintHeight_default, 55);
        f384c.append(C0135b.ConstraintSet_layout_constraintWidth_max, 56);
        f384c.append(C0135b.ConstraintSet_layout_constraintHeight_max, 57);
        f384c.append(C0135b.ConstraintSet_layout_constraintWidth_min, 58);
        f384c.append(C0135b.ConstraintSet_layout_constraintHeight_min, 59);
        f384c.append(C0135b.ConstraintSet_layout_constraintCircle, 61);
        f384c.append(C0135b.ConstraintSet_layout_constraintCircleRadius, 62);
        f384c.append(C0135b.ConstraintSet_layout_constraintCircleAngle, 63);
        f384c.append(C0135b.ConstraintSet_android_id, 38);
    }

    /* renamed from: a */
    public void m394a(C0132c c0132c) {
        this.f385b.clear();
        for (Integer num : c0132c.f385b.keySet()) {
            this.f385b.put(num, ((C0131a) c0132c.f385b.get(num)).m380a());
        }
    }

    /* renamed from: a */
    public void m392a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f385b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f385b.containsKey(Integer.valueOf(id))) {
                this.f385b.put(Integer.valueOf(id), new C0131a());
            }
            C0131a c0131a = (C0131a) this.f385b.get(Integer.valueOf(id));
            c0131a.m374a(id, layoutParams);
            c0131a.f340J = childAt.getVisibility();
            if (VERSION.SDK_INT >= 17) {
                c0131a.f351U = childAt.getAlpha();
                c0131a.f354X = childAt.getRotation();
                c0131a.f355Y = childAt.getRotationX();
                c0131a.f356Z = childAt.getRotationY();
                c0131a.aa = childAt.getScaleX();
                c0131a.ab = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    c0131a.ac = pivotX;
                    c0131a.ad = pivotY;
                }
                c0131a.ae = childAt.getTranslationX();
                c0131a.af = childAt.getTranslationY();
                if (VERSION.SDK_INT >= 21) {
                    c0131a.ag = childAt.getTranslationZ();
                    if (c0131a.f352V) {
                        c0131a.f353W = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m393a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f385b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f385b.containsKey(Integer.valueOf(id))) {
                this.f385b.put(Integer.valueOf(id), new C0131a());
            }
            C0131a c0131a = (C0131a) this.f385b.get(Integer.valueOf(id));
            if (childAt instanceof C0129b) {
                c0131a.m376a((C0129b) childAt, id, layoutParams);
            }
            c0131a.m375a(id, layoutParams);
        }
    }

    /* renamed from: b */
    public void m396b(ConstraintLayout constraintLayout) {
        m397c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: c */
    void m397c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f385b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f385b.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0131a c0131a = (C0131a) this.f385b.get(Integer.valueOf(id));
                if (c0131a.as != -1) {
                    if (c0131a.as == 1) {
                        C2732a c2732a = (C2732a) childAt;
                        c2732a.setId(id);
                        c2732a.setReferencedIds(c0131a.at);
                        c2732a.setType(c0131a.ar);
                        c0131a.m381a(constraintLayout.generateDefaultLayoutParams());
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                c0131a.m381a(layoutParams);
                childAt.setLayoutParams(layoutParams);
                childAt.setVisibility(c0131a.f340J);
                if (VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0131a.f351U);
                    childAt.setRotation(c0131a.f354X);
                    childAt.setRotationX(c0131a.f355Y);
                    childAt.setRotationY(c0131a.f356Z);
                    childAt.setScaleX(c0131a.aa);
                    childAt.setScaleY(c0131a.ab);
                    if (!Float.isNaN(c0131a.ac)) {
                        childAt.setPivotX(c0131a.ac);
                    }
                    if (!Float.isNaN(c0131a.ad)) {
                        childAt.setPivotY(c0131a.ad);
                    }
                    childAt.setTranslationX(c0131a.ae);
                    childAt.setTranslationY(c0131a.af);
                    if (VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0131a.ag);
                        if (c0131a.f352V) {
                            childAt.setElevation(c0131a.f353W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0131a c0131a2 = (C0131a) this.f385b.get(num);
            if (c0131a2.as != -1) {
                if (c0131a2.as == 1) {
                    childAt = new C2732a(constraintLayout.getContext());
                    childAt.setId(num.intValue());
                    childAt.setReferencedIds(c0131a2.at);
                    childAt.setType(c0131a2.ar);
                    ViewGroup.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    c0131a2.m381a(generateDefaultLayoutParams);
                    constraintLayout.addView(childAt, generateDefaultLayoutParams);
                }
            }
            if (c0131a2.f357a) {
                childAt = new Guideline(constraintLayout.getContext());
                childAt.setId(num.intValue());
                ViewGroup.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0131a2.m381a(generateDefaultLayoutParams2);
                constraintLayout.addView(childAt, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void m389a(int i, int i2, int i3, int i4) {
        if (!this.f385b.containsKey(Integer.valueOf(i))) {
            this.f385b.put(Integer.valueOf(i), new C0131a());
        }
        C0131a c0131a = (C0131a) this.f385b.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    c0131a.f364h = i3;
                    c0131a.f365i = -1;
                    return;
                } else if (i4 == 2) {
                    c0131a.f365i = i3;
                    c0131a.f364h = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("left to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            case 2:
                if (i4 == 1) {
                    c0131a.f366j = i3;
                    c0131a.f367k = -1;
                    return;
                } else if (i4 == 2) {
                    c0131a.f367k = i3;
                    c0131a.f366j = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("right to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            case 3:
                if (i4 == 3) {
                    c0131a.f368l = i3;
                    c0131a.f369m = -1;
                    c0131a.f372p = -1;
                    return;
                } else if (i4 == 4) {
                    c0131a.f369m = i3;
                    c0131a.f368l = -1;
                    c0131a.f372p = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("right to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            case 4:
                if (i4 == 4) {
                    c0131a.f371o = i3;
                    c0131a.f370n = -1;
                    c0131a.f372p = -1;
                    return;
                } else if (i4 == 3) {
                    c0131a.f370n = i3;
                    c0131a.f371o = -1;
                    c0131a.f372p = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("right to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            case 5:
                if (i4 == 5) {
                    c0131a.f372p = i3;
                    c0131a.f371o = -1;
                    c0131a.f370n = -1;
                    c0131a.f368l = -1;
                    c0131a.f369m = -1;
                    return;
                }
                i2 = new StringBuilder();
                i2.append("right to ");
                i2.append(m386c(i4));
                i2.append(" undefined");
                throw new IllegalArgumentException(i2.toString());
            case 6:
                if (i4 == 6) {
                    c0131a.f374r = i3;
                    c0131a.f373q = -1;
                    return;
                } else if (i4 == 7) {
                    c0131a.f373q = i3;
                    c0131a.f374r = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("right to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            case 7:
                if (i4 == 7) {
                    c0131a.f376t = i3;
                    c0131a.f375s = -1;
                    return;
                } else if (i4 == 6) {
                    c0131a.f375s = i3;
                    c0131a.f376t = -1;
                    return;
                } else {
                    i2 = new StringBuilder();
                    i2.append("right to ");
                    i2.append(m386c(i4));
                    i2.append(" undefined");
                    throw new IllegalArgumentException(i2.toString());
                }
            default:
                i3 = new StringBuilder();
                i3.append(m386c(i2));
                i3.append(" to ");
                i3.append(m386c(i4));
                i3.append(" unknown");
                throw new IllegalArgumentException(i3.toString());
        }
    }

    /* renamed from: a */
    public void m387a(int i) {
        this.f385b.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m390a(int i, String str) {
        m385b(i).f379w = str;
    }

    /* renamed from: a */
    public void m388a(int i, int i2) {
        m385b(i).f359c = i2;
    }

    /* renamed from: b */
    public void m395b(int i, int i2) {
        m385b(i).f358b = i2;
    }

    /* renamed from: b */
    private C0131a m385b(int i) {
        if (!this.f385b.containsKey(Integer.valueOf(i))) {
            this.f385b.put(Integer.valueOf(i), new C0131a());
        }
        return (C0131a) this.f385b.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m391a(Context context, int i) {
        i = context.getResources().getXml(i);
        try {
            for (int eventType = i.getEventType(); eventType != 1; eventType = i.next()) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = i.getName();
                            C0131a a = m383a(context, Xml.asAttributeSet(i));
                            if (name.equalsIgnoreCase("Guideline")) {
                                a.f357a = true;
                            }
                            this.f385b.put(Integer.valueOf(a.f360d), a);
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                }
                i.getName();
            }
        } catch (Context context2) {
            context2.printStackTrace();
        } catch (Context context22) {
            context22.printStackTrace();
        }
    }

    /* renamed from: a */
    private static int m382a(TypedArray typedArray, int i, int i2) {
        i2 = typedArray.getResourceId(i, i2);
        return i2 == -1 ? typedArray.getInt(i, -1) : i2;
    }

    /* renamed from: a */
    private C0131a m383a(Context context, AttributeSet attributeSet) {
        C0131a c0131a = new C0131a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0135b.ConstraintSet);
        m384a(c0131a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0131a;
    }

    /* renamed from: a */
    private void m384a(C0131a c0131a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f384c.get(index);
            switch (i2) {
                case 1:
                    c0131a.f372p = C0132c.m382a(typedArray, index, c0131a.f372p);
                    break;
                case 2:
                    c0131a.f337G = typedArray.getDimensionPixelSize(index, c0131a.f337G);
                    break;
                case 3:
                    c0131a.f371o = C0132c.m382a(typedArray, index, c0131a.f371o);
                    break;
                case 4:
                    c0131a.f370n = C0132c.m382a(typedArray, index, c0131a.f370n);
                    break;
                case 5:
                    c0131a.f379w = typedArray.getString(index);
                    break;
                case 6:
                    c0131a.f331A = typedArray.getDimensionPixelOffset(index, c0131a.f331A);
                    break;
                case 7:
                    c0131a.f332B = typedArray.getDimensionPixelOffset(index, c0131a.f332B);
                    break;
                case 8:
                    c0131a.f338H = typedArray.getDimensionPixelSize(index, c0131a.f338H);
                    break;
                case 9:
                    c0131a.f376t = C0132c.m382a(typedArray, index, c0131a.f376t);
                    break;
                case 10:
                    c0131a.f375s = C0132c.m382a(typedArray, index, c0131a.f375s);
                    break;
                case 11:
                    c0131a.f344N = typedArray.getDimensionPixelSize(index, c0131a.f344N);
                    break;
                case 12:
                    c0131a.f345O = typedArray.getDimensionPixelSize(index, c0131a.f345O);
                    break;
                case 13:
                    c0131a.f341K = typedArray.getDimensionPixelSize(index, c0131a.f341K);
                    break;
                case 14:
                    c0131a.f343M = typedArray.getDimensionPixelSize(index, c0131a.f343M);
                    break;
                case 15:
                    c0131a.f346P = typedArray.getDimensionPixelSize(index, c0131a.f346P);
                    break;
                case 16:
                    c0131a.f342L = typedArray.getDimensionPixelSize(index, c0131a.f342L);
                    break;
                case 17:
                    c0131a.f361e = typedArray.getDimensionPixelOffset(index, c0131a.f361e);
                    break;
                case 18:
                    c0131a.f362f = typedArray.getDimensionPixelOffset(index, c0131a.f362f);
                    break;
                case 19:
                    c0131a.f363g = typedArray.getFloat(index, c0131a.f363g);
                    break;
                case 20:
                    c0131a.f377u = typedArray.getFloat(index, c0131a.f377u);
                    break;
                case 21:
                    c0131a.f359c = typedArray.getLayoutDimension(index, c0131a.f359c);
                    break;
                case 22:
                    c0131a.f340J = typedArray.getInt(index, c0131a.f340J);
                    c0131a.f340J = f383a[c0131a.f340J];
                    break;
                case 23:
                    c0131a.f358b = typedArray.getLayoutDimension(index, c0131a.f358b);
                    break;
                case 24:
                    c0131a.f334D = typedArray.getDimensionPixelSize(index, c0131a.f334D);
                    break;
                case 25:
                    c0131a.f364h = C0132c.m382a(typedArray, index, c0131a.f364h);
                    break;
                case 26:
                    c0131a.f365i = C0132c.m382a(typedArray, index, c0131a.f365i);
                    break;
                case 27:
                    c0131a.f333C = typedArray.getInt(index, c0131a.f333C);
                    break;
                case 28:
                    c0131a.f335E = typedArray.getDimensionPixelSize(index, c0131a.f335E);
                    break;
                case 29:
                    c0131a.f366j = C0132c.m382a(typedArray, index, c0131a.f366j);
                    break;
                case 30:
                    c0131a.f367k = C0132c.m382a(typedArray, index, c0131a.f367k);
                    break;
                case 31:
                    c0131a.f339I = typedArray.getDimensionPixelSize(index, c0131a.f339I);
                    break;
                case 32:
                    c0131a.f373q = C0132c.m382a(typedArray, index, c0131a.f373q);
                    break;
                case 33:
                    c0131a.f374r = C0132c.m382a(typedArray, index, c0131a.f374r);
                    break;
                case 34:
                    c0131a.f336F = typedArray.getDimensionPixelSize(index, c0131a.f336F);
                    break;
                case 35:
                    c0131a.f369m = C0132c.m382a(typedArray, index, c0131a.f369m);
                    break;
                case 36:
                    c0131a.f368l = C0132c.m382a(typedArray, index, c0131a.f368l);
                    break;
                case 37:
                    c0131a.f378v = typedArray.getFloat(index, c0131a.f378v);
                    break;
                case 38:
                    c0131a.f360d = typedArray.getResourceId(index, c0131a.f360d);
                    break;
                case 39:
                    c0131a.f348R = typedArray.getFloat(index, c0131a.f348R);
                    break;
                case 40:
                    c0131a.f347Q = typedArray.getFloat(index, c0131a.f347Q);
                    break;
                case 41:
                    c0131a.f349S = typedArray.getInt(index, c0131a.f349S);
                    break;
                case 42:
                    c0131a.f350T = typedArray.getInt(index, c0131a.f350T);
                    break;
                case 43:
                    c0131a.f351U = typedArray.getFloat(index, c0131a.f351U);
                    break;
                case 44:
                    c0131a.f352V = true;
                    c0131a.f353W = typedArray.getDimension(index, c0131a.f353W);
                    break;
                case 45:
                    c0131a.f355Y = typedArray.getFloat(index, c0131a.f355Y);
                    break;
                case 46:
                    c0131a.f356Z = typedArray.getFloat(index, c0131a.f356Z);
                    break;
                case 47:
                    c0131a.aa = typedArray.getFloat(index, c0131a.aa);
                    break;
                case 48:
                    c0131a.ab = typedArray.getFloat(index, c0131a.ab);
                    break;
                case 49:
                    c0131a.ac = typedArray.getFloat(index, c0131a.ac);
                    break;
                case 50:
                    c0131a.ad = typedArray.getFloat(index, c0131a.ad);
                    break;
                case 51:
                    c0131a.ae = typedArray.getDimension(index, c0131a.ae);
                    break;
                case 52:
                    c0131a.af = typedArray.getDimension(index, c0131a.af);
                    break;
                case 53:
                    c0131a.ag = typedArray.getDimension(index, c0131a.ag);
                    break;
                default:
                    StringBuilder stringBuilder;
                    switch (i2) {
                        case 60:
                            c0131a.f354X = typedArray.getFloat(index, c0131a.f354X);
                            break;
                        case 61:
                            c0131a.f380x = C0132c.m382a(typedArray, index, c0131a.f380x);
                            break;
                        case 62:
                            c0131a.f381y = typedArray.getDimensionPixelSize(index, c0131a.f381y);
                            break;
                        case 63:
                            c0131a.f382z = typedArray.getFloat(index, c0131a.f382z);
                            break;
                        case 64:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("unused attribute 0x");
                            stringBuilder.append(Integer.toHexString(index));
                            stringBuilder.append("   ");
                            stringBuilder.append(f384c.get(index));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown attribute 0x");
                            stringBuilder.append(Integer.toHexString(index));
                            stringBuilder.append("   ");
                            stringBuilder.append(f384c.get(index));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                    }
            }
        }
    }
}
