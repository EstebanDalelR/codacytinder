package com.tinder.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class LinearAdapterLayout extends LinearLayout {
    /* renamed from: a */
    private View f47779a;
    /* renamed from: b */
    private View f47780b;
    /* renamed from: c */
    private DataSetObserver f47781c;
    /* renamed from: d */
    private BaseAdapter f47782d;
    /* renamed from: e */
    private OnClickListener f47783e;
    /* renamed from: f */
    private OnClickListener f47784f;

    /* renamed from: com.tinder.views.LinearAdapterLayout$a */
    private class C15435a extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ LinearAdapterLayout f47778a;

        private C15435a(LinearAdapterLayout linearAdapterLayout) {
            this.f47778a = linearAdapterLayout;
        }

        public void onChanged() {
            super.onChanged();
            this.f47778a.m57902b();
        }
    }

    public LinearAdapterLayout(Context context) {
        super(context);
        m57900a();
    }

    public LinearAdapterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57900a();
    }

    public LinearAdapterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57900a();
    }

    @TargetApi(21)
    public LinearAdapterLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m57900a();
    }

    /* renamed from: a */
    private void m57900a() {
        this.f47781c = new C15435a();
    }

    public void setOnClickListenerForItems(OnClickListener onClickListener) {
        this.f47783e = onClickListener;
        this.f47784f = new C15468w(this);
    }

    /* renamed from: a */
    final /* synthetic */ void m57903a(View view) {
        this.f47783e.onClick(view);
    }

    public BaseAdapter getAdapter() {
        return this.f47782d;
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.f47782d = baseAdapter;
        this.f47782d.registerDataSetObserver(this.f47781c);
        this.f47781c.onChanged();
    }

    public View getHeader() {
        return this.f47779a;
    }

    public void setHeader(View view) {
        this.f47779a = view;
        if (this.f47782d != null) {
            this.f47781c.onChanged();
        }
    }

    /* renamed from: b */
    private void m57902b() {
        int count = this.f47782d.getCount();
        int i = 0;
        Object obj = 1;
        Object obj2 = this.f47779a != null ? 1 : null;
        if (this.f47780b == null) {
            obj = null;
        }
        removeAllViews();
        if (obj2 != null) {
            addView(this.f47779a);
        }
        for (int i2 = 0; i2 < count; i2++) {
            addView(this.f47782d.getView(i2, null, this));
        }
        if (obj != null) {
            addView(this.f47780b);
        }
        while (i < getChildCount()) {
            getChildAt(i).setOnClickListener(this.f47784f);
            i++;
        }
    }

    public View getFooter() {
        return this.f47780b;
    }

    public void setFooter(View view) {
        this.f47780b = view;
        if (this.f47782d != null) {
            this.f47781c.onChanged();
        }
    }
}
