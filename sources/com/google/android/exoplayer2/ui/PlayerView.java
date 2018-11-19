package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.C3585a;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener;
import com.google.android.exoplayer2.ui.C2273b.C2267a;
import com.google.android.exoplayer2.ui.C2273b.C2268b;
import com.google.android.exoplayer2.ui.C2273b.C2269c;
import com.google.android.exoplayer2.ui.C2273b.C2270d;
import com.google.android.exoplayer2.ui.C2273b.C2272f;
import com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.video.VideoListener;
import java.util.List;

public class PlayerView extends FrameLayout {
    /* renamed from: a */
    private final AspectRatioFrameLayout f6746a;
    /* renamed from: b */
    private final View f6747b;
    /* renamed from: c */
    private final View f6748c;
    /* renamed from: d */
    private final ImageView f6749d;
    /* renamed from: e */
    private final SubtitleView f6750e;
    @Nullable
    /* renamed from: f */
    private final View f6751f;
    @Nullable
    /* renamed from: g */
    private final TextView f6752g;
    /* renamed from: h */
    private final PlayerControlView f6753h;
    /* renamed from: i */
    private final C4265a f6754i;
    /* renamed from: j */
    private final FrameLayout f6755j;
    /* renamed from: k */
    private Player f6756k;
    /* renamed from: l */
    private boolean f6757l;
    /* renamed from: m */
    private boolean f6758m;
    /* renamed from: n */
    private Bitmap f6759n;
    /* renamed from: o */
    private boolean f6760o;
    /* renamed from: p */
    private boolean f6761p;
    @Nullable
    /* renamed from: q */
    private ErrorMessageProvider<? super ExoPlaybackException> f6762q;
    @Nullable
    /* renamed from: r */
    private CharSequence f6763r;
    /* renamed from: s */
    private int f6764s;
    /* renamed from: t */
    private boolean f6765t;
    /* renamed from: u */
    private boolean f6766u;
    /* renamed from: v */
    private boolean f6767v;
    /* renamed from: w */
    private int f6768w;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    private final class C4265a extends C3585a implements OnLayoutChangeListener, TextOutput, VideoListener {
        /* renamed from: a */
        final /* synthetic */ PlayerView f13815a;

        private C4265a(PlayerView playerView) {
            this.f13815a = playerView;
        }

        public void onCues(List<Cue> list) {
            if (this.f13815a.f6750e != null) {
                this.f13815a.f6750e.onCues(list);
            }
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            if (this.f13815a.f6746a != null) {
                if (i2 != 0) {
                    if (i != 0) {
                        i = (((float) i) * f) / ((float) i2);
                        if ((this.f13815a.f6748c instanceof TextureView) != 0) {
                            if (i3 == 90 || i3 == 270) {
                                i = 1.0f / i;
                            }
                            if (this.f13815a.f6768w != 0) {
                                this.f13815a.f6748c.removeOnLayoutChangeListener(this);
                            }
                            this.f13815a.f6768w = i3;
                            if (this.f13815a.f6768w != 0) {
                                this.f13815a.f6748c.addOnLayoutChangeListener(this);
                            }
                            PlayerView.m8196b((TextureView) this.f13815a.f6748c, this.f13815a.f6768w);
                        }
                        this.f13815a.f6746a.setAspectRatio(i);
                    }
                }
                i = 1065353216;
                if ((this.f13815a.f6748c instanceof TextureView) != 0) {
                    i = 1.0f / i;
                    if (this.f13815a.f6768w != 0) {
                        this.f13815a.f6748c.removeOnLayoutChangeListener(this);
                    }
                    this.f13815a.f6768w = i3;
                    if (this.f13815a.f6768w != 0) {
                        this.f13815a.f6748c.addOnLayoutChangeListener(this);
                    }
                    PlayerView.m8196b((TextureView) this.f13815a.f6748c, this.f13815a.f6768w);
                }
                this.f13815a.f6746a.setAspectRatio(i);
            }
        }

        public void onRenderedFirstFrame() {
            if (this.f13815a.f6747b != null) {
                this.f13815a.f6747b.setVisibility(4);
            }
        }

        public void onTracksChanged(TrackGroupArray trackGroupArray, C2255e c2255e) {
            this.f13815a.m8200c((boolean) null);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            this.f13815a.m8208g();
            this.f13815a.m8210h();
            if (this.f13815a.m8203d() && this.f13815a.f6766u) {
                this.f13815a.m8215b();
            } else {
                this.f13815a.m8190a((boolean) 0);
            }
        }

        public void onPositionDiscontinuity(int i) {
            if (this.f13815a.m8203d() != 0 && this.f13815a.f6766u != 0) {
                this.f13815a.m8215b();
            }
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m8196b((TextureView) view, this.f13815a.f6768w);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private boolean m8191a(int i) {
        if (!(i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268)) {
            if (i != 23) {
                return false;
            }
        }
        return true;
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        ViewGroup viewGroup = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        super(context, attributeSet, i);
        if (isInEditMode()) {
            viewGroup.f6746a = null;
            viewGroup.f6747b = null;
            viewGroup.f6748c = null;
            viewGroup.f6749d = null;
            viewGroup.f6750e = null;
            viewGroup.f6751f = null;
            viewGroup.f6752g = null;
            viewGroup.f6753h = null;
            viewGroup.f6754i = null;
            viewGroup.f6755j = null;
            ImageView imageView = new ImageView(context2);
            if (C2314v.f6956a >= 23) {
                m8186a(getResources(), imageView);
            } else {
                m8195b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int color;
        boolean z;
        int resourceId;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        int i5 = C2270d.exo_player_view;
        boolean hasValue;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C2272f.PlayerView, 0, 0);
            try {
                hasValue = obtainStyledAttributes.hasValue(C2272f.PlayerView_shutter_background_color);
                color = obtainStyledAttributes.getColor(C2272f.PlayerView_shutter_background_color, 0);
                i5 = obtainStyledAttributes.getResourceId(C2272f.PlayerView_player_layout_id, i5);
                z = obtainStyledAttributes.getBoolean(C2272f.PlayerView_use_artwork, true);
                resourceId = obtainStyledAttributes.getResourceId(C2272f.PlayerView_default_artwork, 0);
                z2 = obtainStyledAttributes.getBoolean(C2272f.PlayerView_use_controller, true);
                i2 = obtainStyledAttributes.getInt(C2272f.PlayerView_surface_type, 1);
                int i6 = obtainStyledAttributes.getInt(C2272f.PlayerView_resize_mode, 0);
                i3 = obtainStyledAttributes.getInt(C2272f.PlayerView_show_timeout, 5000);
                z3 = obtainStyledAttributes.getBoolean(C2272f.PlayerView_hide_on_touch, true);
                int i7 = i5;
                boolean z9 = obtainStyledAttributes.getBoolean(C2272f.PlayerView_auto_show, true);
                z4 = obtainStyledAttributes.getBoolean(C2272f.PlayerView_show_buffering, false);
                int i8 = i6;
                viewGroup.f6761p = obtainStyledAttributes.getBoolean(C2272f.PlayerView_keep_content_on_player_reset, viewGroup.f6761p);
                z5 = obtainStyledAttributes.getBoolean(C2272f.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z6 = z5;
                i4 = i3;
                z7 = z3;
                i5 = i7;
                i3 = i8;
                z8 = z2;
                z2 = z9;
            } catch (Throwable th) {
                Throwable th2 = th;
                obtainStyledAttributes.recycle();
            }
        } else {
            z6 = true;
            i3 = 0;
            z4 = false;
            z7 = true;
            hasValue = false;
            color = 0;
            z = true;
            resourceId = 0;
            z2 = true;
            i2 = 1;
            z8 = true;
            i4 = 5000;
        }
        LayoutInflater.from(context).inflate(i5, viewGroup);
        viewGroup.f6754i = new C4265a();
        setDescendantFocusability(262144);
        viewGroup.f6746a = (AspectRatioFrameLayout) findViewById(C2269c.exo_content_frame);
        if (viewGroup.f6746a != null) {
            m8188a(viewGroup.f6746a, i3);
        }
        viewGroup.f6747b = findViewById(C2269c.exo_shutter);
        if (viewGroup.f6747b != null && r10) {
            viewGroup.f6747b.setBackgroundColor(color);
        }
        if (viewGroup.f6746a == null || i2 == 0) {
            viewGroup.f6748c = null;
        } else {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            viewGroup.f6748c = i2 == 2 ? new TextureView(context2) : new SurfaceView(context2);
            viewGroup.f6748c.setLayoutParams(layoutParams);
            viewGroup.f6746a.addView(viewGroup.f6748c, 0);
        }
        viewGroup.f6755j = (FrameLayout) findViewById(C2269c.exo_overlay);
        viewGroup.f6749d = (ImageView) findViewById(C2269c.exo_artwork);
        z5 = z && viewGroup.f6749d != null;
        viewGroup.f6758m = z5;
        if (resourceId != 0) {
            viewGroup.f6759n = BitmapFactory.decodeResource(context.getResources(), resourceId);
        }
        viewGroup.f6750e = (SubtitleView) findViewById(C2269c.exo_subtitles);
        if (viewGroup.f6750e != null) {
            viewGroup.f6750e.m14072b();
            viewGroup.f6750e.m14070a();
        }
        viewGroup.f6751f = findViewById(C2269c.exo_buffering);
        if (viewGroup.f6751f != null) {
            viewGroup.f6751f.setVisibility(8);
        }
        viewGroup.f6760o = z4;
        viewGroup.f6752g = (TextView) findViewById(C2269c.exo_error_message);
        if (viewGroup.f6752g != null) {
            viewGroup.f6752g.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(C2269c.exo_controller);
        View findViewById = findViewById(C2269c.exo_controller_placeholder);
        if (playerControlView != null) {
            viewGroup.f6753h = playerControlView;
            z3 = false;
        } else if (findViewById != null) {
            z3 = false;
            viewGroup.f6753h = new PlayerControlView(context2, null, 0, attributeSet2);
            viewGroup.f6753h.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup2 = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup2.indexOfChild(findViewById);
            viewGroup2.removeView(findViewById);
            viewGroup2.addView(viewGroup.f6753h, indexOfChild);
        } else {
            z3 = false;
            viewGroup.f6753h = null;
        }
        viewGroup.f6764s = viewGroup.f6753h != null ? i4 : 0;
        viewGroup.f6767v = z7;
        viewGroup.f6765t = z2;
        viewGroup.f6766u = z6;
        if (z8 && viewGroup.f6753h != null) {
            z3 = true;
        }
        viewGroup.f6757l = z3;
        m8215b();
    }

    public Player getPlayer() {
        return this.f6756k;
    }

    public void setPlayer(Player player) {
        if (this.f6756k != player) {
            VideoComponent videoComponent;
            TextComponent textComponent;
            if (this.f6756k != null) {
                this.f6756k.removeListener(this.f6754i);
                videoComponent = this.f6756k.getVideoComponent();
                if (videoComponent != null) {
                    videoComponent.removeVideoListener(this.f6754i);
                    if (this.f6748c instanceof TextureView) {
                        videoComponent.clearVideoTextureView((TextureView) this.f6748c);
                    } else if (this.f6748c instanceof SurfaceView) {
                        videoComponent.clearVideoSurfaceView((SurfaceView) this.f6748c);
                    }
                }
                textComponent = this.f6756k.getTextComponent();
                if (textComponent != null) {
                    textComponent.removeTextOutput(this.f6754i);
                }
            }
            this.f6756k = player;
            if (this.f6757l) {
                this.f6753h.setPlayer(player);
            }
            if (this.f6750e != null) {
                this.f6750e.setCues(null);
            }
            m8208g();
            m8210h();
            m8200c(true);
            if (player != null) {
                videoComponent = player.getVideoComponent();
                if (videoComponent != null) {
                    if (this.f6748c instanceof TextureView) {
                        videoComponent.setVideoTextureView((TextureView) this.f6748c);
                    } else if (this.f6748c instanceof SurfaceView) {
                        videoComponent.setVideoSurfaceView((SurfaceView) this.f6748c);
                    }
                    videoComponent.addVideoListener(this.f6754i);
                }
                textComponent = player.getTextComponent();
                if (textComponent != null) {
                    textComponent.addTextOutput(this.f6754i);
                }
                player.addListener(this.f6754i);
                m8190a((boolean) null);
            } else {
                m8215b();
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f6748c instanceof SurfaceView) {
            this.f6748c.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        C2289a.m8313b(this.f6746a != null);
        this.f6746a.setResizeMode(i);
    }

    public int getResizeMode() {
        C2289a.m8313b(this.f6746a != null);
        return this.f6746a.getResizeMode();
    }

    public boolean getUseArtwork() {
        return this.f6758m;
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (z) {
            if (this.f6749d == null) {
                z2 = false;
                C2289a.m8313b(z2);
                if (this.f6758m != z) {
                    this.f6758m = z;
                    m8200c(false);
                }
            }
        }
        z2 = true;
        C2289a.m8313b(z2);
        if (this.f6758m != z) {
            this.f6758m = z;
            m8200c(false);
        }
    }

    public Bitmap getDefaultArtwork() {
        return this.f6759n;
    }

    public void setDefaultArtwork(Bitmap bitmap) {
        if (this.f6759n != bitmap) {
            this.f6759n = bitmap;
            m8200c((boolean) null);
        }
    }

    public boolean getUseController() {
        return this.f6757l;
    }

    public void setUseController(boolean z) {
        boolean z2;
        if (z) {
            if (this.f6753h == null) {
                z2 = false;
                C2289a.m8313b(z2);
                if (this.f6757l == z) {
                    this.f6757l = z;
                    if (z) {
                        this.f6753h.setPlayer(this.f6756k);
                    } else if (this.f6753h) {
                        this.f6753h.m8182b();
                        this.f6753h.setPlayer(null);
                    }
                }
            }
        }
        z2 = true;
        C2289a.m8313b(z2);
        if (this.f6757l == z) {
            this.f6757l = z;
            if (z) {
                this.f6753h.setPlayer(this.f6756k);
            } else if (this.f6753h) {
                this.f6753h.m8182b();
                this.f6753h.setPlayer(null);
            }
        }
    }

    public void setShutterBackgroundColor(int i) {
        if (this.f6747b != null) {
            this.f6747b.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f6761p != z) {
            this.f6761p = z;
            m8200c(false);
        }
    }

    public void setShowBuffering(boolean z) {
        if (this.f6760o != z) {
            this.f6760o = z;
            m8208g();
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super ExoPlaybackException> errorMessageProvider) {
        if (this.f6762q != errorMessageProvider) {
            this.f6762q = errorMessageProvider;
            m8210h();
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        C2289a.m8313b(this.f6752g != null);
        this.f6763r = charSequence;
        m8210h();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f6756k == null || !this.f6756k.isPlayingAd()) {
            boolean z = false;
            Object obj = (m8191a(keyEvent.getKeyCode()) && this.f6757l && !this.f6753h.m8183c()) ? 1 : null;
            m8190a(true);
            if (!(obj == null && !m8214a(keyEvent) && super.dispatchKeyEvent(keyEvent) == null)) {
                z = true;
            }
            return z;
        }
        this.f6755j.requestFocus();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public boolean m8214a(KeyEvent keyEvent) {
        return (!this.f6757l || this.f6753h.m8181a(keyEvent) == null) ? null : true;
    }

    /* renamed from: a */
    public void m8213a() {
        m8198b(m8201c());
    }

    /* renamed from: b */
    public void m8215b() {
        if (this.f6753h != null) {
            this.f6753h.m8182b();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.f6764s;
    }

    public void setControllerShowTimeoutMs(int i) {
        C2289a.m8313b(this.f6753h != null);
        this.f6764s = i;
        if (this.f6753h.m8183c() != 0) {
            m8213a();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.f6767v;
    }

    public void setControllerHideOnTouch(boolean z) {
        C2289a.m8313b(this.f6753h != null);
        this.f6767v = z;
    }

    public boolean getControllerAutoShow() {
        return this.f6765t;
    }

    public void setControllerAutoShow(boolean z) {
        this.f6765t = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f6766u = z;
    }

    public void setControllerVisibilityListener(VisibilityListener visibilityListener) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setVisibilityListener(visibilityListener);
    }

    public void setPlaybackPreparer(@Nullable PlaybackPreparer playbackPreparer) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setPlaybackPreparer(playbackPreparer);
    }

    public void setControlDispatcher(@Nullable ControlDispatcher controlDispatcher) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setControlDispatcher(controlDispatcher);
    }

    public void setRewindIncrementMs(int i) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setRewindIncrementMs(i);
    }

    public void setFastForwardIncrementMs(int i) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setFastForwardIncrementMs(i);
    }

    public void setRepeatToggleModes(int i) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setShowShuffleButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C2289a.m8313b(this.f6753h != null);
        this.f6753h.setShowMultiWindowTimeBar(z);
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
        C2289a.m8313b(this.f6746a != null);
        this.f6746a.setAspectRatioListener(aspectRatioListener);
    }

    public View getVideoSurfaceView() {
        return this.f6748c;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f6755j;
    }

    public SubtitleView getSubtitleView() {
        return this.f6750e;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6757l && this.f6756k != null) {
            if (motionEvent.getActionMasked() == null) {
                if (this.f6753h.m8183c() == null) {
                    m8190a(true);
                } else if (this.f6767v != null) {
                    this.f6753h.m8182b();
                }
                return true;
            }
        }
        return null;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (this.f6757l != null) {
            if (this.f6756k != null) {
                m8190a(true);
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m8190a(boolean z) {
        if (!(m8203d() && this.f6766u) && this.f6757l) {
            Object obj = (!this.f6753h.m8183c() || this.f6753h.getShowTimeoutMs() > 0) ? null : 1;
            boolean c = m8201c();
            if (z || obj != null || c) {
                m8198b(c);
            }
        }
    }

    /* renamed from: c */
    private boolean m8201c() {
        boolean z = true;
        if (this.f6756k == null) {
            return true;
        }
        int playbackState = this.f6756k.getPlaybackState();
        if (this.f6765t) {
            if (!(playbackState == 1 || playbackState == 4)) {
                if (!this.f6756k.getPlayWhenReady()) {
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    /* renamed from: b */
    private void m8198b(boolean z) {
        if (this.f6757l) {
            this.f6753h.setShowTimeoutMs(z ? false : this.f6764s);
            this.f6753h.m8180a();
        }
    }

    /* renamed from: d */
    private boolean m8203d() {
        return this.f6756k != null && this.f6756k.isPlayingAd() && this.f6756k.getPlayWhenReady();
    }

    /* renamed from: c */
    private void m8200c(boolean z) {
        if (this.f6756k != null) {
            if (!this.f6756k.getCurrentTrackGroups().isEmpty()) {
                if (z && !this.f6761p) {
                    m8206f();
                }
                z = this.f6756k.getCurrentTrackSelections();
                int i = 0;
                while (i < z.f6685a) {
                    if (this.f6756k.getRendererType(i) != 2 || z.m8123a(i) == null) {
                        i++;
                    } else {
                        m8205e();
                        return;
                    }
                }
                m8206f();
                if (this.f6758m) {
                    for (i = 0; i < z.f6685a; i++) {
                        TrackSelection a = z.m8123a(i);
                        if (a != null) {
                            int i2 = 0;
                            while (i2 < a.length()) {
                                Metadata metadata = a.getFormat(i2).metadata;
                                if (metadata == null || !m8193a(metadata)) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                    if (m8192a(this.f6759n)) {
                        return;
                    }
                }
                m8205e();
                return;
            }
        }
        if (!this.f6761p) {
            m8205e();
            m8206f();
        }
    }

    /* renamed from: a */
    private boolean m8193a(Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            Entry entry = metadata.get(i);
            if (entry instanceof ApicFrame) {
                metadata = ((ApicFrame) entry).pictureData;
                return m8192a(BitmapFactory.decodeByteArray(metadata, 0, metadata.length));
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m8192a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                if (this.f6746a != null) {
                    this.f6746a.setAspectRatio(((float) width) / ((float) height));
                }
                this.f6749d.setImageBitmap(bitmap);
                this.f6749d.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m8205e() {
        if (this.f6749d != null) {
            this.f6749d.setImageResource(17170445);
            this.f6749d.setVisibility(4);
        }
    }

    /* renamed from: f */
    private void m8206f() {
        if (this.f6747b != null) {
            this.f6747b.setVisibility(0);
        }
    }

    /* renamed from: g */
    private void m8208g() {
        if (this.f6751f != null) {
            int i = 0;
            Object obj = (this.f6760o && this.f6756k != null && this.f6756k.getPlaybackState() == 2 && this.f6756k.getPlayWhenReady()) ? 1 : null;
            View view = this.f6751f;
            if (obj == null) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: h */
    private void m8210h() {
        if (this.f6752g != null) {
            if (this.f6763r != null) {
                this.f6752g.setText(this.f6763r);
                this.f6752g.setVisibility(0);
                return;
            }
            Throwable th = null;
            if (!(this.f6756k == null || this.f6756k.getPlaybackState() != 1 || this.f6762q == null)) {
                th = this.f6756k.getPlaybackError();
            }
            if (th != null) {
                this.f6752g.setText((CharSequence) this.f6762q.getErrorMessage(th).second);
                this.f6752g.setVisibility(0);
            } else {
                this.f6752g.setVisibility(8);
            }
        }
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m8186a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C2268b.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(C2267a.exo_edit_mode_background_color, null));
    }

    /* renamed from: b */
    private static void m8195b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C2268b.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C2267a.exo_edit_mode_background_color));
    }

    /* renamed from: a */
    private static void m8188a(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: b */
    private static void m8196b(TextureView textureView, int i) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f)) {
            if (i != 0) {
                Matrix matrix = new Matrix();
                float f = width / 2.0f;
                float f2 = height / 2.0f;
                matrix.postRotate((float) i, f, f2);
                i = new RectF(0.0f, 0.0f, width, height);
                RectF rectF = new RectF();
                matrix.mapRect(rectF, i);
                matrix.postScale(width / rectF.width(), height / rectF.height(), f, f2);
                textureView.setTransform(matrix);
                return;
            }
        }
        textureView.setTransform(0);
    }
}
