package com.tinder.spotify.adapter;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.adapters.C7966f;
import com.tinder.spotify.model.Artist;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.List;

public class SpotifyPickTrackAdapter extends C7966f<Artist, TrackViewHolder, TrackViewHeaderHolder> {
    /* renamed from: a */
    public static final String f58555a = "SpotifyPickTrackAdapter";
    /* renamed from: b */
    private final List<Artist> f58556b = new ArrayList();
    /* renamed from: c */
    private TrackViewHeaderHolder f58557c;
    @NonNull
    /* renamed from: d */
    private Context f58558d;

    public class TrackViewHeaderHolder extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ SpotifyPickTrackAdapter f51927a;
        @BindView(2131363661)
        View mEmptyView;
        @BindView(2131363651)
        CustomTextView mLastUpdated;
        @BindView(2131363686)
        TextView mSelectedAll;

        public TrackViewHeaderHolder(SpotifyPickTrackAdapter spotifyPickTrackAdapter, View view) {
            this.f51927a = spotifyPickTrackAdapter;
            super(view);
            ButterKnife.a(this, view);
        }

        /* renamed from: a */
        public void m62402a() {
            if (this.f51927a.m67394d()) {
                this.mSelectedAll.setVisibility(0);
            } else {
                this.mSelectedAll.setVisibility(8);
            }
            if (this.f51927a.f58556b != null) {
                if (!this.f51927a.f58556b.isEmpty()) {
                    this.mEmptyView.setVisibility(8);
                    return;
                }
            }
            this.mEmptyView.setVisibility(0);
        }

        /* renamed from: a */
        public void m62403a(String str) {
            this.mLastUpdated.setText(str);
        }
    }

    public class TrackViewHeaderHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private TrackViewHeaderHolder f51928b;

        @UiThread
        public TrackViewHeaderHolder_ViewBinding(TrackViewHeaderHolder trackViewHeaderHolder, View view) {
            this.f51928b = trackViewHeaderHolder;
            trackViewHeaderHolder.mLastUpdated = (CustomTextView) C0761c.b(view, R.id.spotify_artists_last_updated, "field 'mLastUpdated'", CustomTextView.class);
            trackViewHeaderHolder.mSelectedAll = (TextView) C0761c.b(view, R.id.spotify_track_select_all, "field 'mSelectedAll'", TextView.class);
            trackViewHeaderHolder.mEmptyView = C0761c.a(view, R.id.spotify_empty_artists_container, "field 'mEmptyView'");
        }

        @CallSuper
        public void unbind() {
            TrackViewHeaderHolder trackViewHeaderHolder = this.f51928b;
            if (trackViewHeaderHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f51928b = null;
            trackViewHeaderHolder.mLastUpdated = null;
            trackViewHeaderHolder.mSelectedAll = null;
            trackViewHeaderHolder.mEmptyView = null;
        }
    }

    public class TrackViewHolder extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ SpotifyPickTrackAdapter f51929a;
        @BindView(2131363492)
        CheckBox mCheckBox;
        @BindDimen(2131166218)
        int mCornerRadius;
        @BindView(2131363489)
        ImageView mImageView;
        @BindView(2131363488)
        CustomTextView mTrackName;

        public TrackViewHolder(SpotifyPickTrackAdapter spotifyPickTrackAdapter, View view) {
            this.f51929a = spotifyPickTrackAdapter;
            super(view);
            ButterKnife.a(this, view);
        }

        /* renamed from: a */
        public void m62404a(final com.tinder.spotify.model.Artist r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = "";
            r1 = r7.getTopTrack();	 Catch:{ Exception -> 0x001f }
            r1 = r1.getAlbum();	 Catch:{ Exception -> 0x001f }
            r1 = r1.getImages();	 Catch:{ Exception -> 0x001f }
            r2 = 2;	 Catch:{ Exception -> 0x001f }
            r1 = r1.get(r2);	 Catch:{ Exception -> 0x001f }
            r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x001f }
            r2 = "url";	 Catch:{ Exception -> 0x001f }
            r1 = r1.get(r2);	 Catch:{ Exception -> 0x001f }
            r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x001f }
            r0 = r1;
            goto L_0x0039;
        L_0x001f:
            r1 = com.tinder.spotify.adapter.SpotifyPickTrackAdapter.f58555a;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "error when getting track album image.";
            r2.append(r3);
            r3 = r7.toString();
            r2.append(r3);
            r2 = r2.toString();
            com.tinder.utils.ad.b(r1, r2);
        L_0x0039:
            r1 = r6.f51929a;
            r1 = r1.f58558d;
            r1 = com.bumptech.glide.C0994i.b(r1);
            r0 = r1.a(r0);
            r0 = r0.l();
            r0 = r0.a();
            r1 = 2131231309; // 0x7f08024d float:1.8078695E38 double:1.052968173E-314;
            r0 = r0.b(r1);
            r1 = 1;
            r1 = new com.bumptech.glide.load.resource.bitmap.C3082c[r1];
            r2 = 0;
            r3 = new com.tinder.common.e.a.b;
            r4 = r6.f51929a;
            r4 = r4.f58558d;
            r5 = r6.mCornerRadius;
            r3.<init>(r4, r5);
            r1[r2] = r3;
            r0 = r0.a(r1);
            r1 = r6.mImageView;
            r0.a(r1);
            r0 = r6.mTrackName;
            r1 = r7.getName();
            r0.setText(r1);
            r0 = r6.mCheckBox;
            r1 = new com.tinder.spotify.adapter.SpotifyPickTrackAdapter$TrackViewHolder$1;
            r1.<init>(r6, r7);
            r0.setOnCheckedChangeListener(r1);
            r0 = r6.mCheckBox;
            r7 = r7.isSelected();
            r0.setChecked(r7);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.spotify.adapter.SpotifyPickTrackAdapter.TrackViewHolder.a(com.tinder.spotify.model.Artist):void");
        }
    }

    public class TrackViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private TrackViewHolder f51930b;

        @UiThread
        public TrackViewHolder_ViewBinding(TrackViewHolder trackViewHolder, View view) {
            this.f51930b = trackViewHolder;
            trackViewHolder.mImageView = (ImageView) C0761c.b(view, R.id.row_track_image, "field 'mImageView'", ImageView.class);
            trackViewHolder.mTrackName = (CustomTextView) C0761c.b(view, R.id.row_track_artist_name, "field 'mTrackName'", CustomTextView.class);
            trackViewHolder.mCheckBox = (CheckBox) C0761c.b(view, R.id.row_track_pick_checkbox, "field 'mCheckBox'", CheckBox.class);
            trackViewHolder.mCornerRadius = view.getContext().getResources().getDimensionPixelSize(R.dimen.spotify_top_track_image_view_corner_radius);
        }

        @CallSuper
        public void unbind() {
            TrackViewHolder trackViewHolder = this.f51930b;
            if (trackViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f51930b = null;
            trackViewHolder.mImageView = null;
            trackViewHolder.mTrackName = null;
            trackViewHolder.mCheckBox = null;
        }
    }

    /* renamed from: a */
    public /* synthetic */ ViewHolder m67395a(ViewGroup viewGroup) {
        return m67403c(viewGroup);
    }

    /* renamed from: b */
    public /* synthetic */ ViewHolder m67402b(ViewGroup viewGroup) {
        return m67406d(viewGroup);
    }

    public SpotifyPickTrackAdapter(@NonNull Context context) {
        this.f58558d = context;
    }

    public int getItemCount() {
        return this.f58556b.size() + 1;
    }

    /* renamed from: c */
    public TrackViewHolder m67403c(ViewGroup viewGroup) {
        return new TrackViewHolder(this, LayoutInflater.from(this.f58558d).inflate(R.layout.row_pick_track, viewGroup, false));
    }

    /* renamed from: d */
    public TrackViewHeaderHolder m67406d(ViewGroup viewGroup) {
        this.f58557c = new TrackViewHeaderHolder(this, LayoutInflater.from(this.f58558d).inflate(R.layout.view_pick_track_list_header, viewGroup, false));
        this.f58557c.mSelectedAll.setOnClickListener(new C15040a(this));
        return this.f58557c;
    }

    /* renamed from: a */
    final /* synthetic */ void m67398a(View view) {
        for (Artist selected : this.f58556b) {
            selected.setSelected(true);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m67400a(TrackViewHolder trackViewHolder, int i) {
        trackViewHolder.m62404a((Artist) this.f58556b.get(i));
    }

    /* renamed from: a */
    public void m67399a(TrackViewHeaderHolder trackViewHeaderHolder) {
        trackViewHeaderHolder.m62402a();
    }

    /* renamed from: a */
    public void m67401a(String str) {
        this.f58557c.m62403a(str);
    }

    /* renamed from: c */
    public List<Artist> m67404c() {
        return this.f58556b;
    }

    /* renamed from: c */
    public void m67405c(List<Artist> list) {
        this.f58556b.clear();
        this.f58556b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    private boolean m67394d() {
        if (this.f58556b.isEmpty()) {
            return false;
        }
        for (Artist isSelected : this.f58556b) {
            if (!isSelected.isSelected()) {
                return true;
            }
        }
        return false;
    }
}
