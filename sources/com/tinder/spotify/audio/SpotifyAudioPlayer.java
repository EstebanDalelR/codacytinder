package com.tinder.spotify.audio;

import android.media.AudioManager;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.tinder.module.Default;
import com.tinder.spotify.audio.SpotifyAudioStreamer.EventDelegate;
import com.tinder.spotify.audio.SpotifyAudioStreamer.State;
import com.tinder.spotify.model.SearchTrack;
import de.greenrobot.event.C2664c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SpotifyAudioPlayer {
    /* renamed from: a */
    private Set<StateListener> f46842a = new CopyOnWriteArraySet();
    /* renamed from: b */
    private boolean f46843b = false;
    /* renamed from: c */
    private ProgressListener f46844c = new C16851b(this);
    /* renamed from: d */
    private int f46845d = 1;
    /* renamed from: e */
    private State f46846e = State.STOPPED;
    /* renamed from: f */
    private SearchTrack f46847f;
    /* renamed from: g */
    private final SpotifyAudioStreamer f46848g;
    /* renamed from: h */
    private final C2664c f46849h;
    /* renamed from: i */
    private final AudioManager f46850i;
    /* renamed from: j */
    private final EventDelegate f46851j = new C168501(this);

    public interface ProgressListener {
        void onProgressChanged(float f);
    }

    public interface StateListener {
        void onStateChanged(State state, SearchTrack searchTrack);
    }

    /* renamed from: com.tinder.spotify.audio.SpotifyAudioPlayer$a */
    public static class C15042a {
        /* renamed from: a */
        private final float f46841a;

        C15042a(float f) {
            this.f46841a = f;
        }

        /* renamed from: a */
        public float m56690a() {
            return this.f46841a;
        }
    }

    /* renamed from: com.tinder.spotify.audio.SpotifyAudioPlayer$1 */
    class C168501 implements EventDelegate {
        /* renamed from: a */
        final /* synthetic */ SpotifyAudioPlayer f51938a;

        C168501(SpotifyAudioPlayer spotifyAudioPlayer) {
            this.f51938a = spotifyAudioPlayer;
        }

        public void notifyProgressChange(float f) {
            switch (this.f51938a.f46845d) {
                case 0:
                    this.f51938a.f46844c.onProgressChanged(f);
                    return;
                case 1:
                    this.f51938a.f46849h.d(new C15042a(f));
                    return;
                default:
                    return;
            }
        }

        public void notifyCompleted() {
            switch (this.f51938a.f46845d) {
                case 0:
                    this.f51938a.f46844c.onProgressChanged(1.0f);
                    return;
                case 1:
                    this.f51938a.f46849h.d(new C15042a(0.0f));
                    return;
                default:
                    return;
            }
        }

        public void notifyStateChanged(State state) {
            this.f51938a.f46846e = state;
            for (StateListener onStateChanged : this.f51938a.f46842a) {
                onStateChanged.onStateChanged(state, this.f51938a.f46847f);
            }
        }

        public void notifyError(Exception exception) {
            notifyCompleted();
            for (StateListener onStateChanged : this.f51938a.f46842a) {
                onStateChanged.onStateChanged(State.ERROR, this.f51938a.f46847f);
            }
        }
    }

    /* renamed from: com.tinder.spotify.audio.SpotifyAudioPlayer$b */
    class C16851b implements ProgressListener {
        /* renamed from: a */
        final /* synthetic */ SpotifyAudioPlayer f51939a;

        public void onProgressChanged(float f) {
        }

        C16851b(SpotifyAudioPlayer spotifyAudioPlayer) {
            this.f51939a = spotifyAudioPlayer;
        }
    }

    @Inject
    SpotifyAudioPlayer(SpotifyAudioStreamer spotifyAudioStreamer, AudioManager audioManager, @Default C2664c c2664c) {
        this.f46848g = spotifyAudioStreamer;
        this.f46848g.setEventDelegate(this.f46851j);
        this.f46849h = c2664c;
        this.f46850i = audioManager;
    }

    /* renamed from: a */
    public void m56702a(@NonNull SearchTrack searchTrack) {
        if (!(this.f46847f == null || this.f46847f.equals(searchTrack) || this.f46846e == State.STOPPED)) {
            this.f46848g.stop();
        }
        if (m56708d()) {
            this.f46847f = searchTrack;
            this.f46847f.setPlayToken(String.valueOf(System.currentTimeMillis()));
            this.f46848g.play(searchTrack.getPreviewUrl());
        }
    }

    /* renamed from: a */
    public void m56703a(@NonNull String str) {
        if (this.f46847f != null && this.f46847f.getId().equals(str) != null) {
            m56697e();
        }
    }

    /* renamed from: a */
    public void m56698a() {
        m56697e();
    }

    /* renamed from: a */
    public void m56701a(@NonNull StateListener stateListener) {
        this.f46842a.add(stateListener);
    }

    /* renamed from: b */
    public void m56705b(@NonNull StateListener stateListener) {
        this.f46842a.remove(stateListener);
    }

    /* renamed from: a */
    public void m56700a(@NonNull ProgressListener progressListener) {
        this.f46844c = progressListener;
    }

    /* renamed from: b */
    public State m56704b() {
        return this.f46846e;
    }

    /* renamed from: c */
    public SearchTrack m56707c() {
        return this.f46847f;
    }

    /* renamed from: b */
    public boolean m56706b(@NonNull SearchTrack searchTrack) {
        return (this.f46847f == null || this.f46847f.equals(searchTrack) == null || this.f46846e == State.STOPPED) ? null : true;
    }

    @VisibleForTesting
    /* renamed from: d */
    boolean m56708d() {
        boolean z = true;
        if (this.f46843b) {
            return true;
        }
        if (this.f46850i.requestAudioFocus(new C15044b(this), 3, 1) != 1) {
            z = false;
        }
        this.f46843b = z;
        return this.f46843b;
    }

    /* renamed from: a */
    final /* synthetic */ void m56699a(int i) {
        if (i != 1) {
            switch (i) {
                case -3:
                    this.f46843b = false;
                    m56697e();
                    return;
                case -2:
                    this.f46843b = false;
                    m56697e();
                    return;
                case -1:
                    this.f46843b = false;
                    m56697e();
                    return;
                default:
                    return;
            }
        }
        this.f46843b = true;
    }

    /* renamed from: e */
    private void m56697e() {
        this.f46848g.stop();
        this.f46847f = null;
    }
}
