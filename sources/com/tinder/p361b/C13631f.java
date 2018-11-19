package com.tinder.p361b;

import android.databinding.C0119f;
import android.databinding.DataBindingComponent;
import android.databinding.InverseBindingListener;
import android.databinding.ObservableBoolean;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.databinding.adapters.C0115a;
import android.databinding.adapters.TextViewBindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tinder.R;
import com.tinder.views.CustomSwitch;
import com.tinder.views.CustomTextView;

/* renamed from: com.tinder.b.f */
public class C13631f extends ViewDataBinding {
    @Nullable
    /* renamed from: e */
    private static final C0111b f43441e = null;
    @Nullable
    /* renamed from: f */
    private static final SparseIntArray f43442f = null;
    @NonNull
    /* renamed from: c */
    public final CustomSwitch f43443c;
    @NonNull
    /* renamed from: d */
    public final CustomTextView f43444d;
    @Nullable
    /* renamed from: g */
    private String f43445g;
    @Nullable
    /* renamed from: h */
    private ObservableBoolean f43446h;
    @Nullable
    /* renamed from: i */
    private OnCheckedChangeListener f43447i;
    /* renamed from: j */
    private long f43448j = -1;

    public C13631f(@NonNull DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        super(dataBindingComponent, viewArr[0], 1);
        dataBindingComponent = C13631f.a(dataBindingComponent, viewArr, 2, f43441e, f43442f);
        this.f43443c = (CustomSwitch) dataBindingComponent[1];
        this.f43443c.setTag(null);
        this.f43444d = (CustomTextView) dataBindingComponent[0];
        this.f43444d.setTag(null);
        a(viewArr);
        m53162i();
    }

    /* renamed from: i */
    public void m53162i() {
        synchronized (this) {
            this.f43448j = 8;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53161c() {
        synchronized (this) {
            if (this.f43448j != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53158a(@Nullable String str) {
        this.f43445g = str;
        synchronized (this) {
            this.f43448j |= 2;
        }
        notifyPropertyChanged(12);
        super.e();
    }

    /* renamed from: a */
    public void m53156a(@Nullable ObservableBoolean observableBoolean) {
        a(0, observableBoolean);
        this.f43446h = observableBoolean;
        synchronized (this) {
            this.f43448j |= 1;
        }
        notifyPropertyChanged(4);
        super.e();
    }

    @Nullable
    /* renamed from: j */
    public ObservableBoolean m53163j() {
        return this.f43446h;
    }

    /* renamed from: a */
    public void m53157a(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.f43447i = onCheckedChangeListener;
        synchronized (this) {
            this.f43448j |= 4;
        }
        notifyPropertyChanged(11);
        super.e();
    }

    /* renamed from: a */
    protected boolean m53159a(int i, Object obj, int i2) {
        return i != 0 ? false : m53155a((ObservableBoolean) obj, i2);
    }

    /* renamed from: a */
    private boolean m53155a(ObservableBoolean observableBoolean, int i) {
        if (i != 0) {
            return null;
        }
        synchronized (this) {
            this.f43448j |= 1;
        }
        return true;
    }

    /* renamed from: b */
    protected void m53160b() {
        long j;
        C13631f c13631f = this;
        synchronized (this) {
            try {
                j = c13631f.f43448j;
                c13631f.f43448j = 0;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                }
            }
        }
        CharSequence charSequence = c13631f.f43445g;
        ObservableBoolean observableBoolean = c13631f.f43446h;
        boolean z = false;
        OnCheckedChangeListener onCheckedChangeListener = c13631f.f43447i;
        long j2 = j & 10;
        long j3 = j & 9;
        if (!(j3 == 0 || observableBoolean == null)) {
            z = observableBoolean.get();
        }
        long j4 = j & 12;
        if (j3 != 0) {
            C0115a.a(c13631f.f43443c, z);
        }
        if (j4 != 0) {
            C0115a.a(c13631f.f43443c, onCheckedChangeListener, (InverseBindingListener) null);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.a(c13631f.f43444d, charSequence);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C13631f m53153a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return C13631f.m53154a(layoutInflater, viewGroup, z, C0119f.a());
    }

    @NonNull
    /* renamed from: a */
    public static C13631f m53154a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (C13631f) C0119f.a(layoutInflater, R.layout.view_switch_row, viewGroup, z, dataBindingComponent);
    }
}
