package com.tinder.sponsoredmessage.p479d;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.sponsoredmessage.p414a.C16825a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/sponsoredmessage/usecase/DeleteSponsoredMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/match/model/MessageAdMatch;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "addAdChatBlockEvent", "Lcom/tinder/sponsoredmessage/analytics/AddAdChatBlockEvent;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/sponsoredmessage/analytics/AddAdChatBlockEvent;)V", "execute", "Lrx/Completable;", "messageAdMatch", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.d.a */
public final class C16844a implements CompletableUseCase<MessageAdMatch> {
    /* renamed from: a */
    private final MatchRepository f51908a;
    /* renamed from: b */
    private final C16825a f51909b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.d.a$a */
    static final class C18910a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16844a f58553a;
        /* renamed from: b */
        final /* synthetic */ MessageAdMatch f58554b;

        C18910a(C16844a c16844a, MessageAdMatch messageAdMatch) {
            this.f58553a = c16844a;
            this.f58554b = messageAdMatch;
        }

        public final void call() {
            this.f58553a.f51909b.m56641a(this.f58554b);
        }
    }

    @Inject
    public C16844a(@NotNull MatchRepository matchRepository, @NotNull C16825a c16825a) {
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(c16825a, "addAdChatBlockEvent");
        this.f51908a = matchRepository;
        this.f51909b = c16825a;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62399a((MessageAdMatch) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62399a(@NotNull MessageAdMatch messageAdMatch) {
        C2668g.b(messageAdMatch, "messageAdMatch");
        messageAdMatch = this.f51908a.deleteMatch(messageAdMatch.getId()).b(new C18910a(this, messageAdMatch));
        C2668g.a(messageAdMatch, "matchRepository\n        …execute(messageAdMatch) }");
        return messageAdMatch;
    }
}
