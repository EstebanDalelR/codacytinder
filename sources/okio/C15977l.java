package okio;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: okio.l */
public final class C15977l extends AbstractList<ByteString> implements RandomAccess {
    /* renamed from: a */
    final ByteString[] f49608a;

    public /* synthetic */ Object get(int i) {
        return m60623a(i);
    }

    private C15977l(ByteString[] byteStringArr) {
        this.f49608a = byteStringArr;
    }

    /* renamed from: a */
    public static C15977l m60622a(ByteString... byteStringArr) {
        return new C15977l((ByteString[]) byteStringArr.clone());
    }

    /* renamed from: a */
    public ByteString m60623a(int i) {
        return this.f49608a[i];
    }

    public int size() {
        return this.f49608a.length;
    }
}
