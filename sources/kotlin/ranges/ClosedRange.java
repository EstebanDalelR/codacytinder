package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", "start", "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
public interface ClosedRange<T extends Comparable<? super T>> {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: kotlin.ranges.ClosedRange$a */
    public static final class C15831a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m59889a(ClosedRange<T> closedRange, @NotNull T t) {
            C2668g.b(t, "value");
            return (t.compareTo(closedRange.getStart()) < 0 || t.compareTo(closedRange.getEndInclusive()) > null) ? null : true;
        }

        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m59888a(ClosedRange<T> closedRange) {
            return closedRange.getStart().compareTo(closedRange.getEndInclusive()) > null ? true : null;
        }
    }

    boolean contains(@NotNull T t);

    @NotNull
    T getEndInclusive();

    @NotNull
    T getStart();

    boolean isEmpty();
}
