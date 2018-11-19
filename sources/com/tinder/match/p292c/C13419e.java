package com.tinder.match.p292c;

import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.match.c.e */
public final class C13419e implements Factory<MatchAvatarUrlsVisitor> {
    /* renamed from: a */
    private final C9850a f42567a;

    public /* synthetic */ Object get() {
        return m51880a();
    }

    public C13419e(C9850a c9850a) {
        this.f42567a = c9850a;
    }

    /* renamed from: a */
    public MatchAvatarUrlsVisitor m51880a() {
        return C13419e.m51877a(this.f42567a);
    }

    /* renamed from: a */
    public static MatchAvatarUrlsVisitor m51877a(C9850a c9850a) {
        return C13419e.m51879c(c9850a);
    }

    /* renamed from: b */
    public static C13419e m51878b(C9850a c9850a) {
        return new C13419e(c9850a);
    }

    /* renamed from: c */
    public static MatchAvatarUrlsVisitor m51879c(C9850a c9850a) {
        return (MatchAvatarUrlsVisitor) C15521i.a(c9850a.m40543b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
