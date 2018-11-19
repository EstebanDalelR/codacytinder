package com.tinder.reactions.gestures.target;

import com.tinder.reactions.audio.C14589a.C14588a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/gestures/target/GrandGestureSelectorTarget;", "", "addAnimationViewAt", "", "animationFile", "", "position", "", "playAudio", "audioConfig", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "setCurrentAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface GrandGestureSelectorTarget {
    void addAnimationViewAt(@NotNull String str, int i);

    void playAudio(@NotNull C14588a c14588a);

    void setCurrentAnimation(int i);
}
