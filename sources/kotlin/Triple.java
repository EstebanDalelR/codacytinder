package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
public final class Triple<A, B, C> implements Serializable {
    /* renamed from: a */
    private final A f49008a;
    /* renamed from: b */
    private final B f49009b;
    /* renamed from: c */
    private final C f49010c;

    /* renamed from: d */
    public final A m59810d() {
        return this.f49008a;
    }

    /* renamed from: e */
    public final B m59811e() {
        return this.f49009b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Triple) {
                Triple triple = (Triple) obj;
                if (C2668g.a(this.f49008a, triple.f49008a) && C2668g.a(this.f49009b, triple.f49009b) && C2668g.a(this.f49010c, triple.f49010c)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C m59812f() {
        return this.f49010c;
    }

    public int hashCode() {
        Object obj = this.f49008a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f49009b;
        hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        obj2 = this.f49010c;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public Triple(A a, B b, C c) {
        this.f49008a = a;
        this.f49009b = b;
        this.f49010c = c;
    }

    /* renamed from: a */
    public final A m59807a() {
        return this.f49008a;
    }

    /* renamed from: b */
    public final B m59808b() {
        return this.f49009b;
    }

    /* renamed from: c */
    public final C m59809c() {
        return this.f49010c;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.f49008a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f49009b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f49010c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
