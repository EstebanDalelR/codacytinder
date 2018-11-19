package com.tinder.superlikeable.p424d;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/superlikeable/resources/StringResources;", "", "headerText", "", "footerText", "", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "getFooterText", "()Ljava/lang/String;", "getHeaderText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.d.a */
public final class C15141a {
    @NotNull
    /* renamed from: a */
    private final CharSequence f47119a;
    @NotNull
    /* renamed from: b */
    private final String f47120b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15141a) {
                C15141a c15141a = (C15141a) obj;
                if (C2668g.a(this.f47119a, c15141a.f47119a) && C2668g.a(this.f47120b, c15141a.f47120b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CharSequence charSequence = this.f47119a;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        String str = this.f47120b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StringResources(headerText=");
        stringBuilder.append(this.f47119a);
        stringBuilder.append(", footerText=");
        stringBuilder.append(this.f47120b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15141a(@NotNull CharSequence charSequence, @NotNull String str) {
        C2668g.b(charSequence, "headerText");
        C2668g.b(str, "footerText");
        this.f47119a = charSequence;
        this.f47120b = str;
    }

    @NotNull
    /* renamed from: a */
    public final CharSequence m56982a() {
        return this.f47119a;
    }

    @NotNull
    /* renamed from: b */
    public final String m56983b() {
        return this.f47120b;
    }
}
