package com.tinder.loops.engine.creation.p276c;

import android.media.MediaFormat;
import com.tinder.loops.engine.creation.p277d.C9782b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/engine/creation/factory/MediaFormatFactory;", "", "()V", "createMediaFormat", "Landroid/media/MediaFormat;", "videoMeta", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.c.a */
public final class C9777a {
    @NotNull
    /* renamed from: a */
    public final MediaFormat m40332a(@NotNull C9782b c9782b) {
        C2668g.b(c9782b, "videoMeta");
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(c9782b.m40344d(), c9782b.m40341a().m40389a(), c9782b.m40341a().m40390b());
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", c9782b.m40342b());
        createVideoFormat.setInteger("frame-rate", c9782b.m40343c());
        createVideoFormat.setInteger("i-frame-interval", c9782b.m40346f());
        C2668g.a(createVideoFormat, "MediaFormat.createVideoF…          )\n            }");
        C2668g.a(createVideoFormat, "videoMeta.let {\n        …)\n            }\n        }");
        return createVideoFormat;
    }
}
