package com.tinder.data.updates;

import com.tinder.api.model.common.ApiMatch;
import com.tinder.data.match.C10799v;
import com.tinder.data.match.C10799v.C8678a;
import com.tinder.domain.match.usecase.InsertMatches;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000f\u001a\u00020\bJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/updates/UpdatesResponseMatchesHandler;", "", "matchDomainApiAdapter", "Lcom/tinder/data/match/MatchDomainApiAdapter;", "insertMatches", "Lcom/tinder/domain/match/usecase/InsertMatches;", "(Lcom/tinder/data/match/MatchDomainApiAdapter;Lcom/tinder/domain/match/usecase/InsertMatches;)V", "isNotNewMessage", "", "Lcom/tinder/api/model/common/ApiMatch;", "(Lcom/tinder/api/model/common/ApiMatch;)Z", "processMatches", "Lio/reactivex/Completable;", "apiMatches", "", "markMatchesAsTouched", "wrapMatchUpdates", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "touched", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ac {
    /* renamed from: a */
    private final C10799v f30881a;
    /* renamed from: b */
    private final InsertMatches f30882b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "it", "Lcom/tinder/api/model/common/ApiMatch;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.ac$a */
    static final class C11037a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ ac f35798a;
        /* renamed from: b */
        final /* synthetic */ boolean f35799b;

        C11037a(ac acVar, boolean z) {
            this.f35798a = acVar;
            this.f35799b = z;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43706a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C8678a> m43706a(@NotNull List<? extends ApiMatch> list) {
            C2668g.b(list, "it");
            return this.f35798a.m37474b(list, this.f35799b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "matchDataList", "", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.ac$b */
    static final class C11038b<T> implements Predicate<List<? extends C8678a>> {
        /* renamed from: a */
        public static final C11038b f35800a = new C11038b();

        C11038b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m43707a((List) obj);
        }

        /* renamed from: a */
        public final boolean m43707a(@NotNull List<C8678a> list) {
            C2668g.b(list, "matchDataList");
            return list.isEmpty() ^ 1;
        }
    }

    @Inject
    public ac(@NotNull C10799v c10799v, @NotNull InsertMatches insertMatches) {
        C2668g.b(c10799v, "matchDomainApiAdapter");
        C2668g.b(insertMatches, "insertMatches");
        this.f30881a = c10799v;
        this.f30882b = insertMatches;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37475a(@NotNull List<? extends ApiMatch> list, boolean z) {
        C2668g.b(list, "apiMatches");
        list = C3959e.just(list).map(new C11037a(this, z)).filter((Predicate) C11038b.f35800a).map(new ad((Function1) new UpdatesResponseMatchesHandler$processMatches$3(this.f30881a))).flatMapCompletable(new ad((Function1) new UpdatesResponseMatchesHandler$processMatches$4(this.f30882b)));
        C2668g.a(list, "Observable.just(apiMatch…e(insertMatches::execute)");
        return list;
    }

    /* renamed from: b */
    private final List<C8678a> m37474b(List<? extends ApiMatch> list, boolean z) {
        return C19285g.f(C19285g.e(C19285g.a(C19301m.r(list), new UpdatesResponseMatchesHandler$wrapMatchUpdates$1(this)), new UpdatesResponseMatchesHandler$wrapMatchUpdates$2(z)));
    }

    /* renamed from: a */
    private final boolean m37472a(@NotNull ApiMatch apiMatch) {
        apiMatch = apiMatch.isNewMessage();
        if (apiMatch == null) {
            apiMatch = Boolean.valueOf(null);
        }
        return apiMatch.booleanValue() ^ 1;
    }
}
