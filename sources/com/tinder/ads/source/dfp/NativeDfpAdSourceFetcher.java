package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.C2340b.C2339a;
import com.google.android.gms.ads.C2414k.C2413a;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.formats.NativeAdOptions.C2350a;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.AdSourceFetcher;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Single;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/ads/source/dfp/NativeDfpAdSourceFetcher;", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "nativeDfpSource", "adLoaderBuilder", "Lcom/google/android/gms/ads/AdLoader$Builder;", "publisherAdRequest", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "templateId", "", "adFactory", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/AdLoader$Builder;Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;Ljava/lang/String;Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;)V", "cancel", "", "loadNext", "Lrx/Single;", "scheduler", "Lrx/Scheduler;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class NativeDfpAdSourceFetcher implements AdSourceFetcher<NativeDfpAd, NativeCustomTemplateAd, NativeDfpSource> {
    private final NativeDfpAdFactory adFactory;
    private final C2339a adLoaderBuilder;
    private final NativeDfpSource nativeDfpSource;
    private final C2345a publisherAdRequest;
    private final String templateId;

    public void cancel() {
    }

    public NativeDfpAdSourceFetcher(@NotNull NativeDfpSource nativeDfpSource, @NotNull C2339a c2339a, @NotNull C2345a c2345a, @NotNull String str, @NotNull NativeDfpAdFactory nativeDfpAdFactory) {
        C2668g.b(nativeDfpSource, "nativeDfpSource");
        C2668g.b(c2339a, "adLoaderBuilder");
        C2668g.b(c2345a, "publisherAdRequest");
        C2668g.b(str, "templateId");
        C2668g.b(nativeDfpAdFactory, "adFactory");
        this.nativeDfpSource = nativeDfpSource;
        this.adLoaderBuilder = c2339a;
        this.publisherAdRequest = c2345a;
        this.templateId = str;
        this.adFactory = nativeDfpAdFactory;
    }

    @NotNull
    public Single<NativeDfpAd> loadNext() {
        Single<NativeDfpAd> a = Single.a(new NativeDfpAdSourceFetcher$loadNext$1(this, new C2350a().a(new C2413a().b(true).a(true).a()).a()));
        C2668g.a(a, "Single.fromEmitter<Nativ…isherAdRequest)\n        }");
        return a;
    }

    @NotNull
    public C2671a scheduler() {
        C2671a a = C19397a.a();
        C2668g.a(a, "AndroidSchedulers.mainThread()");
        return a;
    }
}
