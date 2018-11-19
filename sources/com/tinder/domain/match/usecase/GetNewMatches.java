package com.tinder.domain.match.usecase;

import com.tinder.domain.common.usecase.UseCase;
import com.tinder.domain.match.model.Match;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/match/usecase/GetNewMatches;", "Lcom/tinder/domain/common/usecase/UseCase;", "", "", "Lcom/tinder/domain/match/model/Match;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;)V", "combine", "matches", "messages", "", "Lcom/tinder/domain/message/Message;", "execute", "Lrx/Observable;", "query", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetNewMatches implements UseCase<String, List<? extends Match>> {
    private final MatchRepository matchRepository;
    private final MessageRepository messageRepository;

    public GetNewMatches(@NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository) {
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(messageRepository, "messageRepository");
        this.matchRepository = matchRepository;
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Observable<List<Match>> execute(@NotNull String str) {
        C2668g.b(str, "query");
        str = Observable.a(matches(str), this.messageRepository.latestMessageByMatch(), new GetNewMatches$sam$rx_functions_Func2$0(new GetNewMatches$execute$1(this)));
        C2668g.a(str, "Observable.combineLatest…  this::combine\n        )");
        return str;
    }

    private final Observable<List<Match>> matches(String str) {
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return this.matchRepository.loadMatches();
        }
        return this.matchRepository.search(str);
    }

    private final List<Match> combine(List<? extends Match> list, Map<String, ? extends Message> map) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if ((map.containsKey(((Match) next).getId()) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
