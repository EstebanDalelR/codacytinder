package com.tinder.fastmatch.target;

import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.domain.recs.model.Rec;
import com.tinder.views.grid.p450b.C15455a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH&J\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\u001c\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/tinder/fastmatch/target/FastMatchRecsGridTarget;", "", "animateLike", "", "clearRecs", "hideLoadingMoreAndStopRefreshing", "insertRecs", "position", "", "cards", "", "Lcom/tinder/cardstack/model/Card;", "postInsertRec", "card", "removeRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "showCardGrid", "showEmptyList", "showLoadingMore", "showNoNetworkConnectionError", "showNotification", "viewModel", "Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "showRefreshing", "showSuperLikePaywall", "rec", "Lcom/tinder/domain/recs/model/Rec;", "showTutorial", "smoothScrollToTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FastMatchRecsGridTarget {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.target.FastMatchRecsGridTarget$a */
    public static final class C9405a {
        /* renamed from: a */
        public static /* synthetic */ void m39354a(FastMatchRecsGridTarget fastMatchRecsGridTarget, int i, C8361a c8361a, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeRec");
            }
            if ((i2 & 2) != 0) {
                c8361a = null;
            }
            fastMatchRecsGridTarget.removeRec(i, c8361a);
        }
    }

    void animateLike();

    void clearRecs();

    void hideLoadingMoreAndStopRefreshing();

    void insertRecs(int i, @NotNull List<? extends C8395a<?>> list);

    void postInsertRec(int i, @NotNull C8395a<?> c8395a);

    void removeRec(int i, @Nullable C8361a c8361a);

    void showCardGrid();

    void showEmptyList();

    void showLoadingMore();

    void showNoNetworkConnectionError();

    void showNotification(@NotNull C15455a c15455a);

    void showRefreshing();

    void showSuperLikePaywall(@NotNull Rec rec);

    void showTutorial();

    void smoothScrollToTop();
}
