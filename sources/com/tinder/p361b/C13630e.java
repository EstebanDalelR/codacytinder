package com.tinder.p361b;

import android.databinding.C0119f;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.databinding.adapters.TextViewBindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.views.CustomTextView;

/* renamed from: com.tinder.b.e */
public class C13630e extends ViewDataBinding {
    @Nullable
    /* renamed from: c */
    private static final C0111b f43435c = null;
    @Nullable
    /* renamed from: d */
    private static final SparseIntArray f43436d = null;
    @NonNull
    /* renamed from: e */
    private final CustomTextView f43437e;
    @Nullable
    /* renamed from: f */
    private String f43438f;
    @Nullable
    /* renamed from: g */
    private OnClickListener f43439g;
    /* renamed from: h */
    private long f43440h = -1;

    /* renamed from: a */
    protected boolean m53149a(int i, Object obj, int i2) {
        return false;
    }

    public C13630e(@NonNull DataBindingComponent dataBindingComponent, @NonNull View view) {
        super(dataBindingComponent, view, 0);
        this.f43437e = (CustomTextView) C13630e.a(dataBindingComponent, view, 1, f43435c, f43436d)[0];
        this.f43437e.setTag(null);
        a(view);
        m53152i();
    }

    /* renamed from: i */
    public void m53152i() {
        synchronized (this) {
            this.f43440h = 4;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53151c() {
        synchronized (this) {
            if (this.f43440h != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53148a(@Nullable String str) {
        this.f43438f = str;
        synchronized (this) {
            this.f43440h |= 1;
        }
        notifyPropertyChanged(13);
        super.e();
    }

    /* renamed from: a */
    public void m53147a(@Nullable OnClickListener onClickListener) {
        this.f43439g = onClickListener;
        synchronized (this) {
            this.f43440h |= 2;
        }
        notifyPropertyChanged(7);
        super.e();
    }

    /* renamed from: b */
    protected void m53150b() {
        long j;
        synchronized (this) {
            j = this.f43440h;
            this.f43440h = 0;
        }
        CharSequence charSequence = this.f43438f;
        OnClickListener onClickListener = this.f43439g;
        long j2 = j & 6;
        if ((j & 5) != 0) {
            TextViewBindingAdapter.a(this.f43437e, charSequence);
        }
        if (j2 != 0) {
            this.f43437e.setOnClickListener(onClickListener);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C13630e m53145a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return C13630e.m53146a(layoutInflater, viewGroup, z, C0119f.a());
    }

    @NonNull
    /* renamed from: a */
    public static C13630e m53146a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (C13630e) C0119f.a(layoutInflater, R.layout.view_overflow_menu_item, viewGroup, z, dataBindingComponent);
    }
}
