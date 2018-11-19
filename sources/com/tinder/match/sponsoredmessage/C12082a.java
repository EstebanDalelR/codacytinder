package com.tinder.match.sponsoredmessage;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.NativeDfpTrackingUrlParser;
import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/match/sponsoredmessage/InsertSponsoredMessagesTrackingUrls;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/match/sponsoredmessage/InsertSponsoredMessagesTrackingUrls$Request;", "trackingUrlRepository", "Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "trackingUrlParser", "Lcom/tinder/ads/NativeDfpTrackingUrlParser;", "(Lcom/tinder/domain/match/repository/TrackingUrlRepository;Lcom/tinder/ads/NativeDfpTrackingUrlParser;)V", "execute", "Lrx/Completable;", "request", "parseUrlsForEvents", "", "Lcom/tinder/domain/common/TrackingUrl;", "customTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "events", "", "Lcom/tinder/domain/common/TrackingUrl$Event;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.sponsoredmessage.a */
public final class C12082a implements CompletableUseCase<C9881a> {
    /* renamed from: a */
    private final TrackingUrlRepository f39231a;
    /* renamed from: b */
    private final NativeDfpTrackingUrlParser f39232b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/match/sponsoredmessage/InsertSponsoredMessagesTrackingUrls$Request;", "", "nativeAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "expectedEvents", "", "Lcom/tinder/domain/common/TrackingUrl$Event;", "(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Ljava/util/Set;)V", "getExpectedEvents", "()Ljava/util/Set;", "getNativeAd", "()Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.a$a */
    public static final class C9881a {
        @NotNull
        /* renamed from: a */
        private final NativeCustomTemplateAd f32722a;
        @NotNull
        /* renamed from: b */
        private final Set<Event> f32723b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9881a) {
                    C9881a c9881a = (C9881a) obj;
                    if (C2668g.a(this.f32722a, c9881a.f32722a) && C2668g.a(this.f32723b, c9881a.f32723b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            NativeCustomTemplateAd nativeCustomTemplateAd = this.f32722a;
            int i = 0;
            int hashCode = (nativeCustomTemplateAd != null ? nativeCustomTemplateAd.hashCode() : 0) * 31;
            Set set = this.f32723b;
            if (set != null) {
                i = set.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(nativeAd=");
            stringBuilder.append(this.f32722a);
            stringBuilder.append(", expectedEvents=");
            stringBuilder.append(this.f32723b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9881a(@NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull Set<? extends Event> set) {
            C2668g.b(nativeCustomTemplateAd, "nativeAd");
            C2668g.b(set, "expectedEvents");
            this.f32722a = nativeCustomTemplateAd;
            this.f32723b = set;
        }

        @NotNull
        /* renamed from: a */
        public final NativeCustomTemplateAd m40656a() {
            return this.f32722a;
        }

        @NotNull
        /* renamed from: b */
        public final Set<Event> m40657b() {
            return this.f32723b;
        }
    }

    @Inject
    public C12082a(@NotNull TrackingUrlRepository trackingUrlRepository, @NotNull NativeDfpTrackingUrlParser nativeDfpTrackingUrlParser) {
        C2668g.b(trackingUrlRepository, "trackingUrlRepository");
        C2668g.b(nativeDfpTrackingUrlParser, "trackingUrlParser");
        this.f39231a = trackingUrlRepository;
        this.f39232b = nativeDfpTrackingUrlParser;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m48187a((C9881a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m48187a(@NotNull C9881a c9881a) {
        C2668g.b(c9881a, "request");
        NativeCustomTemplateAd a = c9881a.m40656a();
        c9881a = m48186a(a, c9881a.m40657b());
        String customTemplateId = a.getCustomTemplateId();
        TrackingUrlRepository trackingUrlRepository = this.f39231a;
        C2668g.a(customTemplateId, "customTemplateId");
        return trackingUrlRepository.insert(customTemplateId, c9881a);
    }

    /* renamed from: a */
    private final List<TrackingUrl> m48186a(NativeCustomTemplateAd nativeCustomTemplateAd, Set<? extends Event> set) {
        List<TrackingUrl> arrayList = new ArrayList();
        for (Event parseTrackingUrls : set) {
            arrayList.addAll(this.f39232b.parseTrackingUrls(parseTrackingUrls, nativeCustomTemplateAd));
        }
        return arrayList;
    }
}
