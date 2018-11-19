package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.af;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdRequestReceiveEvent;", "Lcom/tinder/recsads/analytics/AddAdEvent;", "Lcom/tinder/recsads/analytics/AddAdRequestReceiveEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "commonFieldsFactory", "Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recsads/analytics/AdEventFields$Factory;)V", "getCommonFieldsFactory", "()Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "commonFields", "Lcom/tinder/recsads/analytics/AdEventFields;", "Request", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.analytics.l */
public final class C16435l extends C14737g<C14740a> {
    @NotNull
    /* renamed from: a */
    private final C2630h f51000a;
    @NotNull
    /* renamed from: b */
    private final C14729c f51001b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdRequestReceiveEvent$Request;", "", "()V", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.l$a */
    public static final class C14740a {
    }

    @Inject
    public C16435l(@NotNull C2630h c2630h, @NotNull C14729c c14729c) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14729c, "commonFieldsFactory");
        super(c2630h, c14729c);
        this.f51000a = c2630h;
        this.f51001b = c14729c;
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent m61825a(@NotNull C14740a c14740a, @NotNull AdEventFields adEventFields) {
        C2668g.b(c14740a, "request");
        C2668g.b(adEventFields, "commonFields");
        c14740a = af.a().a(adEventFields.mo12162a()).b(adEventFields.mo12164c()).c(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).a();
        C2668g.a(c14740a, "AdRequestReceiveEvent.bu…y())\n            .build()");
        return (EtlEvent) c14740a;
    }
}
