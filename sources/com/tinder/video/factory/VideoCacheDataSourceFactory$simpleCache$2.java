package com.tinder.video.factory;

import android.content.Context;
import com.google.android.exoplayer2.upstream.cache.C3719i;
import com.google.android.exoplayer2.upstream.cache.C4267h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "invoke"}, k = 3, mv = {1, 1, 10})
final class VideoCacheDataSourceFactory$simpleCache$2 extends Lambda implements Function0<C3719i> {
    /* renamed from: a */
    final /* synthetic */ Context f58759a;

    VideoCacheDataSourceFactory$simpleCache$2(Context context) {
        this.f58759a = context;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67528a();
    }

    @NotNull
    /* renamed from: a */
    public final C3719i m67528a() {
        return new C3719i(new File(this.f58759a.getCacheDir(), "tinder-exo-player-cache"), new C4267h(52428800));
    }
}
