package com.tinder.sponsoredmessage.p414a;

import com.tinder.ads.analytics.AdEventFields;
import com.tinder.ads.analytics.AdEventFields.From;
import com.tinder.ads.analytics.AdEventFields.Provider;
import com.tinder.ads.analytics.AdEventFields.Type;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.etl.event.EtlEvent;
import com.tinder.utils.RxUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H$J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/sponsoredmessage/analytics/AddAdChatEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createAdEventFields", "Lcom/tinder/ads/analytics/AdEventFields;", "messageAdMatch", "Lcom/tinder/domain/match/model/MessageAdMatch;", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "commonFields", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.a.c */
public abstract class C15031c {
    /* renamed from: a */
    private final C2630h f46807a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.a.c$a */
    static final class C18903a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C15031c f58545a;
        /* renamed from: b */
        final /* synthetic */ MessageAdMatch f58546b;

        C18903a(C15031c c15031c, MessageAdMatch messageAdMatch) {
            this.f58545a = c15031c;
            this.f58546b = messageAdMatch;
        }

        public final void call() {
            this.f58545a.f46807a.a(this.f58545a.mo12405a(this.f58545a.m56642b(this.f58546b)));
        }
    }

    @NotNull
    /* renamed from: a */
    protected abstract EtlEvent mo12405a(@NotNull AdEventFields adEventFields);

    public C15031c(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f46807a = c2630h;
    }

    /* renamed from: a */
    public final void m56641a(@NotNull MessageAdMatch messageAdMatch) {
        C2668g.b(messageAdMatch, "messageAdMatch");
        Completable.a(new C18903a(this, messageAdMatch)).b(RxUtils.b());
    }

    @NotNull
    /* renamed from: b */
    public final AdEventFields m56642b(@NotNull MessageAdMatch messageAdMatch) {
        C2668g.b(messageAdMatch, "messageAdMatch");
        return AdEventFields.Companion.builder().creativeId(messageAdMatch.getTemplateId()).type(Type.MESSAGE).provider(Provider.DIRECT_SALE).from(From.POST_MATCH).build();
    }
}
