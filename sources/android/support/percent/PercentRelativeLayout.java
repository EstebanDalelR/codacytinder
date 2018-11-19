package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.PercentLayoutHelper.C0277a;
import android.support.percent.PercentLayoutHelper.PercentLayoutParams;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    /* renamed from: a */
    private final PercentLayoutHelper f994a = new PercentLayoutHelper(this);

    @Deprecated
    public static class LayoutParams extends android.widget.RelativeLayout.LayoutParams implements PercentLayoutParams {
        /* renamed from: a */
        private C0277a f8830a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8830a = PercentLayoutHelper.m1029a(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public C0277a getPercentLayoutInfo() {
            if (this.f8830a == null) {
                this.f8830a = new C0277a();
            }
            return this.f8830a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            PercentLayoutHelper.m1030a(this, typedArray, i, i2);
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1036a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m1037a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ android.widget.RelativeLayout.LayoutParams m71744generateLayoutParams(AttributeSet attributeSet) {
        return m1037a(attributeSet);
    }

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    protected LayoutParams m1036a() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public LayoutParams m1037a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        this.f994a.m1034a(i, i2);
        super.onMeasure(i, i2);
        if (this.f994a.m1035b()) {
            super.onMeasure(i, i2);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f994a.m1033a();
    }
}
