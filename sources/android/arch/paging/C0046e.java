package android.arch.paging;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: android.arch.paging.e */
class C0046e<T> {
    /* renamed from: e */
    private static final C0046e f99e = new C0046e(Collections.EMPTY_LIST, 0);
    @NonNull
    /* renamed from: a */
    public final List<T> f100a;
    /* renamed from: b */
    public final int f101b;
    /* renamed from: c */
    public final int f102c;
    /* renamed from: d */
    public final int f103d;

    /* renamed from: android.arch.paging.e$a */
    static abstract class C0045a<T> {
        @MainThread
        /* renamed from: a */
        public abstract void mo48a(int i, @NonNull C0046e<T> c0046e);

        C0045a() {
        }
    }

    /* renamed from: a */
    static <T> C0046e<T> m157a() {
        return f99e;
    }

    C0046e(@NonNull List<T> list, int i, int i2, int i3) {
        this.f100a = list;
        this.f101b = i;
        this.f102c = i2;
        this.f103d = i3;
    }

    C0046e(@NonNull List<T> list, int i) {
        this.f100a = list;
        this.f101b = 0;
        this.f102c = 0;
        this.f103d = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Result ");
        stringBuilder.append(this.f101b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f100a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f102c);
        stringBuilder.append(", offset ");
        stringBuilder.append(this.f103d);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public boolean m158b() {
        return this == f99e;
    }
}
