package com.tinder.paywall.domain;

import com.tinder.purchase.domain.model.C14510e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/paywall/domain/Paywall;", "", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "(Ljava/util/List;)V", "getOffers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.domain.a */
public final class C10060a {
    @NotNull
    /* renamed from: a */
    private final List<C14510e> f32957a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10060a) {
                if (C2668g.a(this.f32957a, ((C10060a) obj).f32957a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.f32957a;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Paywall(offers=");
        stringBuilder.append(this.f32957a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10060a(@NotNull List<? extends C14510e> list) {
        C2668g.b(list, "offers");
        this.f32957a = list;
    }

    @NotNull
    /* renamed from: a */
    public final List<C14510e> m41128a() {
        return this.f32957a;
    }
}
