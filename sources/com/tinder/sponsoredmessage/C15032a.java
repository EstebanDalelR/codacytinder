package com.tinder.sponsoredmessage;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/sponsoredmessage/AdRequestRuleSet;", "", "rules", "", "Lcom/tinder/sponsoredmessage/AdRequestRule;", "(Ljava/util/Set;)V", "getRules", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.a */
public final class C15032a {
    @NotNull
    /* renamed from: a */
    private final Set<AdRequestRule> f46808a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15032a) {
                if (C2668g.a(this.f46808a, ((C15032a) obj).f46808a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set set = this.f46808a;
        return set != null ? set.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdRequestRuleSet(rules=");
        stringBuilder.append(this.f46808a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15032a(@NotNull Set<? extends AdRequestRule> set) {
        C2668g.b(set, "rules");
        this.f46808a = set;
    }

    @NotNull
    /* renamed from: a */
    public final Set<AdRequestRule> m56643a() {
        return this.f46808a;
    }
}
