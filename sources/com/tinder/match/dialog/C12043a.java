package com.tinder.match.dialog;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.analytics.chat.Origin;
import com.tinder.apprating.p086a.C3919h;
import com.tinder.chat.activity.C8406b;
import com.tinder.common.p076a.C2640a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.itsamatch.ItsAMatchDialogModel;
import com.tinder.itsamatch.ItsAMatchDialogModel.Attribution;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.activities.CurrentUserProfileActivity;
import com.tinder.profile.activities.MatchProfileActivity;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.AvatarView;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.match.dialog.a */
public class C12043a extends Dialog implements ItsAMatchDialogTarget {
    @Inject
    /* renamed from: a */
    C9862h f39157a;
    @Inject
    /* renamed from: b */
    C8406b f39158b;
    @Inject
    /* renamed from: c */
    AppRatingRepository f39159c;
    @Inject
    /* renamed from: d */
    AbTestUtility f39160d;
    @NonNull
    /* renamed from: e */
    private final ItsAMatchDialogModel f39161e;
    /* renamed from: f */
    private RelativeLayout f39162f;
    /* renamed from: g */
    private RelativeLayout f39163g;
    /* renamed from: h */
    private TextView f39164h;
    /* renamed from: i */
    private TextView f39165i;
    /* renamed from: j */
    private View f39166j;
    /* renamed from: k */
    private ProgressBar f39167k;
    /* renamed from: l */
    private ImageView f39168l;
    /* renamed from: m */
    private AvatarView f39169m;
    /* renamed from: n */
    private TextView f39170n;
    /* renamed from: o */
    private AvatarView f39171o;
    /* renamed from: p */
    private ImageView f39172p;
    @DrawableRes
    /* renamed from: q */
    private int f39173q;
    @DrawableRes
    /* renamed from: r */
    private int f39174r;
    @DrawableRes
    /* renamed from: s */
    private int f39175s;
    @DrawableRes
    /* renamed from: t */
    private int f39176t;
    @DrawableRes
    /* renamed from: u */
    private int f39177u;
    @DrawableRes
    /* renamed from: v */
    private int f39178v;
    @DrawableRes
    /* renamed from: w */
    private int f39179w;
    @DrawableRes
    /* renamed from: x */
    private int f39180x;

    /* renamed from: com.tinder.match.dialog.a$1 */
    class C98531 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C12043a f32634a;

        C98531(C12043a c12043a) {
            this.f32634a = c12043a;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f32634a.f39165i.setEnabled(true);
            this.f32634a.f39166j.setEnabled(true);
        }
    }

    /* renamed from: com.tinder.match.dialog.a$2 */
    class C98542 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C12043a f32635a;

        C98542(C12043a c12043a) {
            this.f32635a = c12043a;
        }

        public void onAnimationEnd(Animator animator) {
            this.f32635a.dismiss();
        }
    }

    public C12043a(@NonNull Activity activity, @NonNull ItsAMatchDialogModel itsAMatchDialogModel) {
        super(activity, 16973840);
        setOwnerActivity(activity);
        this.f39161e = itsAMatchDialogModel;
        ((ManagerApp) activity.getApplicationContext()).h().inject(this);
        m48146b();
        m48147c();
    }

    protected void onStart() {
        super.onStart();
        Deadshot.take(this, this.f39157a);
        this.f39157a.m40563a(this.f39161e);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    public void show() {
        super.show();
        m48148d();
        C0001a.b("New Match: %s", new Object[]{m48150a()});
        if (this.f39160d.appRatingV2()) {
            this.f39159c.writeItsANewMatchDialogSeen(true);
        } else {
            C3919h.a().d();
        }
    }

    @NonNull
    /* renamed from: a */
    public String m48150a() {
        return this.f39161e.m40258a();
    }

    public void setMatchAvatar(@Nullable List<String> list) {
        if (list != null) {
            this.f39171o.setAvatars(list);
        }
    }

    public void setMyAvatar(@Nullable List<String> list) {
        if (list != null) {
            this.f39169m.setAvatars(list);
        }
    }

    public void goToMyProfile() {
        Context ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            C0001a.e("Can't start My Profile, no owner activity", new Object[0]);
        } else {
            ownerActivity.startActivity(new Intent(ownerActivity, CurrentUserProfileActivity.class));
        }
    }

    public void goToChat(Origin origin, String str, Attribution attribution) {
        Context ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            C0001a.e("Can't start Chat, no owner activity", new Object[null]);
        } else {
            ownerActivity.startActivity(this.f39158b.m35882a(ownerActivity, origin, str, attribution));
        }
    }

    public void goToMatchProfile(String str, String str2) {
        Context ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            C0001a.e("Can't start Match Profile, no owner activity", new Object[null]);
        } else {
            ownerActivity.startActivity(MatchProfileActivity.a(ownerActivity, str, str2, ProfileScreenSource.RECS));
        }
    }

    public void showNoUserError() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            C0001a.e("Can't show error, no owner activity", new Object[0]);
        } else {
            at.a(ownerActivity, R.string.error_loading);
        }
    }

    public void showShareMatches(long j) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        String str = "android.intent.extra.TEXT";
        intent.putExtra(str, getContext().getString(2131821842, new Object[]{Long.valueOf(j)}));
        getContext().startActivity(Intent.createChooser(intent, getContext().getString(R.string.share_matched)));
    }

    public void setMatchName(@NonNull Attribution attribution, @NonNull String str, @Nullable String str2) {
        this.f39172p.setVisibility(8);
        switch (attribution) {
            case SUPER_LIKE_BY_ME:
                this.f39168l.setVisibility(0);
                this.f39168l.setImageResource(this.f39173q);
                this.f39170n.setText(getContext().getString(R.string.superlike_like_statement, new Object[]{str}));
                return;
            case SUPER_LIKE_BY_THEM:
                this.f39168l.setVisibility(0);
                this.f39168l.setImageResource(this.f39173q);
                this.f39170n.setText(getContext().getString(R.string.superlike_liked_statement, new Object[]{str}));
                return;
            case BOOST:
                this.f39168l.setVisibility(0);
                this.f39168l.setImageResource(this.f39174r);
                this.f39170n.setText(getContext().getString(R.string.liked_statement, new Object[]{str}));
                return;
            case FAST_MATCH:
                this.f39170n.setText(getContext().getString(R.string.liked_statement, new Object[]{str}));
                this.f39157a.m40571e();
                return;
            case VERIFIED:
                this.f39168l.setVisibility(0);
                this.f39168l.setImageResource(this.f39177u);
                this.f39170n.setText(getContext().getString(R.string.liked_statement, new Object[]{str}));
                return;
            case TOP_PICKS:
                this.f39170n.setText(getContext().getString(R.string.liked_statement, new Object[]{str}));
                this.f39157a.m40573f();
                break;
            case PLACES:
                break;
            default:
                this.f39168l.setVisibility(8);
                this.f39170n.setText(getContext().getString(R.string.liked_statement, new Object[]{str}));
                return;
        }
        this.f39157a.m40564a(str, str2);
    }

    public void showFastMatchAttribution() {
        this.f39168l.setVisibility(0);
        this.f39168l.setImageResource(this.f39176t);
        this.f39172p.setImageResource(this.f39175s);
        this.f39172p.setVisibility(0);
    }

    public void showTopPicksAttribution() {
        this.f39168l.setVisibility(0);
        this.f39168l.setImageResource(this.f39179w);
        this.f39172p.setImageResource(this.f39178v);
        this.f39172p.setVisibility(0);
    }

    public void showPlacesAttribution(String str) {
        this.f39170n.setText(getContext().getString(R.string.places_liked_message, new Object[]{str}));
        this.f39168l.setVisibility(0);
        this.f39168l.setImageResource(this.f39180x);
    }

    public void hideMatchAttribution() {
        this.f39168l.setVisibility(8);
        this.f39172p.setVisibility(8);
    }

    /* renamed from: b */
    private void m48146b() {
        Window window = getWindow();
        C2640a.a(window, "Window must not be null");
        window.requestFeature(1);
        window.setWindowAnimations(R.style.dialog_animation_matched);
        window.setLayout(-1, -1);
        setContentView(R.layout.view_matched);
        this.f39170n = (TextView) findViewById(R.id.matched_text);
        this.f39164h = (TextView) findViewById(R.id.text_matched_share);
        this.f39169m = (AvatarView) findViewById(R.id.img_match_one);
        this.f39171o = (AvatarView) findViewById(R.id.img_match_two);
        this.f39167k = (ProgressBar) findViewById(R.id.progressBar);
        this.f39165i = (TextView) findViewById(R.id.btn_start_chatting);
        this.f39166j = findViewById(R.id.btn_find_more_matches);
        this.f39168l = (ImageView) findViewById(R.id.match_attribution_icon);
        this.f39172p = (ImageView) findViewById(R.id.fast_match_icon_foreground);
        this.f39173q = R.drawable.new_match_star;
        this.f39174r = R.drawable.boost_matchscreen_icon;
        this.f39175s = R.drawable.ic_fast_match_itsamatch_foreground;
        this.f39176t = R.drawable.ic_fastmatch_itsamatch_background;
        this.f39177u = R.drawable.verification_badge_large;
        this.f39178v = R.drawable.ic_top_picks_medium_foreground;
        this.f39179w = R.drawable.ic_top_picks_medium_background;
        this.f39180x = R.drawable.ic_places_icon_its_a_match;
        this.f39162f = (RelativeLayout) findViewById(R.id.linear_match_one);
        this.f39163g = (RelativeLayout) findViewById(R.id.linear_match_two);
        this.f39165i.setText(this.f39161e.m40264g());
        TextView textView = (TextView) findViewById(R.id.customTextView_its_a_match);
        ImageView imageView = (ImageView) findViewById(R.id.imageView_its_a_match);
        if (!Locale.US.equals(Locale.getDefault())) {
            if (!Locale.UK.equals(Locale.getDefault())) {
                imageView.setVisibility(4);
                textView.setVisibility(0);
                this.f39165i.setOnClickListener(new C9856b(this));
                this.f39166j.setOnClickListener(new C9857c(this));
                this.f39164h.setOnClickListener(new C9858d(this));
                this.f39169m.setOnClickListener(new C9859e(this));
                this.f39171o.setOnClickListener(new C9860f(this));
                av.b(this.f39164h);
                av.b(this.f39169m);
                av.b(this.f39171o);
            }
        }
        imageView.setVisibility(0);
        textView.setVisibility(4);
        this.f39165i.setOnClickListener(new C9856b(this));
        this.f39166j.setOnClickListener(new C9857c(this));
        this.f39164h.setOnClickListener(new C9858d(this));
        this.f39169m.setOnClickListener(new C9859e(this));
        this.f39171o.setOnClickListener(new C9860f(this));
        av.b(this.f39164h);
        av.b(this.f39169m);
        av.b(this.f39171o);
    }

    /* renamed from: e */
    final /* synthetic */ void m48155e(View view) {
        this.f39157a.m40566b(this.f39161e);
        this.f39167k.setVisibility(0);
    }

    /* renamed from: d */
    final /* synthetic */ void m48154d(View view) {
        this.f39157a.m40568c(this.f39161e);
        m48149e();
    }

    /* renamed from: c */
    final /* synthetic */ void m48153c(View view) {
        this.f39157a.m40572e(this.f39161e);
    }

    /* renamed from: b */
    final /* synthetic */ void m48152b(View view) {
        this.f39157a.m40569d();
    }

    /* renamed from: a */
    final /* synthetic */ void m48151a(View view) {
        this.f39157a.m40570d(this.f39161e);
    }

    /* renamed from: c */
    private void m48147c() {
        float b = (float) av.b();
        float c = (float) av.c();
        float dimensionPixelSize = (float) getContext().getResources().getDimensionPixelSize(R.dimen.matched_avatar_frame_length);
        this.f39165i.measure(0, 0);
        this.f39166j.measure(0, 0);
        this.f39164h.measure(0, 0);
        int measuredWidth = this.f39165i.getMeasuredWidth();
        float f = ((float) ((-this.f39166j.getMeasuredWidth()) - 100)) - b;
        float f2 = (((float) measuredWidth) + b) + 100.0f;
        c += (float) this.f39164h.getMeasuredHeight();
        this.f39163g.setTranslationX((-dimensionPixelSize) * 2.0f);
        this.f39162f.setTranslationX(b);
        this.f39162f.setRotation(-23.0f);
        this.f39163g.setRotation(23.0f);
        this.f39165i.setTranslationX(f2);
        this.f39166j.setTranslationX(f);
        this.f39164h.setTranslationY(c);
    }

    /* renamed from: d */
    private void m48148d() {
        AnimatorListener c98531 = new C98531(this);
        TimeInterpolator overshootInterpolator = new OvershootInterpolator(1.6f);
        TimeInterpolator overshootInterpolator2 = new OvershootInterpolator(0.6f);
        this.f39163g.animate().translationX(0.0f).setStartDelay(100).setDuration(550).setInterpolator(overshootInterpolator).start();
        this.f39163g.animate().rotation(0.0f).setStartDelay(100).setInterpolator(new LinearInterpolator()).start();
        this.f39162f.animate().translationX(0.0f).setStartDelay(100).setDuration(550).setInterpolator(overshootInterpolator).start();
        this.f39162f.animate().rotation(0.0f).setStartDelay(100).setInterpolator(new LinearInterpolator()).start();
        this.f39166j.animate().translationX(0.0f).setStartDelay(320).setDuration(425).setInterpolator(overshootInterpolator2).setListener(c98531).start();
        this.f39165i.animate().translationX(0.0f).setStartDelay(320).setDuration(425).setInterpolator(overshootInterpolator2).start();
        this.f39164h.animate().translationY(0.0f).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setStartDelay(650).setDuration(500).start();
    }

    public void cancel() {
        m48149e();
    }

    /* renamed from: e */
    private void m48149e() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.matched_relative_layout);
        relativeLayout.setPivotX((float) (relativeLayout.getMeasuredWidth() / 2));
        relativeLayout.setPivotY((float) (relativeLayout.getMeasuredHeight() / 2));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.matched_frame_layout);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", new float[]{0.4f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", new float[]{0.4f});
        TimeInterpolator anticipateInterpolator = new AnticipateInterpolator(2.0f);
        ofFloat.setInterpolator(anticipateInterpolator);
        ofFloat2.setInterpolator(anticipateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, "alpha", new float[]{0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.addListener(new C98542(this));
        animatorSet.start();
    }
}
