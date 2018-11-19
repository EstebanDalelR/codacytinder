package com.tinder.toppicks.view;

import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH&J\u001c\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000eH&J\u001c\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u0003H&¨\u0006!"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsTarget;", "", "attachPaywallOverscrollListener", "", "clearRecs", "detachPaywallOverscrollListener", "displayTutorial", "hideLoadingMoreAndStopRefreshing", "insertHeader", "insertRecs", "position", "", "cards", "", "Lcom/tinder/cardstack/model/Card;", "postInsertRec", "card", "removeRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "showCardGrid", "showGenericError", "showLoadingMore", "showNoNetworkConnectionError", "showRefreshing", "showSuperLikeNetworkError", "showSuperLikePaywall", "rec", "Lcom/tinder/domain/recs/model/Rec;", "showTutorial", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksGridRecsTarget {
    void attachPaywallOverscrollListener();

    void clearRecs();

    void detachPaywallOverscrollListener();

    void displayTutorial();

    void hideLoadingMoreAndStopRefreshing();

    void insertHeader();

    void insertRecs(int i, @NotNull List<? extends C8395a<?>> list);

    void postInsertRec(int i, @NotNull C8395a<?> c8395a);

    void removeRec(int i, @Nullable C8361a c8361a);

    void reset(@NotNull ResetReason resetReason);

    void showCardGrid();

    void showGenericError();

    void showLoadingMore();

    void showNoNetworkConnectionError();

    void showRefreshing();

    void showSuperLikeNetworkError();

    void showSuperLikePaywall(@NotNull Rec rec);

    void showTutorial();
}
