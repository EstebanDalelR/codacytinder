package com.tinder.match.presenter;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.target.NewMatchesTarget;
import com.tinder.match.viewmodel.C9891i;
import com.tinder.match.viewmodel.NewMatchListItem;
import com.tinder.module.ViewScope;
import com.tinder.presenters.PresenterBase;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import java.util.List;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import rx.Observable;

@ViewScope
/* renamed from: com.tinder.match.presenter.s */
public class C13431s extends PresenterBase<NewMatchesTarget> {
    @NonNull
    /* renamed from: a */
    private final GetNewMatches f42612a;
    @NonNull
    /* renamed from: b */
    private final MatchesSearchQueryProvider f42613b;
    @NonNull
    /* renamed from: c */
    private final C9891i f42614c;
    @NonNull
    /* renamed from: d */
    private final FastMatchConfigProvider f42615d;
    @NonNull
    /* renamed from: e */
    private final FastMatchStatusProvider f42616e;
    @NonNull
    /* renamed from: f */
    private final SubscriptionProvider f42617f;

    @Inject
    C13431s(@NonNull GetNewMatches getNewMatches, @NonNull MatchesSearchQueryProvider matchesSearchQueryProvider, @NonNull C9891i c9891i, @NonNull FastMatchConfigProvider fastMatchConfigProvider, @NonNull FastMatchStatusProvider fastMatchStatusProvider, @NonNull SubscriptionProvider subscriptionProvider) {
        this.f42612a = getNewMatches;
        this.f42613b = matchesSearchQueryProvider;
        this.f42614c = c9891i;
        this.f42615d = fastMatchConfigProvider;
        this.f42616e = fastMatchStatusProvider;
        this.f42617f = subscriptionProvider;
    }

    /* renamed from: b */
    public void m51922b() {
        a(new C14061t(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m51919a(NewMatchesTarget newMatchesTarget) {
        newMatchesTarget.displayFastMatchPreview(this.f42614c.m40704a());
    }

    /* renamed from: c */
    public void m51923c() {
        Observable d = m51917d();
        Observable e = m51918e();
        C9891i c9891i = this.f42614c;
        c9891i.getClass();
        Observable.a(d, e, C13432u.m51924a(c9891i)).f(C13433x.f42619a).a(bindToLifecycle()).a(RxUtils.a()).a(new C14063y(this), C14064z.f44577a);
    }

    /* renamed from: a */
    final /* synthetic */ void m51920a(List list) {
        a(new C14062w(this, list));
    }

    /* renamed from: a */
    final /* synthetic */ void m51921a(List list, NewMatchesTarget newMatchesTarget) {
        newMatchesTarget.displayNewMatches(list);
        long c = m51916c(list);
        if (c <= 0) {
            newMatchesTarget.hideUntouchedMatchCount();
        } else {
            newMatchesTarget.displayUntouchedMatchCount(String.valueOf(c));
        }
    }

    /* renamed from: d */
    private Observable<List<Match>> m51917d() {
        Observable observeSearchQuery = this.f42613b.observeSearchQuery();
        GetNewMatches getNewMatches = this.f42612a;
        getNewMatches.getClass();
        return observeSearchQuery.p(aa.m51900a(getNewMatches));
    }

    /* renamed from: e */
    private Observable<Boolean> m51918e() {
        return Observable.a(this.f42615d.observe(), C15551e.a(this.f42616e.observe(), BackpressureStrategy.LATEST), this.f42617f.observe(), ab.f42583a);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m51913a(FastMatchConfig fastMatchConfig, FastMatchStatus fastMatchStatus, Subscription subscription) {
        fastMatchConfig = (fastMatchConfig.isEnabled() == null || (fastMatchStatus.getCount() <= null && subscription.isGold() == null)) ? null : true;
        return Boolean.valueOf(fastMatchConfig);
    }

    /* renamed from: c */
    private long m51916c(@NonNull List<NewMatchListItem> list) {
        return StreamSupport.a(list).map(ac.f39208a).filter(ad.f39209a).map(ae.f39210a).filter(C12075v.f39220a).count();
    }
}
