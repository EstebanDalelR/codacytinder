package com.tinder.spotify.views;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.listeners.C11895a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.adapter.SpotifyTrackSearchAdapter;
import com.tinder.spotify.adapter.SpotifyTrackSearchAdapter.OnSearchTrackClickListener;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p416b.C18170x;
import com.tinder.spotify.target.SpotifyTrackSearchTarget;
import com.tinder.utils.at;
import java.util.List;
import javax.inject.Inject;

public class SpotifyTrackSearchView extends LinearLayout implements SpotifyTrackSearchTarget {
    @Inject
    /* renamed from: a */
    C18170x f51996a;
    @Inject
    /* renamed from: b */
    ManagerAnalytics f51997b;
    /* renamed from: c */
    private SpotifyTrackSearchAdapter f51998c;
    /* renamed from: d */
    private C11895a f51999d;
    /* renamed from: e */
    private OnSearchTrackClickListener f52000e = new C168711(this);
    @BindView(2131363337)
    ProgressBar mProgressBar;
    @BindView(2131363638)
    RecyclerView mRecyclerView;
    @BindView(2131363865)
    SearchView mSearchView;
    @BindView(2131363825)
    Toolbar mToolbar;

    /* renamed from: com.tinder.spotify.views.SpotifyTrackSearchView$1 */
    class C168711 implements OnSearchTrackClickListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackSearchView f51994a;

        C168711(SpotifyTrackSearchView spotifyTrackSearchView) {
            this.f51994a = spotifyTrackSearchView;
        }

        public void onSearchTrackClick(SearchTrack searchTrack) {
            this.f51994a.f51996a.m65923a(searchTrack);
        }

        public void onNoThemeSongClick() {
            this.f51994a.f51996a.m65932e();
        }
    }

    /* renamed from: com.tinder.spotify.views.SpotifyTrackSearchView$2 */
    class C168722 implements OnQueryTextListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackSearchView f51995a;

        C168722(SpotifyTrackSearchView spotifyTrackSearchView) {
            this.f51995a = spotifyTrackSearchView;
        }

        public boolean onQueryTextSubmit(String str) {
            this.f51995a.mSearchView.clearFocus();
            return true;
        }

        public boolean onQueryTextChange(String str) {
            this.f51995a.f51998c.b();
            this.f51995a.f51999d.a();
            this.f51995a.f51996a.m65930c();
            this.f51995a.mProgressBar.setVisibility(0);
            this.f51995a.f51996a.m65925a(str);
            return true;
        }
    }

    /* renamed from: com.tinder.spotify.views.SpotifyTrackSearchView$a */
    private static class C18183a extends LinearLayoutManager {
        C18183a(Context context) {
            super(context);
        }
    }

    public SpotifyTrackSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ManagerApp.e().inject(this);
        inflate(context, R.layout.view_spotify_track_search_view, this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        m62446b();
        m62447c();
        m62448d();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51996a.a(this);
        this.f51996a.m65928b();
        this.f51998c.m67412a(this.f52000e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51998c.m67412a(null);
        this.f51996a.m65922a();
    }

    public void addTracks(@Nullable List<SearchTrack> list) {
        this.f51998c.m67418c((List) list);
        this.mProgressBar.setVisibility(8);
    }

    public void toastError(@StringRes int i) {
        at.m57641a(this.mToolbar.getRootView(), i);
    }

    public void showSearchError() {
        this.f51998c.m67418c(null);
    }

    public void closeView() {
        ((Activity) getContext()).finish();
    }

    /* renamed from: a */
    public void m62449a() {
        if (!TextUtils.isEmpty(this.mSearchView.getQuery().toString())) {
            this.f51996a.m65925a(this.mSearchView.getQuery().toString());
        }
    }

    /* renamed from: b */
    private void m62446b() {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getContext();
        appCompatActivity.setSupportActionBar(this.mToolbar);
        this.mToolbar.setNavigationOnClickListener(new C15057k(appCompatActivity));
    }

    /* renamed from: c */
    private void m62447c() {
        this.mSearchView.setQueryHint(getResources().getString(R.string.search_spotify_songs));
        this.mSearchView.requestFocus();
        this.mSearchView.setOnQueryTextListener(new C168722(this));
    }

    /* renamed from: d */
    private void m62448d() {
        this.f51998c = new SpotifyTrackSearchAdapter();
        LayoutManager c18183a = new C18183a(getContext());
        this.mRecyclerView.setLayoutManager(c18183a);
        this.mRecyclerView.setAdapter(this.f51998c);
        this.f51999d = new C11895a(this, c18183a) {
            /* renamed from: b */
            final /* synthetic */ SpotifyTrackSearchView f56376b;

            /* renamed from: a */
            public void m65934a(int i) {
                this.f56376b.m62449a();
            }
        };
        this.mRecyclerView.setOnScrollListener(this.f51999d);
        if (this.f51996a.m65931d()) {
            this.f51998c.m67415a(getResources().getString(R.string.most_played_songs));
        } else {
            this.f51998c.m67415a(getResources().getString(R.string.popular_on_spotify));
        }
    }
}
