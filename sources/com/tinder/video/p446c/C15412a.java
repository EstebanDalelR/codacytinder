package com.tinder.video.p446c;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.C2053e;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.C3675b;
import com.google.android.exoplayer2.source.C4374i;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/video/provider/ExoPlayerProvider;", "", "cacheDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "extractorFactory", "Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;", "trackSelector", "Lcom/google/android/exoplayer2/trackselection/TrackSelector;", "applicationContext", "Landroid/content/Context;", "(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;Lcom/google/android/exoplayer2/trackselection/TrackSelector;Landroid/content/Context;)V", "createPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "preparePlayer", "", "simpleExoPlayer", "videoUrl", "", "loopVideo", "", "video_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.video.c.a */
public final class C15412a {
    /* renamed from: a */
    private final Factory f47695a;
    /* renamed from: b */
    private final ExtractorsFactory f47696b;
    /* renamed from: c */
    private final TrackSelector f47697c;
    /* renamed from: d */
    private final Context f47698d;

    @Inject
    public C15412a(@NotNull Factory factory, @NotNull ExtractorsFactory extractorsFactory, @NotNull TrackSelector trackSelector, @NotNull @ForApplication Context context) {
        C2668g.b(factory, "cacheDataSourceFactory");
        C2668g.b(extractorsFactory, "extractorFactory");
        C2668g.b(trackSelector, "trackSelector");
        C2668g.b(context, "applicationContext");
        this.f47695a = factory;
        this.f47696b = extractorsFactory;
        this.f47697c = trackSelector;
        this.f47698d = context;
    }

    @NotNull
    /* renamed from: a */
    public final SimpleExoPlayer m57789a() {
        SimpleExoPlayer a = C2053e.a(this.f47698d, this.f47697c);
        C2668g.a(a, "ExoPlayerFactory.newSimp…onContext, trackSelector)");
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ void m57788a(C15412a c15412a, SimpleExoPlayer simpleExoPlayer, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c15412a.m57790a(simpleExoPlayer, str, z);
    }

    /* renamed from: a */
    public final void m57790a(@NotNull SimpleExoPlayer simpleExoPlayer, @NotNull String str, boolean z) {
        C2668g.b(simpleExoPlayer, "simpleExoPlayer");
        C2668g.b(str, "videoUrl");
        ExtractorMediaSource extractorMediaSource = new ExtractorMediaSource(Uri.parse(str), this.f47695a, this.f47696b, null, null);
        if (z) {
            str = (C3675b) new C4374i(extractorMediaSource);
        } else {
            str = extractorMediaSource;
        }
        simpleExoPlayer.prepare((MediaSource) str);
    }
}
