package com.tinder.spotify.views;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.activity.SpotifyAuthActivity;
import com.tinder.spotify.activity.SpotifyPickTopArtistActivity;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.p416b.C18159b;
import com.tinder.spotify.target.SpotifyConnectTarget;
import com.tinder.utils.at;
import com.tinder.views.CustomTextView;
import java.util.List;
import javax.inject.Inject;

public class SpotifyConnectView extends LinearLayout implements SpotifyConnectTarget {
    @Inject
    /* renamed from: a */
    C18159b f51961a;
    @BindView(2131363656)
    CustomTextView mArtistNames;
    @BindView(2131363659)
    View mConnectedContainer;
    @BindView(2131363658)
    CustomTextView mCurrentUserName;
    @BindInt(2131427352)
    int mMaxChar;
    @BindView(2131363655)
    CustomTextView mMore;
    @BindView(2131363666)
    ProgressBar mProgressBar;
    @BindView(2131363657)
    View mProgressBarContainer;
    @BindView(2131362025)
    CustomTextView mSpotifyAuthButton;
    @BindView(2131363660)
    View mSpotifyContainer;

    public SpotifyConnectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62431a();
    }

    public SpotifyConnectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62431a();
    }

    /* renamed from: a */
    private void m62431a() {
        inflate(getContext(), R.layout.view_spotify_connect, this);
        ManagerApp.e().inject(this);
    }

    @OnClick({2131363660})
    public void spotifyClicked() {
        getContext().startActivity(SpotifyAuthActivity.m68659a(getContext(), 2));
        m62432b();
    }

    @OnClick({2131363659})
    public void connectedClicked() {
        getContext().startActivity(new Intent(getContext(), SpotifyPickTopArtistActivity.class));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.f51961a.a(this);
        m62432b();
        this.f51961a.m65869b();
    }

    public void initView(boolean z) {
        this.mProgressBar.setVisibility(8);
        this.mProgressBarContainer.setVisibility(8);
        if (z) {
            this.mConnectedContainer.setVisibility(0);
            this.mSpotifyContainer.setVisibility(8);
            return;
        }
        this.mConnectedContainer.setVisibility(8);
        this.mSpotifyContainer.setVisibility(0);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51961a.m65868a();
    }

    public void setTopArtists(List<Artist> list) {
        this.mCurrentUserName.setText(this.f51961a.m65870c());
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        String str = "";
        int i2 = 0;
        for (Artist artist : list) {
            if (stringBuilder.length() >= this.mMaxChar) {
                break;
            }
            if (artist.isSelected()) {
                stringBuilder.append(str);
                str = ", ";
                stringBuilder.append(artist.getName());
            }
            i2++;
        }
        if (TextUtils.isEmpty(stringBuilder.toString())) {
            this.mArtistNames.setText(getResources().getString(R.string.zero_artist));
            this.mMore.setVisibility(8);
            return;
        }
        this.mArtistNames.setText(stringBuilder.toString());
        if (i2 < list.size()) {
            this.mMore.setVisibility(0);
            while (i2 < list.size()) {
                if (((Artist) list.get(i2)).isSelected()) {
                    i++;
                }
                i2++;
            }
            if (i == 0) {
                this.mMore.setVisibility(8);
            } else {
                list = this.mMore;
                stringBuilder = new StringBuilder();
                stringBuilder.append("+");
                stringBuilder.append(i);
                list.setText(stringBuilder.toString());
            }
        } else {
            this.mMore.setVisibility(8);
        }
    }

    public void onConnectFinished(List<Artist> list, boolean z) {
        this.mProgressBar.setVisibility(8);
        this.mProgressBarContainer.setVisibility(8);
        if (z) {
            this.mConnectedContainer.setVisibility(0);
            this.mSpotifyContainer.setVisibility(8);
            setTopArtists(list);
            return;
        }
        this.mConnectedContainer.setVisibility(8);
        this.mSpotifyContainer.setVisibility(0);
        at.m57641a(this.mSpotifyContainer.getRootView(), (int) true);
    }

    /* renamed from: b */
    private void m62432b() {
        this.mSpotifyContainer.setVisibility(8);
        this.mConnectedContainer.setVisibility(8);
        this.mProgressBar.setVisibility(0);
        this.mProgressBarContainer.setVisibility(0);
    }
}
