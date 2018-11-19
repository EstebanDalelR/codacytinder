package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15821b;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 1, 10})
final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements Function0<Iterator<? extends T>> {
    /* renamed from: a */
    final /* synthetic */ Object[] f59332a;

    ArraysKt___ArraysKt$withIndex$1(Object[] objArr) {
        this.f59332a = objArr;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67955a();
    }

    @NotNull
    /* renamed from: a */
    public final Iterator<T> m67955a() {
        return C15821b.m59855a(this.f59332a);
    }
}
