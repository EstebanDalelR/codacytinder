package com.tinder.p361b;

import android.databinding.C0119f;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.views.CustomTextView;

/* renamed from: com.tinder.b.c */
public class C13628c extends ViewDataBinding {
    @Nullable
    /* renamed from: e */
    private static final C0111b f43415e = null;
    @Nullable
    /* renamed from: f */
    private static final SparseIntArray f43416f = new SparseIntArray();
    @NonNull
    /* renamed from: c */
    public final CardView f43417c;
    @NonNull
    /* renamed from: d */
    public final CustomTextView f43418d;
    @NonNull
    /* renamed from: g */
    private final CustomTextView f43419g;
    @Nullable
    /* renamed from: h */
    private OnClickListener f43420h;
    /* renamed from: i */
    private long f43421i = -1;

    /* renamed from: a */
    protected boolean m53130a(int i, Object obj, int i2) {
        return false;
    }

    static {
        f43416f.put(R.id.share_my_activity_text, 2);
    }

    public C13628c(@NonNull DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        super(dataBindingComponent, viewArr[0], 0);
        dataBindingComponent = C13628c.a(dataBindingComponent, viewArr, 3, f43415e, f43416f);
        this.f43417c = (CardView) dataBindingComponent[0];
        this.f43417c.setTag(null);
        this.f43419g = (CustomTextView) dataBindingComponent[1];
        this.f43419g.setTag(null);
        this.f43418d = (CustomTextView) dataBindingComponent[2];
        a(viewArr);
        m53133i();
    }

    /* renamed from: i */
    public void m53133i() {
        synchronized (this) {
            this.f43421i = 2;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53132c() {
        synchronized (this) {
            if (this.f43421i != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53129a(@Nullable OnClickListener onClickListener) {
        this.f43420h = onClickListener;
        synchronized (this) {
            this.f43421i |= 1;
        }
        notifyPropertyChanged(1);
        super.e();
    }

    /* renamed from: b */
    protected void m53131b() {
        synchronized (this) {
            long j = this.f43421i;
            this.f43421i = 0;
        }
        OnClickListener onClickListener = this.f43420h;
        if ((j & 3) != 0) {
            this.f43417c.setOnClickListener(onClickListener);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C13628c m53127a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return C13628c.m53128a(layoutInflater, viewGroup, z, C0119f.a());
    }

    @NonNull
    /* renamed from: a */
    public static C13628c m53128a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (C13628c) C0119f.a(layoutInflater, R.layout.view_feed_setting_item, viewGroup, z, dataBindingComponent);
    }
}
