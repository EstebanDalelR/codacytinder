package com.tinder.sponsoredmessage.p414a;

import com.tinder.ads.analytics.AdEventFields;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11467s;
import com.tinder.etl.event.EtlEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/tinder/sponsoredmessage/analytics/AddAdChatCloseEvent;", "Lcom/tinder/sponsoredmessage/analytics/AddAdChatEvent;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "commonFields", "Lcom/tinder/ads/analytics/AdEventFields;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.a.b */
public final class C16826b extends C15031c {
    @Inject
    public C16826b(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        super(c2630h);
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent mo12405a(@NotNull AdEventFields adEventFields) {
        C2668g.b(adEventFields, "commonFields");
        adEventFields = C11467s.a().a(adEventFields.campaignId()).b(adEventFields.creativeId()).a(adEventFields.from().key()).b(adEventFields.provider().key()).c(Integer.valueOf(adEventFields.type().key())).a();
        C2668g.a(adEventFields, "AdChatCloseEvent.builder…                 .build()");
        return (EtlEvent) adEventFields;
    }
}
