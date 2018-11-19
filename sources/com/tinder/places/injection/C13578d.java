package com.tinder.places.injection;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.List;

/* renamed from: com.tinder.places.injection.d */
public final class C13578d implements Factory<List<String>> {
    /* renamed from: a */
    private final C10213b f43320a;

    public /* synthetic */ Object get() {
        return m53004a();
    }

    /* renamed from: a */
    public List<String> m53004a() {
        return C13578d.m53002a(this.f43320a);
    }

    /* renamed from: a */
    public static List<String> m53002a(C10213b c10213b) {
        return C13578d.m53003b(c10213b);
    }

    /* renamed from: b */
    public static List<String> m53003b(C10213b c10213b) {
        return (List) C15521i.a(c10213b.m41535c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
