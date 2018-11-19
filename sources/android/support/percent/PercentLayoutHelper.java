package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.percent.C0280a.C0279a;
import android.support.v4.view.C0596e;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

@Deprecated
public class PercentLayoutHelper {
    /* renamed from: a */
    private final ViewGroup f993a;

    @Deprecated
    public interface PercentLayoutParams {
        C0277a getPercentLayoutInfo();
    }

    @Deprecated
    /* renamed from: android.support.percent.PercentLayoutHelper$a */
    public static class C0277a {
        /* renamed from: a */
        public float f981a = -1.0f;
        /* renamed from: b */
        public float f982b = -1.0f;
        /* renamed from: c */
        public float f983c = -1.0f;
        /* renamed from: d */
        public float f984d = -1.0f;
        /* renamed from: e */
        public float f985e = -1.0f;
        /* renamed from: f */
        public float f986f = -1.0f;
        /* renamed from: g */
        public float f987g = -1.0f;
        /* renamed from: h */
        public float f988h = -1.0f;
        /* renamed from: i */
        public float f989i;
        /* renamed from: j */
        final C0278b f990j = new C0278b(0, 0);

        /* renamed from: a */
        public void m1023a(LayoutParams layoutParams, int i, int i2) {
            this.f990j.width = layoutParams.width;
            this.f990j.height = layoutParams.height;
            Object obj = null;
            Object obj2 = ((this.f990j.f992b || this.f990j.width == 0) && this.f981a < 0.0f) ? 1 : null;
            if ((this.f990j.f991a || this.f990j.height == 0) && this.f982b < 0.0f) {
                obj = 1;
            }
            if (this.f981a >= 0.0f) {
                layoutParams.width = Math.round(((float) i) * this.f981a);
            }
            if (this.f982b >= 0) {
                layoutParams.height = Math.round(((float) i2) * this.f982b);
            }
            if (this.f989i >= 0) {
                if (obj2 != null) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * this.f989i);
                    this.f990j.f992b = true;
                }
                if (obj != null) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f989i);
                    this.f990j.f991a = true;
                }
            }
        }

        /* renamed from: a */
        public void m1021a(View view, MarginLayoutParams marginLayoutParams, int i, int i2) {
            m1023a(marginLayoutParams, i, i2);
            this.f990j.leftMargin = marginLayoutParams.leftMargin;
            this.f990j.topMargin = marginLayoutParams.topMargin;
            this.f990j.rightMargin = marginLayoutParams.rightMargin;
            this.f990j.bottomMargin = marginLayoutParams.bottomMargin;
            C0596e.m2319a(this.f990j, C0596e.m2318a(marginLayoutParams));
            C0596e.m2321b(this.f990j, C0596e.m2320b(marginLayoutParams));
            if (this.f983c >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i) * this.f983c);
            }
            if (this.f984d >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i2) * this.f984d);
            }
            if (this.f985e >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i) * this.f985e);
            }
            if (this.f986f >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i2) * this.f986f);
            }
            i2 = 0;
            if (this.f987g >= 0.0f) {
                C0596e.m2319a(marginLayoutParams, Math.round(((float) i) * this.f987g));
                i2 = 1;
            }
            if (this.f988h >= 0.0f) {
                C0596e.m2321b(marginLayoutParams, Math.round(((float) i) * this.f988h));
                i2 = 1;
            }
            if (i2 != 0 && view != null) {
                C0596e.m2322c(marginLayoutParams, ViewCompat.m2208f(view));
            }
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f981a), Float.valueOf(this.f982b), Float.valueOf(this.f983c), Float.valueOf(this.f984d), Float.valueOf(this.f985e), Float.valueOf(this.f986f), Float.valueOf(this.f987g), Float.valueOf(this.f988h)});
        }

        /* renamed from: a */
        public void m1024a(MarginLayoutParams marginLayoutParams) {
            m1022a((LayoutParams) marginLayoutParams);
            marginLayoutParams.leftMargin = this.f990j.leftMargin;
            marginLayoutParams.topMargin = this.f990j.topMargin;
            marginLayoutParams.rightMargin = this.f990j.rightMargin;
            marginLayoutParams.bottomMargin = this.f990j.bottomMargin;
            C0596e.m2319a(marginLayoutParams, C0596e.m2318a(this.f990j));
            C0596e.m2321b(marginLayoutParams, C0596e.m2320b(this.f990j));
        }

        /* renamed from: a */
        public void m1022a(LayoutParams layoutParams) {
            if (!this.f990j.f992b) {
                layoutParams.width = this.f990j.width;
            }
            if (!this.f990j.f991a) {
                layoutParams.height = this.f990j.height;
            }
            this.f990j.f992b = false;
            this.f990j.f991a = false;
        }
    }

    /* renamed from: android.support.percent.PercentLayoutHelper$b */
    static class C0278b extends MarginLayoutParams {
        /* renamed from: a */
        private boolean f991a;
        /* renamed from: b */
        private boolean f992b;

        public C0278b(int i, int i2) {
            super(i, i2);
        }
    }

    public PercentLayoutHelper(@NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("host must be non-null");
        }
        this.f993a = viewGroup;
    }

    /* renamed from: a */
    public static void m1030a(LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    /* renamed from: a */
    public void m1034a(int i, int i2) {
        i = (MeasureSpec.getSize(i) - this.f993a.getPaddingLeft()) - this.f993a.getPaddingRight();
        i2 = (MeasureSpec.getSize(i2) - this.f993a.getPaddingTop()) - this.f993a.getPaddingBottom();
        int childCount = this.f993a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f993a.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof PercentLayoutParams) {
                C0277a percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo();
                if (percentLayoutInfo != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        percentLayoutInfo.m1021a(childAt, (MarginLayoutParams) layoutParams, i, i2);
                    } else {
                        percentLayoutInfo.m1023a(layoutParams, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0277a m1029a(Context context, AttributeSet attributeSet) {
        C0277a c0277a;
        context = context.obtainStyledAttributes(attributeSet, C0279a.PercentLayout_Layout);
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            c0277a = new C0277a();
            c0277a.f981a = attributeSet;
        } else {
            c0277a = null;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f982b = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f983c = attributeSet;
            c0277a.f984d = attributeSet;
            c0277a.f985e = attributeSet;
            c0277a.f986f = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f983c = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f984d = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f985e = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f986f = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f987g = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f988h = attributeSet;
        }
        attributeSet = context.getFraction(C0279a.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (attributeSet != -1082130432) {
            if (c0277a == null) {
                c0277a = new C0277a();
            }
            c0277a.f989i = attributeSet;
        }
        context.recycle();
        return c0277a;
    }

    /* renamed from: a */
    public void m1033a() {
        int childCount = this.f993a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = this.f993a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof PercentLayoutParams) {
                C0277a percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo();
                if (percentLayoutInfo != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        percentLayoutInfo.m1024a((MarginLayoutParams) layoutParams);
                    } else {
                        percentLayoutInfo.m1022a(layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m1035b() {
        int childCount = this.f993a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f993a.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof PercentLayoutParams) {
                C0277a percentLayoutInfo = ((PercentLayoutParams) layoutParams).getPercentLayoutInfo();
                if (percentLayoutInfo != null) {
                    if (m1031a(childAt, percentLayoutInfo)) {
                        layoutParams.width = -2;
                        z = true;
                    }
                    if (m1032b(childAt, percentLayoutInfo)) {
                        layoutParams.height = -2;
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m1031a(View view, C0277a c0277a) {
        return ((view.getMeasuredWidthAndState() & -16777216) == 16777216 && c0277a.f981a >= 0.0f && c0277a.f990j.width == -2) ? true : null;
    }

    /* renamed from: b */
    private static boolean m1032b(View view, C0277a c0277a) {
        return ((view.getMeasuredHeightAndState() & -16777216) == 16777216 && c0277a.f982b >= 0.0f && c0277a.f990j.height == -2) ? true : null;
    }
}
