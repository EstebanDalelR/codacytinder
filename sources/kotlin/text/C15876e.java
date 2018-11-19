package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.text.e */
public final class C15876e {
    @NotNull
    /* renamed from: a */
    private final String f49053a;
    @NotNull
    /* renamed from: b */
    private final C18461c f49054b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15876e) {
                C15876e c15876e = (C15876e) obj;
                if (C2668g.a(this.f49053a, c15876e.f49053a) && C2668g.a(this.f49054b, c15876e.f49054b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f49053a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C18461c c18461c = this.f49054b;
        if (c18461c != null) {
            i = c18461c.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchGroup(value=");
        stringBuilder.append(this.f49053a);
        stringBuilder.append(", range=");
        stringBuilder.append(this.f49054b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15876e(@NotNull String str, @NotNull C18461c c18461c) {
        C2668g.b(str, "value");
        C2668g.b(c18461c, "range");
        this.f49053a = str;
        this.f49054b = c18461c;
    }
}
