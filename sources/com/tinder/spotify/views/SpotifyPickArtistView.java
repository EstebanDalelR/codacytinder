package com.tinder.spotify.views;

import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.adapter.SpotifyPickTrackAdapter;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.p416b.C18161c;
import com.tinder.spotify.target.SpotifyPickArtistsTarget;
import com.tinder.utils.at;
import java.util.List;
import javax.inject.Inject;

public class SpotifyPickArtistView extends LinearLayout implements SpotifyPickArtistsTarget {
    @Inject
    /* renamed from: a */
    C18161c f51970a;
    /* renamed from: b */
    private Unbinder f51971b;
    /* renamed from: c */
    private SpotifyPickTrackAdapter f51972c;
    @BindView(2131363685)
    SwipeRefreshLayout mPullContainer;
    @BindView(2131363684)
    RecyclerView mTrackList;

    /* renamed from: com.tinder.spotify.views.SpotifyPickArtistView$1 */
    class C168661 implements OnRefreshListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyPickArtistView f51969a;

        C168661(SpotifyPickArtistView spotifyPickArtistView) {
            this.f51969a = spotifyPickArtistView;
        }

        public void onRefresh() {
            this.f51969a.f51970a.m65890d();
        }
    }

    /* renamed from: com.tinder.spotify.views.SpotifyPickArtistView$a */
    private static class C18181a extends LinearLayoutManager {
        C18181a(Context context) {
            super(context);
        }
    }

    public SpotifyPickArtistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ManagerApp.e().inject(this);
        inflate(getContext(), R.layout.view_spotify_pick_tracks, this);
    }

    public void setTrackList(List<Artist> list) {
        if (list != null) {
            this.f51972c.m67405c((List) list);
        }
        this.mPullContainer.setRefreshing(false);
    }

    public void setLastUpdateAt(String str) {
        this.f51972c.m67401a(str);
    }

    public void showErrorMessage(@StringRes int i) {
        at.m57641a(this.mTrackList.getRootView(), i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f51971b = ButterKnife.a(this);
        m62433b();
        this.f51970a.a(this);
        this.f51970a.m65883b();
    }

    /* renamed from: b */
    private void m62433b() {
        this.mPullContainer.setOnRefreshListener(new C168661(this));
        this.mPullContainer.setColorSchemeResources(new int[]{17170459, 17170452, 17170456, 17170454});
        ManagerApp.e().inject(this);
        this.f51972c = new SpotifyPickTrackAdapter(getContext());
        this.mTrackList.setLayoutManager(new C18181a(getContext()));
        this.mTrackList.setAdapter(this.f51972c);
        this.f51972c.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m62434a() {
        this.f51970a.m65887c();
    }

    public void onPause() {
        this.f51970a.m65882a(this.f51972c.m67404c());
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51970a.a();
        this.f51971b.unbind();
    }
}
