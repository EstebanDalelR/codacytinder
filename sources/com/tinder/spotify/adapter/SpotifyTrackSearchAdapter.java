package com.tinder.spotify.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.tinder.R;
import com.tinder.adapters.C7966f;
import com.tinder.common.p192e.p193a.C12777b;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.views.CustomTextView;
import java.util.List;
import java.util.Map;

public class SpotifyTrackSearchAdapter extends C7966f<SearchTrack, SearchTrackViewHolder, SearchTrackHeaderViewHolder> {
    /* renamed from: a */
    private String f58559a;
    /* renamed from: b */
    private OnSearchTrackClickListener f58560b;

    public interface OnSearchTrackClickListener {
        void onNoThemeSongClick();

        void onSearchTrackClick(SearchTrack searchTrack);
    }

    class SearchTrackHeaderViewHolder extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackSearchAdapter f51931a;
        @BindView(2131363639)
        CustomTextView mSongListTitle;

        @OnClick({2131363009})
        void onNoThemeSongClicked() {
            this.f51931a.f58560b.onNoThemeSongClick();
        }

        SearchTrackHeaderViewHolder(SpotifyTrackSearchAdapter spotifyTrackSearchAdapter, View view) {
            this.f51931a = spotifyTrackSearchAdapter;
            super(view);
            ButterKnife.a(this, view);
            m62405a(spotifyTrackSearchAdapter.f58559a);
        }

        /* renamed from: a */
        void m62405a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mSongListTitle.setText(str);
            }
        }
    }

    public class SearchTrackHeaderViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private SearchTrackHeaderViewHolder f51934b;
        /* renamed from: c */
        private View f51935c;

        @UiThread
        public SearchTrackHeaderViewHolder_ViewBinding(final SearchTrackHeaderViewHolder searchTrackHeaderViewHolder, View view) {
            this.f51934b = searchTrackHeaderViewHolder;
            searchTrackHeaderViewHolder.mSongListTitle = (CustomTextView) C0761c.b(view, R.id.songs_list_title, "field 'mSongListTitle'", CustomTextView.class);
            view = C0761c.a(view, R.id.no_theme_song_container, "method 'onNoThemeSongClicked'");
            this.f51935c = view;
            view.setOnClickListener(new C0759a(this) {
                /* renamed from: b */
                final /* synthetic */ SearchTrackHeaderViewHolder_ViewBinding f51933b;

                public void doClick(View view) {
                    searchTrackHeaderViewHolder.onNoThemeSongClicked();
                }
            });
        }

        @CallSuper
        public void unbind() {
            SearchTrackHeaderViewHolder searchTrackHeaderViewHolder = this.f51934b;
            if (searchTrackHeaderViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f51934b = null;
            searchTrackHeaderViewHolder.mSongListTitle = null;
            this.f51935c.setOnClickListener(null);
            this.f51935c = null;
        }
    }

    class SearchTrackViewHolder extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ SpotifyTrackSearchAdapter f51936a;
        @BindDimen(2131166218)
        int cornerPixels;
        @BindView(2131363527)
        CustomTextView mArtistName;
        @BindView(2131363489)
        ImageView mImageView;
        @BindDrawable(2131231309)
        Drawable mSpotifyIcon;
        @BindView(2131363491)
        CustomTextView mTrackName;

        SearchTrackViewHolder(SpotifyTrackSearchAdapter spotifyTrackSearchAdapter, View view) {
            this.f51936a = spotifyTrackSearchAdapter;
            super(view);
            ButterKnife.a(this, view);
        }

        /* renamed from: a */
        void m62407a(SearchTrack searchTrack) {
            if (searchTrack != null) {
                C0994i.b(this.itemView.getContext()).a(m62406b(searchTrack)).l().a().a(this.mSpotifyIcon).a(new C3082c[]{new C12777b(r0, this.cornerPixels)}).a(this.mImageView);
                this.mTrackName.setText(searchTrack.getName());
                this.mArtistName.setText(((Artist) searchTrack.getArtist().get(0)).getName());
                this.itemView.setOnClickListener(new C15041b(this, searchTrack));
            }
        }

        /* renamed from: a */
        final /* synthetic */ void m62408a(SearchTrack searchTrack, View view) {
            this.f51936a.f58560b.onSearchTrackClick(searchTrack);
        }

        /* renamed from: b */
        private String m62406b(SearchTrack searchTrack) {
            String str = "";
            return (searchTrack.getAlbum() == null || searchTrack.getAlbum().getImages() == null || searchTrack.getAlbum().getImages().size() <= 0) ? str : (String) ((Map) searchTrack.getAlbum().getImages().get(0)).get("url");
        }
    }

    public class SearchTrackViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private SearchTrackViewHolder f51937b;

        @UiThread
        public SearchTrackViewHolder_ViewBinding(SearchTrackViewHolder searchTrackViewHolder, View view) {
            this.f51937b = searchTrackViewHolder;
            searchTrackViewHolder.mImageView = (ImageView) C0761c.b(view, R.id.row_track_image, "field 'mImageView'", ImageView.class);
            searchTrackViewHolder.mTrackName = (CustomTextView) C0761c.b(view, R.id.row_track_name, "field 'mTrackName'", CustomTextView.class);
            searchTrackViewHolder.mArtistName = (CustomTextView) C0761c.b(view, R.id.search_row_artist_name, "field 'mArtistName'", CustomTextView.class);
            view = view.getContext();
            searchTrackViewHolder.cornerPixels = view.getResources().getDimensionPixelSize(R.dimen.spotify_top_track_image_view_corner_radius);
            searchTrackViewHolder.mSpotifyIcon = C0432b.a(view, R.drawable.ic_spotify);
        }

        @CallSuper
        public void unbind() {
            SearchTrackViewHolder searchTrackViewHolder = this.f51937b;
            if (searchTrackViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f51937b = null;
            searchTrackViewHolder.mImageView = null;
            searchTrackViewHolder.mTrackName = null;
            searchTrackViewHolder.mArtistName = null;
        }
    }

    /* renamed from: a */
    public void m67413a(SearchTrackHeaderViewHolder searchTrackHeaderViewHolder) {
    }

    /* renamed from: a */
    public /* synthetic */ ViewHolder m67409a(ViewGroup viewGroup) {
        return m67417c(viewGroup);
    }

    /* renamed from: b */
    public /* synthetic */ ViewHolder m67416b(ViewGroup viewGroup) {
        return m67419d(viewGroup);
    }

    /* renamed from: c */
    public SearchTrackViewHolder m67417c(ViewGroup viewGroup) {
        return new SearchTrackViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_track_search_view, viewGroup, false));
    }

    /* renamed from: d */
    public SearchTrackHeaderViewHolder m67419d(ViewGroup viewGroup) {
        return new SearchTrackHeaderViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_theme_song_list_header, viewGroup, false));
    }

    /* renamed from: a */
    public void m67414a(SearchTrackViewHolder searchTrackViewHolder, int i) {
        searchTrackViewHolder.m62407a((SearchTrack) a(i));
    }

    /* renamed from: c */
    public void m67418c(@Nullable List<SearchTrack> list) {
        if (list != null) {
            super.b(list);
        }
    }

    /* renamed from: a */
    public void m67415a(@NonNull String str) {
        this.f58559a = str;
    }

    /* renamed from: a */
    public void m67412a(OnSearchTrackClickListener onSearchTrackClickListener) {
        this.f58560b = onSearchTrackClickListener;
    }
}
