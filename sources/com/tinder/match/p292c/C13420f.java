package com.tinder.match.p292c;

import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.match.c.f */
public final class C13420f implements Factory<MatchAvatarUrlsVisitor> {
    /* renamed from: a */
    private final C9850a f42568a;

    public /* synthetic */ Object get() {
        return m51883a();
    }

    /* renamed from: a */
    public MatchAvatarUrlsVisitor m51883a() {
        return C13420f.m51881a(this.f42568a);
    }

    /* renamed from: a */
    public static MatchAvatarUrlsVisitor m51881a(C9850a c9850a) {
        return C13420f.m51882b(c9850a);
    }

    /* renamed from: b */
    public static MatchAvatarUrlsVisitor m51882b(C9850a c9850a) {
        return (MatchAvatarUrlsVisitor) C15521i.a(c9850a.m40540a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
