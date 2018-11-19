package com.tinder.video.injection.p448a;

import android.content.Context;
import com.google.android.exoplayer2.extractor.C3622c;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.trackselection.C4261a.C3712a;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.C3722e;
import com.google.android.exoplayer2.upstream.DataSource;
import com.tinder.module.ForApplication;
import com.tinder.video.factory.C17249a;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/video/injection/module/VideoModule;", "", "()V", "provideBandwidthMeter", "Lcom/google/android/exoplayer2/upstream/BandwidthMeter;", "provideDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "applicationContext", "Landroid/content/Context;", "provideExtractorsFactory", "Lcom/google/android/exoplayer2/extractor/ExtractorsFactory;", "provideTrackSelectionFactory", "Lcom/google/android/exoplayer2/trackselection/TrackSelection$Factory;", "bandwidthMeter", "provideTrackSelector", "Lcom/google/android/exoplayer2/trackselection/TrackSelector;", "trackSelectionFactory", "video_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.video.injection.a.a */
public final class C15414a {
    @NotNull
    @Provides
    /* renamed from: a */
    public final BandwidthMeter m57796a() {
        return new C3722e();
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final Factory m57794a(@NotNull BandwidthMeter bandwidthMeter) {
        C2668g.b(bandwidthMeter, "bandwidthMeter");
        return new C3712a(bandwidthMeter);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final TrackSelector m57795a(@NotNull Factory factory) {
        C2668g.b(factory, "trackSelectionFactory");
        return new DefaultTrackSelector(factory);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final ExtractorsFactory m57798b() {
        return new C3622c();
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final DataSource.Factory m57797a(@NotNull @ForApplication Context context) {
        C2668g.b(context, "applicationContext");
        return new C17249a(context);
    }
}
