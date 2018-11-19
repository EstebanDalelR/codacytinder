package com.tinder.spotify.p416b;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.enums.UserType;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.module.Default;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.audio.SpotifyAudioPlayer;
import com.tinder.spotify.audio.SpotifyAudioPlayer.C15042a;
import com.tinder.spotify.audio.SpotifyAudioPlayer.ProgressListener;
import com.tinder.spotify.audio.SpotifyAudioPlayer.StateListener;
import com.tinder.spotify.audio.SpotifyAudioStreamer.State;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.model.SpotifyMauEventType;
import com.tinder.spotify.model.SpotifyMauType;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyPlayerTarget;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;

/* renamed from: com.tinder.spotify.b.n */
public class C18162n extends PresenterBase<SpotifyPlayerTarget> {
    /* renamed from: a */
    private final SpotifyAudioPlayer f56344a;
    /* renamed from: b */
    private final C15035a f56345b;
    /* renamed from: c */
    private final ManagerAnalytics f56346c;
    /* renamed from: d */
    private final C2664c f56347d;
    /* renamed from: e */
    private SearchTrack f56348e;
    /* renamed from: f */
    private StateListener f56349f = new C16853o(this);
    /* renamed from: g */
    private ProgressListener f56350g = new C16854p(this);

    /* renamed from: com.tinder.spotify.b.n$1 */
    static /* synthetic */ class C150461 {
        /* renamed from: a */
        static final /* synthetic */ int[] f46855a = new int[UserType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            f46856b = r0;
            r0 = 1;
            r1 = f46856b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.PLAYING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f46856b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.STOPPED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f46856b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.BUFFERING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = f46856b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.PREPARING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r3 = f46856b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = com.tinder.spotify.audio.SpotifyAudioStreamer.State.ERROR;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r3 = com.tinder.enums.UserType.values();
            r3 = r3.length;
            r3 = new int[r3];
            f46855a = r3;
            r3 = f46855a;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r4 = com.tinder.enums.UserType.MATCH;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r0 = f46855a;	 Catch:{ NoSuchFieldError -> 0x005d }
            r3 = com.tinder.enums.UserType.REC;	 Catch:{ NoSuchFieldError -> 0x005d }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r0 = f46855a;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = com.tinder.enums.UserType.ME;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.spotify.b.n.1.<clinit>():void");
        }
    }

    @Inject
    public C18162n(SpotifyAudioPlayer spotifyAudioPlayer, C15035a c15035a, ManagerAnalytics managerAnalytics, @Default C2664c c2664c) {
        this.f56344a = spotifyAudioPlayer;
        this.f56345b = c15035a;
        this.f56346c = managerAnalytics;
        this.f56347d = c2664c;
    }

    /* renamed from: a */
    public void m65898a(@NonNull SpotifyPlayerTarget spotifyPlayerTarget) {
        super.a(spotifyPlayerTarget);
        this.f56347d.a(this);
        this.f56344a.m56700a(this.f56350g);
        this.f56344a.m56701a(this.f56349f);
    }

    /* renamed from: a */
    public void m65894a() {
        super.a();
        this.f56347d.c(this);
        this.f56344a.m56705b(this.f56349f);
    }

    /* renamed from: b */
    public void m65902b() {
        if (this.f56348e != null) {
            SearchTrack c = this.f56344a.m56707c();
            State b = this.f56344a.m56704b();
            if (b != State.STOPPED) {
                if (this.f56348e.equals(c)) {
                    if (b == State.PLAYING) {
                        a(C18922r.f58574a);
                        this.f56344a.m56698a();
                    }
                }
            }
            a(C18921q.f58573a);
            this.f56344a.m56702a(this.f56348e);
            m65893f();
            m65892e();
        }
    }

    /* renamed from: e */
    private void m65892e() {
        this.f56345b.m56664a(this.f56348e, SpotifyMauType.START.toString(), SpotifyMauEventType.EXTERNAL_PREVIEW_PLAY.toString());
    }

    /* renamed from: a */
    public void m65897a(SearchTrack searchTrack) {
        this.f56348e = searchTrack;
    }

    /* renamed from: c */
    public void m65903c() {
        this.f56344a.m56698a();
    }

    /* renamed from: a */
    public void m65900a(@NonNull String str) {
        this.f56344a.m56703a(str);
    }

    /* renamed from: f */
    private void m65893f() {
        this.f56345b.m56666a(true);
        User i = this.f56345b.m56682i();
        UserType n = this.f56345b.m56687n();
        if (n != null) {
            String str;
            String m;
            switch (C150461.f46855a[n.ordinal()]) {
                case 1:
                    str = "Match.Listen";
                    m = this.f56345b.m56686m();
                    break;
                case 2:
                    str = "Recs.Listen";
                    m = this.f56345b.m56686m();
                    break;
                case 3:
                    str = "Recs.Listen";
                    m = ManagerWebServices.NULL_STRING_VALUE;
                    break;
                default:
                    return;
            }
            SparksEvent put = new SparksEvent(str).put("otherId", m);
            if (i != null) {
                put.put(InstrumentationConstantsKt.FIELD_UID, i.getId());
                if (i.getSpotifyThemeTrack() != null) {
                    put.put("anthemConnected", TextUtils.isEmpty(i.getSpotifyThemeTrack().getName()) ^ true);
                }
            }
            if (this.f56348e != null) {
                put.put("songName", this.f56348e.getName());
                if (this.f56348e.getArtist().size() != 0) {
                    put.put("artistName", ((Artist) this.f56348e.getArtist().get(0)).getName());
                }
            }
            this.f56346c.a(put);
        }
    }

    /* renamed from: d */
    public SearchTrack m65904d() {
        return this.f56348e;
    }

    /* renamed from: a */
    public void m65901a(String str, UserType userType) {
        this.f56345b.m56676c(str);
        this.f56345b.m56663a(userType);
    }

    /* renamed from: a */
    final /* synthetic */ void m65896a(State state, SearchTrack searchTrack) {
        if (this.f56348e != null && this.f56348e.equals(searchTrack)) {
            if (G()) {
                SpotifyPlayerTarget spotifyPlayerTarget = (SpotifyPlayerTarget) H();
                switch (state) {
                    case PLAYING:
                        spotifyPlayerTarget.showPlaying(searchTrack);
                        break;
                    case STOPPED:
                        spotifyPlayerTarget.showStopped(searchTrack);
                        break;
                    case BUFFERING:
                    case PREPARING:
                        spotifyPlayerTarget.showLoading(searchTrack);
                        break;
                    case ERROR:
                        spotifyPlayerTarget.toastError(R.string.spotify_connection_error);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m65895a(float f) {
        ((SpotifyPlayerTarget) H()).showProgressChanged(f);
    }

    public void onEventMainThread(C15042a c15042a) {
        if (this.f56348e != null && this.f56344a.m56706b(this.f56348e)) {
            ((SpotifyPlayerTarget) H()).showProgressChanged(c15042a.m56690a());
        }
    }
}
