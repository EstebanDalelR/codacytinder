package com.tinder.profile.dialogs;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.bumptech.glide.request.target.C4331i;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Instagram.Photo;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.SparksEvent;
import com.tinder.profile.adapters.C16072a;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.C15358e;
import com.tinder.utils.C15374w;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class InstagramPhotoViewerDialog extends Dialog implements OnPageChangeListener, OnClickListener {
    /* renamed from: A */
    private long f50055A = 700;
    /* renamed from: a */
    boolean f50056a;
    @Inject
    /* renamed from: b */
    ManagerProfile f50057b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f50058c;
    /* renamed from: d */
    private Context f50059d;
    /* renamed from: e */
    private View f50060e;
    /* renamed from: f */
    private ViewPager f50061f;
    /* renamed from: g */
    private C16072a f50062g;
    /* renamed from: h */
    private RelativeLayout f50063h;
    /* renamed from: i */
    private RoundImageView f50064i;
    /* renamed from: j */
    private TextView f50065j;
    /* renamed from: k */
    private TextView f50066k;
    /* renamed from: l */
    private TextView f50067l;
    @Nullable
    /* renamed from: m */
    private ListenerPhotoViewer f50068m;
    /* renamed from: n */
    private ImageView f50069n;
    /* renamed from: o */
    private C14400a f50070o;
    /* renamed from: p */
    private Instagram f50071p;
    /* renamed from: q */
    private int f50072q;
    /* renamed from: r */
    private int f50073r;
    /* renamed from: s */
    private int f50074s = -1;
    /* renamed from: t */
    private int f50075t;
    /* renamed from: u */
    private int f50076u;
    /* renamed from: v */
    private float f50077v;
    /* renamed from: w */
    private float f50078w;
    /* renamed from: x */
    private float f50079x;
    /* renamed from: y */
    private String f50080y;
    /* renamed from: z */
    private Source f50081z;

    public interface ListenerPhotoViewer {
        void onPhotoIndex(int i);

        void onUserClick();
    }

    /* renamed from: com.tinder.profile.dialogs.InstagramPhotoViewerDialog$a */
    public static class C14400a {
        /* renamed from: a */
        private float f45593a;
        /* renamed from: b */
        private float f45594b;
        /* renamed from: c */
        private float f45595c;
        /* renamed from: d */
        private float f45596d;
        /* renamed from: e */
        private float f45597e;
        /* renamed from: f */
        private int f45598f;
        /* renamed from: g */
        private int f45599g;
        /* renamed from: h */
        private float f45600h;

        /* renamed from: a */
        public float m54834a() {
            return this.f45593a;
        }

        /* renamed from: a */
        public void m54835a(float f) {
            this.f45593a = f;
        }

        /* renamed from: b */
        public float m54837b() {
            return this.f45594b;
        }

        /* renamed from: b */
        public void m54838b(float f) {
            this.f45594b = f;
        }

        /* renamed from: c */
        public float m54840c() {
            return this.f45595c;
        }

        /* renamed from: c */
        public void m54841c(float f) {
            this.f45595c = f;
        }

        /* renamed from: d */
        public float m54842d() {
            return this.f45596d;
        }

        /* renamed from: d */
        public void m54843d(float f) {
            this.f45596d = f;
        }

        public String toString() {
            return String.format("thumbail width[%s] height[%s], x[%s] y[%s]", new Object[]{Float.valueOf(this.f45593a), Float.valueOf(this.f45594b), Float.valueOf(this.f45595c), Float.valueOf(this.f45596d)});
        }

        /* renamed from: e */
        public float m54844e() {
            return this.f45597e;
        }

        /* renamed from: e */
        public void m54845e(float f) {
            this.f45597e = f;
        }

        /* renamed from: f */
        public int m54846f() {
            return this.f45598f;
        }

        /* renamed from: a */
        public void m54836a(int i) {
            this.f45598f = i;
        }

        /* renamed from: g */
        public int m54848g() {
            return this.f45599g;
        }

        /* renamed from: b */
        public void m54839b(int i) {
            this.f45599g = i;
        }

        /* renamed from: h */
        public float m54849h() {
            return this.f45600h;
        }

        /* renamed from: f */
        public void m54847f(float f) {
            this.f45600h = f;
        }
    }

    /* renamed from: com.tinder.profile.dialogs.InstagramPhotoViewerDialog$2 */
    class C191612 extends C4330g<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ InstagramPhotoViewerDialog f59366a;

        C191612(InstagramPhotoViewerDialog instagramPhotoViewerDialog) {
            this.f59366a = instagramPhotoViewerDialog;
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m68060a((Bitmap) obj, glideAnimation);
        }

        /* renamed from: a */
        public void m68060a(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
            this.f59366a.f50069n.setImageBitmap(bitmap);
            this.f59366a.m60904a(true, (float) this.f59366a.f50079x);
            this.f59366a.m60907b(true);
        }

        public void onLoadFailed(Exception exception, Drawable drawable) {
            super.onLoadFailed(exception, drawable);
            this.f59366a.dismiss();
        }
    }

    /* renamed from: com.tinder.profile.dialogs.InstagramPhotoViewerDialog$4 */
    class C191634 extends C4330g<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ InstagramPhotoViewerDialog f59368a;

        C191634(InstagramPhotoViewerDialog instagramPhotoViewerDialog) {
            this.f59368a = instagramPhotoViewerDialog;
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m68062a((Bitmap) obj, glideAnimation);
        }

        /* renamed from: a */
        public void m68062a(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
            this.f59368a.f50069n.setImageBitmap(bitmap);
            this.f59368a.f50069n.setVisibility(0);
            this.f59368a.m60910c(false);
        }

        public void onLoadFailed(Exception exception, Drawable drawable) {
            ViewCompat.c(this.f59368a.f50069n, null);
            this.f59368a.m60910c((boolean) null);
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public InstagramPhotoViewerDialog(Context context, Integer num, Integer num2, C14400a c14400a, @NonNull Profile profile, ListenerPhotoViewer listenerPhotoViewer) {
        super(context, R.style.instagramPhotoViewer);
        ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        setContentView(R.layout.instagram_photo_viewer);
        this.f50077v = (float) av.b();
        this.f50078w = (float) av.c();
        this.f50070o = c14400a;
        this.f50080y = profile.mo11651a();
        this.f50081z = profile.mo11660j();
        this.f50079x = this.f50070o.m54834a() / this.f50077v;
        this.f50059d = context;
        this.f50072q = num.intValue();
        this.f50073r = num.intValue();
        this.f50075t = num2.intValue();
        this.f50071p = profile.mo11673w();
        this.f50068m = listenerPhotoViewer;
        this.f50076u = (int) this.f50059d.getResources().getDimension(R.dimen.instagram_view_avatar_size);
        this.f50060e = findViewById(R.id.photo_background);
        this.f50064i = (RoundImageView) findViewById(R.id.profile_thumb);
        this.f50065j = (TextView) findViewById(R.id.username);
        this.f50066k = (TextView) findViewById(R.id.time);
        this.f50067l = (TextView) findViewById(R.id.nexttime);
        this.f50061f = (ViewPager) findViewById(R.id.photo_viewpager);
        this.f50063h = (RelativeLayout) findViewById(R.id.row_photo_details);
        this.f50069n = (ImageView) findViewById(R.id.photo_scale);
        num = new ArrayList(this.f50075t);
        for (c14400a = null; c14400a < this.f50075t; c14400a++) {
            num.add(this.f50071p.photos().get(c14400a));
        }
        this.f50062g = new C16072a(context, num, new C14404f(this));
        this.f50061f.setOffscreenPageLimit(null);
        this.f50061f.setAdapter(this.f50062g);
        this.f50061f.setCurrentItem(this.f50072q);
        this.f50061f.setOnPageChangeListener(this);
        this.f50061f.setPageMargin((int) this.f50059d.getResources().getDimension(R.dimen.ig_photoviewer_page_margin));
        this.f50064i.setOnClickListener(this);
        this.f50056a = C15358e.f47625a.m57654a();
        m60914f();
        this.f50065j.setText(this.f50071p.username());
        this.f50066k.setText(m60916a(((Photo) this.f50071p.photos().get(this.f50072q)).timestampMillis()));
        if (this.f50068m != null) {
            this.f50068m.onPhotoIndex(this.f50072q);
        }
        m60909c();
        m60900a(this.f50072q);
    }

    /* renamed from: a */
    final /* synthetic */ void m60918a(View view) {
        m60915g();
    }

    /* renamed from: c */
    private void m60909c() {
        m60912d();
        m60913e();
    }

    /* renamed from: b */
    private void m60907b(boolean z) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        this.f50060e.setAlpha(f2);
        this.f50060e.animate().alpha(f).setDuration(225).start();
    }

    /* renamed from: d */
    private void m60912d() {
        this.f50060e.setAlpha(0.0f);
        this.f50063h.setAlpha(0.0f);
        this.f50061f.setAlpha(0.0f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private void m60910c(boolean z) {
        int i = z ^ 1;
        TimeInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.f50061f.setAlpha((float) i);
        this.f50061f.animate().alpha((float) z).setInterpolator(decelerateInterpolator).withEndAction(new C14405g(this, z)).start();
        if (!z) {
            m60907b(false);
            m60904a(false, this.f50079x);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m60919a(boolean z) {
        if (z) {
            this.f50069n.setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m60904a(boolean z, float f) {
        float f2;
        InstagramPhotoViewerDialog instagramPhotoViewerDialog;
        float f3;
        float f4;
        float f5;
        float f6;
        float e;
        float f7 = this.f50077v / 2.0f;
        float f8 = this.f50078w;
        if (this.f50056a) {
            f2 = 0.0f;
        } else {
            f2 = instagramPhotoViewerDialog.f50070o.m54844e();
        }
        f8 = (f8 + f2) / 2.0f;
        f2 = instagramPhotoViewerDialog.f50070o.m54834a() / 2.0f;
        float b = instagramPhotoViewerDialog.f50070o.m54837b() / 2.0f;
        float f9 = f8 - b;
        float c = instagramPhotoViewerDialog.f50070o.m54840c();
        float d = instagramPhotoViewerDialog.f50070o.m54842d();
        if (z) {
            f3 = f7;
            f4 = f8;
            f5 = b;
            f6 = f9;
        } else {
            int f10 = instagramPhotoViewerDialog.f50070o.m54846f();
            int g = instagramPhotoViewerDialog.f50070o.m54848g();
            f10 *= g;
            f5 = b;
            f4 = f8;
            f6 = f9;
            f9 = (instagramPhotoViewerDialog.f50070o.m54834a() + (instagramPhotoViewerDialog.f50070o.m54849h() * 2.0f)) * ((float) ((instagramPhotoViewerDialog.f50072q % g) - (instagramPhotoViewerDialog.f50073r % g)));
            f3 = f7;
            ad.a(String.format("photo row - origin[%s],dest:[%s], offset[%s], translationY[%s]", new Object[]{Integer.valueOf((instagramPhotoViewerDialog.f50073r % f10) / g), Integer.valueOf((instagramPhotoViewerDialog.f50072q % f10) / g), Integer.valueOf(r14 - ((instagramPhotoViewerDialog.f50073r % f10) / g)), Float.valueOf(((float) (r14 - ((instagramPhotoViewerDialog.f50073r % f10) / g))) * (instagramPhotoViewerDialog.f50070o.m54837b() + (instagramPhotoViewerDialog.f50070o.m54849h() * 2.0f)))}));
            ad.a(String.format("photo column - origin[%s],dest:[%s]), offset[%s], translationX[%s]", new Object[]{Integer.valueOf(r13), Integer.valueOf(r1), Float.valueOf(b), Float.valueOf(f9)}));
            c += f9;
            d += f8;
            ad.a(String.format("photo position origin:[%s] destination:[%s] ", new Object[]{Integer.valueOf(r12), Integer.valueOf(r15)}));
        }
        c -= f3 - f2;
        f7 = d - f6;
        if (av.d()) {
            e = this.f50070o.m54844e();
        } else {
            instagramPhotoViewerDialog = this;
            e = 0.0f;
        }
        f7 -= e;
        f8 = z ? f : 1.0f;
        f2 = z ? 1.0f : f;
        e = z ? c : 0.0f;
        b = z ? 0.0f : c;
        f9 = z ? f7 : 0.0f;
        c = z ? 0.0f : f7;
        ad.a(String.format("instagram thumb translation \n- transXStart [%s]\n- transXEnd [%s]\n- transYStart [%s]\n- transYEnd [%s] = original thumb top[%s] - photoTop[%s]\n- startXScale [%s]\n- endXScale [%s]\n\n- screenHeight [%s]\n- midpointScreenHeight[%s]\n- thumbnailHeight[%s]- midpoint thumbnailHeight[%s]\n- statusbar height[%s]", new Object[]{Float.valueOf(e), Float.valueOf(b), Float.valueOf(f9), Float.valueOf(c), Float.valueOf(d), Float.valueOf(f6), Float.valueOf(f8), Float.valueOf(f2), Float.valueOf(instagramPhotoViewerDialog.f50078w), Float.valueOf(f4), Float.valueOf(instagramPhotoViewerDialog.f50070o.m54837b()), Float.valueOf(f5), Float.valueOf(instagramPhotoViewerDialog.f50070o.m54844e())}));
        final int i = z ^ 1;
        if (!z) {
            instagramPhotoViewerDialog.f50069n.setVisibility(0);
            instagramPhotoViewerDialog.f50061f.setVisibility(4);
        }
        av.c(instagramPhotoViewerDialog.f50069n, f8);
        instagramPhotoViewerDialog.f50069n.setTranslationX(e);
        instagramPhotoViewerDialog.f50069n.setTranslationY(f9);
        C1811f a = C9661a.a();
        a.a(z ^ 1);
        a.c(80.0d);
        final boolean z2 = z;
        final boolean z3 = z;
        a.a(new C3442e(instagramPhotoViewerDialog) {
            /* renamed from: j */
            final /* synthetic */ InstagramPhotoViewerDialog f55410j;

            public void onSpringUpdate(@NonNull C1811f c1811f) {
                c1811f = (float) c1811f.c();
                av.c(this.f55410j.f50069n, C15374w.m57701a(c1811f, 0.0f, f8, 1.0f, f2));
                this.f55410j.f50069n.setTranslationX(C15374w.m57701a(c1811f, 0.0f, e, 1.0f, b));
                this.f55410j.f50069n.setTranslationY(C15374w.m57701a(c1811f, 0.0f, f9, 1.0f, c));
                this.f55410j.f50063h.setAlpha(C15374w.m57701a(c1811f, 0.0f, (float) i, 1.0f, (float) z2));
            }

            public void onSpringAtRest(C1811f c1811f) {
                if (z3) {
                    this.f55410j.m60910c(true);
                } else {
                    this.f55410j.dismiss();
                }
                c1811f.a();
            }
        });
        a.a(0.0d);
        a.b(1.0d);
    }

    public void dismiss() {
        this.f50068m = null;
        super.dismiss();
    }

    public void onPageSelected(int i) {
        this.f50072q = i;
        if (this.f50068m != null) {
            this.f50068m.onPhotoIndex(i);
        }
        this.f50066k.setText(m60916a(((Photo) this.f50071p.photos().get(i)).timestampMillis()));
        m60900a(i);
    }

    /* renamed from: a */
    public void m60917a() {
        at.m57642a(this.f50060e, R.string.instagram_app_and_browser_unavailable_snackbar_message, R.color.white);
    }

    /* renamed from: a */
    protected String m60916a(long j) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        if (j2 == currentTimeMillis) {
            j = "%sh";
            i = 0;
        } else {
            currentTimeMillis = (long) 604800000;
            if (j2 >= currentTimeMillis) {
                j = "%sw";
                i = (int) (j2 / currentTimeMillis);
            } else {
                currentTimeMillis = (long) 86400000;
                if (j2 >= currentTimeMillis) {
                    j = "%sd";
                    i = (int) (j2 / currentTimeMillis);
                } else {
                    currentTimeMillis = (long) 3600000;
                    if (j2 >= currentTimeMillis) {
                        j = "%sh";
                        i = (int) (j2 / currentTimeMillis);
                    } else {
                        j = "%sm";
                        i = (int) (j2 / ((long) ManagerWebServices.TIMEOUT_AUTH_MS));
                    }
                }
            }
        }
        return String.format(j, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: e */
    private void m60913e() {
        ad.a("downloadAndSetTempImage");
        Photo photo = (Photo) this.f50071p.photos().get(this.f50072q);
        C0994i.b(this.f50059d).a(photo.image() != null ? photo.image() : photo.thumbnail()).l().b(new C191612(this));
    }

    /* renamed from: f */
    private void m60914f() {
        ad.a("setProfilePhoto");
        Object profilePicture = this.f50071p.profilePicture();
        if (!TextUtils.isEmpty(profilePicture)) {
            C0994i.b(this.f50059d).a(profilePicture).a().b(new C4331i<RoundImageView, C1041b>(this, this.f50064i) {
                /* renamed from: b */
                final /* synthetic */ InstagramPhotoViewerDialog f59367b;

                public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
                    m68061a((C1041b) obj, glideAnimation);
                }

                /* renamed from: a */
                public void m68061a(C1041b c1041b, GlideAnimation<? super C1041b> glideAnimation) {
                    this.f59367b.f50064i.setImageDrawable(c1041b);
                }
            });
        }
        m60901a(this.f50059d);
    }

    /* renamed from: a */
    private void m60901a(@NonNull Context context) {
        C0001a.b("setProfilePhotoPosition", new Object[0]);
        this.f50063h.post(new C14406h(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m60920b() {
        this.f50063h.setY(this.f50070o.m54844e());
    }

    /* renamed from: g */
    private void m60915g() {
        if (this.f50073r != this.f50072q) {
            Photo photo = (Photo) this.f50071p.photos().get(this.f50072q);
            C0994i.b(getContext()).a(photo.image() != null ? photo.image() : photo.thumbnail()).l().b(new C191634(this));
            return;
        }
        m60910c(false);
    }

    public void onClick(@NonNull View view) {
        view = view.getId();
        if (view == R.id.profile_thumb || view == R.id.username) {
            this.f50068m.onUserClick();
        }
    }

    public void onBackPressed() {
        m60915g();
    }

    /* renamed from: a */
    private void m60900a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("track visible photo: ");
        stringBuilder.append(i);
        ad.a(stringBuilder.toString());
        if (this.f50081z != Source.USER) {
            SparksEvent sparksEvent = null;
            boolean z = true;
            int i2 = this.f50074s < i ? 1 : 2;
            if (i != this.f50071p.photos().size() - 1) {
                z = false;
            }
            if (this.f50081z == Source.REC) {
                sparksEvent = new SparksEvent("Recs.ProfileInstagramPhotoViewerPage");
            } else if (this.f50081z == Source.MATCH) {
                sparksEvent = new SparksEvent("Chat.ProfileInstagramPhotoViewerPage");
            }
            if (sparksEvent != null) {
                if (this.f50074s != -1) {
                    sparksEvent.put("direction", i2);
                }
                sparksEvent.put("otherId", this.f50080y);
                sparksEvent.put("instagramName", this.f50071p.username());
                sparksEvent.put("endOfPhotos", z);
                this.f50058c.a(sparksEvent);
            }
        }
        this.f50074s = i;
    }
}
