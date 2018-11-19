package com.tinder.domain.match.usecase;

import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "match", "Lcom/tinder/domain/match/model/MessageAdMatch;", "call"}, k = 3, mv = {1, 1, 10})
final class CreateMessageAdMatch$execute$2<T, R> implements Func1<MessageAdMatch, Completable> {
    final /* synthetic */ CreateMessageAdMatch this$0;

    CreateMessageAdMatch$execute$2(CreateMessageAdMatch createMessageAdMatch) {
        this.this$0 = createMessageAdMatch;
    }

    public final Completable call(MessageAdMatch messageAdMatch) {
        CreateMessageAdMatch createMessageAdMatch = this.this$0;
        C2668g.a(messageAdMatch, "match");
        TextMessage access$messageFromMessageAd = createMessageAdMatch.messageFromMessageAd(messageAdMatch, messageAdMatch.getId());
        return Completable.b(new Completable[]{this.this$0.matchRepository.deleteMatch(messageAdMatch.getId()), this.this$0.matchRepository.insertMatches(C19301m.a(messageAdMatch)), this.this$0.messageRepository.addMessages(C19301m.a(access$messageFromMessageAd))});
    }
}
