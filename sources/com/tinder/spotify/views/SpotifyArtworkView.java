package com.tinder.spotify.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.tinder.R;
import com.tinder.common.p192e.p193a.C12777b;
import com.tinder.spotify.model.SearchTrack;
import java.util.List;
import java.util.Map;
import java8.util.Optional;

public class SpotifyArtworkView extends FrameLayout {
    /* renamed from: a */
    private ArtworkListener f46880a;
    /* renamed from: b */
    private int f46881b;
    /* renamed from: c */
    private RequestListener<String, Bitmap> f46882c = new C168631(this);
    @BindView(2131363652)
    SpotifyArtworkRoundedImageView mArtworkView;
    @BindView(2131363653)
    ProgressBar mLoadingSpinner;
    @BindDimen(2131166218)
    int mPhotoCornerRadius;

    public interface ArtworkListener {
        void onArtworkClick();

        void onArtworkLoaded();
    }

    /* renamed from: com.tinder.spotify.views.SpotifyArtworkView$1 */
    class C168631 implements RequestListener<String, Bitmap> {
        /* renamed from: a */
        final /* synthetic */ SpotifyArtworkView f51959a;

        C168631(SpotifyArtworkView spotifyArtworkView) {
            this.f51959a = spotifyArtworkView;
        }

        public /* synthetic */ boolean onException(Exception exception, Object obj, Target target, boolean z) {
            return m62430a(exception, (String) obj, target, z);
        }

        public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, boolean z, boolean z2) {
            return m62429a((Bitmap) obj, (String) obj2, target, z, z2);
        }

        /* renamed from: a */
        public boolean m62430a(Exception exception, String str, Target<Bitmap> target, boolean z) {
            this.f51959a.mLoadingSpinner.setVisibility(8);
            return null;
        }

        /* renamed from: a */
        public boolean m62429a(Bitmap bitmap, String str, Target<Bitmap> target, boolean z, boolean z2) {
            this.f51959a.f46880a.onArtworkLoaded();
            this.f51959a.mLoadingSpinner.setVisibility(8);
            return null;
        }
    }

    public SpotifyArtworkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_spotify_artwork, this);
        setClipChildren(false);
        setClipToPadding(false);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        setOnClickListener(new C15056b(this));
        m56747a();
    }

    /* renamed from: a */
    final /* synthetic */ void m56748a(View view) {
        this.f46880a.onArtworkClick();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m56747a();
    }

    /* renamed from: a */
    public void m56749a(@NonNull SearchTrack searchTrack) {
        C0994i.b(getContext()).a((String) Optional.m59121b(searchTrack.getAlbum()).m59122a(C16873c.f52002a).m59122a(C16874d.f52003a).m59122a(C16875e.f52004a).m59130c((Object) "")).l().a(this.f46881b, this.f46881b).b().b(R.drawable.ic_spotify).a(this.f46882c).a(new C3082c[]{new C12777b(getContext(), this.mPhotoCornerRadius)}).a(this.mArtworkView);
    }

    /* renamed from: a */
    static final /* synthetic */ Map m56746a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Map) list.get(0);
    }

    public SpotifyArtworkRoundedImageView getArtworkImage() {
        return this.mArtworkView;
    }

    public void setArtworkListener(ArtworkListener artworkListener) {
        this.f46880a = artworkListener;
    }

    public void setArtworkSize(int i) {
        this.f46881b = i;
    }

    /* renamed from: a */
    private void m56747a() {
        this.mArtworkView.setCornerRadius((float) this.mPhotoCornerRadius);
    }
}
