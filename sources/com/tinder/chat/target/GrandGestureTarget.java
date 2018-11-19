package com.tinder.chat.target;

import com.tinder.reactions.audio.C14589a.C14588a;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/target/GrandGestureTarget;", "", "collapseDrawer", "", "playAudio", "audioConfig", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "playReaction", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "scrollToLatestMessage", "setGrandGestures", "navigationItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface GrandGestureTarget {
    void collapseDrawer();

    void playAudio(@NotNull C14588a c14588a);

    void playReaction(@NotNull C14676f c14676f);

    void scrollToLatestMessage();

    void setGrandGestures(@NotNull Set<GrandGestureNavigationItem> set);
}
