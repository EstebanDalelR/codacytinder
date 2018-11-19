package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.c.b.b */
public class C4161b extends C3361o implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private WeakReference<OnAudioFocusChangeListener> f13294a = null;
    /* renamed from: b */
    private final C3330c f13295b = new C41581(this);
    /* renamed from: c */
    private final C3336i f13296c = new C41592(this);
    /* renamed from: d */
    private final C3338k f13297d = new C41603(this);

    /* renamed from: com.facebook.ads.internal.view.c.b.b$1 */
    class C41581 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C4161b f13291a;

        C41581(C4161b c4161b) {
            this.f13291a = c4161b;
        }

        /* renamed from: a */
        public void m16505a(C3329b c3329b) {
            ((AudioManager) this.f13291a.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f13291a.f13294a == null ? null : (OnAudioFocusChangeListener) this.f13291a.f13294a.get());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.b$2 */
    class C41592 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C4161b f13292a;

        C41592(C4161b c4161b) {
            this.f13292a = c4161b;
        }

        /* renamed from: a */
        public void m16507a(C3335h c3335h) {
            ((AudioManager) this.f13292a.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f13292a.f13294a == null ? null : (OnAudioFocusChangeListener) this.f13292a.f13294a.get());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.b$3 */
    class C41603 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C4161b f13293a;

        /* renamed from: com.facebook.ads.internal.view.c.b.b$3$1 */
        class C15671 implements OnAudioFocusChangeListener {
            /* renamed from: a */
            final /* synthetic */ C41603 f4360a;

            C15671(C41603 c41603) {
                this.f4360a = c41603;
            }

            public void onAudioFocusChange(int i) {
                if (this.f4360a.f13293a.getVideoView() != null && i <= 0) {
                    this.f4360a.f13293a.getVideoView().m13058a(false);
                }
            }
        }

        C41603(C4161b c4161b) {
            this.f13293a = c4161b;
        }

        /* renamed from: a */
        public void m16509a(C3337j c3337j) {
            if (this.f13293a.f13294a == null || this.f13293a.f13294a.get() == null) {
                this.f13293a.f13294a = new WeakReference(new C15671(this));
            }
            ((AudioManager) this.f13293a.getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus((OnAudioFocusChangeListener) this.f13293a.f13294a.get(), 3, 1);
        }
    }

    public C4161b(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4995a(this.f13297d, this.f13295b, this.f13296c);
        }
    }

    /* renamed from: b */
    protected void mo3340b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4997b(this.f13296c, this.f13295b, this.f13297d);
        }
        super.mo3340b();
    }

    public void onAudioFocusChange(int i) {
        if (getVideoView() != null && i <= 0) {
            getVideoView().m13058a(false);
        }
    }

    protected void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f13294a == null ? null : (OnAudioFocusChangeListener) this.f13294a.get());
        super.onDetachedFromWindow();
    }
}
