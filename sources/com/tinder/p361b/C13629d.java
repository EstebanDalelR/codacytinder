package com.tinder.p361b;

import android.databinding.C0119f;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.Space;
import android.support.v7.widget.Toolbar;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.settings.feed.view.FeedSharingOptionItemView.OnFeedSharingOptionChangedListener;
import com.tinder.settings.feed.view.FeedSharingOptionsRecyclerView;
import com.tinder.settings.p403a.C14843a;
import com.tinder.settings.views.SwitchRowView;
import com.tinder.settings.views.SwitchRowView$CheckStatusListener;
import com.tinder.views.CustomTextView;
import java.util.List;

/* renamed from: com.tinder.b.d */
public class C13629d extends ViewDataBinding {
    @Nullable
    /* renamed from: e */
    private static final C0111b f43422e = null;
    @Nullable
    /* renamed from: f */
    private static final SparseIntArray f43423f = null;
    @NonNull
    /* renamed from: c */
    public final CustomTextView f43424c;
    @NonNull
    /* renamed from: d */
    public final Toolbar f43425d;
    @NonNull
    /* renamed from: g */
    private final Space f43426g;
    @NonNull
    /* renamed from: h */
    private final SwitchRowView f43427h;
    @NonNull
    /* renamed from: i */
    private final FeedSharingOptionsRecyclerView f43428i;
    @Nullable
    /* renamed from: j */
    private OnClickListener f43429j;
    @Nullable
    /* renamed from: k */
    private OnFeedSharingOptionChangedListener f43430k;
    @Nullable
    /* renamed from: l */
    private Boolean f43431l;
    @Nullable
    /* renamed from: m */
    private List<FeedSharingOption> f43432m;
    @Nullable
    /* renamed from: n */
    private SwitchRowView$CheckStatusListener f43433n;
    /* renamed from: o */
    private long f43434o = -1;

    /* renamed from: a */
    protected boolean m53141a(int i, Object obj, int i2) {
        return false;
    }

    public C13629d(@NonNull DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        super(dataBindingComponent, viewArr[0], 0);
        dataBindingComponent = C13629d.a(dataBindingComponent, viewArr, 5, f43422e, f43423f);
        this.f43426g = (Space) dataBindingComponent[1];
        this.f43426g.setTag(null);
        this.f43427h = (SwitchRowView) dataBindingComponent[2];
        this.f43427h.setTag(null);
        this.f43428i = (FeedSharingOptionsRecyclerView) dataBindingComponent[4];
        this.f43428i.setTag(null);
        this.f43424c = (CustomTextView) dataBindingComponent[3];
        this.f43424c.setTag(null);
        this.f43425d = (Toolbar) dataBindingComponent[0];
        this.f43425d.setTag(null);
        a(viewArr);
        m53144i();
    }

    /* renamed from: i */
    public void m53144i() {
        synchronized (this) {
            this.f43434o = 32;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53143c() {
        synchronized (this) {
            if (this.f43434o != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53136a(@Nullable OnClickListener onClickListener) {
        this.f43429j = onClickListener;
        synchronized (this) {
            this.f43434o |= 1;
        }
        notifyPropertyChanged(6);
        super.e();
    }

    /* renamed from: a */
    public void m53137a(@Nullable OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        this.f43430k = onFeedSharingOptionChangedListener;
        synchronized (this) {
            this.f43434o |= 2;
        }
        notifyPropertyChanged(8);
        super.e();
    }

    /* renamed from: a */
    public void m53139a(@Nullable Boolean bool) {
        this.f43431l = bool;
        synchronized (this) {
            this.f43434o |= 4;
        }
        notifyPropertyChanged(10);
        super.e();
    }

    /* renamed from: a */
    public void m53140a(@Nullable List<FeedSharingOption> list) {
        this.f43432m = list;
        synchronized (this) {
            this.f43434o |= 8;
        }
        notifyPropertyChanged(3);
        super.e();
    }

    /* renamed from: a */
    public void m53138a(@Nullable SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener) {
        this.f43433n = switchRowView$CheckStatusListener;
        synchronized (this) {
            this.f43434o |= 16;
        }
        notifyPropertyChanged(9);
        super.e();
    }

    /* renamed from: b */
    protected void m53142b() {
        long j;
        C13629d c13629d = this;
        synchronized (this) {
            try {
                j = c13629d.f43434o;
                c13629d.f43434o = 0;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                }
            }
        }
        OnClickListener onClickListener = c13629d.f43429j;
        OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener = c13629d.f43430k;
        Boolean bool = c13629d.f43431l;
        List list = c13629d.f43432m;
        SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener = c13629d.f43433n;
        long j2 = j & 33;
        long j3 = j & 34;
        long j4 = j & 36;
        long j5 = j & 40;
        long j6 = j & 48;
        if ((j & 32) != 0) {
            SwitchRowView.a(c13629d.f43427h, c13629d.f43427h.getResources().getString(R.string.feed_share_my_feed));
        }
        if (j6 != 0) {
            SwitchRowView.a(c13629d.f43427h, switchRowView$CheckStatusListener);
        }
        if (j4 != 0) {
            SwitchRowView.a(c13629d.f43427h, bool);
        }
        if (j5 != 0) {
            FeedSharingOptionsRecyclerView.a(c13629d.f43428i, list);
        }
        if (j3 != 0) {
            FeedSharingOptionsRecyclerView.a(c13629d.f43428i, onFeedSharingOptionChangedListener);
        }
        if (j2 != 0) {
            C14843a.a(c13629d.f43425d, onClickListener);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C13629d m53134a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return C13629d.m53135a(layoutInflater, viewGroup, z, C0119f.a());
    }

    @NonNull
    /* renamed from: a */
    public static C13629d m53135a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (C13629d) C0119f.a(layoutInflater, R.layout.view_feed_settings, viewGroup, z, dataBindingComponent);
    }
}
