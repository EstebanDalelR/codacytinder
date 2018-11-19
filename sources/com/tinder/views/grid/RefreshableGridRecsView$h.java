package com.tinder.views.grid;

import com.tinder.cardstack.model.C8395a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class RefreshableGridRecsView$h implements Runnable {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f47876a;
    /* renamed from: b */
    final /* synthetic */ int f47877b;
    /* renamed from: c */
    final /* synthetic */ C8395a f47878c;

    RefreshableGridRecsView$h(RefreshableGridRecsView refreshableGridRecsView, int i, C8395a c8395a) {
        this.f47876a = refreshableGridRecsView;
        this.f47877b = i;
        this.f47878c = c8395a;
    }

    public final void run() {
        this.f47876a.getCardGridLayout$Tinder_release().a(this.f47877b + this.f47876a.getHeaderOffset$Tinder_release(), this.f47878c);
    }
}
