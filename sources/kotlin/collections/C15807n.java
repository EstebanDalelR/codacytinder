package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\b¢\u0006\u0002\u0010\u0005\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001H\b¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000b\u001a\u0002H\u0006¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0012H\b¨\u0006\u0013"}, d2 = {"copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "listOf", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.n */
class C15807n {
    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m59826a(T t) {
        t = Collections.singletonList(t);
        C2668g.a(t, "java.util.Collections.singletonList(element)");
        return t;
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Object[] m59827a(@NotNull T[] tArr, boolean z) {
        C2668g.b(tArr, "$receiver");
        if (z && C2668g.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        tArr = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C2668g.a(tArr, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return tArr;
    }
}
