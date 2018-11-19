package com.tinder.match.views;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.R;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.deadshot.Deadshot;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.match.adapter.MatchListAdapter;
import com.tinder.match.presenter.C9865a;
import com.tinder.match.target.MatchListTarget;
import com.tinder.match.viewmodel.MatchListItem;
import com.tinder.module.MainActivityComponentProvider;
import com.tinder.module.MatchesListComponentProvider;
import java.util.List;
import javax.inject.Inject;
import rx.p494a.p496b.C19397a;

public class MatchListView extends SafeViewFlipper implements LifecycleObserver, MatchListTarget {
    @Inject
    /* renamed from: a */
    C9865a f12421a;
    @Inject
    /* renamed from: b */
    InputMethodManager f12422b;
    @Inject
    /* renamed from: c */
    C9695a f12423c;
    /* renamed from: d */
    private MatchListAdapter f12424d;
    @BindView(2131362928)
    View loadingView;
    @BindView(2131362909)
    RecyclerView matchListRecycler;
    @BindView(2131362924)
    View matchesContent;
    @BindView(2131362932)
    MatchesSearchView matchesSearchView;
    @BindView(2131363006)
    ViewStub noMatchesView;
    @BindView(2131362931)
    View noSearchResultsView;
    @BindView(2131363519)
    View searchFrostOverlay;

    public MatchListView(Context context) {
        this(context, null);
    }

    public MatchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = ((MainActivityComponentProvider) context).provideMainActivityComponent().m14690c().matchListView(this).build();
            ((MatchesListComponentProvider) context).setMatchesListComponent(attributeSet);
            attributeSet.inject(this);
        }
        inflate(context, R.layout.matches_tab_match_view, this);
        ButterKnife.m2675a((View) this);
        if ((context instanceof AppCompatActivity) != null) {
            ((AppCompatActivity) context).getLifecycle().mo36a(this);
        }
        m15030a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f12421a);
        this.f12421a.e();
        this.f12421a.f();
        m15033b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void displayEmptyScreen() {
        setDisplayedChild(0);
    }

    public void displayLoadingScreen() {
        setDisplayedChild(1);
    }

    public void displayMatches(@NonNull List<MatchListItem> list) {
        setDisplayedChild(3);
        this.noSearchResultsView.setVisibility(8);
        this.matchListRecycler.setVisibility(0);
        this.matchListRecycler.setAlpha(1.0f);
        this.f12424d.a(list);
    }

    /* renamed from: a */
    private void m15030a() {
        this.f12424d = new MatchListAdapter();
        LayoutManager matchListView$a = new MatchListView$a(getContext(), 1, false);
        matchListView$a.setItemPrefetchEnabled(false);
        this.matchListRecycler.setLayoutManager(matchListView$a);
        this.matchListRecycler.setAdapter(this.f12424d);
        this.matchesSearchView.setVisibility(0);
        this.matchListRecycler.setVisibility(0);
        this.noSearchResultsView.setVisibility(8);
        ((Activity) getContext()).getWindow().setSoftInputMode(32);
    }

    public void fadeInSearchOverlay() {
        this.matchListRecycler.setVisibility(0);
        this.searchFrostOverlay.setVisibility(0);
        this.searchFrostOverlay.setAlpha(0.0f);
        this.searchFrostOverlay.animate().setDuration(300).alpha(1.0f).setInterpolator(new AccelerateInterpolator()).setListener(new MatchListView$1(this));
    }

    public void fadeOutSearchOverlay() {
        this.matchListRecycler.setVisibility(0);
        if (this.searchFrostOverlay.getVisibility() == 0) {
            this.searchFrostOverlay.setAlpha(1.0f);
            this.searchFrostOverlay.animate().setDuration(300).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setListener(new MatchListView$2(this));
        }
    }

    public void hideSearchOverlay() {
        this.searchFrostOverlay.setVisibility(8);
        this.matchListRecycler.setVisibility(0);
    }

    public void hideKeyboard() {
        this.f12422b.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public void displayNoSearchResults() {
        this.matchListRecycler.animate().setDuration(150).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setListener(new MatchListView$3(this));
        this.noSearchResultsView.setVisibility(0);
        this.noSearchResultsView.setAlpha(0.0f);
        this.noSearchResultsView.animate().setStartDelay(100).setDuration(150).alpha(1.0f).setInterpolator(new AccelerateInterpolator());
    }

    @OnClick({2131363519})
    public void onSearchOverlayClick() {
        this.f12421a.g();
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public void onResume() {
        this.f12421a.i();
        this.f12421a.c();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public void onPause() {
        this.f12421a.d();
    }

    /* renamed from: b */
    private void m15033b() {
        this.f12423c.a().j(C5707b.a(this)).f(C13468a.f42727a).a(C19397a.a()).a(new C14076b(this), C14077c.f44596a);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m15032b(TabbedPageLayout$Page tabbedPageLayout$Page) {
        return Boolean.valueOf(tabbedPageLayout$Page == MainPage.MATCHES ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m15034a(TabbedPageLayout$Page tabbedPageLayout$Page) {
        this.f12421a.h();
    }
}
