package com.tinder.spotify.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p417c.C15047a;
import com.tinder.utils.av;

public class SpotifyFavoriteArtistPage extends LinearLayout {
    /* renamed from: a */
    private static final int f46883a = (av.b() / 2);

    public SpotifyFavoriteArtistPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    /* renamed from: a */
    public void m56750a(C15047a c15047a) {
        for (SearchTrack searchTrack : c15047a.m56710a()) {
            View a = SpotifyTopTrackItemView.m62439a((ViewGroup) this, f46883a);
            addView(a);
            a.m62442a(searchTrack);
        }
    }
}
