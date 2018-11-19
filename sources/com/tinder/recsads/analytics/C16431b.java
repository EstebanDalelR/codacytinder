package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11503u;
import com.tinder.etl.event.EtlEvent;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdCloseEvent;", "Lcom/tinder/recsads/analytics/AddAdEvent;", "Lcom/tinder/recsads/analytics/AddAdCloseEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "commonFieldsFactory", "Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recsads/analytics/AdEventFields$Factory;)V", "getCommonFieldsFactory", "()Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "commonFields", "Lcom/tinder/recsads/analytics/AdEventFields;", "Request", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.analytics.b */
public final class C16431b extends C14737g<C14733a> {
    @NotNull
    /* renamed from: a */
    private final C2630h f50996a;
    @NotNull
    /* renamed from: b */
    private final C14729c f50997b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdCloseEvent$Request;", "", "progress", "", "timeViewed", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeViewed", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/recsads/analytics/AddAdCloseEvent$Request;", "equals", "", "other", "hashCode", "toString", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.b$a */
    public static final class C14733a {
        @Nullable
        /* renamed from: a */
        private final Integer f46310a;
        @Nullable
        /* renamed from: b */
        private final Integer f46311b;

        public C14733a() {
            this(null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14733a) {
                    C14733a c14733a = (C14733a) obj;
                    if (C2668g.a(this.f46310a, c14733a.f46310a) && C2668g.a(this.f46311b, c14733a.f46311b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.f46310a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Integer num2 = this.f46311b;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(progress=");
            stringBuilder.append(this.f46310a);
            stringBuilder.append(", timeViewed=");
            stringBuilder.append(this.f46311b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14733a(@Nullable Integer num, @Nullable Integer num2) {
            this.f46310a = num;
            this.f46311b = num2;
        }

        public /* synthetic */ C14733a(Integer num, Integer num2, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            this(num, num2);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m55994a() {
            return this.f46310a;
        }

        @Nullable
        /* renamed from: b */
        public final Integer m55995b() {
            return this.f46311b;
        }
    }

    @Inject
    public C16431b(@NotNull C2630h c2630h, @NotNull C14729c c14729c) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14729c, "commonFieldsFactory");
        super(c2630h, c14729c);
        this.f50996a = c2630h;
        this.f50997b = c14729c;
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent m61817a(@NotNull C14733a c14733a, @NotNull AdEventFields adEventFields) {
        C2668g.b(c14733a, "request");
        C2668g.b(adEventFields, "commonFields");
        adEventFields = C11503u.a().a(adEventFields.mo12162a()).a(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).b(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key()));
        Integer a = c14733a.m55994a();
        if (a != null) {
            adEventFields.e(Integer.valueOf(a.intValue()));
        }
        c14733a = c14733a.m55995b();
        if (c14733a != null) {
            adEventFields.f(Integer.valueOf(((Number) c14733a).intValue()));
        }
        c14733a = adEventFields.a();
        C2668g.a(c14733a, "eventBuilder.build()");
        return (EtlEvent) c14733a;
    }
}
