package com.tinder.data.match;

import com.tinder.domain.match.provider.UnMatchNotifier;
import com.tinder.domain.match.provider.UnMatchProvider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/match/UnMatchPublishSubjectProvider;", "Lcom/tinder/domain/match/provider/UnMatchProvider;", "Lcom/tinder/domain/match/provider/UnMatchNotifier;", "()V", "subject", "Lrx/subjects/SerializedSubject;", "", "kotlin.jvm.PlatformType", "notifyUnMatch", "", "matchId", "observeUnMatch", "Lrx/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class aq implements UnMatchNotifier, UnMatchProvider {
    /* renamed from: a */
    private final C19786b<String, String> f35244a = PublishSubject.w().B();

    @NotNull
    public Observable<String> observeUnMatch() {
        Observable<String> e = this.f35244a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    public void notifyUnMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f35244a.onNext(str);
    }
}
