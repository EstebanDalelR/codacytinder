package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.C2121h;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.C3598b;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.C3585a;
import com.google.android.exoplayer2.ui.C2273b.C2268b;
import com.google.android.exoplayer2.ui.C2273b.C2269c;
import com.google.android.exoplayer2.ui.C2273b.C2270d;
import com.google.android.exoplayer2.ui.C2273b.C2271e;
import com.google.android.exoplayer2.ui.C2273b.C2272f;
import com.google.android.exoplayer2.ui.TimeBar.OnScrubListener;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class PlayerControlView extends FrameLayout {
    /* renamed from: A */
    private boolean f6704A;
    /* renamed from: B */
    private boolean f6705B;
    /* renamed from: C */
    private boolean f6706C;
    /* renamed from: D */
    private boolean f6707D;
    /* renamed from: E */
    private int f6708E;
    /* renamed from: F */
    private int f6709F;
    /* renamed from: G */
    private int f6710G;
    /* renamed from: H */
    private int f6711H;
    /* renamed from: I */
    private boolean f6712I;
    /* renamed from: J */
    private long f6713J;
    /* renamed from: K */
    private long[] f6714K;
    /* renamed from: L */
    private boolean[] f6715L;
    /* renamed from: M */
    private long[] f6716M;
    /* renamed from: N */
    private boolean[] f6717N;
    /* renamed from: O */
    private final Runnable f6718O = new C22611(this);
    /* renamed from: P */
    private final Runnable f6719P = new C22622(this);
    /* renamed from: a */
    private final C4264a f6720a;
    /* renamed from: b */
    private final View f6721b;
    /* renamed from: c */
    private final View f6722c;
    /* renamed from: d */
    private final View f6723d;
    /* renamed from: e */
    private final View f6724e;
    /* renamed from: f */
    private final View f6725f;
    /* renamed from: g */
    private final View f6726g;
    /* renamed from: h */
    private final ImageView f6727h;
    /* renamed from: i */
    private final View f6728i;
    /* renamed from: j */
    private final TextView f6729j;
    /* renamed from: k */
    private final TextView f6730k;
    /* renamed from: l */
    private final TimeBar f6731l;
    /* renamed from: m */
    private final StringBuilder f6732m;
    /* renamed from: n */
    private final Formatter f6733n;
    /* renamed from: o */
    private final C2163a f6734o;
    /* renamed from: p */
    private final C2164b f6735p;
    /* renamed from: q */
    private final Drawable f6736q;
    /* renamed from: r */
    private final Drawable f6737r;
    /* renamed from: s */
    private final Drawable f6738s;
    /* renamed from: t */
    private final String f6739t;
    /* renamed from: u */
    private final String f6740u;
    /* renamed from: v */
    private final String f6741v;
    /* renamed from: w */
    private Player f6742w;
    /* renamed from: x */
    private ControlDispatcher f6743x;
    /* renamed from: y */
    private VisibilityListener f6744y;
    @Nullable
    /* renamed from: z */
    private PlaybackPreparer f6745z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$1 */
    class C22611 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ PlayerControlView f6702a;

        C22611(PlayerControlView playerControlView) {
            this.f6702a = playerControlView;
        }

        public void run() {
            this.f6702a.m8157k();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$2 */
    class C22622 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ PlayerControlView f6703a;

        C22622(PlayerControlView playerControlView) {
            this.f6703a = playerControlView;
        }

        public void run() {
            this.f6703a.m8182b();
        }
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$a */
    private final class C4264a extends C3585a implements OnClickListener, OnScrubListener {
        /* renamed from: a */
        final /* synthetic */ PlayerControlView f13814a;

        private C4264a(PlayerControlView playerControlView) {
            this.f13814a = playerControlView;
        }

        public void onScrubStart(TimeBar timeBar, long j) {
            this.f13814a.removeCallbacks(this.f13814a.f6719P);
            this.f13814a.f6707D = 1;
        }

        public void onScrubMove(TimeBar timeBar, long j) {
            if (this.f13814a.f6730k != null) {
                this.f13814a.f6730k.setText(C2314v.m8467a(this.f13814a.f6732m, this.f13814a.f6733n, j));
            }
        }

        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            this.f13814a.f6707D = false;
            if (!(z || this.f13814a.f6742w == null)) {
                this.f13814a.m8141b(j);
            }
            this.f13814a.m8144d();
        }

        public void onPlayerStateChanged(boolean z, int i) {
            this.f13814a.m8148f();
            this.f13814a.m8157k();
        }

        public void onRepeatModeChanged(int i) {
            this.f13814a.m8151h();
            this.f13814a.m8149g();
        }

        public void onShuffleModeEnabledChanged(boolean z) {
            this.f13814a.m8153i();
            this.f13814a.m8149g();
        }

        public void onPositionDiscontinuity(int i) {
            this.f13814a.m8149g();
            this.f13814a.m8157k();
        }

        public void onTimelineChanged(C2165q c2165q, Object obj, int i) {
            this.f13814a.m8149g();
            this.f13814a.m8155j();
            this.f13814a.m8157k();
        }

        public void onClick(View view) {
            if (this.f13814a.f6742w != null) {
                if (this.f13814a.f6722c == view) {
                    this.f13814a.m8163n();
                } else if (this.f13814a.f6721b == view) {
                    this.f13814a.m8162m();
                } else if (this.f13814a.f6725f == view) {
                    this.f13814a.m8167p();
                } else if (this.f13814a.f6726g == view) {
                    this.f13814a.m8166o();
                } else if (this.f13814a.f6723d == view) {
                    if (this.f13814a.f6742w.getPlaybackState() == 1) {
                        if (this.f13814a.f6745z != null) {
                            this.f13814a.f6745z.preparePlayback();
                        }
                    } else if (this.f13814a.f6742w.getPlaybackState() == 4) {
                        this.f13814a.f6743x.dispatchSeekTo(this.f13814a.f6742w, this.f13814a.f6742w.getCurrentWindowIndex(), -9223372036854775807L);
                    }
                    this.f13814a.f6743x.dispatchSetPlayWhenReady(this.f13814a.f6742w, true);
                } else if (this.f13814a.f6724e == view) {
                    this.f13814a.f6743x.dispatchSetPlayWhenReady(this.f13814a.f6742w, false);
                } else if (this.f13814a.f6727h == view) {
                    this.f13814a.f6743x.dispatchSetRepeatMode(this.f13814a.f6742w, RepeatModeUtil.m8306a(this.f13814a.f6742w.getRepeatMode(), this.f13814a.f6711H));
                } else if (this.f13814a.f6728i == view) {
                    this.f13814a.f6743x.dispatchSetShuffleModeEnabled(this.f13814a.f6742w, true ^ this.f13814a.f6742w.getShuffleModeEnabled());
                }
            }
            this.f13814a.m8144d();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static boolean m8137a(int i) {
        if (!(i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87)) {
            if (i != 88) {
                return false;
            }
        }
        return true;
    }

    static {
        C2121h.m7580a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        attributeSet = C2270d.exo_player_control_view;
        this.f6708E = 5000;
        this.f6709F = 15000;
        this.f6710G = 5000;
        this.f6711H = 0;
        this.f6713J = -9223372036854775807L;
        this.f6712I = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C2272f.PlayerControlView, 0, 0);
            try {
                this.f6708E = obtainStyledAttributes.getInt(C2272f.PlayerControlView_rewind_increment, this.f6708E);
                this.f6709F = obtainStyledAttributes.getInt(C2272f.PlayerControlView_fastforward_increment, this.f6709F);
                this.f6710G = obtainStyledAttributes.getInt(C2272f.PlayerControlView_show_timeout, this.f6710G);
                attributeSet = obtainStyledAttributes.getResourceId(C2272f.PlayerControlView_controller_layout_id, attributeSet);
                this.f6711H = m8131a(obtainStyledAttributes, this.f6711H);
                this.f6712I = obtainStyledAttributes.getBoolean(C2272f.PlayerControlView_show_shuffle_button, this.f6712I);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6734o = new C2163a();
        this.f6735p = new C2164b();
        this.f6732m = new StringBuilder();
        this.f6733n = new Formatter(this.f6732m, Locale.getDefault());
        this.f6714K = new long[0];
        this.f6715L = new boolean[0];
        this.f6716M = new long[0];
        this.f6717N = new boolean[0];
        this.f6720a = new C4264a();
        this.f6743x = new C3598b();
        LayoutInflater.from(context).inflate(attributeSet, this);
        setDescendantFocusability(262144);
        this.f6729j = (TextView) findViewById(C2269c.exo_duration);
        this.f6730k = (TextView) findViewById(C2269c.exo_position);
        this.f6731l = (TimeBar) findViewById(C2269c.exo_progress);
        if (this.f6731l != null) {
            this.f6731l.addListener(this.f6720a);
        }
        this.f6723d = findViewById(C2269c.exo_play);
        if (this.f6723d != null) {
            this.f6723d.setOnClickListener(this.f6720a);
        }
        this.f6724e = findViewById(C2269c.exo_pause);
        if (this.f6724e != null) {
            this.f6724e.setOnClickListener(this.f6720a);
        }
        this.f6721b = findViewById(C2269c.exo_prev);
        if (this.f6721b != null) {
            this.f6721b.setOnClickListener(this.f6720a);
        }
        this.f6722c = findViewById(C2269c.exo_next);
        if (this.f6722c != null) {
            this.f6722c.setOnClickListener(this.f6720a);
        }
        this.f6726g = findViewById(C2269c.exo_rew);
        if (this.f6726g != null) {
            this.f6726g.setOnClickListener(this.f6720a);
        }
        this.f6725f = findViewById(C2269c.exo_ffwd);
        if (this.f6725f != null) {
            this.f6725f.setOnClickListener(this.f6720a);
        }
        this.f6727h = (ImageView) findViewById(C2269c.exo_repeat_toggle);
        if (this.f6727h != null) {
            this.f6727h.setOnClickListener(this.f6720a);
        }
        this.f6728i = findViewById(C2269c.exo_shuffle);
        if (this.f6728i != null) {
            this.f6728i.setOnClickListener(this.f6720a);
        }
        context = context.getResources();
        this.f6736q = context.getDrawable(C2268b.exo_controls_repeat_off);
        this.f6737r = context.getDrawable(C2268b.exo_controls_repeat_one);
        this.f6738s = context.getDrawable(C2268b.exo_controls_repeat_all);
        this.f6739t = context.getString(C2271e.exo_controls_repeat_off_description);
        this.f6740u = context.getString(C2271e.exo_controls_repeat_one_description);
        this.f6741v = context.getString(C2271e.exo_controls_repeat_all_description);
    }

    /* renamed from: a */
    private static int m8131a(TypedArray typedArray, int i) {
        return typedArray.getInt(C2272f.PlayerControlView_repeat_toggle_modes, i);
    }

    public Player getPlayer() {
        return this.f6742w;
    }

    public void setPlayer(Player player) {
        if (this.f6742w != player) {
            if (this.f6742w != null) {
                this.f6742w.removeListener(this.f6720a);
            }
            this.f6742w = player;
            if (player != null) {
                player.addListener(this.f6720a);
            }
            m8146e();
        }
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f6705B = z;
        m8155j();
    }

    public void setVisibilityListener(VisibilityListener visibilityListener) {
        this.f6744y = visibilityListener;
    }

    public void setPlaybackPreparer(@Nullable PlaybackPreparer playbackPreparer) {
        this.f6745z = playbackPreparer;
    }

    public void setControlDispatcher(@Nullable ControlDispatcher controlDispatcher) {
        if (controlDispatcher == null) {
            controlDispatcher = new C3598b();
        }
        this.f6743x = controlDispatcher;
    }

    public void setRewindIncrementMs(int i) {
        this.f6708E = i;
        m8149g();
    }

    public void setFastForwardIncrementMs(int i) {
        this.f6709F = i;
        m8149g();
    }

    public int getShowTimeoutMs() {
        return this.f6710G;
    }

    public void setShowTimeoutMs(int i) {
        this.f6710G = i;
        if (m8183c() != 0) {
            m8144d();
        }
    }

    public int getRepeatToggleModes() {
        return this.f6711H;
    }

    public void setRepeatToggleModes(int i) {
        this.f6711H = i;
        if (this.f6742w != null) {
            int repeatMode = this.f6742w.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.f6743x.dispatchSetRepeatMode(this.f6742w, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.f6743x.dispatchSetRepeatMode(this.f6742w, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.f6743x.dispatchSetRepeatMode(this.f6742w, 2);
            }
        }
    }

    public boolean getShowShuffleButton() {
        return this.f6712I;
    }

    public void setShowShuffleButton(boolean z) {
        this.f6712I = z;
        m8153i();
    }

    /* renamed from: a */
    public void m8180a() {
        if (!m8183c()) {
            setVisibility(0);
            if (this.f6744y != null) {
                this.f6744y.onVisibilityChange(getVisibility());
            }
            m8146e();
            m8159l();
        }
        m8144d();
    }

    /* renamed from: b */
    public void m8182b() {
        if (m8183c()) {
            setVisibility(8);
            if (this.f6744y != null) {
                this.f6744y.onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f6718O);
            removeCallbacks(this.f6719P);
            this.f6713J = -9223372036854775807L;
        }
    }

    /* renamed from: c */
    public boolean m8183c() {
        return getVisibility() == 0;
    }

    /* renamed from: d */
    private void m8144d() {
        removeCallbacks(this.f6719P);
        if (this.f6710G > 0) {
            this.f6713J = SystemClock.uptimeMillis() + ((long) this.f6710G);
            if (this.f6704A) {
                postDelayed(this.f6719P, (long) this.f6710G);
                return;
            }
            return;
        }
        this.f6713J = -9223372036854775807L;
    }

    /* renamed from: e */
    private void m8146e() {
        m8148f();
        m8149g();
        m8151h();
        m8153i();
        m8157k();
    }

    /* renamed from: f */
    private void m8148f() {
        if (m8183c()) {
            if (this.f6704A) {
                int i;
                boolean q = m8170q();
                int i2 = 8;
                int i3 = 1;
                if (this.f6723d != null) {
                    i = (q && this.f6723d.isFocused()) ? 1 : 0;
                    i |= 0;
                    this.f6723d.setVisibility(q ? 8 : 0);
                } else {
                    i = 0;
                }
                if (this.f6724e != null) {
                    if (q || !this.f6724e.isFocused()) {
                        i3 = 0;
                    }
                    i |= i3;
                    View view = this.f6724e;
                    if (q) {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                }
                if (i != 0) {
                    m8159l();
                }
            }
        }
    }

    /* renamed from: g */
    private void m8149g() {
        if (m8183c()) {
            if (this.f6704A) {
                boolean z;
                boolean z2;
                boolean z3;
                C2165q currentTimeline = this.f6742w != null ? this.f6742w.getCurrentTimeline() : null;
                boolean z4 = true;
                Object obj = (currentTimeline == null || currentTimeline.m7802a()) ? null : 1;
                if (obj == null || this.f6742w.isPlayingAd()) {
                    z = false;
                    z2 = false;
                    z3 = false;
                } else {
                    currentTimeline.m7799a(this.f6742w.getCurrentWindowIndex(), this.f6735p);
                    z = this.f6735p.f6212d;
                    if (!z && this.f6735p.f6213e) {
                        if (this.f6742w.getPreviousWindowIndex() == -1) {
                            z3 = false;
                            if (!this.f6735p.f6213e) {
                                if (this.f6742w.getNextWindowIndex() != -1) {
                                    z2 = false;
                                }
                            }
                            z2 = true;
                        }
                    }
                    z3 = true;
                    if (this.f6735p.f6213e) {
                        if (this.f6742w.getNextWindowIndex() != -1) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
                m8136a(z3, this.f6721b);
                m8136a(z2, this.f6722c);
                z2 = this.f6709F > 0 && z;
                m8136a(z2, this.f6725f);
                if (this.f6708E <= 0 || !z) {
                    z4 = false;
                }
                m8136a(z4, this.f6726g);
                if (this.f6731l != null) {
                    this.f6731l.setEnabled(z);
                }
            }
        }
    }

    /* renamed from: h */
    private void m8151h() {
        if (m8183c() && this.f6704A) {
            if (this.f6727h != null) {
                if (this.f6711H == 0) {
                    this.f6727h.setVisibility(8);
                } else if (this.f6742w == null) {
                    m8136a(false, this.f6727h);
                } else {
                    m8136a(true, this.f6727h);
                    switch (this.f6742w.getRepeatMode()) {
                        case 0:
                            this.f6727h.setImageDrawable(this.f6736q);
                            this.f6727h.setContentDescription(this.f6739t);
                            break;
                        case 1:
                            this.f6727h.setImageDrawable(this.f6737r);
                            this.f6727h.setContentDescription(this.f6740u);
                            break;
                        case 2:
                            this.f6727h.setImageDrawable(this.f6738s);
                            this.f6727h.setContentDescription(this.f6741v);
                            break;
                        default:
                            break;
                    }
                    this.f6727h.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: i */
    private void m8153i() {
        if (m8183c() && this.f6704A) {
            if (this.f6728i != null) {
                if (!this.f6712I) {
                    this.f6728i.setVisibility(8);
                } else if (this.f6742w == null) {
                    m8136a(false, this.f6728i);
                } else {
                    this.f6728i.setAlpha(this.f6742w.getShuffleModeEnabled() ? 1.0f : 0.3f);
                    this.f6728i.setEnabled(true);
                    this.f6728i.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: j */
    private void m8155j() {
        if (this.f6742w != null) {
            boolean z = this.f6705B && m8138a(this.f6742w.getCurrentTimeline(), this.f6735p);
            this.f6706C = z;
        }
    }

    /* renamed from: k */
    private void m8157k() {
        PlayerControlView playerControlView = this;
        if (m8183c()) {
            if (playerControlView.f6704A) {
                long j;
                long j2;
                long a;
                long contentPosition;
                int length;
                int i = 1;
                if (playerControlView.f6742w != null) {
                    long j3;
                    int i2;
                    C2165q currentTimeline = playerControlView.f6742w.getCurrentTimeline();
                    if (currentTimeline.m7802a()) {
                        j3 = 0;
                        i2 = 0;
                        j = 0;
                    } else {
                        int currentWindowIndex = playerControlView.f6742w.getCurrentWindowIndex();
                        int i3 = playerControlView.f6706C ? 0 : currentWindowIndex;
                        int b = playerControlView.f6706C ? currentTimeline.mo2318b() - 1 : currentWindowIndex;
                        j3 = 0;
                        i2 = 0;
                        j = 0;
                        while (i3 <= b) {
                            if (i3 == currentWindowIndex) {
                                j = j3;
                            }
                            currentTimeline.m7799a(i3, playerControlView.f6735p);
                            if (playerControlView.f6735p.f6217i == -9223372036854775807L) {
                                C2289a.m8313b(playerControlView.f6706C ^ i);
                                break;
                            }
                            int i4 = playerControlView.f6735p.f6214f;
                            while (i4 <= playerControlView.f6735p.f6215g) {
                                int i5;
                                currentTimeline.m7797a(i4, playerControlView.f6734o);
                                int d = playerControlView.f6734o.m7783d();
                                i = i2;
                                i2 = 0;
                                while (i2 < d) {
                                    long a2 = playerControlView.f6734o.m7773a(i2);
                                    if (a2 != Long.MIN_VALUE) {
                                        j2 = a2;
                                    } else if (playerControlView.f6734o.f6206d == -9223372036854775807L) {
                                        i5 = currentWindowIndex;
                                        i2++;
                                        currentWindowIndex = i5;
                                    } else {
                                        j2 = playerControlView.f6734o.f6206d;
                                    }
                                    long c = j2 + playerControlView.f6734o.m7780c();
                                    if (c >= 0 && c <= playerControlView.f6735p.f6217i) {
                                        if (i == playerControlView.f6714K.length) {
                                            int length2 = playerControlView.f6714K.length == 0 ? 1 : playerControlView.f6714K.length * 2;
                                            playerControlView.f6714K = Arrays.copyOf(playerControlView.f6714K, length2);
                                            playerControlView.f6715L = Arrays.copyOf(playerControlView.f6715L, length2);
                                        }
                                        i5 = currentWindowIndex;
                                        playerControlView.f6714K[i] = C2005C.m7215a(j3 + c);
                                        playerControlView.f6715L[i] = playerControlView.f6734o.m7782c(i2);
                                        i++;
                                        i2++;
                                        currentWindowIndex = i5;
                                    }
                                    i5 = currentWindowIndex;
                                    i2++;
                                    currentWindowIndex = i5;
                                }
                                i5 = currentWindowIndex;
                                i4++;
                                i2 = i;
                            }
                            i3++;
                            j3 += playerControlView.f6735p.f6217i;
                            currentWindowIndex = currentWindowIndex;
                            i = 1;
                        }
                    }
                    j2 = C2005C.m7215a(j3);
                    a = C2005C.m7215a(j);
                    if (playerControlView.f6742w.isPlayingAd()) {
                        contentPosition = a + playerControlView.f6742w.getContentPosition();
                        j = contentPosition;
                    } else {
                        contentPosition = a + playerControlView.f6742w.getCurrentPosition();
                        j = a + playerControlView.f6742w.getBufferedPosition();
                    }
                    if (playerControlView.f6731l != null) {
                        length = playerControlView.f6716M.length;
                        i = i2 + length;
                        if (i > playerControlView.f6714K.length) {
                            playerControlView.f6714K = Arrays.copyOf(playerControlView.f6714K, i);
                            playerControlView.f6715L = Arrays.copyOf(playerControlView.f6715L, i);
                        }
                        System.arraycopy(playerControlView.f6716M, 0, playerControlView.f6714K, i2, length);
                        System.arraycopy(playerControlView.f6717N, 0, playerControlView.f6715L, i2, length);
                        playerControlView.f6731l.setAdGroupTimesMs(playerControlView.f6714K, playerControlView.f6715L, i);
                    }
                } else {
                    j2 = 0;
                    contentPosition = 0;
                    j = 0;
                }
                if (playerControlView.f6729j != null) {
                    playerControlView.f6729j.setText(C2314v.m8467a(playerControlView.f6732m, playerControlView.f6733n, j2));
                }
                if (!(playerControlView.f6730k == null || playerControlView.f6707D)) {
                    playerControlView.f6730k.setText(C2314v.m8467a(playerControlView.f6732m, playerControlView.f6733n, contentPosition));
                }
                if (playerControlView.f6731l != null) {
                    playerControlView.f6731l.setPosition(contentPosition);
                    playerControlView.f6731l.setBufferedPosition(j);
                    playerControlView.f6731l.setDuration(j2);
                }
                removeCallbacks(playerControlView.f6718O);
                if (playerControlView.f6742w == null) {
                    length = 1;
                    i = 1;
                } else {
                    i = playerControlView.f6742w.getPlaybackState();
                    length = 1;
                }
                if (!(i == length || i == 4)) {
                    j2 = 1000;
                    if (playerControlView.f6742w.getPlayWhenReady() && i == 3) {
                        float f = playerControlView.f6742w.getPlaybackParameters().f6152b;
                        if (f > 0.1f) {
                            if (f <= 5.0f) {
                                a = (long) (AdError.NETWORK_ERROR_CODE / Math.max(1, Math.round(1.0f / f)));
                                long j4 = a - (contentPosition % a);
                                if (j4 < a / 5) {
                                    j4 += a;
                                }
                                j2 = f == 1.0f ? j4 : (long) (((float) j4) / f);
                            } else {
                                j2 = 200;
                            }
                        }
                    }
                    postDelayed(playerControlView.f6718O, j2);
                }
            }
        }
    }

    /* renamed from: l */
    private void m8159l() {
        boolean q = m8170q();
        if (!q && this.f6723d != null) {
            this.f6723d.requestFocus();
        } else if (q && this.f6724e != null) {
            this.f6724e.requestFocus();
        }
    }

    /* renamed from: a */
    private void m8136a(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? true : true);
            view.setVisibility(false);
        }
    }

    /* renamed from: m */
    private void m8162m() {
        C2165q currentTimeline = this.f6742w.getCurrentTimeline();
        if (!currentTimeline.m7802a()) {
            currentTimeline.m7799a(this.f6742w.getCurrentWindowIndex(), this.f6735p);
            int previousWindowIndex = this.f6742w.getPreviousWindowIndex();
            if (previousWindowIndex == -1 || (this.f6742w.getCurrentPosition() > 3000 && (!this.f6735p.f6213e || this.f6735p.f6212d))) {
                m8133a(0);
            } else {
                m8132a(previousWindowIndex, -9223372036854775807L);
            }
        }
    }

    /* renamed from: n */
    private void m8163n() {
        C2165q currentTimeline = this.f6742w.getCurrentTimeline();
        if (!currentTimeline.m7802a()) {
            int currentWindowIndex = this.f6742w.getCurrentWindowIndex();
            int nextWindowIndex = this.f6742w.getNextWindowIndex();
            if (nextWindowIndex != -1) {
                m8132a(nextWindowIndex, -9223372036854775807L);
            } else if (currentTimeline.m7800a(currentWindowIndex, this.f6735p, false).f6213e) {
                m8132a(currentWindowIndex, -9223372036854775807L);
            }
        }
    }

    /* renamed from: o */
    private void m8166o() {
        if (this.f6708E > 0) {
            m8133a(Math.max(this.f6742w.getCurrentPosition() - ((long) this.f6708E), 0));
        }
    }

    /* renamed from: p */
    private void m8167p() {
        if (this.f6709F > 0) {
            long duration = this.f6742w.getDuration();
            long currentPosition = this.f6742w.getCurrentPosition() + ((long) this.f6709F);
            if (duration != -9223372036854775807L) {
                currentPosition = Math.min(currentPosition, duration);
            }
            m8133a(currentPosition);
        }
    }

    /* renamed from: a */
    private void m8133a(long j) {
        m8132a(this.f6742w.getCurrentWindowIndex(), j);
    }

    /* renamed from: a */
    private void m8132a(int i, long j) {
        if (this.f6743x.dispatchSeekTo(this.f6742w, i, j) == 0) {
            m8157k();
        }
    }

    /* renamed from: b */
    private void m8141b(long j) {
        int currentWindowIndex;
        C2165q currentTimeline = this.f6742w.getCurrentTimeline();
        if (!this.f6706C || currentTimeline.m7802a()) {
            currentWindowIndex = this.f6742w.getCurrentWindowIndex();
        } else {
            long c;
            int b = currentTimeline.mo2318b();
            currentWindowIndex = 0;
            while (true) {
                c = currentTimeline.m7799a(currentWindowIndex, this.f6735p).m7789c();
                if (j < c) {
                    break;
                } else if (currentWindowIndex == b - 1) {
                    break;
                } else {
                    currentWindowIndex++;
                    j -= c;
                }
            }
            j = c;
        }
        m8132a(currentWindowIndex, j);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6704A = true;
        if (this.f6713J != -9223372036854775807L) {
            long uptimeMillis = this.f6713J - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m8182b();
            } else {
                postDelayed(this.f6719P, uptimeMillis);
            }
        } else if (m8183c()) {
            m8144d();
        }
        m8146e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6704A = false;
        removeCallbacks(this.f6718O);
        removeCallbacks(this.f6719P);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!m8181a(keyEvent)) {
            if (super.dispatchKeyEvent(keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m8181a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f6742w != null) {
            if (m8137a(keyCode)) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 90) {
                        if (keyCode != 89) {
                            if (keyEvent.getRepeatCount() == null) {
                                switch (keyCode) {
                                    case 85:
                                        this.f6743x.dispatchSetPlayWhenReady(this.f6742w, this.f6742w.getPlayWhenReady() ^ true);
                                        break;
                                    case 87:
                                        m8163n();
                                        break;
                                    case 88:
                                        m8162m();
                                        break;
                                    case 126:
                                        this.f6743x.dispatchSetPlayWhenReady(this.f6742w, true);
                                        break;
                                    case 127:
                                        this.f6743x.dispatchSetPlayWhenReady(this.f6742w, false);
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        m8166o();
                    } else {
                        m8167p();
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private boolean m8170q() {
        if (this.f6742w == null || this.f6742w.getPlaybackState() == 4 || this.f6742w.getPlaybackState() == 1 || !this.f6742w.getPlayWhenReady()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m8138a(C2165q c2165q, C2164b c2164b) {
        if (c2165q.mo2318b() > 100) {
            return false;
        }
        int b = c2165q.mo2318b();
        for (int i = 0; i < b; i++) {
            if (c2165q.m7799a(i, c2164b).f6217i == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }
}
