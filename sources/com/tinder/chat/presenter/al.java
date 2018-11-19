package com.tinder.chat.presenter;

import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.match.usecase.GetMatch;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class al implements Factory<ag> {
    /* renamed from: a */
    private final Provider<GetMatch> f41051a;
    /* renamed from: b */
    private final Provider<MatchAvatarUrlsVisitor> f41052b;
    /* renamed from: c */
    private final Provider<MatchNameVisitor> f41053c;
    /* renamed from: d */
    private final Provider<String> f41054d;

    public /* synthetic */ Object get() {
        return m50108a();
    }

    /* renamed from: a */
    public ag m50108a() {
        return m50107a(this.f41051a, this.f41052b, this.f41053c, this.f41054d);
    }

    /* renamed from: a */
    public static ag m50107a(Provider<GetMatch> provider, Provider<MatchAvatarUrlsVisitor> provider2, Provider<MatchNameVisitor> provider3, Provider<String> provider4) {
        return new ag((GetMatch) provider.get(), (MatchAvatarUrlsVisitor) provider2.get(), (MatchNameVisitor) provider3.get(), (String) provider4.get());
    }

    /* renamed from: a */
    public static ag m50106a(GetMatch getMatch, MatchAvatarUrlsVisitor matchAvatarUrlsVisitor, MatchNameVisitor matchNameVisitor, String str) {
        return new ag(getMatch, matchAvatarUrlsVisitor, matchNameVisitor, str);
    }
}
