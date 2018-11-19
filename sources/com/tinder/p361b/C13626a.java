package com.tinder.p361b;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import com.tinder.overflow.C10019a;
import com.tinder.overflow.OverflowMenuRecyclerView;
import java.util.List;

/* renamed from: com.tinder.b.a */
public class C13626a extends ViewDataBinding {
    @Nullable
    /* renamed from: c */
    private static final C0111b f43404c = null;
    @Nullable
    /* renamed from: d */
    private static final SparseIntArray f43405d = null;
    @NonNull
    /* renamed from: e */
    private final OverflowMenuRecyclerView f43406e;
    @Nullable
    /* renamed from: f */
    private List<C10019a> f43407f;
    /* renamed from: g */
    private long f43408g = -1;

    /* renamed from: a */
    protected boolean m53115a(int i, Object obj, int i2) {
        return false;
    }

    public C13626a(@NonNull DataBindingComponent dataBindingComponent, @NonNull View view) {
        super(dataBindingComponent, view, 0);
        this.f43406e = (OverflowMenuRecyclerView) C13626a.a(dataBindingComponent, view, 1, f43404c, f43405d)[0];
        this.f43406e.setTag(null);
        a(view);
        m53118i();
    }

    /* renamed from: i */
    public void m53118i() {
        synchronized (this) {
            this.f43408g = 2;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53117c() {
        synchronized (this) {
            if (this.f43408g != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53114a(@Nullable List<C10019a> list) {
        this.f43407f = list;
        synchronized (this) {
            this.f43408g |= 1;
        }
        notifyPropertyChanged(5);
        super.e();
    }

    /* renamed from: b */
    protected void m53116b() {
        synchronized (this) {
            long j = this.f43408g;
            this.f43408g = 0;
        }
        List list = this.f43407f;
        if ((j & 3) != 0) {
            OverflowMenuRecyclerView.m53832a(this.f43406e, list);
        }
    }
}
