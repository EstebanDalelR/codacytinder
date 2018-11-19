package com.tinder.toppicks.view;

import com.tinder.cardstack.view.CardGridLayout.OnScrollProgressListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/toppicks/view/TopPicksGridRecsView$1", "Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "(Lcom/tinder/toppicks/view/TopPicksGridRecsView;)V", "onScrolled", "", "progress", "", "velocity", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksGridRecsView$1 implements OnScrollProgressListener {
    /* renamed from: a */
    final /* synthetic */ TopPicksGridRecsView f52661a;

    TopPicksGridRecsView$1(TopPicksGridRecsView topPicksGridRecsView) {
        this.f52661a = topPicksGridRecsView;
    }

    public void onScrolled(float f, float f2) {
        this.f52661a.getPresenter$Tinder_release().m62935a(f, f2);
    }
}
