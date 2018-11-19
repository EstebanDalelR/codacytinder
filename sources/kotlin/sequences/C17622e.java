package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.e */
public final class C17622e<T, R, E> implements Sequence<E> {
    /* renamed from: a */
    private final Sequence<T> f54788a;
    /* renamed from: b */
    private final Function1<T, R> f54789b;
    /* renamed from: c */
    private final Function1<R, Iterator<E>> f54790c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\t\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005¨\u0006\u000f"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "(Lkotlin/sequences/FlatteningSequence;)V", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.e$a */
    public static final class C17621a implements Iterator<E>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17622e f54785a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54786b;
        @Nullable
        /* renamed from: c */
        private Iterator<? extends E> f54787c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17621a(C17622e c17622e) {
            this.f54785a = c17622e;
            this.f54786b = c17622e.f54788a.iterator();
        }

        public E next() {
            if (m64221a()) {
                Iterator it = this.f54787c;
                if (it == null) {
                    C2668g.a();
                }
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return m64221a();
        }

        /* renamed from: a */
        private final boolean m64221a() {
            Iterator it = this.f54787c;
            if (!(it == null || it.hasNext())) {
                this.f54787c = (Iterator) null;
            }
            while (this.f54787c == null) {
                if (!this.f54786b.hasNext()) {
                    return false;
                }
                it = (Iterator) this.f54785a.f54790c.invoke(this.f54785a.f54789b.invoke(this.f54786b.next()));
                if (it.hasNext()) {
                    this.f54787c = it;
                    return true;
                }
            }
            return true;
        }
    }

    public C17622e(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super R, ? extends Iterator<? extends E>> function12) {
        C2668g.b(sequence, "sequence");
        C2668g.b(function1, "transformer");
        C2668g.b(function12, "iterator");
        this.f54788a = sequence;
        this.f54789b = function1;
        this.f54790c = function12;
    }

    @NotNull
    public Iterator<E> iterator() {
        return new C17621a(this);
    }
}
