package com.tinder.recsads;

import com.tinder.addy.Ad;
import com.tinder.addy.tracker.TrackingUrl;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.addy.tracker.TrackingUrlParser;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016¨\u0006\u0015"}, d2 = {"Lcom/tinder/recsads/BrandedProfileCardTrackingUrlParser;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "()V", "createTrackingUrls", "", "brandedAd", "Lcom/tinder/recsads/model/V2BrandedProfileCardAd;", "event", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "predicate", "Lkotlin/Function1;", "", "", "onTrackingUrlCreated", "Lcom/tinder/addy/tracker/TrackingUrl;", "getPredicate", "parseTrackingUrls", "", "ad", "Lcom/tinder/addy/Ad;", "trackedEventTypes", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.d */
public final class C16457d implements TrackingUrlParser {
    @NotNull
    public List<EventType> trackedEventTypes() {
        return C17554o.m64199b((Object[]) new EventType[]{MessageAdTrackingEvent.CLICK, MessageAdTrackingEvent.SECONDARY_IMPRESSION, MessageAdTrackingEvent.OPEN, MessageAdTrackingEvent.PROFILE, RecsAdTrackingEvent.IMPRESSION, RecsAdTrackingEvent.SWIPE});
    }

    @NotNull
    public List<TrackingUrl> parseTrackingUrls(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        C16469h c16469h = (C16469h) ad;
        List arrayList = new ArrayList();
        for (EventType eventType : trackedEventTypes()) {
            m61873a(c16469h, eventType, m61872a(eventType), new C18775xcee73e95(this, c16469h, arrayList));
        }
        return C19299w.m68840l(arrayList);
    }

    /* renamed from: a */
    private final void m61873a(C16469h c16469h, EventType eventType, Function1<? super String, Boolean> function1, Function1<? super TrackingUrl, C15813i> function12) {
        List availableAssetNames = c16469h.m61880a().getAvailableAssetNames();
        C2668g.a(availableAssetNames, "brandedAd.nativeCustomTe…ateAd.availableAssetNames");
        Collection arrayList = new ArrayList();
        for (Object next : availableAssetNames) {
            String str = (String) next;
            C2668g.a(str, "it");
            if (((Boolean) function1.invoke(str)).booleanValue()) {
                arrayList.add(next);
            }
        }
        Collection collection = (Collection) new ArrayList();
        for (Object next2 : (List) arrayList) {
            str = (String) next2;
            C2668g.a(str, "it");
            if (C19298r.m68786b((CharSequence) str, (CharSequence) eventType.token(), false, 2, null)) {
                collection.add(next2);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Object next22 : (List) collection) {
            CharSequence text = c16469h.m61880a().getText((String) next22);
            C2668g.a(text, "brandedAd.nativeCustomTemplateAd.getText(it)");
            if ((text.length() > 0 ? 1 : null) != null) {
                arrayList2.add(next22);
            }
        }
        Iterable<String> iterable = (List) arrayList2;
        collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (String str2 : iterable) {
            str = c16469h.m61888i();
            C2668g.a(str2, "it");
            collection.add(new TrackingUrl(str, str2, c16469h.m61880a().getText(str2).toString(), eventType));
        }
        for (TrackingUrl invoke : (List) collection) {
            function12.invoke(invoke);
        }
    }

    /* renamed from: a */
    private final Function1<String, Boolean> m61872a(EventType eventType) {
        if (eventType == MessageAdTrackingEvent.SECONDARY_IMPRESSION) {
            return new BrandedProfileCardTrackingUrlParser$getPredicate$1(eventType);
        }
        return new BrandedProfileCardTrackingUrlParser$getPredicate$2(eventType);
    }
}
