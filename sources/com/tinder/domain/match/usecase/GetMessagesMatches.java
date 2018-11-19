package com.tinder.domain.match.usecase;

import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageMatch;
import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/match/usecase/GetMessagesMatches;", "Lcom/tinder/domain/common/usecase/UseCase;", "", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;)V", "combine", "matches", "", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "execute", "Lrx/Observable;", "query", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetMessagesMatches implements UseCase<String, MessageMatchesUpdate> {
    private final MatchRepository matchRepository;
    private final MessageRepository messageRepository;

    public GetMessagesMatches(@NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository) {
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(messageRepository, "messageRepository");
        this.matchRepository = matchRepository;
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Observable<MessageMatchesUpdate> execute(@NotNull String str) {
        C2668g.b(str, "query");
        str = Observable.a(matches(str), this.messageRepository.latestMessageByMatch(), new GetMessagesMatches$sam$rx_functions_Func2$0(new GetMessagesMatches$execute$1(this)));
        C2668g.a(str, "Observable.combineLatest…  this::combine\n        )");
        return str;
    }

    private final Observable<List<Match>> matches(String str) {
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return this.matchRepository.loadMatches();
        }
        return this.matchRepository.search(str);
    }

    private final MessageMatchesUpdate combine(List<? extends Match> list, Map<String, ? extends Message> map) {
        Collection arrayList = new ArrayList();
        for (Match match : list) {
            Message message = (Message) map.get(match.getId());
            Object messageMatch = message != null ? new MessageMatch(match, message) : null;
            if (messageMatch != null) {
                arrayList.add(messageMatch);
            }
        }
        List list2 = (List) arrayList;
        return new MessageMatchesUpdate(list2, list2.size() != list.size() ? true : null);
    }
}
