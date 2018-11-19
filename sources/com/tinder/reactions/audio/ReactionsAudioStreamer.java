package com.tinder.reactions.audio;

import android.content.Context;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/audio/ReactionsAudioStreamer;", "", "play", "", "context", "Landroid/content/Context;", "audioFileResId", "", "onPlaybackCompleteAction", "Lkotlin/Function0;", "stop", "onStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ReactionsAudioStreamer {
    void play(@NotNull Context context, int i, @NotNull Function0<C15813i> function0);

    void stop(@NotNull Function0<C15813i> function0);
}
