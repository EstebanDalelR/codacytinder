package com.tinder.recsads;

import com.tinder.addy.Ad;
import com.tinder.addy.tracker.TrackingUrl;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.addy.tracker.TrackingUrlParser;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/NativeDfpVideoAndDisplayTrackingUrlParser;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "()V", "parseTrackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "ad", "Lcom/tinder/addy/Ad;", "trackedEventTypes", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.j */
public final class C16460j implements TrackingUrlParser {
    @NotNull
    public List<EventType> trackedEventTypes() {
        return C17554o.m64199b((Object[]) new EventType[]{RecsAdTrackingEvent.CLICK, RecsAdTrackingEvent.IMPRESSION, RecsAdTrackingEvent.SWIPE});
    }

    @NotNull
    public List<TrackingUrl> parseTrackingUrls(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        C16468f c16468f = (C16468f) ad;
        List<TrackingUrl> arrayList = new ArrayList();
        for (EventType eventType : trackedEventTypes()) {
            List availableAssetNames = c16468f.getNativeCustomTemplateAd().getAvailableAssetNames();
            C2668g.a(availableAssetNames, "nativeDfpAd.nativeCustom…ateAd.availableAssetNames");
            Collection arrayList2 = new ArrayList();
            for (Object next : availableAssetNames) {
                String str = (String) next;
                C2668g.a(str, "it");
                if (C19296q.m68680c(str, eventType.token(), false, 2, null)) {
                    arrayList2.add(next);
                }
            }
            Collection arrayList3 = new ArrayList();
            for (Object next2 : (List) arrayList2) {
                CharSequence text = c16468f.getNativeCustomTemplateAd().getText((String) next2);
                C2668g.a(text, "nativeDfpAd.nativeCustomTemplateAd.getText(it)");
                if ((text.length() > 0 ? 1 : null) != null) {
                    arrayList3.add(next2);
                }
            }
            Iterable<String> iterable = (List) arrayList3;
            arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (String str2 : iterable) {
                str = c16468f.getLineItemId();
                C2668g.a(str2, "it");
                arrayList2.add(new TrackingUrl(str, str2, c16468f.getNativeCustomTemplateAd().getText(str2).toString(), eventType));
            }
            for (TrackingUrl add : (List) arrayList2) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }
}
