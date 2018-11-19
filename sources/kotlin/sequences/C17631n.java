package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function2;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.n */
public final class C17631n<T, R> implements Sequence<R> {
    /* renamed from: a */
    private final Sequence<T> f54809a;
    /* renamed from: b */
    private final Function2<Integer, T, R> f54810b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "(Lkotlin/sequences/TransformingIndexedSequence;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.n$a */
    public static final class C17630a implements Iterator<R>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17631n f54806a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54807b;
        /* renamed from: c */
        private int f54808c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17630a(C17631n c17631n) {
            this.f54806a = c17631n;
            this.f54807b = c17631n.f54809a.iterator();
        }

        public R next() {
            Function2 a = this.f54806a.f54810b;
            int i = this.f54808c;
            this.f54808c = i + 1;
            return a.invoke(Integer.valueOf(i), this.f54807b.next());
        }

        public boolean hasNext() {
            return this.f54807b.hasNext();
        }
    }

    public C17631n(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        C2668g.b(sequence, "sequence");
        C2668g.b(function2, "transformer");
        this.f54809a = sequence;
        this.f54810b = function2;
    }

    @NotNull
    public Iterator<R> iterator() {
        return new C17630a(this);
    }
}
