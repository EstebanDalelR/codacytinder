package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.m */
public final class C17629m<T> implements Sequence<T> {
    /* renamed from: a */
    private final Sequence<T> f54804a;
    /* renamed from: b */
    private final Function1<T, Boolean> f54805b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "(Lkotlin/sequences/TakeWhileSequence;)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.m$a */
    public static final class C17628a implements Iterator<T>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17629m f54800a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54801b;
        /* renamed from: c */
        private int f54802c = -1;
        @Nullable
        /* renamed from: d */
        private T f54803d;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17628a(C17629m c17629m) {
            this.f54800a = c17629m;
            this.f54801b = c17629m.f54804a.iterator();
        }

        /* renamed from: a */
        private final void m64237a() {
            if (this.f54801b.hasNext()) {
                Object next = this.f54801b.next();
                if (((Boolean) this.f54800a.f54805b.invoke(next)).booleanValue()) {
                    this.f54802c = 1;
                    this.f54803d = next;
                    return;
                }
            }
            this.f54802c = 0;
        }

        public T next() {
            if (this.f54802c == -1) {
                m64237a();
            }
            if (this.f54802c == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f54803d;
            this.f54803d = null;
            this.f54802c = -1;
            return t;
        }

        public boolean hasNext() {
            if (this.f54802c == -1) {
                m64237a();
            }
            return this.f54802c == 1;
        }
    }

    public C17629m(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        C2668g.b(sequence, "sequence");
        C2668g.b(function1, "predicate");
        this.f54804a = sequence;
        this.f54805b = function1;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C17628a(this);
    }
}
