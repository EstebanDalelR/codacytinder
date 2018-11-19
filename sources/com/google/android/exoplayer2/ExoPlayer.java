package com.google.android.exoplayer2;

import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.source.MediaSource;

public interface ExoPlayer extends Player {

    @Deprecated
    /* renamed from: com.google.android.exoplayer2.ExoPlayer$a */
    public static final class C2006a {
        /* renamed from: a */
        public final Target f5451a;
        /* renamed from: b */
        public final int f5452b;
        /* renamed from: c */
        public final Object f5453c;
    }

    @Deprecated
    public interface EventListener extends com.google.android.exoplayer2.Player.EventListener {
    }

    @Deprecated
    public interface ExoPlayerComponent extends Target {
    }

    @Deprecated
    void blockingSendMessages(C2006a... c2006aArr);

    PlayerMessage createMessage(Target target);

    Looper getPlaybackLooper();

    void prepare(MediaSource mediaSource);

    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Deprecated
    void sendMessages(C2006a... c2006aArr);

    void setSeekParameters(@Nullable C2162p c2162p);
}
