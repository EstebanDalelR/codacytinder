package com.tinder.toppicks.header;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/header/TopPicksHeader;", "", "state", "Lcom/tinder/toppicks/header/TopPicksHeaderState;", "(Lcom/tinder/toppicks/header/TopPicksHeaderState;)V", "getState", "()Lcom/tinder/toppicks/header/TopPicksHeaderState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.header.b */
public final class C15271b {
    @NotNull
    /* renamed from: a */
    private final TopPicksHeaderState f47396a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15271b) {
                if (C2668g.a(this.f47396a, ((C15271b) obj).f47396a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        TopPicksHeaderState topPicksHeaderState = this.f47396a;
        return topPicksHeaderState != null ? topPicksHeaderState.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksHeader(state=");
        stringBuilder.append(this.f47396a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15271b(@NotNull TopPicksHeaderState topPicksHeaderState) {
        C2668g.b(topPicksHeaderState, "state");
        this.f47396a = topPicksHeaderState;
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksHeaderState m57376a() {
        return this.f47396a;
    }
}
