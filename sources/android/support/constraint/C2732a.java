package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.C0136e.C0135b;
import android.support.constraint.solver.widgets.C3986a;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a */
public class C2732a extends C0129b {
    /* renamed from: f */
    private int f8589f = 0;
    /* renamed from: g */
    private int f8590g = 0;
    /* renamed from: h */
    private C3986a f8591h;

    public C2732a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f8589f;
    }

    public void setType(int i) {
        this.f8589f = i;
        this.f8590g = i;
        if (VERSION.SDK_INT >= 17) {
            if ((1 == getResources().getConfiguration().getLayoutDirection() ? 1 : 0) != 0) {
                if (this.f8589f == 5) {
                    this.f8590g = 1;
                } else if (this.f8589f == 6) {
                    this.f8590g = 0;
                }
            } else if (this.f8589f == 5) {
                this.f8590g = 0;
            } else if (this.f8589f == 6) {
                this.f8590g = 1;
            }
        } else if (this.f8589f == 5) {
            this.f8590g = 0;
        } else if (this.f8589f == 6) {
            this.f8590g = 1;
        }
        this.f8591h.m15575a(this.f8590g);
    }

    /* renamed from: a */
    protected void mo142a(AttributeSet attributeSet) {
        super.mo142a(attributeSet);
        this.f8591h = new C3986a();
        if (attributeSet != null) {
            attributeSet = getContext().obtainStyledAttributes(attributeSet, C0135b.ConstraintLayout_Layout);
            int indexCount = attributeSet.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = attributeSet.getIndex(i);
                if (index == C0135b.ConstraintLayout_Layout_barrierDirection) {
                    setType(attributeSet.getInt(index, 0));
                } else if (index == C0135b.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f8591h.m15577a(attributeSet.getBoolean(index, true));
                }
            }
        }
        this.d = this.f8591h;
        m369a();
    }
}
