package com.tinder.domain.message.usecase;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.MessageIdGenerator;
import com.tinder.domain.message.MessageSentDate;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00160\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J0\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/message/usecase/CommonMessagePropertiesAggregator;", "", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "getCurrentUser", "Lcom/tinder/domain/meta/usecase/GetCurrentUser;", "getLastMessageSentDate", "Lcom/tinder/domain/message/usecase/GetLastMessageSentDate;", "clientSideMessageIdGenerator", "Lkotlin/Function0;", "", "fallbackMessageSentDateProvider", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/domain/meta/usecase/GetCurrentUser;Lcom/tinder/domain/message/usecase/GetLastMessageSentDate;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "aggregate", "Lrx/Single;", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "matchId", "messageText", "aggregate$domain_release", "currentUserIdSingle", "extractFromIdAndToIdFromMatch", "Lkotlin/Pair;", "match", "Lcom/tinder/domain/match/model/Match;", "gatherCommonMessageProperties", "fromId", "toId", "sentDate", "lastMessageSentDate", "matchSingle", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CommonMessagePropertiesAggregator {
    private final Function0<String> clientSideMessageIdGenerator;
    private final Function0<DateTime> fallbackMessageSentDateProvider;
    private final GetCurrentUser getCurrentUser;
    private final GetLastMessageSentDate getLastMessageSentDate;
    private final GetMatch getMatch;

    @Inject
    public CommonMessagePropertiesAggregator(@NotNull GetMatch getMatch, @NotNull GetCurrentUser getCurrentUser, @NotNull GetLastMessageSentDate getLastMessageSentDate, @MessageIdGenerator @NotNull Function0<String> function0, @NotNull @MessageSentDate Function0<DateTime> function02) {
        C2668g.b(getMatch, "getMatch");
        C2668g.b(getCurrentUser, "getCurrentUser");
        C2668g.b(getLastMessageSentDate, "getLastMessageSentDate");
        C2668g.b(function0, "clientSideMessageIdGenerator");
        C2668g.b(function02, "fallbackMessageSentDateProvider");
        this.getMatch = getMatch;
        this.getCurrentUser = getCurrentUser;
        this.getLastMessageSentDate = getLastMessageSentDate;
        this.clientSideMessageIdGenerator = function0;
        this.fallbackMessageSentDateProvider = function02;
    }

    @NotNull
    public final Single<CommonMessageProperties> aggregate$domain_release(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "messageText");
        str = matchSingle(str).a(new CommonMessagePropertiesAggregator$sam$rx_functions_Func1$0(new CommonMessagePropertiesAggregator$aggregate$1(this))).a(lastMessageSentDate(str), new CommonMessagePropertiesAggregator$aggregate$2(this, str, str2));
        C2668g.a(str, "matchSingle(matchId)\n   …  )\n                    }");
        return str;
    }

    private final Single<Match> matchSingle(String str) {
        str = this.getMatch.execute(str).h().k(CommonMessagePropertiesAggregator$matchSingle$1.INSTANCE).a();
        C2668g.a(str, "getMatch.execute(matchId…              .toSingle()");
        return str;
    }

    private final Single<DateTime> lastMessageSentDate(String str) {
        str = this.getLastMessageSentDate.execute(str).d(new CommonMessagePropertiesAggregator$lastMessageSentDate$1(this));
        C2668g.a(str, "getLastMessageSentDate.e…())\n                    }");
        return str;
    }

    private final Single<Pair<String, String>> extractFromIdAndToIdFromMatch(Match match) {
        match = currentUserIdSingle().d(new C13158xdee7395(match));
        C2668g.a(match, "currentUserIdSingle().ma… fromId to toId\n        }");
        return match;
    }

    private final Single<String> currentUserIdSingle() {
        Single<String> d = this.getCurrentUser.execute().d(CommonMessagePropertiesAggregator$currentUserIdSingle$1.INSTANCE);
        C2668g.a(d, "getCurrentUser.execute().map { it.id() }");
        return d;
    }

    private final CommonMessageProperties gatherCommonMessageProperties(String str, String str2, String str3, DateTime dateTime, String str4) {
        return new CommonMessageProperties((String) this.clientSideMessageIdGenerator.invoke(), str, str3, str2, str4, dateTime, false, false, DeliveryStatus.PENDING);
    }
}
