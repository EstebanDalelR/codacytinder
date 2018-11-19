package java8.util.stream;

import java8.util.StringJoiner;
import java8.util.function.Supplier;

final /* synthetic */ class Collectors$$Lambda$15 implements Supplier {
    /* renamed from: a */
    private final CharSequence f54436a;
    /* renamed from: b */
    private final CharSequence f54437b;
    /* renamed from: c */
    private final CharSequence f54438c;

    private Collectors$$Lambda$15(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f54436a = charSequence;
        this.f54437b = charSequence2;
        this.f54438c = charSequence3;
    }

    /* renamed from: a */
    public static Supplier m63947a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new Collectors$$Lambda$15(charSequence, charSequence2, charSequence3);
    }

    public Object get() {
        return new StringJoiner(this.f54436a, this.f54437b, this.f54438c);
    }
}
