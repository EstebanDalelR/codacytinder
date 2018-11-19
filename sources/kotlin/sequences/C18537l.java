package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.sequences.l */
public final class C18537l<T> implements DropTakeSequence<T>, Sequence<T> {
    /* renamed from: a */
    private final Sequence<T> f57773a;
    /* renamed from: b */
    private final int f57774b;
    /* renamed from: c */
    private final int f57775c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\t\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "(Lkotlin/sequences/SubSequence;)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.sequences.l$a */
    public static final class C17627a implements Iterator<T>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C18537l f54797a;
        @NotNull
        /* renamed from: b */
        private final Iterator<T> f54798b;
        /* renamed from: c */
        private int f54799c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17627a(C18537l c18537l) {
            this.f54797a = c18537l;
            this.f54798b = c18537l.f57773a.iterator();
        }

        /* renamed from: a */
        private final void m64236a() {
            while (this.f54799c < this.f54797a.f57774b && this.f54798b.hasNext()) {
                this.f54798b.next();
                this.f54799c++;
            }
        }

        public boolean hasNext() {
            m64236a();
            return this.f54799c < this.f54797a.f57775c && this.f54798b.hasNext();
        }

        public T next() {
            m64236a();
            if (this.f54799c >= this.f54797a.f57775c) {
                throw new NoSuchElementException();
            }
            this.f54799c++;
            return this.f54798b.next();
        }
    }

    public C18537l(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        C2668g.b(sequence, "sequence");
        this.f57773a = sequence;
        this.f57774b = i;
        this.f57775c = i2;
        i = 0;
        if ((this.f57774b >= null ? true : null) == null) {
            sequence = new StringBuilder();
            sequence.append("startIndex should be non-negative, but is ");
            sequence.append(this.f57774b);
            throw ((Throwable) new IllegalArgumentException(sequence.toString().toString()));
        }
        if ((this.f57775c >= null ? true : null) == null) {
            sequence = new StringBuilder();
            sequence.append("endIndex should be non-negative, but is ");
            sequence.append(this.f57775c);
            throw ((Throwable) new IllegalArgumentException(sequence.toString().toString()));
        }
        if (this.f57775c >= this.f57774b) {
            i = 1;
        }
        if (i == 0) {
            sequence = new StringBuilder();
            sequence.append("endIndex should be not less than startIndex, but was ");
            sequence.append(this.f57775c);
            sequence.append(" < ");
            sequence.append(this.f57774b);
            throw ((Throwable) new IllegalArgumentException(sequence.toString().toString()));
        }
    }

    /* renamed from: a */
    private final int m66932a() {
        return this.f57775c - this.f57774b;
    }

    @NotNull
    public Sequence<T> drop(int i) {
        return i >= m66932a() ? C17625i.m64228a() : new C18537l(this.f57773a, this.f57774b + i, this.f57775c);
    }

    @NotNull
    public Sequence<T> take(int i) {
        return i >= m66932a() ? this : new C18537l(this.f57773a, this.f57774b, this.f57774b + i);
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C17627a(this);
    }
}
