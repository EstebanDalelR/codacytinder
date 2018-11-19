package com.tinder.views.grid;

import com.tinder.view.grid.ParallaxFrameLayout;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/views/grid/RefreshableGridRecsView$ParallaxFrameLayoutManager;", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "(Lcom/tinder/views/grid/RefreshableGridRecsView;)V", "tempChildLocation", "", "tempParentLocation", "getContainerHeight", "", "getYOffsetInContainer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RefreshableGridRecsView$d extends C15421a {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f52916a;
    /* renamed from: b */
    private final int[] f52917b = new int[2];
    /* renamed from: c */
    private final int[] f52918c = new int[2];

    public RefreshableGridRecsView$d(RefreshableGridRecsView refreshableGridRecsView) {
        this.f52916a = refreshableGridRecsView;
    }

    /* renamed from: a */
    public int mo12672a() {
        ParallaxFrameLayout c = m57811c();
        if (c == null) {
            return 0;
        }
        this.f52916a.getLocationInWindow(this.f52917b);
        c.getLocationInWindow(this.f52918c);
        return this.f52918c[1] - this.f52917b[1];
    }

    /* renamed from: b */
    public int mo12673b() {
        return this.f52916a.getHeight();
    }
}
