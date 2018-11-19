package java8.util.stream;

import java8.util.function.Consumer;

final /* synthetic */ class SortedOps$RefSortingSink$$Lambda$1 implements Consumer {
    /* renamed from: a */
    private final Sink f54636a;

    private SortedOps$RefSortingSink$$Lambda$1(Sink sink) {
        this.f54636a = sink;
    }

    /* renamed from: a */
    public static Consumer m64068a(Sink sink) {
        return new SortedOps$RefSortingSink$$Lambda$1(sink);
    }

    public void accept(Object obj) {
        this.f54636a.accept(obj);
    }
}
