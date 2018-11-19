package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.facebook.ads.internal.view.hscroll.C4353d.C1610a;

/* renamed from: com.facebook.ads.internal.view.hscroll.b */
public class C4443b extends C4353d implements C1610a {
    /* renamed from: c */
    private final HScrollLinearLayoutManager f14743c;
    /* renamed from: d */
    private C1608a f14744d;
    /* renamed from: e */
    private int f14745e = -1;
    /* renamed from: f */
    private int f14746f = -1;
    /* renamed from: g */
    private int f14747g = 0;
    /* renamed from: h */
    private int f14748h = 0;

    /* renamed from: com.facebook.ads.internal.view.hscroll.b$a */
    public interface C1608a {
        /* renamed from: a */
        void m5484a(int i, int i2);
    }

    public C4443b(Context context) {
        super(context);
        this.f14743c = new HScrollLinearLayoutManager(context, new C1609c(), new C1607a());
        m18472a();
    }

    public C4443b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14743c = new HScrollLinearLayoutManager(context, new C1609c(), new C1607a());
        m18472a();
    }

    public C4443b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14743c = new HScrollLinearLayoutManager(context, new C1609c(), new C1607a());
        m18472a();
    }

    /* renamed from: a */
    private void m18472a() {
        this.f14743c.setOrientation(0);
        setLayoutManager(this.f14743c);
        setSaveEnabled(false);
        setSnapDelegate(this);
    }

    /* renamed from: a */
    private void m18473a(int i, int i2) {
        if (i != this.f14745e || i2 != this.f14746f) {
            this.f14745e = i;
            this.f14746f = i2;
            if (this.f14744d != null) {
                this.f14744d.m5484a(this.f14745e, this.f14746f);
            }
        }
    }

    /* renamed from: b */
    private int m18474b(int i) {
        int i2 = this.f14748h * 2;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - i2;
        int itemCount = getAdapter().getItemCount();
        int i3 = 0;
        int i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (i4 > i) {
            i3++;
            if (i3 >= itemCount) {
                return i;
            }
            i4 = (int) (((float) (measuredWidth - (i3 * i2))) / (((float) i3) + 0.333f));
        }
        return i4;
    }

    /* renamed from: a */
    public int mo3973a(int i) {
        i = Math.abs(i);
        return i <= this.a ? 0 : this.f14747g == 0 ? 1 : 1 + (i / this.f14747g);
    }

    /* renamed from: a */
    protected void mo3974a(int i, boolean z) {
        super.mo3974a(i, z);
        m18473a(i, 0);
    }

    public int getChildSpacing() {
        return this.f14748h;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = Math.round(((float) getMeasuredWidth()) / 1.91f);
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(MeasureSpec.getSize(i2), i);
        } else if (mode == 1073741824) {
            i = MeasureSpec.getSize(i2);
        }
        i2 = getPaddingTop() + getPaddingBottom();
        i = m18474b(i - i2);
        setMeasuredDimension(getMeasuredWidth(), i2 + i);
        setChildWidth(i + (this.f14748h * 2));
    }

    public void setAdapter(@Nullable Adapter adapter) {
        this.f14743c.m16598a(adapter == null ? -1 : adapter.hashCode());
        super.setAdapter(adapter);
    }

    public void setChildSpacing(int i) {
        this.f14748h = i;
    }

    public void setChildWidth(int i) {
        this.f14747g = i;
        i = getMeasuredWidth();
        this.f14743c.m16599b((((i - getPaddingLeft()) - getPaddingRight()) - this.f14747g) / 2);
        this.f14743c.m16597a(((double) this.f14747g) / ((double) i));
    }

    public void setCurrentPosition(int i) {
        mo3974a(i, false);
    }

    public void setOnPageChangedListener(C1608a c1608a) {
        this.f14744d = c1608a;
    }
}
