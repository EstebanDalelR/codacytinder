package com.tinder.toppicks.view;

import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import com.tinder.cardstack.cardgrid.view.CardGridViewHolderAdapter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsView$SpanSizeLookup;", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "(Lcom/tinder/toppicks/view/TopPicksGridRecsView;)V", "adapter", "Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter;", "getAdapter", "()Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter;", "getSpanSize", "", "position", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class TopPicksGridRecsView$b extends SpanSizeLookup {
    /* renamed from: a */
    final /* synthetic */ TopPicksGridRecsView f52664a;
    @NotNull
    /* renamed from: b */
    private final CardGridViewHolderAdapter f52665b;

    public TopPicksGridRecsView$b(TopPicksGridRecsView topPicksGridRecsView) {
        this.f52664a = topPicksGridRecsView;
        topPicksGridRecsView = topPicksGridRecsView.getCardGridLayout$Tinder_release().getAdapter();
        if (topPicksGridRecsView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.cardstack.cardgrid.view.CardGridViewHolderAdapter");
        }
        this.f52665b = (CardGridViewHolderAdapter) topPicksGridRecsView;
    }

    public int getSpanSize(int i) {
        if (i == 0) {
            return 2;
        }
        return i == this.f52665b.c() ? 2 : 1;
    }
}
