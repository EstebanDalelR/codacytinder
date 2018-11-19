package com.tinder.reactions.common.mediator;

import com.tinder.reactions.gestures.common.GestureEvent;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/tinder/reactions/common/mediator/GrandGestureInterface;", "", "collapseDrawer", "", "expandDrawer", "getGestureEventObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "getReactionEventObservable", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "playReaction", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "setGrandGestures", "grandGestureItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface GrandGestureInterface {
    void collapseDrawer();

    void expandDrawer();

    @NotNull
    Observable<GestureEvent> getGestureEventObservable();

    @NotNull
    Observable<ReactionEvent> getReactionEventObservable();

    void playReaction(@NotNull C14676f c14676f);

    void setGrandGestures(@NotNull Set<GrandGestureNavigationItem> set);
}
