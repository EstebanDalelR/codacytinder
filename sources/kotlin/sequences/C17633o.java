package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.o */
public final class C17633o<T, R> implements Sequence<R> {
    /* renamed from: a */
    private final Sequence<T> f54813a;
    /* renamed from: b */
    private final Function1<T, R> f54814b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "(Lkotlin/sequences/TransformingSequence;)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.o$a */
    public static final class C17632a implements Iterator<R>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17633o f54811a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54812b;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17632a(C17633o c17633o) {
            this.f54811a = c17633o;
            this.f54812b = c17633o.f54813a.iterator();
        }

        public R next() {
            return this.f54811a.f54814b.invoke(this.f54812b.next());
        }

        public boolean hasNext() {
            return this.f54812b.hasNext();
        }
    }

    public C17633o(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        C2668g.b(sequence, "sequence");
        C2668g.b(function1, "transformer");
        this.f54813a = sequence;
        this.f54814b = function1;
    }

    @NotNull
    public Iterator<R> iterator() {
        return new C17632a(this);
    }

    @NotNull
    /* renamed from: a */
    public final <E> Sequence<E> m64244a(@NotNull Function1<? super R, ? extends Iterator<? extends E>> function1) {
        C2668g.b(function1, "iterator");
        return new C17622e(this.f54813a, this.f54814b, function1);
    }
}
