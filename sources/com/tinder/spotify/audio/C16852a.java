package com.tinder.spotify.audio;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.tinder.spotify.audio.SpotifyAudioStreamer.EventDelegate;
import com.tinder.spotify.audio.SpotifyAudioStreamer.State;

/* renamed from: com.tinder.spotify.audio.a */
public class C16852a implements OnCompletionListener, OnInfoListener, OnPreparedListener, SpotifyAudioStreamer {
    /* renamed from: a */
    private MediaPlayer f51940a;
    /* renamed from: b */
    private float f51941b;
    /* renamed from: c */
    private Handler f51942c = new Handler(Looper.getMainLooper());
    /* renamed from: d */
    private EventDelegate f51943d;
    /* renamed from: e */
    private boolean f51944e = false;
    /* renamed from: f */
    private Runnable f51945f = new C150431(this);

    /* renamed from: com.tinder.spotify.audio.a$1 */
    class C150431 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C16852a f46852a;

        C150431(C16852a c16852a) {
            this.f46852a = c16852a;
        }

        public void run() {
            if (this.f46852a.f51944e) {
                this.f46852a.m62409a();
                return;
            }
            this.f46852a.f51943d.notifyProgressChange(((float) this.f46852a.f51940a.getCurrentPosition()) / this.f46852a.f51941b);
            this.f46852a.m62409a();
        }
    }

    public void play(@Nullable String str) {
        if (str == null) {
            this.f51943d.notifyError(new IllegalArgumentException("Play URL must not be null"));
            return;
        }
        if (this.f51940a == null) {
            this.f51940a = new MediaPlayer();
            this.f51940a.setOnPreparedListener(this);
            this.f51940a.setOnCompletionListener(this);
            this.f51940a.setOnInfoListener(this);
            this.f51940a.setAudioStreamType(3);
        }
        try {
            this.f51940a.setDataSource(str);
            this.f51943d.notifyStateChanged(State.PREPARING);
            this.f51940a.prepareAsync();
        } catch (String str2) {
            this.f51943d.notifyError(str2);
        }
    }

    public void stop() {
        this.f51942c.removeCallbacks(this.f51945f);
        this.f51943d.notifyStateChanged(State.STOPPED);
        if (this.f51940a != null) {
            this.f51940a.stop();
            this.f51940a.reset();
            this.f51940a.release();
            this.f51940a = null;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        this.f51941b = (float) mediaPlayer.getDuration();
        this.f51943d.notifyStateChanged(State.PLAYING);
        m62409a();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f51943d.notifyCompleted();
        stop();
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 701:
                this.f51944e = true;
                this.f51943d.notifyStateChanged(State.BUFFERING);
                break;
            case 702:
                this.f51944e = false;
                this.f51943d.notifyStateChanged(State.PLAYING);
                break;
            default:
                break;
        }
        return false;
    }

    /* renamed from: a */
    private void m62409a() {
        this.f51942c.postDelayed(this.f51945f, 200);
    }

    public void setEventDelegate(EventDelegate eventDelegate) {
        this.f51943d = eventDelegate;
    }
}
