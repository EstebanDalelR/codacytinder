package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.b */
public final class C18534b<T> implements DropTakeSequence<T>, Sequence<T> {
    /* renamed from: a */
    private final Sequence<T> f57770a;
    /* renamed from: b */
    private final int f57771b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\t\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "(Lkotlin/sequences/DropSequence;)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.b$a */
    public static final class C17618a implements Iterator<T>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C18534b f54775a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54776b;
        /* renamed from: c */
        private int f54777c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17618a(C18534b c18534b) {
            this.f54775a = c18534b;
            this.f54776b = c18534b.f57770a.iterator();
            this.f54777c = c18534b.f57771b;
        }

        /* renamed from: a */
        private final void m64216a() {
            while (this.f54777c > 0 && this.f54776b.hasNext()) {
                this.f54776b.next();
                this.f54777c--;
            }
        }

        public T next() {
            m64216a();
            return this.f54776b.next();
        }

        public boolean hasNext() {
            m64216a();
            return this.f54776b.hasNext();
        }
    }

    public C18534b(@NotNull Sequence<? extends T> sequence, int i) {
        C2668g.b(sequence, "sequence");
        this.f57770a = sequence;
        this.f57771b = i;
        if ((this.f57771b >= null ? true : null) == null) {
            sequence = new StringBuilder();
            sequence.append("count must be non-negative, but was ");
            sequence.append(this.f57771b);
            sequence.append(46);
            throw ((Throwable) new IllegalArgumentException(sequence.toString().toString()));
        }
    }

    @NotNull
    public Sequence<T> drop(int i) {
        return new C18534b(this.f57770a, this.f57771b + i);
    }

    @NotNull
    public Sequence<T> take(int i) {
        return new C18537l(this.f57770a, this.f57771b, this.f57771b + i);
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C17618a(this);
    }
}
