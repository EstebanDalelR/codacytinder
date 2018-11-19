package com.tinder.data.message;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.message.z */
public final class C12964z implements Factory<ag> {
    /* renamed from: a */
    private final C8698t f41521a;
    /* renamed from: b */
    private final Provider<BriteDatabase> f41522b;

    public /* synthetic */ Object get() {
        return m50700a();
    }

    public C12964z(C8698t c8698t, Provider<BriteDatabase> provider) {
        this.f41521a = c8698t;
        this.f41522b = provider;
    }

    /* renamed from: a */
    public ag m50700a() {
        return C12964z.m50698a(this.f41521a, this.f41522b);
    }

    /* renamed from: a */
    public static ag m50698a(C8698t c8698t, Provider<BriteDatabase> provider) {
        return C12964z.m50697a(c8698t, (BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C12964z m50699b(C8698t c8698t, Provider<BriteDatabase> provider) {
        return new C12964z(c8698t, provider);
    }

    /* renamed from: a */
    public static ag m50697a(C8698t c8698t, BriteDatabase briteDatabase) {
        return (ag) C15521i.a(c8698t.m37156a(briteDatabase), "Cannot return null from a non-@Nullable @Provides method");
    }
}
