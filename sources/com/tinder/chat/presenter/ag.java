package com.tinder.chat.presenter;

import com.tinder.chat.target.ChatToolbarTarget;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.match.qualifiers.PhotoQualityM;
import com.tinder.utils.RxUtils;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.Subscription;

public class ag {
    @DeadshotTarget
    /* renamed from: a */
    ChatToolbarTarget f30006a;
    /* renamed from: b */
    private final MatchAvatarUrlsVisitor f30007b;
    /* renamed from: c */
    private final MatchNameVisitor f30008c;
    /* renamed from: d */
    private final GetMatch f30009d;
    /* renamed from: e */
    private final String f30010e;
    /* renamed from: f */
    private Subscription f30011f;

    @Inject
    ag(GetMatch getMatch, @PhotoQualityM MatchAvatarUrlsVisitor matchAvatarUrlsVisitor, MatchNameVisitor matchNameVisitor, String str) {
        this.f30009d = getMatch;
        this.f30007b = matchAvatarUrlsVisitor;
        this.f30008c = matchNameVisitor;
        this.f30010e = str;
    }

    @Take
    /* renamed from: a */
    void m36087a() {
        this.f30011f = this.f30009d.execute(this.f30010e).a(RxUtils.a()).a(new ah(this), new ai(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m36090a(Optional optional) {
        optional.a(new aj(this), new ak(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m36088a(Match match) {
        this.f30006a.bindAvatar((List) match.accept(this.f30007b), (String) match.accept(this.f30008c));
        this.f30006a.bindMatch(match);
    }

    /* renamed from: c */
    final /* synthetic */ void m36092c() {
        this.f30006a.matchNotFound();
    }

    /* renamed from: a */
    final /* synthetic */ void m36089a(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find match with id ");
        stringBuilder.append(this.f30010e);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }

    @Drop
    /* renamed from: b */
    void m36091b() {
        RxUtils.b(this.f30011f);
    }
}
