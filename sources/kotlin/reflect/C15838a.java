package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
@SinceKotlin(version = "1.1")
/* renamed from: kotlin.reflect.a */
public final class C15838a {
    /* renamed from: a */
    public static final C15837a f49035a = new C15837a();
    @NotNull
    /* renamed from: d */
    private static final C15838a f49036d = new C15838a(null, null);
    @Nullable
    /* renamed from: b */
    private final KVariance f49037b;
    @Nullable
    /* renamed from: c */
    private final KType f49038c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.reflect.a$a */
    public static final class C15837a {
        private C15837a() {
        }

        @NotNull
        /* renamed from: a */
        public final C15838a m59892a() {
            return C15838a.f49036d;
        }

        @NotNull
        /* renamed from: a */
        public final C15838a m59893a(@NotNull KType kType) {
            C2668g.b(kType, "type");
            return new C15838a(KVariance.INVARIANT, kType);
        }

        @NotNull
        /* renamed from: b */
        public final C15838a m59894b(@NotNull KType kType) {
            C2668g.b(kType, "type");
            return new C15838a(KVariance.IN, kType);
        }

        @NotNull
        /* renamed from: c */
        public final C15838a m59895c(@NotNull KType kType) {
            C2668g.b(kType, "type");
            return new C15838a(KVariance.OUT, kType);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15838a) {
                C15838a c15838a = (C15838a) obj;
                if (C2668g.a(this.f49037b, c15838a.f49037b) && C2668g.a(this.f49038c, c15838a.f49038c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        KVariance kVariance = this.f49037b;
        int i = 0;
        int hashCode = (kVariance != null ? kVariance.hashCode() : 0) * 31;
        KType kType = this.f49038c;
        if (kType != null) {
            i = kType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KTypeProjection(variance=");
        stringBuilder.append(this.f49037b);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f49038c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15838a(@Nullable KVariance kVariance, @Nullable KType kType) {
        this.f49037b = kVariance;
        this.f49038c = kType;
    }
}
