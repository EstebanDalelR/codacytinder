package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.b */
public abstract class C3695b implements FilterableManifest<C3695b, RenditionKey> {
    /* renamed from: o */
    public final String f11532o;
    /* renamed from: p */
    public final List<String> f11533p;

    protected C3695b(String str, List<String> list) {
        this.f11532o = str;
        this.f11533p = Collections.unmodifiableList(list);
    }
}
