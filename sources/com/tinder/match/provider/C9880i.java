package com.tinder.match.provider;

import com.tinder.domain.match.model.MessageMatchesUpdate;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/match/provider/MessageMatchesUpdateProvider;", "", "getMessagesMatches", "Lcom/tinder/domain/match/usecase/GetMessagesMatches;", "searchQueryProvider", "Lcom/tinder/match/provider/MatchesSearchQueryProvider;", "(Lcom/tinder/domain/match/usecase/GetMessagesMatches;Lcom/tinder/match/provider/MatchesSearchQueryProvider;)V", "observe", "Lio/reactivex/Observable;", "Lcom/tinder/domain/match/model/MessageMatchesUpdate;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.provider.i */
public final class C9880i {
    /* renamed from: a */
    private final GetMessagesMatches f32710a;
    /* renamed from: b */
    private final MatchesSearchQueryProvider f32711b;

    @Inject
    public C9880i(@NotNull GetMessagesMatches getMessagesMatches, @NotNull MatchesSearchQueryProvider matchesSearchQueryProvider) {
        C2668g.b(getMessagesMatches, "getMessagesMatches");
        C2668g.b(matchesSearchQueryProvider, "searchQueryProvider");
        this.f32710a = getMessagesMatches;
        this.f32711b = matchesSearchQueryProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<MessageMatchesUpdate> m40646a() {
        Observable p = this.f32711b.observeSearchQuery().p(new C13437j(new MessageMatchesUpdateProvider$observe$1(this.f32710a)));
        C2668g.a(p, "searchQueryProvider.obse…MessagesMatches::execute)");
        return RxJavaInteropExtKt.toV2Observable(p);
    }
}
