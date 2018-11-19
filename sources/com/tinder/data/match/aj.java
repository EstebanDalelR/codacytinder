package com.tinder.data.match;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.match.provider.NewMatchProvider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/match/NewMatchPublishSubjectProvider;", "Lcom/tinder/domain/match/provider/NewMatchProvider;", "Lcom/tinder/domain/match/provider/NewMatchNotifier;", "()V", "subject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "notifyNewMatch", "", "match", "observeNewMatches", "Lrx/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class aj implements NewMatchNotifier, NewMatchProvider {
    /* renamed from: a */
    private final PublishSubject<Match> f35240a = PublishSubject.w();

    @NotNull
    public Observable<Match> observeNewMatches() {
        Observable<Match> e = this.f35240a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    public void notifyNewMatch(@NotNull Match match) {
        C2668g.b(match, "match");
        this.f35240a.onNext(match);
    }
}
