package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.C18461c;
import kotlin.ranges.C18464j;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012+\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002R3\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.text.d */
final class C17636d implements Sequence<C18461c> {
    /* renamed from: a */
    private final CharSequence f54821a;
    /* renamed from: b */
    private final int f54822b;
    /* renamed from: c */
    private final int f54823c;
    /* renamed from: d */
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f54824d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\t\u0010\u001a\u001a\u00020\u001bH\u0002J\t\u0010\u001c\u001a\u00020\u0002H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\t¨\u0006\u001d"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "(Lkotlin/text/DelimitedRangesSequence;)V", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.text.d$a */
    public static final class C17635a implements Iterator<C18461c>, KMappedMarker {
        /* renamed from: a */
        final /* synthetic */ C17636d f54815a;
        /* renamed from: b */
        private int f54816b = -1;
        /* renamed from: c */
        private int f54817c;
        /* renamed from: d */
        private int f54818d;
        @Nullable
        /* renamed from: e */
        private C18461c f54819e;
        /* renamed from: f */
        private int f54820f;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C17635a(C17636d c17636d) {
            this.f54815a = c17636d;
            this.f54817c = C18464j.m66920a(c17636d.f54822b, 0, c17636d.f54821a.length());
            this.f54818d = this.f54817c;
        }

        public /* synthetic */ Object next() {
            return m64247a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        private final void m64246b() {
            /*
            r6 = this;
            r0 = r6.f54818d;
            r1 = 0;
            if (r0 >= 0) goto L_0x000e;
        L_0x0005:
            r6.f54816b = r1;
            r0 = 0;
            r0 = (kotlin.ranges.C18461c) r0;
            r6.f54819e = r0;
            goto L_0x00a4;
        L_0x000e:
            r0 = r6.f54815a;
            r0 = r0.f54823c;
            r2 = -1;
            r3 = 1;
            if (r0 <= 0) goto L_0x0027;
        L_0x0018:
            r0 = r6.f54820f;
            r0 = r0 + r3;
            r6.f54820f = r0;
            r0 = r6.f54820f;
            r4 = r6.f54815a;
            r4 = r4.f54823c;
            if (r0 >= r4) goto L_0x0035;
        L_0x0027:
            r0 = r6.f54818d;
            r4 = r6.f54815a;
            r4 = r4.f54821a;
            r4 = r4.length();
            if (r0 <= r4) goto L_0x004b;
        L_0x0035:
            r0 = r6.f54817c;
            r1 = new kotlin.ranges.c;
            r4 = r6.f54815a;
            r4 = r4.f54821a;
            r4 = kotlin.text.C19298r.m68791d(r4);
            r1.<init>(r0, r4);
            r6.f54819e = r1;
            r6.f54818d = r2;
            goto L_0x00a2;
        L_0x004b:
            r0 = r6.f54815a;
            r0 = r0.f54824d;
            r4 = r6.f54815a;
            r4 = r4.f54821a;
            r5 = r6.f54818d;
            r5 = java.lang.Integer.valueOf(r5);
            r0 = r0.invoke(r4, r5);
            r0 = (kotlin.Pair) r0;
            if (r0 != 0) goto L_0x007b;
        L_0x0065:
            r0 = r6.f54817c;
            r1 = new kotlin.ranges.c;
            r4 = r6.f54815a;
            r4 = r4.f54821a;
            r4 = kotlin.text.C19298r.m68791d(r4);
            r1.<init>(r0, r4);
            r6.f54819e = r1;
            r6.f54818d = r2;
            goto L_0x00a2;
        L_0x007b:
            r2 = r0.m59805c();
            r2 = (java.lang.Number) r2;
            r2 = r2.intValue();
            r0 = r0.m59806d();
            r0 = (java.lang.Number) r0;
            r0 = r0.intValue();
            r4 = r6.f54817c;
            r4 = kotlin.ranges.C18464j.m66925b(r4, r2);
            r6.f54819e = r4;
            r2 = r2 + r0;
            r6.f54817c = r2;
            r2 = r6.f54817c;
            if (r0 != 0) goto L_0x009f;
        L_0x009e:
            r1 = 1;
        L_0x009f:
            r2 = r2 + r1;
            r6.f54818d = r2;
        L_0x00a2:
            r6.f54816b = r3;
        L_0x00a4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.a.b():void");
        }

        @NotNull
        /* renamed from: a */
        public C18461c m64247a() {
            if (this.f54816b == -1) {
                m64246b();
            }
            if (this.f54816b == 0) {
                throw new NoSuchElementException();
            }
            C18461c c18461c = this.f54819e;
            if (c18461c == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.f54819e = (C18461c) null;
            this.f54816b = -1;
            return c18461c;
        }

        public boolean hasNext() {
            if (this.f54816b == -1) {
                m64246b();
            }
            return this.f54816b == 1;
        }
    }

    public C17636d(@NotNull CharSequence charSequence, int i, int i2, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        C2668g.b(charSequence, "input");
        C2668g.b(function2, "getNextMatch");
        this.f54821a = charSequence;
        this.f54822b = i;
        this.f54823c = i2;
        this.f54824d = function2;
    }

    @NotNull
    public Iterator<C18461c> iterator() {
        return new C17635a(this);
    }
}
