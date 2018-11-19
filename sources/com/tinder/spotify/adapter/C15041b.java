package com.tinder.spotify.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.spotify.model.SearchTrack;

/* renamed from: com.tinder.spotify.adapter.b */
final /* synthetic */ class C15041b implements OnClickListener {
    /* renamed from: a */
    private final SearchTrackViewHolder f46839a;
    /* renamed from: b */
    private final SearchTrack f46840b;

    C15041b(SearchTrackViewHolder searchTrackViewHolder, SearchTrack searchTrack) {
        this.f46839a = searchTrackViewHolder;
        this.f46840b = searchTrack;
    }

    public void onClick(View view) {
        this.f46839a.m62408a(this.f46840b, view);
    }
}
