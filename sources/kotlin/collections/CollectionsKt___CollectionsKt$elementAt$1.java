package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class CollectionsKt___CollectionsKt$elementAt$1 extends Lambda implements Function1 {
    /* renamed from: a */
    final /* synthetic */ int f59333a;

    CollectionsKt___CollectionsKt$elementAt$1(int i) {
        this.f59333a = i;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m67956a(((Number) obj).intValue());
    }

    @NotNull
    /* renamed from: a */
    public final Void m67956a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Collection doesn't contain element at index ");
        stringBuilder.append(this.f59333a);
        stringBuilder.append('.');
        throw ((Throwable) new IndexOutOfBoundsException(stringBuilder.toString()));
    }
}
