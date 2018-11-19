package com.tinder.loops.engine.extraction.p280b;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"VIDEO_MIME_PREFIX", "", "findFirstVideoTrack", "", "Landroid/media/MediaExtractor;", "getFindFirstVideoTrack", "(Landroid/media/MediaExtractor;)I", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.b.a */
public final class C9791a {
    /* renamed from: a */
    public static final int m40376a(@NotNull MediaExtractor mediaExtractor) {
        C2668g.b(mediaExtractor, "$receiver");
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            C2668g.a(string, "mime");
            if (C19303i.b(string, "video/", false, 2, null)) {
                mediaExtractor = new StringBuilder();
                mediaExtractor.append("Extractor selected track ");
                mediaExtractor.append(i);
                mediaExtractor.append(" (");
                mediaExtractor.append(string);
                mediaExtractor.append("): ");
                mediaExtractor.append(trackFormat);
                C0001a.b(mediaExtractor.toString(), new Object[0]);
                return i;
            }
        }
        return -1;
    }
}
