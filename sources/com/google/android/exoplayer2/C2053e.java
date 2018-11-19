package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.trackselection.TrackSelector;

/* renamed from: com.google.android.exoplayer2.e */
public final class C2053e {
    @Deprecated
    /* renamed from: a */
    public static SimpleExoPlayer m7373a(Context context, TrackSelector trackSelector, LoadControl loadControl) {
        return C2053e.m7375a(new DefaultRenderersFactory(context), trackSelector, loadControl);
    }

    /* renamed from: a */
    public static SimpleExoPlayer m7372a(Context context, TrackSelector trackSelector) {
        return C2053e.m7374a(new DefaultRenderersFactory(context), trackSelector);
    }

    /* renamed from: a */
    public static SimpleExoPlayer m7374a(RenderersFactory renderersFactory, TrackSelector trackSelector) {
        return C2053e.m7375a(renderersFactory, trackSelector, new C3599d());
    }

    /* renamed from: a */
    public static SimpleExoPlayer m7375a(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl) {
        return new SimpleExoPlayer(renderersFactory, trackSelector, loadControl, null);
    }
}
