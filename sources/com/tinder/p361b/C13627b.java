package com.tinder.p361b;

import android.databinding.C0119f;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0111b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.settings.feed.view.FeedSharingOptionItemView;
import com.tinder.settings.feed.view.FeedSharingOptionItemView.OnFeedSharingOptionChangedListener;

/* renamed from: com.tinder.b.b */
public class C13627b extends ViewDataBinding {
    @Nullable
    /* renamed from: c */
    private static final C0111b f43409c = null;
    @Nullable
    /* renamed from: d */
    private static final SparseIntArray f43410d = null;
    @NonNull
    /* renamed from: e */
    private final FeedSharingOptionItemView f43411e;
    @Nullable
    /* renamed from: f */
    private OnFeedSharingOptionChangedListener f43412f;
    @Nullable
    /* renamed from: g */
    private FeedSharingOption f43413g;
    /* renamed from: h */
    private long f43414h = -1;

    /* renamed from: a */
    protected boolean m53123a(int i, Object obj, int i2) {
        return false;
    }

    public C13627b(@NonNull DataBindingComponent dataBindingComponent, @NonNull View view) {
        super(dataBindingComponent, view, 0);
        this.f43411e = (FeedSharingOptionItemView) C13627b.a(dataBindingComponent, view, 1, f43409c, f43410d)[0];
        this.f43411e.setTag(null);
        a(view);
        m53126i();
    }

    /* renamed from: i */
    public void m53126i() {
        synchronized (this) {
            this.f43414h = 4;
        }
        e();
    }

    /* renamed from: c */
    public boolean m53125c() {
        synchronized (this) {
            if (this.f43414h != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m53122a(@Nullable OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener) {
        this.f43412f = onFeedSharingOptionChangedListener;
        synchronized (this) {
            this.f43414h |= 1;
        }
        notifyPropertyChanged(8);
        super.e();
    }

    /* renamed from: a */
    public void m53121a(@Nullable FeedSharingOption feedSharingOption) {
        this.f43413g = feedSharingOption;
        synchronized (this) {
            this.f43414h |= 2;
        }
        notifyPropertyChanged(2);
        super.e();
    }

    /* renamed from: b */
    protected void m53124b() {
        long j;
        synchronized (this) {
            j = this.f43414h;
            this.f43414h = 0;
        }
        OnFeedSharingOptionChangedListener onFeedSharingOptionChangedListener = this.f43412f;
        FeedSharingOption feedSharingOption = this.f43413g;
        long j2 = j & 5;
        if ((j & 6) != 0) {
            FeedSharingOptionItemView.a(this.f43411e, feedSharingOption);
        }
        if (j2 != 0) {
            FeedSharingOptionItemView.a(this.f43411e, onFeedSharingOptionChangedListener);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C13627b m53119a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return C13627b.m53120a(layoutInflater, viewGroup, z, C0119f.a());
    }

    @NonNull
    /* renamed from: a */
    public static C13627b m53120a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        return (C13627b) C0119f.a(layoutInflater, R.layout.row_view_feed_sharing_option_item, viewGroup, z, dataBindingComponent);
    }
}
