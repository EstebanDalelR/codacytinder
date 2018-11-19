package com.tinder.chat.injection.p188a;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.chat.injection.a.k */
public final class C12719k implements Factory<ItemAnimator> {
    /* renamed from: a */
    private final C8440a f41026a;

    public /* synthetic */ Object get() {
        return m50059a();
    }

    public C12719k(C8440a c8440a) {
        this.f41026a = c8440a;
    }

    /* renamed from: a */
    public ItemAnimator m50059a() {
        return C12719k.m50056a(this.f41026a);
    }

    /* renamed from: a */
    public static ItemAnimator m50056a(C8440a c8440a) {
        return C12719k.m50058c(c8440a);
    }

    /* renamed from: b */
    public static C12719k m50057b(C8440a c8440a) {
        return new C12719k(c8440a);
    }

    /* renamed from: c */
    public static ItemAnimator m50058c(C8440a c8440a) {
        return (ItemAnimator) C15521i.a(c8440a.m36025b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
