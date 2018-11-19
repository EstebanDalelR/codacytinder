package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.C0136e.C0135b;
import android.support.constraint.solver.C0141f;
import android.support.constraint.solver.widgets.C2735e;
import android.support.constraint.solver.widgets.C2737i;
import android.support.constraint.solver.widgets.C3987d;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.2";
    SparseArray<View> mChildrenByIds = new SparseArray();
    private ArrayList<C0129b> mConstraintHelpers = new ArrayList(4);
    private C0132c mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap();
    private boolean mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    C3987d mLayoutWidget = new C3987d();
    private int mMaxHeight = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int mMaxWidth = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private C0141f mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOptimizationLevel = 3;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList(100);

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: A */
        public float f272A = 0.5f;
        /* renamed from: B */
        public String f273B = null;
        /* renamed from: C */
        float f274C = 0.0f;
        /* renamed from: D */
        int f275D = 1;
        /* renamed from: E */
        public float f276E = -1.0f;
        /* renamed from: F */
        public float f277F = -1.0f;
        /* renamed from: G */
        public int f278G = 0;
        /* renamed from: H */
        public int f279H = 0;
        /* renamed from: I */
        public int f280I = 0;
        /* renamed from: J */
        public int f281J = 0;
        /* renamed from: K */
        public int f282K = 0;
        /* renamed from: L */
        public int f283L = 0;
        /* renamed from: M */
        public int f284M = 0;
        /* renamed from: N */
        public int f285N = 0;
        /* renamed from: O */
        public float f286O = 1.0f;
        /* renamed from: P */
        public float f287P = 1.0f;
        /* renamed from: Q */
        public int f288Q = -1;
        /* renamed from: R */
        public int f289R = -1;
        /* renamed from: S */
        public int f290S = -1;
        /* renamed from: T */
        public boolean f291T = false;
        /* renamed from: U */
        public boolean f292U = false;
        /* renamed from: V */
        boolean f293V = ConstraintLayout.USE_CONSTRAINTS_HELPER;
        /* renamed from: W */
        boolean f294W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
        /* renamed from: X */
        boolean f295X = false;
        /* renamed from: Y */
        boolean f296Y = false;
        /* renamed from: Z */
        boolean f297Z = false;
        /* renamed from: a */
        public int f298a = -1;
        boolean aa = false;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        float ah = 0.5f;
        int ai;
        int aj;
        float ak;
        ConstraintWidget al = new ConstraintWidget();
        public boolean am = false;
        /* renamed from: b */
        public int f299b = -1;
        /* renamed from: c */
        public float f300c = -1.0f;
        /* renamed from: d */
        public int f301d = -1;
        /* renamed from: e */
        public int f302e = -1;
        /* renamed from: f */
        public int f303f = -1;
        /* renamed from: g */
        public int f304g = -1;
        /* renamed from: h */
        public int f305h = -1;
        /* renamed from: i */
        public int f306i = -1;
        /* renamed from: j */
        public int f307j = -1;
        /* renamed from: k */
        public int f308k = -1;
        /* renamed from: l */
        public int f309l = -1;
        /* renamed from: m */
        public int f310m = -1;
        /* renamed from: n */
        public int f311n = 0;
        /* renamed from: o */
        public float f312o = 0.0f;
        /* renamed from: p */
        public int f313p = -1;
        /* renamed from: q */
        public int f314q = -1;
        /* renamed from: r */
        public int f315r = -1;
        /* renamed from: s */
        public int f316s = -1;
        /* renamed from: t */
        public int f317t = -1;
        /* renamed from: u */
        public int f318u = -1;
        /* renamed from: v */
        public int f319v = -1;
        /* renamed from: w */
        public int f320w = -1;
        /* renamed from: x */
        public int f321x = -1;
        /* renamed from: y */
        public int f322y = -1;
        /* renamed from: z */
        public float f323z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$LayoutParams$a */
        private static class C0128a {
            /* renamed from: a */
            public static final SparseIntArray f271a = new SparseIntArray();

            static {
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f271a.append(C0135b.ConstraintLayout_Layout_android_orientation, 1);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f271a.append(C0135b.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public LayoutParams(android.content.Context r10, android.util.AttributeSet r11) {
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
            r9 = this;
            r9.<init>(r10, r11);
            r0 = -1;
            r9.f298a = r0;
            r9.f299b = r0;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r9.f300c = r1;
            r9.f301d = r0;
            r9.f302e = r0;
            r9.f303f = r0;
            r9.f304g = r0;
            r9.f305h = r0;
            r9.f306i = r0;
            r9.f307j = r0;
            r9.f308k = r0;
            r9.f309l = r0;
            r9.f310m = r0;
            r2 = 0;
            r9.f311n = r2;
            r3 = 0;
            r9.f312o = r3;
            r9.f313p = r0;
            r9.f314q = r0;
            r9.f315r = r0;
            r9.f316s = r0;
            r9.f317t = r0;
            r9.f318u = r0;
            r9.f319v = r0;
            r9.f320w = r0;
            r9.f321x = r0;
            r9.f322y = r0;
            r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r9.f323z = r4;
            r9.f272A = r4;
            r5 = 0;
            r9.f273B = r5;
            r9.f274C = r3;
            r5 = 1;
            r9.f275D = r5;
            r9.f276E = r1;
            r9.f277F = r1;
            r9.f278G = r2;
            r9.f279H = r2;
            r9.f280I = r2;
            r9.f281J = r2;
            r9.f282K = r2;
            r9.f283L = r2;
            r9.f284M = r2;
            r9.f285N = r2;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r9.f286O = r1;
            r9.f287P = r1;
            r9.f288Q = r0;
            r9.f289R = r0;
            r9.f290S = r0;
            r9.f291T = r2;
            r9.f292U = r2;
            r9.f293V = r5;
            r9.f294W = r5;
            r9.f295X = r2;
            r9.f296Y = r2;
            r9.f297Z = r2;
            r9.aa = r2;
            r9.ab = r0;
            r9.ac = r0;
            r9.ad = r0;
            r9.ae = r0;
            r9.af = r0;
            r9.ag = r0;
            r9.ah = r4;
            r1 = new android.support.constraint.solver.widgets.ConstraintWidget;
            r1.<init>();
            r9.al = r1;
            r9.am = r2;
            r1 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout;
            r10 = r10.obtainStyledAttributes(r11, r1);
            r11 = r10.getIndexCount();
            r1 = 0;
        L_0x009a:
            if (r1 >= r11) goto L_0x03e5;
        L_0x009c:
            r4 = r10.getIndex(r1);
            r6 = android.support.constraint.ConstraintLayout.LayoutParams.C0128a.f271a;
            r6 = r6.get(r4);
            r7 = -2;
            switch(r6) {
                case 0: goto L_0x03e1;
                case 1: goto L_0x03d9;
                case 2: goto L_0x03c6;
                case 3: goto L_0x03bd;
                case 4: goto L_0x03a4;
                case 5: goto L_0x039b;
                case 6: goto L_0x0392;
                case 7: goto L_0x0389;
                case 8: goto L_0x0376;
                case 9: goto L_0x0363;
                case 10: goto L_0x034f;
                case 11: goto L_0x033b;
                case 12: goto L_0x0327;
                case 13: goto L_0x0313;
                case 14: goto L_0x02ff;
                case 15: goto L_0x02eb;
                case 16: goto L_0x02d7;
                case 17: goto L_0x02c3;
                case 18: goto L_0x02af;
                case 19: goto L_0x029b;
                case 20: goto L_0x0287;
                case 21: goto L_0x027d;
                case 22: goto L_0x0273;
                case 23: goto L_0x0269;
                case 24: goto L_0x025f;
                case 25: goto L_0x0255;
                case 26: goto L_0x024b;
                case 27: goto L_0x0241;
                case 28: goto L_0x0237;
                case 29: goto L_0x022d;
                case 30: goto L_0x0223;
                case 31: goto L_0x0210;
                case 32: goto L_0x01fd;
                case 33: goto L_0x01e7;
                case 34: goto L_0x01d1;
                case 35: goto L_0x01c3;
                case 36: goto L_0x01ad;
                case 37: goto L_0x0197;
                case 38: goto L_0x0189;
                case 39: goto L_0x03e1;
                case 40: goto L_0x03e1;
                case 41: goto L_0x03e1;
                case 42: goto L_0x03e1;
                case 43: goto L_0x00aa;
                case 44: goto L_0x00e4;
                case 45: goto L_0x00da;
                case 46: goto L_0x00d0;
                case 47: goto L_0x00c8;
                case 48: goto L_0x00c0;
                case 49: goto L_0x00b6;
                case 50: goto L_0x00ac;
                default: goto L_0x00aa;
            };
        L_0x00aa:
            goto L_0x03e1;
        L_0x00ac:
            r6 = r9.f289R;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f289R = r4;
            goto L_0x03e1;
        L_0x00b6:
            r6 = r9.f288Q;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f288Q = r4;
            goto L_0x03e1;
        L_0x00c0:
            r4 = r10.getInt(r4, r2);
            r9.f279H = r4;
            goto L_0x03e1;
        L_0x00c8:
            r4 = r10.getInt(r4, r2);
            r9.f278G = r4;
            goto L_0x03e1;
        L_0x00d0:
            r6 = r9.f277F;
            r4 = r10.getFloat(r4, r6);
            r9.f277F = r4;
            goto L_0x03e1;
        L_0x00da:
            r6 = r9.f276E;
            r4 = r10.getFloat(r4, r6);
            r9.f276E = r4;
            goto L_0x03e1;
        L_0x00e4:
            r4 = r10.getString(r4);
            r9.f273B = r4;
            r4 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
            r9.f274C = r4;
            r9.f275D = r0;
            r4 = r9.f273B;
            if (r4 == 0) goto L_0x03e1;
        L_0x00f4:
            r4 = r9.f273B;
            r4 = r4.length();
            r6 = r9.f273B;
            r7 = 44;
            r6 = r6.indexOf(r7);
            if (r6 <= 0) goto L_0x0126;
        L_0x0104:
            r7 = r4 + -1;
            if (r6 >= r7) goto L_0x0126;
        L_0x0108:
            r7 = r9.f273B;
            r7 = r7.substring(r2, r6);
            r8 = "W";
            r8 = r7.equalsIgnoreCase(r8);
            if (r8 == 0) goto L_0x0119;
        L_0x0116:
            r9.f275D = r2;
            goto L_0x0123;
        L_0x0119:
            r8 = "H";
            r7 = r7.equalsIgnoreCase(r8);
            if (r7 == 0) goto L_0x0123;
        L_0x0121:
            r9.f275D = r5;
        L_0x0123:
            r6 = r6 + 1;
            goto L_0x0127;
        L_0x0126:
            r6 = 0;
        L_0x0127:
            r7 = r9.f273B;
            r8 = 58;
            r7 = r7.indexOf(r8);
            if (r7 < 0) goto L_0x0175;
        L_0x0131:
            r4 = r4 + -1;
            if (r7 >= r4) goto L_0x0175;
        L_0x0135:
            r4 = r9.f273B;
            r4 = r4.substring(r6, r7);
            r6 = r9.f273B;
            r7 = r7 + 1;
            r6 = r6.substring(r7);
            r7 = r4.length();
            if (r7 <= 0) goto L_0x03e1;
        L_0x0149:
            r7 = r6.length();
            if (r7 <= 0) goto L_0x03e1;
        L_0x014f:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03e1 }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ NumberFormatException -> 0x03e1 }
            r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03e1 }
            if (r7 <= 0) goto L_0x03e1;	 Catch:{ NumberFormatException -> 0x03e1 }
        L_0x015b:
            r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03e1 }
            if (r7 <= 0) goto L_0x03e1;	 Catch:{ NumberFormatException -> 0x03e1 }
        L_0x015f:
            r7 = r9.f275D;	 Catch:{ NumberFormatException -> 0x03e1 }
            if (r7 != r5) goto L_0x016c;	 Catch:{ NumberFormatException -> 0x03e1 }
        L_0x0163:
            r6 = r6 / r4;	 Catch:{ NumberFormatException -> 0x03e1 }
            r4 = java.lang.Math.abs(r6);	 Catch:{ NumberFormatException -> 0x03e1 }
            r9.f274C = r4;	 Catch:{ NumberFormatException -> 0x03e1 }
            goto L_0x03e1;	 Catch:{ NumberFormatException -> 0x03e1 }
        L_0x016c:
            r4 = r4 / r6;	 Catch:{ NumberFormatException -> 0x03e1 }
            r4 = java.lang.Math.abs(r4);	 Catch:{ NumberFormatException -> 0x03e1 }
            r9.f274C = r4;	 Catch:{ NumberFormatException -> 0x03e1 }
            goto L_0x03e1;
        L_0x0175:
            r4 = r9.f273B;
            r4 = r4.substring(r6);
            r6 = r4.length();
            if (r6 <= 0) goto L_0x03e1;
        L_0x0181:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03e1 }
            r9.f274C = r4;	 Catch:{ NumberFormatException -> 0x03e1 }
            goto L_0x03e1;
        L_0x0189:
            r6 = r9.f287P;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f287P = r4;
            goto L_0x03e1;
        L_0x0197:
            r6 = r9.f285N;	 Catch:{ Exception -> 0x01a1 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01a1 }
            r9.f285N = r6;	 Catch:{ Exception -> 0x01a1 }
            goto L_0x03e1;
        L_0x01a1:
            r6 = r9.f285N;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e1;
        L_0x01a9:
            r9.f285N = r7;
            goto L_0x03e1;
        L_0x01ad:
            r6 = r9.f283L;	 Catch:{ Exception -> 0x01b7 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01b7 }
            r9.f283L = r6;	 Catch:{ Exception -> 0x01b7 }
            goto L_0x03e1;
        L_0x01b7:
            r6 = r9.f283L;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e1;
        L_0x01bf:
            r9.f283L = r7;
            goto L_0x03e1;
        L_0x01c3:
            r6 = r9.f286O;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f286O = r4;
            goto L_0x03e1;
        L_0x01d1:
            r6 = r9.f284M;	 Catch:{ Exception -> 0x01db }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01db }
            r9.f284M = r6;	 Catch:{ Exception -> 0x01db }
            goto L_0x03e1;
        L_0x01db:
            r6 = r9.f284M;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e1;
        L_0x01e3:
            r9.f284M = r7;
            goto L_0x03e1;
        L_0x01e7:
            r6 = r9.f282K;	 Catch:{ Exception -> 0x01f1 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01f1 }
            r9.f282K = r6;	 Catch:{ Exception -> 0x01f1 }
            goto L_0x03e1;
        L_0x01f1:
            r6 = r9.f282K;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03e1;
        L_0x01f9:
            r9.f282K = r7;
            goto L_0x03e1;
        L_0x01fd:
            r4 = r10.getInt(r4, r2);
            r9.f281J = r4;
            r4 = r9.f281J;
            if (r4 != r5) goto L_0x03e1;
        L_0x0207:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
            android.util.Log.e(r4, r6);
            goto L_0x03e1;
        L_0x0210:
            r4 = r10.getInt(r4, r2);
            r9.f280I = r4;
            r4 = r9.f280I;
            if (r4 != r5) goto L_0x03e1;
        L_0x021a:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
            android.util.Log.e(r4, r6);
            goto L_0x03e1;
        L_0x0223:
            r6 = r9.f272A;
            r4 = r10.getFloat(r4, r6);
            r9.f272A = r4;
            goto L_0x03e1;
        L_0x022d:
            r6 = r9.f323z;
            r4 = r10.getFloat(r4, r6);
            r9.f323z = r4;
            goto L_0x03e1;
        L_0x0237:
            r6 = r9.f292U;
            r4 = r10.getBoolean(r4, r6);
            r9.f292U = r4;
            goto L_0x03e1;
        L_0x0241:
            r6 = r9.f291T;
            r4 = r10.getBoolean(r4, r6);
            r9.f291T = r4;
            goto L_0x03e1;
        L_0x024b:
            r6 = r9.f322y;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f322y = r4;
            goto L_0x03e1;
        L_0x0255:
            r6 = r9.f321x;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f321x = r4;
            goto L_0x03e1;
        L_0x025f:
            r6 = r9.f320w;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f320w = r4;
            goto L_0x03e1;
        L_0x0269:
            r6 = r9.f319v;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f319v = r4;
            goto L_0x03e1;
        L_0x0273:
            r6 = r9.f318u;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f318u = r4;
            goto L_0x03e1;
        L_0x027d:
            r6 = r9.f317t;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f317t = r4;
            goto L_0x03e1;
        L_0x0287:
            r6 = r9.f316s;
            r6 = r10.getResourceId(r4, r6);
            r9.f316s = r6;
            r6 = r9.f316s;
            if (r6 != r0) goto L_0x03e1;
        L_0x0293:
            r4 = r10.getInt(r4, r0);
            r9.f316s = r4;
            goto L_0x03e1;
        L_0x029b:
            r6 = r9.f315r;
            r6 = r10.getResourceId(r4, r6);
            r9.f315r = r6;
            r6 = r9.f315r;
            if (r6 != r0) goto L_0x03e1;
        L_0x02a7:
            r4 = r10.getInt(r4, r0);
            r9.f315r = r4;
            goto L_0x03e1;
        L_0x02af:
            r6 = r9.f314q;
            r6 = r10.getResourceId(r4, r6);
            r9.f314q = r6;
            r6 = r9.f314q;
            if (r6 != r0) goto L_0x03e1;
        L_0x02bb:
            r4 = r10.getInt(r4, r0);
            r9.f314q = r4;
            goto L_0x03e1;
        L_0x02c3:
            r6 = r9.f313p;
            r6 = r10.getResourceId(r4, r6);
            r9.f313p = r6;
            r6 = r9.f313p;
            if (r6 != r0) goto L_0x03e1;
        L_0x02cf:
            r4 = r10.getInt(r4, r0);
            r9.f313p = r4;
            goto L_0x03e1;
        L_0x02d7:
            r6 = r9.f309l;
            r6 = r10.getResourceId(r4, r6);
            r9.f309l = r6;
            r6 = r9.f309l;
            if (r6 != r0) goto L_0x03e1;
        L_0x02e3:
            r4 = r10.getInt(r4, r0);
            r9.f309l = r4;
            goto L_0x03e1;
        L_0x02eb:
            r6 = r9.f308k;
            r6 = r10.getResourceId(r4, r6);
            r9.f308k = r6;
            r6 = r9.f308k;
            if (r6 != r0) goto L_0x03e1;
        L_0x02f7:
            r4 = r10.getInt(r4, r0);
            r9.f308k = r4;
            goto L_0x03e1;
        L_0x02ff:
            r6 = r9.f307j;
            r6 = r10.getResourceId(r4, r6);
            r9.f307j = r6;
            r6 = r9.f307j;
            if (r6 != r0) goto L_0x03e1;
        L_0x030b:
            r4 = r10.getInt(r4, r0);
            r9.f307j = r4;
            goto L_0x03e1;
        L_0x0313:
            r6 = r9.f306i;
            r6 = r10.getResourceId(r4, r6);
            r9.f306i = r6;
            r6 = r9.f306i;
            if (r6 != r0) goto L_0x03e1;
        L_0x031f:
            r4 = r10.getInt(r4, r0);
            r9.f306i = r4;
            goto L_0x03e1;
        L_0x0327:
            r6 = r9.f305h;
            r6 = r10.getResourceId(r4, r6);
            r9.f305h = r6;
            r6 = r9.f305h;
            if (r6 != r0) goto L_0x03e1;
        L_0x0333:
            r4 = r10.getInt(r4, r0);
            r9.f305h = r4;
            goto L_0x03e1;
        L_0x033b:
            r6 = r9.f304g;
            r6 = r10.getResourceId(r4, r6);
            r9.f304g = r6;
            r6 = r9.f304g;
            if (r6 != r0) goto L_0x03e1;
        L_0x0347:
            r4 = r10.getInt(r4, r0);
            r9.f304g = r4;
            goto L_0x03e1;
        L_0x034f:
            r6 = r9.f303f;
            r6 = r10.getResourceId(r4, r6);
            r9.f303f = r6;
            r6 = r9.f303f;
            if (r6 != r0) goto L_0x03e1;
        L_0x035b:
            r4 = r10.getInt(r4, r0);
            r9.f303f = r4;
            goto L_0x03e1;
        L_0x0363:
            r6 = r9.f302e;
            r6 = r10.getResourceId(r4, r6);
            r9.f302e = r6;
            r6 = r9.f302e;
            if (r6 != r0) goto L_0x03e1;
        L_0x036f:
            r4 = r10.getInt(r4, r0);
            r9.f302e = r4;
            goto L_0x03e1;
        L_0x0376:
            r6 = r9.f301d;
            r6 = r10.getResourceId(r4, r6);
            r9.f301d = r6;
            r6 = r9.f301d;
            if (r6 != r0) goto L_0x03e1;
        L_0x0382:
            r4 = r10.getInt(r4, r0);
            r9.f301d = r4;
            goto L_0x03e1;
        L_0x0389:
            r6 = r9.f300c;
            r4 = r10.getFloat(r4, r6);
            r9.f300c = r4;
            goto L_0x03e1;
        L_0x0392:
            r6 = r9.f299b;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f299b = r4;
            goto L_0x03e1;
        L_0x039b:
            r6 = r9.f298a;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f298a = r4;
            goto L_0x03e1;
        L_0x03a4:
            r6 = r9.f312o;
            r4 = r10.getFloat(r4, r6);
            r6 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
            r4 = r4 % r6;
            r9.f312o = r4;
            r4 = r9.f312o;
            r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
            if (r4 >= 0) goto L_0x03e1;
        L_0x03b5:
            r4 = r9.f312o;
            r4 = r6 - r4;
            r4 = r4 % r6;
            r9.f312o = r4;
            goto L_0x03e1;
        L_0x03bd:
            r6 = r9.f311n;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f311n = r4;
            goto L_0x03e1;
        L_0x03c6:
            r6 = r9.f310m;
            r6 = r10.getResourceId(r4, r6);
            r9.f310m = r6;
            r6 = r9.f310m;
            if (r6 != r0) goto L_0x03e1;
        L_0x03d2:
            r4 = r10.getInt(r4, r0);
            r9.f310m = r4;
            goto L_0x03e1;
        L_0x03d9:
            r6 = r9.f290S;
            r4 = r10.getInt(r4, r6);
            r9.f290S = r4;
        L_0x03e1:
            r1 = r1 + 1;
            goto L_0x009a;
        L_0x03e5:
            r10.recycle();
            r9.m365a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        /* renamed from: a */
        public void m365a() {
            this.f296Y = false;
            this.f293V = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f294W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (this.width == -2 && this.f291T) {
                this.f293V = false;
                this.f280I = 1;
            }
            if (this.height == -2 && this.f292U) {
                this.f294W = false;
                this.f281J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f293V = false;
                if (this.width == 0 && this.f280I == 1) {
                    this.width = -2;
                    this.f291T = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f294W = false;
                if (this.height == 0 && this.f281J == 1) {
                    this.height = -2;
                    this.f292U = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.f300c != -1.0f || this.f298a != -1 || this.f299b != -1) {
                this.f296Y = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                this.f293V = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                this.f294W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                if (!(this.al instanceof C2735e)) {
                    this.al = new C2735e();
                }
                ((C2735e) this.al).m10635a(this.f290S);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2 = this.leftMargin;
            int i3 = this.rightMargin;
            super.resolveLayoutDirection(i);
            this.ad = -1;
            this.ae = -1;
            this.ab = -1;
            this.ac = -1;
            this.af = -1;
            this.ag = -1;
            this.af = this.f317t;
            this.ag = this.f319v;
            this.ah = this.f323z;
            this.ai = this.f298a;
            this.aj = this.f299b;
            this.ak = this.f300c;
            Object obj = null;
            if ((1 == getLayoutDirection() ? 1 : null) != null) {
                if (this.f313p != -1) {
                    this.ad = this.f313p;
                } else {
                    if (this.f314q != -1) {
                        this.ae = this.f314q;
                    }
                    if (this.f315r != -1) {
                        this.ac = this.f315r;
                        obj = 1;
                    }
                    if (this.f316s != -1) {
                        this.ab = this.f316s;
                        obj = 1;
                    }
                    if (this.f321x != -1) {
                        this.ag = this.f321x;
                    }
                    if (this.f322y != -1) {
                        this.af = this.f322y;
                    }
                    if (obj != null) {
                        this.ah = 1.0f - this.f323z;
                    }
                    if (this.f296Y && this.f290S == 1) {
                        if (this.f300c != -1.0f) {
                            this.ak = 1.0f - this.f300c;
                            this.ai = -1;
                            this.aj = -1;
                        } else if (this.f298a != -1) {
                            this.aj = this.f298a;
                            this.ai = -1;
                            this.ak = -1.0f;
                        } else if (this.f299b != -1) {
                            this.ai = this.f299b;
                            this.aj = -1;
                            this.ak = -1.0f;
                        }
                    }
                }
                obj = 1;
                if (this.f315r != -1) {
                    this.ac = this.f315r;
                    obj = 1;
                }
                if (this.f316s != -1) {
                    this.ab = this.f316s;
                    obj = 1;
                }
                if (this.f321x != -1) {
                    this.ag = this.f321x;
                }
                if (this.f322y != -1) {
                    this.af = this.f322y;
                }
                if (obj != null) {
                    this.ah = 1.0f - this.f323z;
                }
                if (this.f300c != -1.0f) {
                    this.ak = 1.0f - this.f300c;
                    this.ai = -1;
                    this.aj = -1;
                } else if (this.f298a != -1) {
                    this.aj = this.f298a;
                    this.ai = -1;
                    this.ak = -1.0f;
                } else if (this.f299b != -1) {
                    this.ai = this.f299b;
                    this.aj = -1;
                    this.ak = -1.0f;
                }
            } else {
                if (this.f313p != -1) {
                    this.ac = this.f313p;
                }
                if (this.f314q != -1) {
                    this.ab = this.f314q;
                }
                if (this.f315r != -1) {
                    this.ad = this.f315r;
                }
                if (this.f316s != -1) {
                    this.ae = this.f316s;
                }
                if (this.f321x != -1) {
                    this.af = this.f321x;
                }
                if (this.f322y != -1) {
                    this.ag = this.f322y;
                }
            }
            if (this.f315r == -1 && this.f316s == -1 && this.f314q == -1 && this.f313p == -1) {
                if (this.f303f != -1) {
                    this.ad = this.f303f;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                } else if (this.f304g != -1) {
                    this.ae = this.f304g;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                }
                if (this.f301d != -1) {
                    this.ab = this.f301d;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                } else if (this.f302e != -1) {
                    this.ac = this.f302e;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                }
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) != 0 && (obj2 instanceof Integer) != 0) {
            if (this.mDesignIds == 0) {
                this.mDesignIds = new HashMap();
            }
            obj = (String) obj;
            i = obj.indexOf("/");
            if (i != -1) {
                obj = obj.substring(i + 1);
            }
            this.mDesignIds.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String) != 0) {
            String str = (String) obj;
            if (!(this.mDesignIds == 0 || this.mDesignIds.containsKey(str) == 0)) {
                return this.mDesignIds.get(str);
            }
        }
        return 0;
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    private void init(android.util.AttributeSet r8) {
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
        r7 = this;
        r0 = r7.mLayoutWidget;
        r0.m501a(r7);
        r0 = r7.mChildrenByIds;
        r1 = r7.getId();
        r0.put(r1, r7);
        r0 = 0;
        r7.mConstraintSet = r0;
        if (r8 == 0) goto L_0x008d;
    L_0x0013:
        r1 = r7.getContext();
        r2 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout;
        r8 = r1.obtainStyledAttributes(r8, r2);
        r1 = r8.getIndexCount();
        r2 = 0;
        r3 = 0;
    L_0x0023:
        if (r3 >= r1) goto L_0x008a;
    L_0x0025:
        r4 = r8.getIndex(r3);
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_android_minWidth;
        if (r4 != r5) goto L_0x0036;
    L_0x002d:
        r5 = r7.mMinWidth;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.mMinWidth = r4;
        goto L_0x0087;
    L_0x0036:
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_android_minHeight;
        if (r4 != r5) goto L_0x0043;
    L_0x003a:
        r5 = r7.mMinHeight;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.mMinHeight = r4;
        goto L_0x0087;
    L_0x0043:
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_android_maxWidth;
        if (r4 != r5) goto L_0x0050;
    L_0x0047:
        r5 = r7.mMaxWidth;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.mMaxWidth = r4;
        goto L_0x0087;
    L_0x0050:
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_android_maxHeight;
        if (r4 != r5) goto L_0x005d;
    L_0x0054:
        r5 = r7.mMaxHeight;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.mMaxHeight = r4;
        goto L_0x0087;
    L_0x005d:
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_layout_optimizationLevel;
        if (r4 != r5) goto L_0x006a;
    L_0x0061:
        r5 = r7.mOptimizationLevel;
        r4 = r8.getInt(r4, r5);
        r7.mOptimizationLevel = r4;
        goto L_0x0087;
    L_0x006a:
        r5 = android.support.constraint.C0136e.C0135b.ConstraintLayout_Layout_constraintSet;
        if (r4 != r5) goto L_0x0087;
    L_0x006e:
        r4 = r8.getResourceId(r4, r2);
        r5 = new android.support.constraint.c;	 Catch:{ NotFoundException -> 0x0083 }
        r5.<init>();	 Catch:{ NotFoundException -> 0x0083 }
        r7.mConstraintSet = r5;	 Catch:{ NotFoundException -> 0x0083 }
        r5 = r7.mConstraintSet;	 Catch:{ NotFoundException -> 0x0083 }
        r6 = r7.getContext();	 Catch:{ NotFoundException -> 0x0083 }
        r5.m391a(r6, r4);	 Catch:{ NotFoundException -> 0x0083 }
        goto L_0x0085;
    L_0x0083:
        r7.mConstraintSet = r0;
    L_0x0085:
        r7.mConstraintSetId = r4;
    L_0x0087:
        r3 = r3 + 1;
        goto L_0x0023;
    L_0x008a:
        r8.recycle();
    L_0x008d:
        r8 = r7.mLayoutWidget;
        r0 = r7.mOptimizationLevel;
        r8.m15595a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.init(android.util.AttributeSet):void");
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C2735e)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.al = new C2735e();
            layoutParams.f296Y = USE_CONSTRAINTS_HELPER;
            ((C2735e) layoutParams.al).m10635a(layoutParams.f290S);
        }
        if (view instanceof C0129b) {
            C0129b c0129b = (C0129b) view;
            c0129b.m369a();
            ((LayoutParams) view.getLayoutParams()).f297Z = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(c0129b)) {
                this.mConstraintHelpers.add(c0129b);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.m10668d(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private void updateHierarchy() {
        int childCount = getChildCount();
        Object obj = null;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.mVariableDimensionsWidgets.clear();
            setChildrenConstraints();
        }
    }

    private void setChildrenConstraints() {
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
        r26 = this;
        r0 = r26;
        r1 = r26.isInEditMode();
        r2 = r26.getChildCount();
        r3 = 0;
        r4 = -1;
        if (r1 == 0) goto L_0x0048;
    L_0x000e:
        r5 = 0;
    L_0x000f:
        if (r5 >= r2) goto L_0x0048;
    L_0x0011:
        r6 = r0.getChildAt(r5);
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r0.setDesignInformation(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = 47;	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        if (r8 == r4) goto L_0x003a;	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0034:
        r8 = r8 + 1;	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x003a:
        r6 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r6 = r0.getTargetWidget(r6);	 Catch:{ NotFoundException -> 0x0045 }
        r6.m502a(r7);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0045:
        r5 = r5 + 1;
        goto L_0x000f;
    L_0x0048:
        r5 = 0;
    L_0x0049:
        if (r5 >= r2) goto L_0x005c;
    L_0x004b:
        r6 = r0.getChildAt(r5);
        r6 = r0.getViewWidget(r6);
        if (r6 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0059;
    L_0x0056:
        r6.mo163f();
    L_0x0059:
        r5 = r5 + 1;
        goto L_0x0049;
    L_0x005c:
        r5 = r0.mConstraintSetId;
        if (r5 == r4) goto L_0x007e;
    L_0x0060:
        r5 = 0;
    L_0x0061:
        if (r5 >= r2) goto L_0x007e;
    L_0x0063:
        r6 = r0.getChildAt(r5);
        r7 = r6.getId();
        r8 = r0.mConstraintSetId;
        if (r7 != r8) goto L_0x007b;
    L_0x006f:
        r7 = r6 instanceof android.support.constraint.Constraints;
        if (r7 == 0) goto L_0x007b;
    L_0x0073:
        r6 = (android.support.constraint.Constraints) r6;
        r6 = r6.getConstraintSet();
        r0.mConstraintSet = r6;
    L_0x007b:
        r5 = r5 + 1;
        goto L_0x0061;
    L_0x007e:
        r5 = r0.mConstraintSet;
        if (r5 == 0) goto L_0x0087;
    L_0x0082:
        r5 = r0.mConstraintSet;
        r5.m397c(r0);
    L_0x0087:
        r5 = r0.mLayoutWidget;
        r5.m10664S();
        r5 = r0.mConstraintHelpers;
        r5 = r5.size();
        if (r5 <= 0) goto L_0x00a5;
    L_0x0094:
        r6 = 0;
    L_0x0095:
        if (r6 >= r5) goto L_0x00a5;
    L_0x0097:
        r7 = r0.mConstraintHelpers;
        r7 = r7.get(r6);
        r7 = (android.support.constraint.C0129b) r7;
        r7.m370a(r0);
        r6 = r6 + 1;
        goto L_0x0095;
    L_0x00a5:
        r5 = 0;
    L_0x00a6:
        if (r5 >= r2) goto L_0x00b8;
    L_0x00a8:
        r6 = r0.getChildAt(r5);
        r7 = r6 instanceof android.support.constraint.C0133d;
        if (r7 == 0) goto L_0x00b5;
    L_0x00b0:
        r6 = (android.support.constraint.C0133d) r6;
        r6.m398a(r0);
    L_0x00b5:
        r5 = r5 + 1;
        goto L_0x00a6;
    L_0x00b8:
        r5 = 0;
    L_0x00b9:
        if (r5 >= r2) goto L_0x03f7;
    L_0x00bb:
        r6 = r0.getChildAt(r5);
        r13 = r0.getViewWidget(r6);
        if (r13 != 0) goto L_0x00c7;
    L_0x00c5:
        goto L_0x03f3;
    L_0x00c7:
        r7 = r6.getLayoutParams();
        r14 = r7;
        r14 = (android.support.constraint.ConstraintLayout.LayoutParams) r14;
        r14.m365a();
        r7 = r14.am;
        if (r7 == 0) goto L_0x00d8;
    L_0x00d5:
        r14.am = r3;
        goto L_0x0108;
    L_0x00d8:
        if (r1 == 0) goto L_0x0108;
    L_0x00da:
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0108 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0108 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0108 }
        r0.setDesignInformation(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0108 }
        r8 = "id/";	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r8 + 3;	 Catch:{ NotFoundException -> 0x0108 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0108 }
        r8 = r0.getTargetWidget(r8);	 Catch:{ NotFoundException -> 0x0108 }
        r8.m502a(r7);	 Catch:{ NotFoundException -> 0x0108 }
    L_0x0108:
        r7 = r6.getVisibility();
        r13.m525e(r7);
        r7 = r14.aa;
        if (r7 == 0) goto L_0x0118;
    L_0x0113:
        r7 = 8;
        r13.m525e(r7);
    L_0x0118:
        r13.m501a(r6);
        r6 = r0.mLayoutWidget;
        r6.m10667c(r13);
        r6 = r14.f294W;
        if (r6 == 0) goto L_0x0128;
    L_0x0124:
        r6 = r14.f293V;
        if (r6 != 0) goto L_0x012d;
    L_0x0128:
        r6 = r0.mVariableDimensionsWidgets;
        r6.add(r13);
    L_0x012d:
        r6 = r14.f296Y;
        r7 = 17;
        if (r6 == 0) goto L_0x015e;
    L_0x0133:
        r13 = (android.support.constraint.solver.widgets.C2735e) r13;
        r6 = r14.ai;
        r8 = r14.aj;
        r9 = r14.ak;
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 >= r7) goto L_0x0145;
    L_0x013f:
        r6 = r14.f298a;
        r8 = r14.f299b;
        r9 = r14.f300c;
    L_0x0145:
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r7 == 0) goto L_0x0150;
    L_0x014b:
        r13.m10640e(r9);
        goto L_0x03f3;
    L_0x0150:
        if (r6 == r4) goto L_0x0157;
    L_0x0152:
        r13.m10641q(r6);
        goto L_0x03f3;
    L_0x0157:
        if (r8 == r4) goto L_0x03f3;
    L_0x0159:
        r13.m10642r(r8);
        goto L_0x03f3;
    L_0x015e:
        r6 = r14.f301d;
        if (r6 != r4) goto L_0x01a6;
    L_0x0162:
        r6 = r14.f302e;
        if (r6 != r4) goto L_0x01a6;
    L_0x0166:
        r6 = r14.f303f;
        if (r6 != r4) goto L_0x01a6;
    L_0x016a:
        r6 = r14.f304g;
        if (r6 != r4) goto L_0x01a6;
    L_0x016e:
        r6 = r14.f314q;
        if (r6 != r4) goto L_0x01a6;
    L_0x0172:
        r6 = r14.f313p;
        if (r6 != r4) goto L_0x01a6;
    L_0x0176:
        r6 = r14.f315r;
        if (r6 != r4) goto L_0x01a6;
    L_0x017a:
        r6 = r14.f316s;
        if (r6 != r4) goto L_0x01a6;
    L_0x017e:
        r6 = r14.f305h;
        if (r6 != r4) goto L_0x01a6;
    L_0x0182:
        r6 = r14.f306i;
        if (r6 != r4) goto L_0x01a6;
    L_0x0186:
        r6 = r14.f307j;
        if (r6 != r4) goto L_0x01a6;
    L_0x018a:
        r6 = r14.f308k;
        if (r6 != r4) goto L_0x01a6;
    L_0x018e:
        r6 = r14.f309l;
        if (r6 != r4) goto L_0x01a6;
    L_0x0192:
        r6 = r14.f288Q;
        if (r6 != r4) goto L_0x01a6;
    L_0x0196:
        r6 = r14.f289R;
        if (r6 != r4) goto L_0x01a6;
    L_0x019a:
        r6 = r14.f310m;
        if (r6 != r4) goto L_0x01a6;
    L_0x019e:
        r6 = r14.width;
        if (r6 == r4) goto L_0x01a6;
    L_0x01a2:
        r6 = r14.height;
        if (r6 != r4) goto L_0x03f3;
    L_0x01a6:
        r6 = r14.ab;
        r8 = r14.ac;
        r9 = r14.ad;
        r10 = r14.ae;
        r11 = r14.af;
        r12 = r14.ag;
        r15 = r14.ah;
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 >= r7) goto L_0x01f1;
    L_0x01b8:
        r3 = r14.f301d;
        r6 = r14.f302e;
        r9 = r14.f303f;
        r10 = r14.f304g;
        r7 = r14.f317t;
        r8 = r14.f319v;
        r15 = r14.f323z;
        if (r3 != r4) goto L_0x01d7;
    L_0x01c8:
        if (r6 != r4) goto L_0x01d7;
    L_0x01ca:
        r11 = r14.f314q;
        if (r11 == r4) goto L_0x01d1;
    L_0x01ce:
        r3 = r14.f314q;
        goto L_0x01d7;
    L_0x01d1:
        r11 = r14.f313p;
        if (r11 == r4) goto L_0x01d7;
    L_0x01d5:
        r6 = r14.f313p;
    L_0x01d7:
        r25 = r6;
        r6 = r3;
        r3 = r25;
        if (r9 != r4) goto L_0x01ed;
    L_0x01de:
        if (r10 != r4) goto L_0x01ed;
    L_0x01e0:
        r11 = r14.f315r;
        if (r11 == r4) goto L_0x01e7;
    L_0x01e4:
        r9 = r14.f315r;
        goto L_0x01ed;
    L_0x01e7:
        r11 = r14.f316s;
        if (r11 == r4) goto L_0x01ed;
    L_0x01eb:
        r10 = r14.f316s;
    L_0x01ed:
        r12 = r7;
        r16 = r8;
        goto L_0x01f5;
    L_0x01f1:
        r3 = r8;
        r16 = r12;
        r12 = r11;
    L_0x01f5:
        r11 = r10;
        r10 = r15;
        r15 = r9;
        r7 = r14.f310m;
        if (r7 == r4) goto L_0x020d;
    L_0x01fc:
        r3 = r14.f310m;
        r3 = r0.getTargetWidget(r3);
        if (r3 == 0) goto L_0x0341;
    L_0x0204:
        r6 = r14.f312o;
        r7 = r14.f311n;
        r13.m500a(r3, r6, r7);
        goto L_0x0341;
    L_0x020d:
        if (r6 == r4) goto L_0x022a;
    L_0x020f:
        r9 = r0.getTargetWidget(r6);
        if (r9 == 0) goto L_0x0225;
    L_0x0215:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r6 = r14.leftMargin;
        r7 = r13;
        r17 = r10;
        r10 = r3;
        r3 = r11;
        r11 = r6;
        r7.m495a(r8, r9, r10, r11, r12);
        goto L_0x0228;
    L_0x0225:
        r17 = r10;
        r3 = r11;
    L_0x0228:
        r6 = r3;
        goto L_0x023f;
    L_0x022a:
        r17 = r10;
        r6 = r11;
        if (r3 == r4) goto L_0x023f;
    L_0x022f:
        r9 = r0.getTargetWidget(r3);
        if (r9 == 0) goto L_0x023f;
    L_0x0235:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r11 = r14.leftMargin;
        r7 = r13;
        r7.m495a(r8, r9, r10, r11, r12);
    L_0x023f:
        if (r15 == r4) goto L_0x0254;
    L_0x0241:
        r9 = r0.getTargetWidget(r15);
        if (r9 == 0) goto L_0x0268;
    L_0x0247:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r11 = r14.rightMargin;
        r7 = r13;
        r12 = r16;
        r7.m495a(r8, r9, r10, r11, r12);
        goto L_0x0268;
    L_0x0254:
        if (r6 == r4) goto L_0x0268;
    L_0x0256:
        r9 = r0.getTargetWidget(r6);
        if (r9 == 0) goto L_0x0268;
    L_0x025c:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r11 = r14.rightMargin;
        r7 = r13;
        r12 = r16;
        r7.m495a(r8, r9, r10, r11, r12);
    L_0x0268:
        r3 = r14.f305h;
        if (r3 == r4) goto L_0x0281;
    L_0x026c:
        r3 = r14.f305h;
        r9 = r0.getTargetWidget(r3);
        if (r9 == 0) goto L_0x0299;
    L_0x0274:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r11 = r14.topMargin;
        r12 = r14.f318u;
        r7 = r13;
        r7.m495a(r8, r9, r10, r11, r12);
        goto L_0x0299;
    L_0x0281:
        r3 = r14.f306i;
        if (r3 == r4) goto L_0x0299;
    L_0x0285:
        r3 = r14.f306i;
        r9 = r0.getTargetWidget(r3);
        if (r9 == 0) goto L_0x0299;
    L_0x028d:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r11 = r14.topMargin;
        r12 = r14.f318u;
        r7 = r13;
        r7.m495a(r8, r9, r10, r11, r12);
    L_0x0299:
        r3 = r14.f307j;
        if (r3 == r4) goto L_0x02b2;
    L_0x029d:
        r3 = r14.f307j;
        r9 = r0.getTargetWidget(r3);
        if (r9 == 0) goto L_0x02ca;
    L_0x02a5:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r11 = r14.bottomMargin;
        r12 = r14.f320w;
        r7 = r13;
        r7.m495a(r8, r9, r10, r11, r12);
        goto L_0x02ca;
    L_0x02b2:
        r3 = r14.f308k;
        if (r3 == r4) goto L_0x02ca;
    L_0x02b6:
        r3 = r14.f308k;
        r9 = r0.getTargetWidget(r3);
        if (r9 == 0) goto L_0x02ca;
    L_0x02be:
        r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r11 = r14.bottomMargin;
        r12 = r14.f320w;
        r7 = r13;
        r7.m495a(r8, r9, r10, r11, r12);
    L_0x02ca:
        r3 = r14.f309l;
        if (r3 == r4) goto L_0x0320;
    L_0x02ce:
        r3 = r0.mChildrenByIds;
        r6 = r14.f309l;
        r3 = r3.get(r6);
        r3 = (android.view.View) r3;
        r6 = r14.f309l;
        r6 = r0.getTargetWidget(r6);
        if (r6 == 0) goto L_0x0320;
    L_0x02e0:
        if (r3 == 0) goto L_0x0320;
    L_0x02e2:
        r7 = r3.getLayoutParams();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout.LayoutParams;
        if (r7 == 0) goto L_0x0320;
    L_0x02ea:
        r3 = r3.getLayoutParams();
        r3 = (android.support.constraint.ConstraintLayout.LayoutParams) r3;
        r7 = 1;
        r14.f295X = r7;
        r3.f295X = r7;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BASELINE;
        r18 = r13.mo153a(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BASELINE;
        r19 = r6.mo153a(r3);
        r20 = 0;
        r21 = -1;
        r22 = android.support.constraint.solver.widgets.ConstraintAnchor.Strength.STRONG;
        r23 = 0;
        r24 = 1;
        r18.m466a(r19, r20, r21, r22, r23, r24);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r3 = r13.mo153a(r3);
        r3.m475i();
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r3 = r13.mo153a(r3);
        r3.m475i();
    L_0x0320:
        r3 = 0;
        r15 = r17;
        r6 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1));
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r6 < 0) goto L_0x0330;
    L_0x0329:
        r6 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x0330;
    L_0x032d:
        r13.m488a(r15);
    L_0x0330:
        r6 = r14.f272A;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x0341;
    L_0x0336:
        r3 = r14.f272A;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x0341;
    L_0x033c:
        r3 = r14.f272A;
        r13.m506b(r3);
    L_0x0341:
        if (r1 == 0) goto L_0x0352;
    L_0x0343:
        r3 = r14.f288Q;
        if (r3 != r4) goto L_0x034b;
    L_0x0347:
        r3 = r14.f289R;
        if (r3 == r4) goto L_0x0352;
    L_0x034b:
        r3 = r14.f288Q;
        r6 = r14.f289R;
        r13.m489a(r3, r6);
    L_0x0352:
        r3 = r14.f293V;
        if (r3 != 0) goto L_0x037e;
    L_0x0356:
        r3 = r14.width;
        if (r3 != r4) goto L_0x0374;
    L_0x035a:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        r13.m498a(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r3 = r13.mo153a(r3);
        r6 = r14.leftMargin;
        r3.f470d = r6;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r3 = r13.mo153a(r3);
        r6 = r14.rightMargin;
        r3.f470d = r6;
        goto L_0x0388;
    L_0x0374:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r13.m498a(r3);
        r3 = 0;
        r13.m532h(r3);
        goto L_0x0388;
    L_0x037e:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r13.m498a(r3);
        r3 = r14.width;
        r13.m532h(r3);
    L_0x0388:
        r3 = r14.f294W;
        if (r3 != 0) goto L_0x03b5;
    L_0x038c:
        r3 = r14.height;
        if (r3 != r4) goto L_0x03ab;
    L_0x0390:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        r13.m511b(r3);
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r3 = r13.mo153a(r3);
        r6 = r14.topMargin;
        r3.f470d = r6;
        r3 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r3 = r13.mo153a(r3);
        r6 = r14.bottomMargin;
        r3.f470d = r6;
        r3 = 0;
        goto L_0x03c0;
    L_0x03ab:
        r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        r13.m511b(r3);
        r3 = 0;
        r13.m534i(r3);
        goto L_0x03c0;
    L_0x03b5:
        r3 = 0;
        r6 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        r13.m511b(r6);
        r6 = r14.height;
        r13.m534i(r6);
    L_0x03c0:
        r6 = r14.f273B;
        if (r6 == 0) goto L_0x03c9;
    L_0x03c4:
        r6 = r14.f273B;
        r13.m513b(r6);
    L_0x03c9:
        r6 = r14.f276E;
        r13.m516c(r6);
        r6 = r14.f277F;
        r13.m521d(r6);
        r6 = r14.f278G;
        r13.m546o(r6);
        r6 = r14.f279H;
        r13.m548p(r6);
        r6 = r14.f280I;
        r7 = r14.f282K;
        r8 = r14.f284M;
        r9 = r14.f286O;
        r13.m490a(r6, r7, r8, r9);
        r6 = r14.f281J;
        r7 = r14.f283L;
        r8 = r14.f285N;
        r9 = r14.f287P;
        r13.m509b(r6, r7, r8, r9);
    L_0x03f3:
        r5 = r5 + 1;
        goto L_0x00b9;
    L_0x03f7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.setChildrenConstraints():void");
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = (View) this.mChildrenByIds.get(i);
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            i = 0;
        } else {
            i = ((LayoutParams) view.getLayoutParams()).al;
        }
        return i;
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            view = null;
        } else {
            view = ((LayoutParams) view.getLayoutParams()).al;
        }
        return view;
    }

    private void internalMeasureChildren(int i, int i2) {
        ConstraintLayout constraintLayout = this;
        int i3 = i;
        int i4 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.al;
                if (!layoutParams.f296Y) {
                    if (!layoutParams.f297Z) {
                        Object obj;
                        int childMeasureSpec;
                        Object obj2;
                        int childMeasureSpec2;
                        Object obj3;
                        C0141f c0141f;
                        int baseline;
                        constraintWidget.m525e(childAt.getVisibility());
                        int i6 = layoutParams.width;
                        int i7 = layoutParams.height;
                        if (!(layoutParams.f293V || layoutParams.f294W || ((!layoutParams.f293V && layoutParams.f280I == 1) || layoutParams.width == -1))) {
                            if (!layoutParams.f294W) {
                                if (layoutParams.f281J != 1) {
                                    if (layoutParams.height == -1) {
                                    }
                                }
                            }
                            obj = null;
                            if (obj == null) {
                                if (i6 == 0) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                    obj2 = 1;
                                } else if (i6 != -1) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                    obj2 = null;
                                } else {
                                    obj2 = i6 != -2 ? 1 : null;
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                                }
                                if (i7 == 0) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                    obj3 = 1;
                                } else if (i7 != -1) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                    obj3 = null;
                                } else {
                                    obj3 = i7 != -2 ? 1 : null;
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                                }
                                childAt.measure(childMeasureSpec, childMeasureSpec2);
                                if (constraintLayout.mMetrics != null) {
                                    c0141f = constraintLayout.mMetrics;
                                    c0141f.f440a++;
                                }
                                constraintWidget.m514b(i6 != -2 ? USE_CONSTRAINTS_HELPER : false);
                                constraintWidget.m520c(i7 != -2 ? USE_CONSTRAINTS_HELPER : false);
                                i6 = childAt.getMeasuredWidth();
                                i7 = childAt.getMeasuredHeight();
                            } else {
                                obj2 = null;
                                obj3 = null;
                            }
                            constraintWidget.m532h(i6);
                            constraintWidget.m534i(i7);
                            if (obj2 != null) {
                                constraintWidget.m540l(i6);
                            }
                            if (obj3 != null) {
                                constraintWidget.m542m(i7);
                            }
                            if (layoutParams.f295X) {
                                baseline = childAt.getBaseline();
                                if (baseline != -1) {
                                    constraintWidget.m544n(baseline);
                                }
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                            obj2 = null;
                            obj3 = null;
                        } else {
                            if (i6 == 0) {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                obj2 = 1;
                            } else if (i6 != -1) {
                                if (i6 != -2) {
                                }
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                            } else {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                obj2 = null;
                            }
                            if (i7 == 0) {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                obj3 = 1;
                            } else if (i7 != -1) {
                                if (i7 != -2) {
                                }
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                            } else {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                obj3 = null;
                            }
                            childAt.measure(childMeasureSpec, childMeasureSpec2);
                            if (constraintLayout.mMetrics != null) {
                                c0141f = constraintLayout.mMetrics;
                                c0141f.f440a++;
                            }
                            if (i6 != -2) {
                            }
                            constraintWidget.m514b(i6 != -2 ? USE_CONSTRAINTS_HELPER : false);
                            if (i7 != -2) {
                            }
                            constraintWidget.m520c(i7 != -2 ? USE_CONSTRAINTS_HELPER : false);
                            i6 = childAt.getMeasuredWidth();
                            i7 = childAt.getMeasuredHeight();
                        }
                        constraintWidget.m532h(i6);
                        constraintWidget.m534i(i7);
                        if (obj2 != null) {
                            constraintWidget.m540l(i6);
                        }
                        if (obj3 != null) {
                            constraintWidget.m542m(i7);
                        }
                        if (layoutParams.f295X) {
                            baseline = childAt.getBaseline();
                            if (baseline != -1) {
                                constraintWidget.m544n(baseline);
                            }
                        }
                    }
                }
            }
            i5++;
            constraintLayout = this;
            i3 = i;
        }
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0133d) {
                ((C0133d) childAt).m399b(this);
            }
        }
        childCount = this.mConstraintHelpers.size();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                ((C0129b) this.mConstraintHelpers.get(i2)).m373c(this);
            }
        }
    }

    private void internalMeasureDimensions(int i, int i2) {
        int i3;
        int i4;
        int i5;
        ConstraintLayout constraintLayout = this;
        int i6 = i;
        int i7 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            long j = 1;
            int i9 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.al;
                if (!layoutParams.f296Y) {
                    if (!layoutParams.f297Z) {
                        constraintWidget.m525e(childAt.getVisibility());
                        int i10 = layoutParams.width;
                        int i11 = layoutParams.height;
                        if (i10 != 0) {
                            if (i11 != 0) {
                                Object obj = i10 == -2 ? 1 : null;
                                int childMeasureSpec = getChildMeasureSpec(i6, paddingLeft, i10);
                                Object obj2 = i11 == -2 ? 1 : null;
                                childAt.measure(childMeasureSpec, getChildMeasureSpec(i7, paddingTop, i11));
                                if (constraintLayout.mMetrics != null) {
                                    C0141f c0141f = constraintLayout.mMetrics;
                                    i3 = paddingTop;
                                    i4 = paddingLeft;
                                    i5 = childCount;
                                    c0141f.f440a++;
                                } else {
                                    i3 = paddingTop;
                                    i4 = paddingLeft;
                                    i5 = childCount;
                                }
                                constraintWidget.m514b(i10 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                constraintWidget.m520c(i11 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                i7 = childAt.getMeasuredWidth();
                                paddingTop = childAt.getMeasuredHeight();
                                constraintWidget.m532h(i7);
                                constraintWidget.m534i(paddingTop);
                                if (obj != null) {
                                    constraintWidget.m540l(i7);
                                }
                                if (obj2 != null) {
                                    constraintWidget.m542m(paddingTop);
                                }
                                if (layoutParams.f295X) {
                                    paddingLeft = childAt.getBaseline();
                                    if (paddingLeft != -1) {
                                        constraintWidget.m544n(paddingLeft);
                                    }
                                }
                                if (layoutParams.f293V && layoutParams.f294W) {
                                    constraintWidget.m531h().m10658a(i7);
                                    constraintWidget.m533i().m10658a(paddingTop);
                                }
                                i8++;
                                paddingTop = i3;
                                paddingLeft = i4;
                                childCount = i5;
                                i7 = i2;
                            }
                        }
                        i3 = paddingTop;
                        i4 = paddingLeft;
                        i5 = childCount;
                        constraintWidget.m531h().m571e();
                        constraintWidget.m533i().m571e();
                        i8++;
                        paddingTop = i3;
                        paddingLeft = i4;
                        childCount = i5;
                        i7 = i2;
                    }
                }
            }
            i3 = paddingTop;
            i4 = paddingLeft;
            i5 = childCount;
            i8++;
            paddingTop = i3;
            paddingLeft = i4;
            childCount = i5;
            i7 = i2;
        }
        i3 = paddingTop;
        i4 = paddingLeft;
        i5 = childCount;
        constraintLayout.mLayoutWidget.m15591N();
        i7 = i5;
        paddingTop = 0;
        while (paddingTop < i7) {
            int i12;
            int i13;
            int i14;
            long j2;
            View childAt2 = constraintLayout.getChildAt(paddingTop);
            if (childAt2.getVisibility() != i9) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                ConstraintWidget constraintWidget2 = layoutParams2.al;
                if (!layoutParams2.f296Y) {
                    if (!layoutParams2.f297Z) {
                        constraintWidget2.m525e(childAt2.getVisibility());
                        i8 = layoutParams2.width;
                        childMeasureSpec = layoutParams2.height;
                        if (i8 == 0 || childMeasureSpec == 0) {
                            C2737i a = constraintWidget2.mo153a(Type.LEFT).m462a();
                            C2737i a2 = constraintWidget2.mo153a(Type.RIGHT).m462a();
                            Object obj3 = (constraintWidget2.mo153a(Type.LEFT).m473g() == null || constraintWidget2.mo153a(Type.RIGHT).m473g() == null) ? null : 1;
                            C2737i a3 = constraintWidget2.mo153a(Type.TOP).m462a();
                            C2737i a4 = constraintWidget2.mo153a(Type.BOTTOM).m462a();
                            Object obj4 = (constraintWidget2.mo153a(Type.TOP).m473g() == null || constraintWidget2.mo153a(Type.BOTTOM).m473g() == null) ? null : 1;
                            if (i8 != 0 || childMeasureSpec != 0 || obj3 == null || obj4 == null) {
                                int i15;
                                Object obj5;
                                int childMeasureSpec2;
                                int i16;
                                Object obj6;
                                int childMeasureSpec3;
                                C0141f c0141f2;
                                i12 = i7;
                                Object obj7 = constraintLayout.mLayoutWidget.m485F() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                                i13 = paddingTop;
                                Object obj8 = constraintLayout.mLayoutWidget.m486G() != DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                                if (obj7 == null) {
                                    constraintWidget2.m531h().m571e();
                                }
                                if (obj8 == null) {
                                    constraintWidget2.m533i().m571e();
                                }
                                if (i8 != 0) {
                                    i15 = i4;
                                    if (i8 == -1) {
                                        obj5 = obj7;
                                        childMeasureSpec2 = getChildMeasureSpec(i6, i15, -1);
                                    } else {
                                        obj5 = obj7;
                                        obj7 = i8 == -2 ? 1 : null;
                                        childMeasureSpec2 = getChildMeasureSpec(i6, i15, i8);
                                        if (childMeasureSpec != 0) {
                                            i9 = i3;
                                            i16 = i2;
                                            if (childMeasureSpec == -1) {
                                                if (childMeasureSpec == -2) {
                                                }
                                                obj6 = obj8;
                                                obj8 = childMeasureSpec == -2 ? 1 : null;
                                                childMeasureSpec3 = getChildMeasureSpec(i16, i9, childMeasureSpec);
                                                childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                                if (constraintLayout.mMetrics != null) {
                                                    i14 = i15;
                                                    j2 = 1;
                                                } else {
                                                    c0141f2 = constraintLayout.mMetrics;
                                                    i14 = i15;
                                                    j2 = 1;
                                                    c0141f2.f440a++;
                                                }
                                                if (i8 == -2) {
                                                }
                                                constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                                if (childMeasureSpec == -2) {
                                                }
                                                constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                                i6 = childAt2.getMeasuredWidth();
                                                i8 = childAt2.getMeasuredHeight();
                                                constraintWidget2.m532h(i6);
                                                constraintWidget2.m534i(i8);
                                                if (obj7 != null) {
                                                    constraintWidget2.m540l(i6);
                                                }
                                                if (obj8 != null) {
                                                    constraintWidget2.m542m(i8);
                                                }
                                                if (obj5 != null) {
                                                    constraintWidget2.m531h().m10660c();
                                                } else {
                                                    constraintWidget2.m531h().m10658a(i6);
                                                }
                                                if (obj6 != null) {
                                                    constraintWidget2.m533i().m10660c();
                                                } else {
                                                    constraintWidget2.m533i().m10658a(i8);
                                                }
                                                if (layoutParams2.f295X) {
                                                    i6 = childAt2.getBaseline();
                                                    if (i6 != -1) {
                                                        constraintWidget2.m544n(i6);
                                                    }
                                                }
                                                paddingTop = i13 + 1;
                                                j = j2;
                                                i7 = i12;
                                                i4 = i14;
                                                constraintLayout = this;
                                                i6 = i;
                                                i3 = i9;
                                                i9 = 8;
                                            } else {
                                                obj6 = obj8;
                                                childMeasureSpec3 = getChildMeasureSpec(i16, i9, -1);
                                            }
                                        } else {
                                            if (obj8 == null) {
                                            }
                                            i9 = i3;
                                            childMeasureSpec3 = getChildMeasureSpec(i2, i9, -2);
                                            obj8 = 1;
                                            obj6 = null;
                                            childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                            if (constraintLayout.mMetrics != null) {
                                                c0141f2 = constraintLayout.mMetrics;
                                                i14 = i15;
                                                j2 = 1;
                                                c0141f2.f440a++;
                                            } else {
                                                i14 = i15;
                                                j2 = 1;
                                            }
                                            if (i8 == -2) {
                                            }
                                            constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                            if (childMeasureSpec == -2) {
                                            }
                                            constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                            i6 = childAt2.getMeasuredWidth();
                                            i8 = childAt2.getMeasuredHeight();
                                            constraintWidget2.m532h(i6);
                                            constraintWidget2.m534i(i8);
                                            if (obj7 != null) {
                                                constraintWidget2.m540l(i6);
                                            }
                                            if (obj8 != null) {
                                                constraintWidget2.m542m(i8);
                                            }
                                            if (obj5 != null) {
                                                constraintWidget2.m531h().m10658a(i6);
                                            } else {
                                                constraintWidget2.m531h().m10660c();
                                            }
                                            if (obj6 != null) {
                                                constraintWidget2.m533i().m10658a(i8);
                                            } else {
                                                constraintWidget2.m533i().m10660c();
                                            }
                                            if (layoutParams2.f295X) {
                                                i6 = childAt2.getBaseline();
                                                if (i6 != -1) {
                                                    constraintWidget2.m544n(i6);
                                                }
                                            }
                                            paddingTop = i13 + 1;
                                            j = j2;
                                            i7 = i12;
                                            i4 = i14;
                                            constraintLayout = this;
                                            i6 = i;
                                            i3 = i9;
                                            i9 = 8;
                                        }
                                        obj8 = null;
                                        childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                        if (constraintLayout.mMetrics != null) {
                                            i14 = i15;
                                            j2 = 1;
                                        } else {
                                            c0141f2 = constraintLayout.mMetrics;
                                            i14 = i15;
                                            j2 = 1;
                                            c0141f2.f440a++;
                                        }
                                        if (i8 == -2) {
                                        }
                                        constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        if (childMeasureSpec == -2) {
                                        }
                                        constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        i6 = childAt2.getMeasuredWidth();
                                        i8 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m532h(i6);
                                        constraintWidget2.m534i(i8);
                                        if (obj7 != null) {
                                            constraintWidget2.m540l(i6);
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m542m(i8);
                                        }
                                        if (obj5 != null) {
                                            constraintWidget2.m531h().m10660c();
                                        } else {
                                            constraintWidget2.m531h().m10658a(i6);
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m533i().m10660c();
                                        } else {
                                            constraintWidget2.m533i().m10658a(i8);
                                        }
                                        if (layoutParams2.f295X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m544n(i6);
                                            }
                                        }
                                        paddingTop = i13 + 1;
                                        j = j2;
                                        i7 = i12;
                                        i4 = i14;
                                        constraintLayout = this;
                                        i6 = i;
                                        i3 = i9;
                                        i9 = 8;
                                    }
                                } else if (obj7 != null && constraintWidget2.m524d() && obj3 != null && a.m573g() && a2.m573g()) {
                                    i8 = (int) (a2.m10657d() - a.m10657d());
                                    constraintWidget2.m531h().m10658a(i8);
                                    i15 = i4;
                                    childMeasureSpec2 = getChildMeasureSpec(i6, i15, i8);
                                    obj5 = obj7;
                                } else {
                                    i15 = i4;
                                    childMeasureSpec2 = getChildMeasureSpec(i6, i15, -2);
                                    obj7 = 1;
                                    obj5 = null;
                                    if (childMeasureSpec != 0) {
                                        i9 = i3;
                                        i16 = i2;
                                        if (childMeasureSpec == -1) {
                                            obj6 = obj8;
                                            childMeasureSpec3 = getChildMeasureSpec(i16, i9, -1);
                                        } else {
                                            obj6 = obj8;
                                            obj8 = childMeasureSpec == -2 ? 1 : null;
                                            childMeasureSpec3 = getChildMeasureSpec(i16, i9, childMeasureSpec);
                                            childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                            if (constraintLayout.mMetrics != null) {
                                                i14 = i15;
                                                j2 = 1;
                                            } else {
                                                c0141f2 = constraintLayout.mMetrics;
                                                i14 = i15;
                                                j2 = 1;
                                                c0141f2.f440a++;
                                            }
                                            if (i8 == -2) {
                                            }
                                            constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                            if (childMeasureSpec == -2) {
                                            }
                                            constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                            i6 = childAt2.getMeasuredWidth();
                                            i8 = childAt2.getMeasuredHeight();
                                            constraintWidget2.m532h(i6);
                                            constraintWidget2.m534i(i8);
                                            if (obj7 != null) {
                                                constraintWidget2.m540l(i6);
                                            }
                                            if (obj8 != null) {
                                                constraintWidget2.m542m(i8);
                                            }
                                            if (obj5 != null) {
                                                constraintWidget2.m531h().m10660c();
                                            } else {
                                                constraintWidget2.m531h().m10658a(i6);
                                            }
                                            if (obj6 != null) {
                                                constraintWidget2.m533i().m10660c();
                                            } else {
                                                constraintWidget2.m533i().m10658a(i8);
                                            }
                                            if (layoutParams2.f295X) {
                                                i6 = childAt2.getBaseline();
                                                if (i6 != -1) {
                                                    constraintWidget2.m544n(i6);
                                                }
                                            }
                                            paddingTop = i13 + 1;
                                            j = j2;
                                            i7 = i12;
                                            i4 = i14;
                                            constraintLayout = this;
                                            i6 = i;
                                            i3 = i9;
                                            i9 = 8;
                                        }
                                    } else if (obj8 == null && constraintWidget2.m526e() && obj4 != null && a3.m573g() && a4.m573g()) {
                                        childMeasureSpec = (int) (a4.m10657d() - a3.m10657d());
                                        constraintWidget2.m533i().m10658a(childMeasureSpec);
                                        i9 = i3;
                                        childMeasureSpec3 = getChildMeasureSpec(i2, i9, childMeasureSpec);
                                        obj6 = obj8;
                                    } else {
                                        i9 = i3;
                                        childMeasureSpec3 = getChildMeasureSpec(i2, i9, -2);
                                        obj8 = 1;
                                        obj6 = null;
                                        childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                        if (constraintLayout.mMetrics != null) {
                                            c0141f2 = constraintLayout.mMetrics;
                                            i14 = i15;
                                            j2 = 1;
                                            c0141f2.f440a++;
                                        } else {
                                            i14 = i15;
                                            j2 = 1;
                                        }
                                        constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        i6 = childAt2.getMeasuredWidth();
                                        i8 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m532h(i6);
                                        constraintWidget2.m534i(i8);
                                        if (obj7 != null) {
                                            constraintWidget2.m540l(i6);
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m542m(i8);
                                        }
                                        if (obj5 != null) {
                                            constraintWidget2.m531h().m10658a(i6);
                                        } else {
                                            constraintWidget2.m531h().m10660c();
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m533i().m10658a(i8);
                                        } else {
                                            constraintWidget2.m533i().m10660c();
                                        }
                                        if (layoutParams2.f295X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m544n(i6);
                                            }
                                        }
                                        paddingTop = i13 + 1;
                                        j = j2;
                                        i7 = i12;
                                        i4 = i14;
                                        constraintLayout = this;
                                        i6 = i;
                                        i3 = i9;
                                        i9 = 8;
                                    }
                                    obj8 = null;
                                    childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                    if (constraintLayout.mMetrics != null) {
                                        c0141f2 = constraintLayout.mMetrics;
                                        i14 = i15;
                                        j2 = 1;
                                        c0141f2.f440a++;
                                    } else {
                                        i14 = i15;
                                        j2 = 1;
                                    }
                                    if (i8 == -2) {
                                    }
                                    constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                    if (childMeasureSpec == -2) {
                                    }
                                    constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                    i6 = childAt2.getMeasuredWidth();
                                    i8 = childAt2.getMeasuredHeight();
                                    constraintWidget2.m532h(i6);
                                    constraintWidget2.m534i(i8);
                                    if (obj7 != null) {
                                        constraintWidget2.m540l(i6);
                                    }
                                    if (obj8 != null) {
                                        constraintWidget2.m542m(i8);
                                    }
                                    if (obj5 != null) {
                                        constraintWidget2.m531h().m10658a(i6);
                                    } else {
                                        constraintWidget2.m531h().m10660c();
                                    }
                                    if (obj6 != null) {
                                        constraintWidget2.m533i().m10658a(i8);
                                    } else {
                                        constraintWidget2.m533i().m10660c();
                                    }
                                    if (layoutParams2.f295X) {
                                        i6 = childAt2.getBaseline();
                                        if (i6 != -1) {
                                            constraintWidget2.m544n(i6);
                                        }
                                    }
                                    paddingTop = i13 + 1;
                                    j = j2;
                                    i7 = i12;
                                    i4 = i14;
                                    constraintLayout = this;
                                    i6 = i;
                                    i3 = i9;
                                    i9 = 8;
                                }
                                obj7 = null;
                                if (childMeasureSpec != 0) {
                                    if (obj8 == null) {
                                    }
                                    i9 = i3;
                                    childMeasureSpec3 = getChildMeasureSpec(i2, i9, -2);
                                    obj8 = 1;
                                    obj6 = null;
                                    childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                    if (constraintLayout.mMetrics != null) {
                                        c0141f2 = constraintLayout.mMetrics;
                                        i14 = i15;
                                        j2 = 1;
                                        c0141f2.f440a++;
                                    } else {
                                        i14 = i15;
                                        j2 = 1;
                                    }
                                    if (i8 == -2) {
                                    }
                                    constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                    if (childMeasureSpec == -2) {
                                    }
                                    constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                    i6 = childAt2.getMeasuredWidth();
                                    i8 = childAt2.getMeasuredHeight();
                                    constraintWidget2.m532h(i6);
                                    constraintWidget2.m534i(i8);
                                    if (obj7 != null) {
                                        constraintWidget2.m540l(i6);
                                    }
                                    if (obj8 != null) {
                                        constraintWidget2.m542m(i8);
                                    }
                                    if (obj5 != null) {
                                        constraintWidget2.m531h().m10658a(i6);
                                    } else {
                                        constraintWidget2.m531h().m10660c();
                                    }
                                    if (obj6 != null) {
                                        constraintWidget2.m533i().m10658a(i8);
                                    } else {
                                        constraintWidget2.m533i().m10660c();
                                    }
                                    if (layoutParams2.f295X) {
                                        i6 = childAt2.getBaseline();
                                        if (i6 != -1) {
                                            constraintWidget2.m544n(i6);
                                        }
                                    }
                                    paddingTop = i13 + 1;
                                    j = j2;
                                    i7 = i12;
                                    i4 = i14;
                                    constraintLayout = this;
                                    i6 = i;
                                    i3 = i9;
                                    i9 = 8;
                                } else {
                                    i9 = i3;
                                    i16 = i2;
                                    if (childMeasureSpec == -1) {
                                        obj6 = obj8;
                                        childMeasureSpec3 = getChildMeasureSpec(i16, i9, -1);
                                    } else {
                                        if (childMeasureSpec == -2) {
                                        }
                                        obj6 = obj8;
                                        obj8 = childMeasureSpec == -2 ? 1 : null;
                                        childMeasureSpec3 = getChildMeasureSpec(i16, i9, childMeasureSpec);
                                        childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                        if (constraintLayout.mMetrics != null) {
                                            i14 = i15;
                                            j2 = 1;
                                        } else {
                                            c0141f2 = constraintLayout.mMetrics;
                                            i14 = i15;
                                            j2 = 1;
                                            c0141f2.f440a++;
                                        }
                                        if (i8 == -2) {
                                        }
                                        constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        if (childMeasureSpec == -2) {
                                        }
                                        constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                        i6 = childAt2.getMeasuredWidth();
                                        i8 = childAt2.getMeasuredHeight();
                                        constraintWidget2.m532h(i6);
                                        constraintWidget2.m534i(i8);
                                        if (obj7 != null) {
                                            constraintWidget2.m540l(i6);
                                        }
                                        if (obj8 != null) {
                                            constraintWidget2.m542m(i8);
                                        }
                                        if (obj5 != null) {
                                            constraintWidget2.m531h().m10660c();
                                        } else {
                                            constraintWidget2.m531h().m10658a(i6);
                                        }
                                        if (obj6 != null) {
                                            constraintWidget2.m533i().m10660c();
                                        } else {
                                            constraintWidget2.m533i().m10658a(i8);
                                        }
                                        if (layoutParams2.f295X) {
                                            i6 = childAt2.getBaseline();
                                            if (i6 != -1) {
                                                constraintWidget2.m544n(i6);
                                            }
                                        }
                                        paddingTop = i13 + 1;
                                        j = j2;
                                        i7 = i12;
                                        i4 = i14;
                                        constraintLayout = this;
                                        i6 = i;
                                        i3 = i9;
                                        i9 = 8;
                                    }
                                }
                                obj8 = null;
                                childAt2.measure(childMeasureSpec2, childMeasureSpec3);
                                if (constraintLayout.mMetrics != null) {
                                    c0141f2 = constraintLayout.mMetrics;
                                    i14 = i15;
                                    j2 = 1;
                                    c0141f2.f440a++;
                                } else {
                                    i14 = i15;
                                    j2 = 1;
                                }
                                if (i8 == -2) {
                                }
                                constraintWidget2.m514b(i8 == -2 ? USE_CONSTRAINTS_HELPER : false);
                                if (childMeasureSpec == -2) {
                                }
                                constraintWidget2.m520c(childMeasureSpec == -2 ? USE_CONSTRAINTS_HELPER : false);
                                i6 = childAt2.getMeasuredWidth();
                                i8 = childAt2.getMeasuredHeight();
                                constraintWidget2.m532h(i6);
                                constraintWidget2.m534i(i8);
                                if (obj7 != null) {
                                    constraintWidget2.m540l(i6);
                                }
                                if (obj8 != null) {
                                    constraintWidget2.m542m(i8);
                                }
                                if (obj5 != null) {
                                    constraintWidget2.m531h().m10658a(i6);
                                } else {
                                    constraintWidget2.m531h().m10660c();
                                }
                                if (obj6 != null) {
                                    constraintWidget2.m533i().m10658a(i8);
                                } else {
                                    constraintWidget2.m533i().m10660c();
                                }
                                if (layoutParams2.f295X) {
                                    i6 = childAt2.getBaseline();
                                    if (i6 != -1) {
                                        constraintWidget2.m544n(i6);
                                    }
                                }
                                paddingTop = i13 + 1;
                                j = j2;
                                i7 = i12;
                                i4 = i14;
                                constraintLayout = this;
                                i6 = i;
                                i3 = i9;
                                i9 = 8;
                            } else {
                                i12 = i7;
                                i13 = paddingTop;
                                i9 = i3;
                                i14 = i4;
                                j2 = 1;
                                paddingTop = i13 + 1;
                                j = j2;
                                i7 = i12;
                                i4 = i14;
                                constraintLayout = this;
                                i6 = i;
                                i3 = i9;
                                i9 = 8;
                            }
                        }
                    }
                }
            }
            i12 = i7;
            i13 = paddingTop;
            i9 = i3;
            i14 = i4;
            j2 = j;
            paddingTop = i13 + 1;
            j = j2;
            i7 = i12;
            i4 = i14;
            constraintLayout = this;
            i6 = i;
            i3 = i9;
            i9 = 8;
        }
    }

    public void fillMetrics(C0141f c0141f) {
        this.mMetrics = c0141f;
        this.mLayoutWidget.m15597a(c0141f);
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        System.currentTimeMillis();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (this.mLastMeasureWidth != -1) {
            int i7 = r0.mLastMeasureHeight;
        }
        if (mode == 1073741824 && mode2 == 1073741824 && size == r0.mLastMeasureWidth) {
            int i8 = r0.mLastMeasureHeight;
        }
        Object obj = (mode == r0.mLastMeasureWidthMode && mode2 == r0.mLastMeasureHeightMode) ? 1 : null;
        if (obj != null && size == r0.mLastMeasureWidthSize) {
            int i9 = r0.mLastMeasureHeightSize;
        }
        if (obj != null && mode == Integer.MIN_VALUE && mode2 == 1073741824 && size >= r0.mLastMeasureWidth) {
            i3 = r0.mLastMeasureHeight;
        }
        if (obj != null && mode == 1073741824 && mode2 == Integer.MIN_VALUE && size == r0.mLastMeasureWidth) {
            i8 = r0.mLastMeasureHeight;
        }
        r0.mLastMeasureWidthMode = mode;
        r0.mLastMeasureHeightMode = mode2;
        r0.mLastMeasureWidthSize = size;
        r0.mLastMeasureHeightSize = size2;
        mode = getPaddingLeft();
        size = getPaddingTop();
        r0.mLayoutWidget.m528f(mode);
        r0.mLayoutWidget.m530g(size);
        r0.mLayoutWidget.m517c(r0.mMaxWidth);
        r0.mLayoutWidget.m522d(r0.mMaxHeight);
        if (VERSION.SDK_INT >= 17) {
            r0.mLayoutWidget.m15599a(getLayoutDirection() == 1 ? USE_CONSTRAINTS_HELPER : false);
        }
        setSelfDimensionBehaviour(i, i2);
        mode2 = r0.mLayoutWidget.m545o();
        size2 = r0.mLayoutWidget.m549q();
        if (r0.mDirtyHierarchy) {
            r0.mDirtyHierarchy = false;
            updateHierarchy();
        }
        obj = (r0.mOptimizationLevel & 8) == 8 ? 1 : null;
        if (obj != null) {
            r0.mLayoutWidget.m15590M();
            r0.mLayoutWidget.m15602e(mode2, size2);
            internalMeasureDimensions(i, i2);
        } else {
            internalMeasureChildren(i, i2);
        }
        updatePostMeasures();
        if (getChildCount() > 0) {
            solveLinearSystem("First pass");
        }
        i3 = r0.mVariableDimensionsWidgets.size();
        size += getPaddingBottom();
        mode += getPaddingRight();
        if (i3 > 0) {
            int i10;
            int i11;
            int i12;
            Object obj2 = r0.mLayoutWidget.m485F() == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
            Object obj3 = r0.mLayoutWidget.m486G() == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
            int max = Math.max(r0.mLayoutWidget.m545o(), r0.mMinWidth);
            int max2 = Math.max(r0.mLayoutWidget.m549q(), r0.mMinHeight);
            int i13 = max;
            int i14 = 0;
            Object obj4 = null;
            int i15 = 0;
            while (i14 < i3) {
                ConstraintWidget constraintWidget = (ConstraintWidget) r0.mVariableDimensionsWidgets.get(i14);
                View view = (View) constraintWidget.m481B();
                if (view == null) {
                    i4 = mode;
                    i10 = mode2;
                    i11 = size2;
                    i12 = i3;
                } else {
                    i12 = i3;
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    i11 = size2;
                    if (!layoutParams.f297Z) {
                        if (!layoutParams.f296Y) {
                            i10 = mode2;
                            if (view.getVisibility() != 8) {
                                if (obj == null || !constraintWidget.m531h().m573g() || !constraintWidget.m533i().m573g()) {
                                    if (layoutParams.width == -2 && layoutParams.f293V) {
                                        mode2 = getChildMeasureSpec(i5, mode, layoutParams.width);
                                    } else {
                                        mode2 = MeasureSpec.makeMeasureSpec(constraintWidget.m545o(), 1073741824);
                                    }
                                    if (layoutParams.height == -2 && layoutParams.f294W) {
                                        i5 = getChildMeasureSpec(i6, size, layoutParams.height);
                                    } else {
                                        i5 = MeasureSpec.makeMeasureSpec(constraintWidget.m549q(), 1073741824);
                                    }
                                    view.measure(mode2, i5);
                                    if (r0.mMetrics != null) {
                                        C0141f c0141f = r0.mMetrics;
                                        i4 = mode;
                                        c0141f.f441b++;
                                    } else {
                                        i4 = mode;
                                    }
                                    i5 = view.getMeasuredWidth();
                                    i6 = view.getMeasuredHeight();
                                    if (i5 != constraintWidget.m545o()) {
                                        constraintWidget.m532h(i5);
                                        if (obj != null) {
                                            constraintWidget.m531h().m10658a(i5);
                                        }
                                        if (obj2 != null && constraintWidget.m555w() > i13) {
                                            i13 = Math.max(i13, constraintWidget.m555w() + constraintWidget.mo153a(Type.RIGHT).m471e());
                                        }
                                        obj4 = 1;
                                    }
                                    if (i6 != constraintWidget.m549q()) {
                                        constraintWidget.m534i(i6);
                                        if (obj != null) {
                                            constraintWidget.m533i().m10658a(i6);
                                        }
                                        if (obj3 != null) {
                                            i6 = max2;
                                            if (constraintWidget.m556x() > i6) {
                                                max2 = Math.max(i6, constraintWidget.m556x() + constraintWidget.mo153a(Type.BOTTOM).m471e());
                                                i6 = max2;
                                                obj4 = 1;
                                            }
                                        } else {
                                            i6 = max2;
                                        }
                                        max2 = i6;
                                        i6 = max2;
                                        obj4 = 1;
                                    } else {
                                        i6 = max2;
                                    }
                                    if (layoutParams.f295X) {
                                        i5 = view.getBaseline();
                                        if (!(i5 == -1 || i5 == constraintWidget.m480A())) {
                                            constraintWidget.m544n(i5);
                                            obj4 = 1;
                                        }
                                    }
                                    if (VERSION.SDK_INT >= 11) {
                                        i15 = combineMeasuredStates(i15, view.getMeasuredState());
                                    } else {
                                        mode2 = i15;
                                    }
                                    max2 = i6;
                                    i14++;
                                    i3 = i12;
                                    size2 = i11;
                                    mode2 = i10;
                                    mode = i4;
                                    i5 = i;
                                    i6 = i2;
                                }
                            }
                            i4 = mode;
                        }
                    }
                    i4 = mode;
                    i10 = mode2;
                }
                max2 = max2;
                i15 = i15;
                i14++;
                i3 = i12;
                size2 = i11;
                mode2 = i10;
                mode = i4;
                i5 = i;
                i6 = i2;
            }
            i4 = mode;
            i10 = mode2;
            i11 = size2;
            i12 = i3;
            i6 = max2;
            mode2 = i15;
            if (obj4 != null) {
                r0.mLayoutWidget.m532h(i10);
                r0.mLayoutWidget.m534i(i11);
                if (obj != null) {
                    r0.mLayoutWidget.m15591N();
                }
                solveLinearSystem("2nd pass");
                if (r0.mLayoutWidget.m545o() < i13) {
                    r0.mLayoutWidget.m532h(i13);
                    obj3 = 1;
                } else {
                    obj3 = null;
                }
                if (r0.mLayoutWidget.m549q() < i6) {
                    r0.mLayoutWidget.m534i(i6);
                    obj3 = 1;
                }
                if (obj3 != null) {
                    solveLinearSystem("3rd pass");
                }
            }
            i5 = i12;
            for (i6 = 0; i6 < i5; i6++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) r0.mVariableDimensionsWidgets.get(i6);
                View view2 = (View) constraintWidget2.m481B();
                if (view2 != null && (view2.getMeasuredWidth() != constraintWidget2.m545o() || view2.getMeasuredHeight() != constraintWidget2.m549q())) {
                    if (constraintWidget2.m537k() != 8) {
                        view2.measure(MeasureSpec.makeMeasureSpec(constraintWidget2.m545o(), 1073741824), MeasureSpec.makeMeasureSpec(constraintWidget2.m549q(), 1073741824));
                        if (r0.mMetrics != null) {
                            C0141f c0141f2 = r0.mMetrics;
                            c0141f2.f441b++;
                        }
                    }
                }
            }
        } else {
            i4 = mode;
            mode2 = 0;
        }
        i5 = r0.mLayoutWidget.m545o() + i4;
        i6 = r0.mLayoutWidget.m549q() + size;
        if (VERSION.SDK_INT >= 11) {
            i6 = resolveSizeAndState(i6, i2, mode2 << 16) & 16777215;
            i5 = Math.min(r0.mMaxWidth, resolveSizeAndState(i5, i, mode2) & 16777215);
            i6 = Math.min(r0.mMaxHeight, i6);
            if (r0.mLayoutWidget.m15586I()) {
                i5 |= 16777216;
            }
            if (r0.mLayoutWidget.m15587J()) {
                i6 |= 16777216;
            }
            setMeasuredDimension(i5, i6);
            r0.mLastMeasureWidth = i5;
            r0.mLastMeasureHeight = i6;
            return;
        }
        setMeasuredDimension(i5, i6);
        r0.mLastMeasureWidth = i5;
        r0.mLastMeasureHeight = i6;
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                i = Math.min(this.mMaxWidth, i) - paddingLeft;
            }
            i = 0;
        } else {
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                i2 = Math.min(this.mMaxHeight, i2) - paddingTop;
            }
            i2 = 0;
        } else {
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.m536j(0);
        this.mLayoutWidget.m538k(0);
        this.mLayoutWidget.m498a(dimensionBehaviour);
        this.mLayoutWidget.m532h(i);
        this.mLayoutWidget.m511b(dimensionBehaviour2);
        this.mLayoutWidget.m534i(i2);
        this.mLayoutWidget.m536j((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.m538k((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    protected void solveLinearSystem(String str) {
        this.mLayoutWidget.mo2977L();
        if (this.mMetrics != null) {
            str = this.mMetrics;
            str.f442c++;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildCount();
        i = isInEditMode();
        boolean z2 = false;
        for (boolean z3 = false; z3 < z; z3++) {
            i4 = getChildAt(z3);
            LayoutParams layoutParams = (LayoutParams) i4.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.al;
            if (i4.getVisibility() != 8 || layoutParams.f296Y || layoutParams.f297Z || i != 0) {
                if (!layoutParams.aa) {
                    int s = constraintWidget.m551s();
                    int t = constraintWidget.m552t();
                    int o = constraintWidget.m545o() + s;
                    int q = constraintWidget.m549q() + t;
                    i4.layout(s, t, o, q);
                    if (i4 instanceof C0133d) {
                        i4 = ((C0133d) i4).getContent();
                        if (i4 != 0) {
                            i4.setVisibility(0);
                            i4.layout(s, t, o, q);
                        }
                    }
                }
            }
        }
        z = this.mConstraintHelpers.size();
        if (z <= false) {
            while (z2 < z) {
                ((C0129b) this.mConstraintHelpers.get(z2)).m372b(this);
                z2++;
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.m15595a(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.mo152H();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C0132c c0132c) {
        this.mConstraintSet = c0132c;
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) parseInt2;
                            float f4 = f;
                            float f5 = f;
                            f = f3;
                            Paint paint2 = paint;
                            float f6 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            float f7 = (float) (parseInt2 + parseInt4);
                            f4 = f2;
                            float f8 = f7;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f = f7;
                            f6 = f5;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f4 = f5;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            paint = paint2;
                            paint.setColor(-16711936);
                            Paint paint4 = paint;
                            f6 = f2;
                            paint3 = paint4;
                            canvas2.drawLine(f4, f3, f6, f7, paint3);
                            canvas2.drawLine(f4, f7, f6, f3, paint3);
                        }
                    }
                }
            }
        }
        ConstraintLayout constraintLayout = this;
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
