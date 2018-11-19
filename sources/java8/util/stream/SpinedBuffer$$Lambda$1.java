package java8.util.stream;

import java.util.List;
import java8.util.function.Consumer;

final /* synthetic */ class SpinedBuffer$$Lambda$1 implements Consumer {
    /* renamed from: a */
    private final List f54637a;

    private SpinedBuffer$$Lambda$1(List list) {
        this.f54637a = list;
    }

    /* renamed from: a */
    public static Consumer m64069a(List list) {
        return new SpinedBuffer$$Lambda$1(list);
    }

    public void accept(Object obj) {
        this.f54637a.add(obj);
    }
}
