package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.aa;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdOpenEvent;", "Lcom/tinder/recsads/analytics/AddAdEvent;", "Lcom/tinder/recsads/analytics/AddAdOpenEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "adEventFieldsFactory", "Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recsads/analytics/AdEventFields$Factory;)V", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "commonFields", "Lcom/tinder/recsads/analytics/AdEventFields;", "AdOpenMethodType", "Request", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class AddAdOpenEvent extends C14737g<C14730a> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdOpenEvent$AdOpenMethodType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TAP", "SWIPE", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    public enum AdOpenMethodType {
        ;
        
        @NotNull
        private final String key;

        protected AdOpenMethodType(String str) {
            C2668g.b(str, "key");
            this.key = str;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/recsads/analytics/AddAdOpenEvent$Request;", "", "adOpenMethodType", "Lcom/tinder/recsads/analytics/AddAdOpenEvent$AdOpenMethodType;", "(Lcom/tinder/recsads/analytics/AddAdOpenEvent$AdOpenMethodType;)V", "getAdOpenMethodType", "()Lcom/tinder/recsads/analytics/AddAdOpenEvent$AdOpenMethodType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.AddAdOpenEvent$a */
    public static final class C14730a {
        @NotNull
        /* renamed from: a */
        private final AdOpenMethodType f46305a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14730a) {
                    if (C2668g.a(this.f46305a, ((C14730a) obj).f46305a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AdOpenMethodType adOpenMethodType = this.f46305a;
            return adOpenMethodType != null ? adOpenMethodType.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(adOpenMethodType=");
            stringBuilder.append(this.f46305a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14730a(@NotNull AdOpenMethodType adOpenMethodType) {
            C2668g.b(adOpenMethodType, "adOpenMethodType");
            this.f46305a = adOpenMethodType;
        }

        @NotNull
        /* renamed from: a */
        public final AdOpenMethodType m55987a() {
            return this.f46305a;
        }
    }

    @Inject
    public AddAdOpenEvent(@NotNull C2630h c2630h, @NotNull C14729c c14729c) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14729c, "adEventFieldsFactory");
        super(c2630h, c14729c);
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent m61810a(@NotNull C14730a c14730a, @NotNull AdEventFields adEventFields) {
        C2668g.b(c14730a, "request");
        C2668g.b(adEventFields, "commonFields");
        c14730a = aa.a().a(adEventFields.mo12162a()).b(adEventFields.mo12164c()).c(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).a(c14730a.m55987a().getKey()).a();
        C2668g.a(c14730a, "AdOpenEvent.builder()\n  …key)\n            .build()");
        return (EtlEvent) c14730a;
    }
}
