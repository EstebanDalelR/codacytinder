package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11567y;
import com.tinder.etl.event.EtlEvent;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdDismissEvent;", "Lcom/tinder/recsads/analytics/AddAdEvent;", "Lcom/tinder/recsads/analytics/AddAdDismissEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "commonFieldsFactory", "Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recsads/analytics/AdEventFields$Factory;)V", "getCommonFieldsFactory", "()Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "commonFields", "Lcom/tinder/recsads/analytics/AdEventFields;", "Request", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.analytics.f */
public final class C16433f extends C14737g<C14736a> {
    @NotNull
    /* renamed from: a */
    private final C2630h f50998a;
    @NotNull
    /* renamed from: b */
    private final C14729c f50999b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdDismissEvent$Request;", "", "timeViewed", "", "(Ljava/lang/Long;)V", "getTimeViewed", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/tinder/recsads/analytics/AddAdDismissEvent$Request;", "equals", "", "other", "hashCode", "", "toString", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.f$a */
    public static final class C14736a {
        @Nullable
        /* renamed from: a */
        private final Long f46312a;

        public C14736a() {
            this(null, 1, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14736a) {
                    if (C2668g.a(this.f46312a, ((C14736a) obj).f46312a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Long l = this.f46312a;
            return l != null ? l.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(timeViewed=");
            stringBuilder.append(this.f46312a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14736a(@Nullable Long l) {
            this.f46312a = l;
        }

        public /* synthetic */ C14736a(Long l, int i, C15823e c15823e) {
            if ((i & 1) != 0) {
                l = null;
            }
            this(l);
        }

        @Nullable
        /* renamed from: a */
        public final Long m56000a() {
            return this.f46312a;
        }
    }

    @Inject
    public C16433f(@NotNull C2630h c2630h, @NotNull C14729c c14729c) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14729c, "commonFieldsFactory");
        super(c2630h, c14729c);
        this.f50998a = c2630h;
        this.f50999b = c14729c;
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent m61821a(@NotNull C14736a c14736a, @NotNull AdEventFields adEventFields) {
        C2668g.b(c14736a, "request");
        C2668g.b(adEventFields, "commonFields");
        adEventFields = C11567y.a().a(adEventFields.mo12162a()).b(adEventFields.mo12167f().key()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).a(adEventFields.mo12163b()).a(adEventFields.mo12168g());
        c14736a = c14736a.m56000a();
        if (c14736a != null) {
            adEventFields.e(Long.valueOf(((Number) c14736a).longValue()));
        }
        c14736a = adEventFields.a();
        C2668g.a(c14736a, "eventBuilder.build()");
        return (EtlEvent) c14736a;
    }
}
