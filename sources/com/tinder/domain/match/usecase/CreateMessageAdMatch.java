package com.tinder.domain.match.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.meta.gateway.MetaGateway;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/match/model/MessageAdMatch;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "execute", "Lrx/Completable;", "request", "messageFromMessageAd", "Lcom/tinder/domain/message/TextMessage;", "match", "matchId", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CreateMessageAdMatch implements CompletableUseCase<MessageAdMatch> {
    private final MatchRepository matchRepository;
    private final MessageRepository messageRepository;
    private final MetaGateway metaGateway;

    @Inject
    public CreateMessageAdMatch(@NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository, @NotNull MetaGateway metaGateway) {
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(messageRepository, "messageRepository");
        C2668g.b(metaGateway, "metaGateway");
        this.matchRepository = matchRepository;
        this.messageRepository = messageRepository;
        this.metaGateway = metaGateway;
    }

    @NotNull
    public Completable execute(@NotNull MessageAdMatch messageAdMatch) {
        C2668g.b(messageAdMatch, "request");
        messageAdMatch = Single.a(new CreateMessageAdMatch$execute$1(messageAdMatch)).c(new CreateMessageAdMatch$execute$2(this));
        C2668g.a(messageAdMatch, "Single.fromCallable { re…(message)))\n            }");
        return messageAdMatch;
    }

    private final TextMessage messageFromMessageAd(MessageAdMatch messageAdMatch, String str) {
        DateTime a = DateTime.a();
        String id = messageAdMatch.getId();
        Object b = this.metaGateway.getUserId().b();
        C2668g.a(b, "metaGateway.userId.get()");
        String str2 = (String) b;
        String id2 = messageAdMatch.getId();
        C2668g.a(a, "timestamp");
        return new TextMessage(null, id, str, str2, id2, messageAdMatch.getBody(), a, false, false, DeliveryStatus.SUCCESS, 1, null);
    }
}
