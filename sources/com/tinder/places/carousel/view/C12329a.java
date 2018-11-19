package com.tinder.places.carousel.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselCenterScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "()V", "isCentered", "", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.view.a */
public final class C12329a extends OnScrollListener {
    /* renamed from: a */
    private boolean f39923a = true;

    public void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (recyclerView == null) {
            C2668g.a();
        }
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof CarouselLayoutManager) {
            if (!this.f39923a && i == 0) {
                recyclerView.smoothScrollBy(((CarouselLayoutManager) layoutManager).m48695b(), 0);
                this.f39923a = true;
            }
            if (1 == i || 2 == i) {
                this.f39923a = false;
            }
            return;
        }
        this.f39923a = true;
    }
}
