package com.tinder.ads;

import com.tinder.api.module.OkHttpQualifiers$Public;
import com.tinder.data.ads.TrackingUrlNotifier;
import com.tinder.domain.common.TrackingUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/ads/TrackingUrlNotifierClient;", "Lcom/tinder/data/ads/TrackingUrlNotifier;", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "notifyTrackingUrl", "Lrx/Completable;", "trackingUrl", "Lcom/tinder/domain/common/TrackingUrl;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TrackingUrlNotifierClient implements TrackingUrlNotifier {
    private final C17692o okHttpClient;

    public TrackingUrlNotifierClient(@NotNull @OkHttpQualifiers$Public C17692o c17692o) {
        C2668g.b(c17692o, "okHttpClient");
        this.okHttpClient = c17692o;
    }

    @NotNull
    public Completable notifyTrackingUrl(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "trackingUrl");
        trackingUrl = Completable.a(new TrackingUrlNotifierClient$notifyTrackingUrl$1(this, trackingUrl));
        C2668g.a(trackingUrl, "Completable.fromAction {…        }\n        }\n    }");
        return trackingUrl;
    }
}
