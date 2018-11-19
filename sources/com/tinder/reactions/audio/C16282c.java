package com.tinder.reactions.audio;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/audio/MediaPlayerReactionsAudioStreamer;", "Lcom/tinder/reactions/audio/ReactionsAudioStreamer;", "()V", "mediaPlayer", "Landroid/media/MediaPlayer;", "play", "", "context", "Landroid/content/Context;", "audioFileResId", "", "onPlaybackCompleteAction", "Lkotlin/Function0;", "stop", "onStop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.audio.c */
public final class C16282c implements ReactionsAudioStreamer {
    /* renamed from: a */
    private MediaPlayer f50702a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/media/MediaPlayer;", "kotlin.jvm.PlatformType", "onCompletion"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.audio.c$a */
    static final class C14591a implements OnCompletionListener {
        /* renamed from: a */
        final /* synthetic */ C16282c f46044a;
        /* renamed from: b */
        final /* synthetic */ Function0 f46045b;

        C14591a(C16282c c16282c, Function0 function0) {
            this.f46044a = c16282c;
            this.f46045b = function0;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f46044a.stop(new MediaPlayerReactionsAudioStreamer$play$2$1(this));
        }
    }

    public void play(@NotNull Context context, int i, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(function0, "onPlaybackCompleteAction");
        stop(new MediaPlayerReactionsAudioStreamer$play$1(function0));
        this.f50702a = MediaPlayer.create(context, i);
        if (this.f50702a == null) {
            C0001a.e("Failed to create MediaPlayer for reactions", new Object[0]);
            return;
        }
        context = this.f50702a;
        if (context != null) {
            context.setOnCompletionListener((OnCompletionListener) new C14591a(this, function0));
        }
        context = this.f50702a;
        if (context != null) {
            context.setAudioStreamType(3);
        }
        context = this.f50702a;
        if (context != null) {
            context.start();
        }
    }

    public void stop(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "onStop");
        function0.invoke();
        function0 = this.f50702a;
        if (function0 != null) {
            function0.stop();
        }
        function0 = this.f50702a;
        if (function0 != null) {
            function0.reset();
        }
        function0 = this.f50702a;
        if (function0 != null) {
            function0.release();
        }
        this.f50702a = (MediaPlayer) null;
    }
}
