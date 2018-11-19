package com.tinder.loops.engine.common.p272a;

import android.media.MediaCodec;
import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"getInputBufferExt", "Ljava/nio/ByteBuffer;", "Landroid/media/MediaCodec;", "index", "", "getOutputBufferExt", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.common.a.a */
public final class C9769a {
    @Nullable
    /* renamed from: a */
    public static final ByteBuffer m40312a(@NotNull MediaCodec mediaCodec, int i) {
        C2668g.b(mediaCodec, "$receiver");
        if (VERSION.SDK_INT >= 21) {
            return mediaCodec.getInputBuffer(i);
        }
        return mediaCodec.getInputBuffers()[i];
    }

    @Nullable
    /* renamed from: b */
    public static final ByteBuffer m40313b(@NotNull MediaCodec mediaCodec, int i) {
        C2668g.b(mediaCodec, "$receiver");
        if (VERSION.SDK_INT >= 21) {
            return mediaCodec.getOutputBuffer(i);
        }
        return mediaCodec.getOutputBuffers()[i];
    }
}
