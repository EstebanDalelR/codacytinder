package com.tinder.views.grid;

import android.view.ViewTreeObserver.OnPreDrawListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tinder/views/grid/RefreshableGridRecsView$OnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lcom/tinder/views/grid/RefreshableGridRecsView;)V", "onPreDraw", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class RefreshableGridRecsView$c implements OnPreDrawListener {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f47873a;

    public RefreshableGridRecsView$c(RefreshableGridRecsView refreshableGridRecsView) {
        this.f47873a = refreshableGridRecsView;
    }

    public boolean onPreDraw() {
        RefreshableGridRecsView.a(this.f47873a);
        return true;
    }
}
