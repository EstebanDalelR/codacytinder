package com.tinder.loops.engine.creation.p274a;

import android.media.MediaCodec;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000b"}, d2 = {"SOFTWARE_CODEC", "", "isSoftwareCodec", "", "Landroid/media/MediaCodec;", "(Landroid/media/MediaCodec;)Z", "computePresentationTimeInNanoSec", "", "frameIndex", "", "framesPerSecond", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.a.a */
public final class C9775a {
    /* renamed from: a */
    public static final boolean m40330a(@NotNull MediaCodec mediaCodec) {
        C2668g.b(mediaCodec, "$receiver");
        mediaCodec = mediaCodec.getCodecInfo();
        C2668g.a(mediaCodec, "this.codecInfo");
        return C2668g.a(mediaCodec.getName(), "OMX.google.h264.encoder");
    }

    /* renamed from: a */
    public static final long m40329a(int i, int i2) {
        return TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.SECONDS) / ((long) i2);
    }
}
