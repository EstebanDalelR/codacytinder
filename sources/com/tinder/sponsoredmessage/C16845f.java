package com.tinder.sponsoredmessage;

import com.tinder.addy.Ad;
import com.tinder.addy.tracker.TrackingUrl;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.addy.tracker.TrackingUrlParser;
import com.tinder.messageads.model.C12131a;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageTrackingUrlParser;", "Lcom/tinder/addy/tracker/TrackingUrlParser;", "()V", "parseTrackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "ad", "Lcom/tinder/addy/Ad;", "trackedEventTypes", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.f */
public final class C16845f implements TrackingUrlParser {
    @NotNull
    public List<EventType> trackedEventTypes() {
        return C17554o.m64199b((Object[]) new MessageAdTrackingEvent[]{MessageAdTrackingEvent.CLICK, MessageAdTrackingEvent.IMPRESSION, MessageAdTrackingEvent.OPEN});
    }

    @NotNull
    public List<TrackingUrl> parseTrackingUrls(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        List<TrackingUrl> arrayList = new ArrayList();
        C12131a c12131a = (C12131a) ad;
        for (EventType eventType : trackedEventTypes()) {
            List availableAssetNames = c12131a.a().getAvailableAssetNames();
            C2668g.a(availableAssetNames, "messageAd.customTemplateAd.availableAssetNames");
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
                CharSequence text = c12131a.a().getText((String) next2);
                C2668g.a(text, "messageAd.customTemplateAd.getText(it)");
                if ((text.length() > 0 ? 1 : null) != null) {
                    arrayList3.add(next2);
                }
            }
            Iterable<String> iterable = (List) arrayList3;
            arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (String str2 : iterable) {
                str = c12131a.d();
                C2668g.a(str2, "it");
                arrayList2.add(new TrackingUrl(str, str2, c12131a.a().getText(str2).toString(), eventType));
            }
            for (TrackingUrl add : (List) arrayList2) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }
}
