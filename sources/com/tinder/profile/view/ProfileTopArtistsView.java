package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.be;
import com.tinder.profile.target.ProfileTopArtistsTarget;
import com.tinder.spotify.p417c.C15047a;
import com.tinder.spotify.views.SpotifyFavoriteArtistPage;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class ProfileTopArtistsView extends LinearLayout implements ProfileTopArtistsTarget, ProfileView$a {
    @Inject
    /* renamed from: a */
    be f50294a;
    /* renamed from: b */
    private final List<C15047a> f50295b = new ArrayList();
    /* renamed from: c */
    private C0600i f50296c = new C161541(this);
    @BindView(2131363680)
    CirclePageIndicator circlePageIndicator;
    @BindView(2131363683)
    ViewPager viewPager;

    /* renamed from: com.tinder.profile.view.ProfileTopArtistsView$1 */
    class C161541 extends C0600i {
        /* renamed from: a */
        final /* synthetic */ ProfileTopArtistsView f50293a;

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        C161541(ProfileTopArtistsView profileTopArtistsView) {
            this.f50293a = profileTopArtistsView;
        }

        public /* synthetic */ Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            return m61043a(viewGroup, i);
        }

        public int getCount() {
            return this.f50293a.f50295b.size();
        }

        /* renamed from: a */
        public View m61043a(@NonNull ViewGroup viewGroup, int i) {
            SpotifyFavoriteArtistPage spotifyFavoriteArtistPage = (SpotifyFavoriteArtistPage) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favorite_artists_page, viewGroup, false);
            spotifyFavoriteArtistPage.m56750a((C15047a) this.f50293a.f50295b.get(i));
            viewGroup.addView(spotifyFavoriteArtistPage);
            return spotifyFavoriteArtistPage;
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    public ProfileTopArtistsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        inflate(context, R.layout.view_profile_spotify_top_artists, this);
        ButterKnife.a(this);
        this.viewPager.setAdapter(this.f50296c);
        this.viewPager.setOffscreenPageLimit(5);
        this.circlePageIndicator.setViewPager(this.viewPager);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50294a.a(this);
        this.f50294a.m64951b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50294a.m64950a();
    }

    /* renamed from: a */
    public void mo11746a() {
        m61046b();
    }

    public void hide() {
        setVisibility(8);
    }

    public void setTopTracks(@NonNull List<C15047a> list) {
        this.f50295b.clear();
        this.f50295b.addAll(list);
    }

    public void showTopTracks() {
        setVisibility(0);
        this.f50296c.notifyDataSetChanged();
        if (this.f50296c.getCount() <= 1) {
            this.circlePageIndicator.setVisibility(8);
        } else {
            this.circlePageIndicator.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m61046b() {
        this.f50294a.m64952c();
    }
}
