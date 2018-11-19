package com.facebook.ads.internal.view.p052c.p054c;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.internal.view.c.c.c */
public interface C1589c {
    /* renamed from: a */
    void mo1790a(int i);

    /* renamed from: a */
    void mo1791a(VideoStartReason videoStartReason);

    /* renamed from: a */
    void mo1792a(boolean z);

    /* renamed from: b */
    void mo1793b();

    /* renamed from: b */
    void mo1794b(boolean z);

    /* renamed from: c */
    void mo1795c();

    /* renamed from: d */
    boolean mo1796d();

    /* renamed from: e */
    void mo1797e();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    VideoStartReason getStartReason();

    C1590d getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(C1591e c1591e);

    void setup(Uri uri);
}
