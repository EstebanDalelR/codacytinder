package com.tinder.loops.engine.creation.p276c;

import android.media.MediaMuxer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/loops/engine/creation/factory/MediaMuxerFactory;", "", "()V", "createMediaMuxer", "Landroid/media/MediaMuxer;", "outputFilePath", "", "outputFormat", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.c.c */
public final class C9778c {
    @NotNull
    /* renamed from: a */
    public final MediaMuxer m40333a(@NotNull String str, int i) {
        C2668g.b(str, "outputFilePath");
        return new MediaMuxer(str, i);
    }
}
