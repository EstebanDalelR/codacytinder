package com.tinder.profile.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.common.p076a.C2640a;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.common.model.Photo;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.adapters.C14363d;
import com.tinder.profile.adapters.C14369o;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.ProfileFeature;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.model.ProfileShareSource;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.ak;
import com.tinder.profile.target.ProfileTarget;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.BasicInfoView.OnScrollStateChangeListener;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.utils.RxUtils;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rx.Completable;
import rx.schedulers.Schedulers;

public class ProfileView extends FrameLayout implements LifecycleObserver, ProfileTarget {
    @Inject
    /* renamed from: a */
    ak f12466a;
    @Inject
    /* renamed from: b */
    C14369o f12467b;
    @Inject
    /* renamed from: c */
    Lifecycle f12468c;
    @Inject
    /* renamed from: d */
    C14548a f12469d;
    @Inject
    /* renamed from: e */
    C14550a f12470e;
    @Nullable
    /* renamed from: f */
    private BasicInfoView f12471f;
    @Nullable
    /* renamed from: g */
    private OnPhotoPageChangeListener f12472g;
    /* renamed from: h */
    private boolean f12473h = true;
    /* renamed from: i */
    private boolean f12474i = true;
    /* renamed from: j */
    private boolean f12475j = false;
    /* renamed from: k */
    private boolean f12476k = true;
    @Nullable
    /* renamed from: l */
    private String f12477l;
    @Nullable
    /* renamed from: m */
    private ProfileScreenSource f12478m;
    @NonNull
    /* renamed from: n */
    private final List<ProfileView$a> f12479n = new ArrayList();
    /* renamed from: o */
    private final Map<ProfileFeature, Integer> f12480o = new ProfileView$1(this);
    /* renamed from: p */
    private final OnScrollStateChangeListener f12481p = new C16171y(this);
    @BindView(2131363308)
    LinearLayout profileLayout;
    @BindView(2131363512)
    ScrollView scrollView;

    public ProfileView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_profile, this);
        ButterKnife.m2675a((View) this);
        ((ProfileComponentProvider) C14398a.a(context)).provideComponent().inject(this);
        Deadshot.take(this, this.f12466a);
        this.scrollView.setVerticalScrollBarEnabled(false);
        this.scrollView.setOverScrollMode(2);
        this.scrollView.setDescendantFocusability(131072);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12468c.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12468c.mo37b(this);
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public void m15106a(ProfileScreenSource profileScreenSource) {
        this.f12478m = profileScreenSource;
    }

    /* renamed from: a */
    public void m15107a(@NonNull Profile profile) {
        m15108a(profile, null);
    }

    /* renamed from: a */
    public void m15108a(@NonNull Profile profile, @Nullable String str) {
        this.f12477l = str;
        this.f12466a.a(profile);
        this.f12466a.a(this.f12478m, profile.a());
    }

    public void showProfile(@NonNull Profile profile, @NonNull List<ProfileFeature> list) {
        this.f12479n.clear();
        this.profileLayout.removeAllViews();
        for (ProfileFeature profileFeature : list) {
            View inflate = LayoutInflater.from(getContext()).inflate(((Integer) this.f12480o.get(profileFeature)).intValue(), this.profileLayout, false);
            m15099a(profileFeature, inflate, profile);
            m15103b(profile);
            this.profileLayout.addView(inflate);
            this.f12466a.b(profile);
        }
    }

    public void exit() {
        m15101b();
    }

    public void sendScreenshotInAppNotification(@NonNull Profile profile, C14826a c14826a) {
        String replace = profile.b().trim().replace(",", "");
        this.f12469d.a(replace, ((Photo) profile.f().get(0)).url()).c(new C17775z(this, profile, replace, c14826a)).m10386b(Schedulers.io()).m10394b(RxUtils.m10187b());
    }

    /* renamed from: a */
    final /* synthetic */ Completable m15104a(@NonNull Profile profile, String str, C14826a c14826a, TinderNotification tinderNotification) {
        return Completable.m10366a(new aa(this, tinderNotification, profile, str, c14826a));
    }

    /* renamed from: a */
    final /* synthetic */ void m15110a(TinderNotification tinderNotification, @NonNull Profile profile, String str, C14826a c14826a) {
        tinderNotification.a(new ab(this, profile, str, c14826a));
        this.f12470e.a(tinderNotification);
    }

    /* renamed from: a */
    final /* synthetic */ void m15109a(@NonNull Profile profile, String str, C14826a c14826a) {
        this.f12466a.a(profile, str, c14826a, this.f12478m);
    }

    public void createChooserToShareScreenshottedProfile(Profile profile, String str, @Nullable Uri uri, String str2, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        intent.putExtra("android.intent.extra.TEXT", String.format(getContext().getString(R.string.share_screenshot_text), new Object[]{str, str2}));
        if (VERSION.SDK_INT >= 22) {
            m15097a(getContext(), intent, (String) C2640a.m9986a(str2), str, profile, profileShareSource, profileShareAction);
        } else {
            m15102b(getContext(), intent, (String) C2640a.m9986a(str2), str, profile, profileShareSource, profileShareAction);
        }
    }

    @RequiresApi(api = 22)
    /* renamed from: a */
    private void m15097a(Context context, Intent intent, String str, String str2, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        new RecommendProfileBroadcastReceiver().a(context, intent, str2, str, profile.a(), profileShareSource, profileShareAction, profile);
    }

    /* renamed from: b */
    private void m15102b(Context context, Intent intent, String str, String str2, Profile profile, ProfileShareSource profileShareSource, ProfileShareAction profileShareAction) {
        context.startActivity(Intent.createChooser(intent, String.format(context.getString(R.string.share_sheet_title), new Object[]{str2})));
        this.f12466a.a(profile, new C14373a("N/A", true, str, profileShareSource, profileShareAction));
    }

    /* renamed from: a */
    private void m15099a(@NonNull ProfileFeature profileFeature, @NonNull View view, @NonNull Profile profile) {
        switch (ProfileView$2.f45791a[profileFeature.ordinal()]) {
            case 1:
                this.f12471f = (BasicInfoView) view;
                if (this.f12477l != null) {
                    this.f12471f.setMatchId(this.f12477l);
                }
                this.f12471f.a(profile);
                this.f12471f.setOnScrollStateChangedListener(this.f12481p);
                break;
            case 2:
                ((CustomTextView) view).setText(profile.d());
                break;
            case 3:
                ((ProfileAnthemView) view).a(profile);
                break;
            case 4:
                ((ProfileTopArtistsView) view).setTopTracks(this.f12467b.a(profile.t()));
                break;
            case 5:
                ((ProfileRecommendToFriendView) view).a(profile, this.f12478m);
                break;
            case 6:
                ((ProfileCommonConnectionsView) view).a(C14363d.a(profile.v()));
                break;
            case 7:
                ((ProfilePotentialCommonConnectionsView) view).a(profile.u());
                break;
            case 8:
                ((ProfileInstagramView) view).a(profile);
                break;
            case 9:
                ((ProfileInstagramConnectView) view).a(profile.j());
                break;
            case 10:
                ((ProfileInterestsView) view).a(profile);
                break;
            case 11:
                ((ProfileReportUserView) view).a(profile);
                break;
            default:
                break;
        }
        if ((view instanceof ProfileView$a) != null) {
            m15100a((ProfileView$a) view);
        }
    }

    /* renamed from: a */
    public void m15111a(boolean z) {
        this.f12476k = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f12476k) {
            return null;
        }
        if (this.f12471f == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!(this.scrollView.canScrollVertically(-1) || this.f12475j) || (this.f12471f.getPixelsToIncreaseViewPagerBy() >= 0.0f && !this.f12475j)) {
            this.f12471f.a(motionEvent);
        }
        this.f12474i = this.f12471f.a() ^ 1;
        m15098a(motionEvent);
        this.f12473h = this.f12474i;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m15103b(Profile profile) {
        if (this.f12471f != null) {
            this.f12471f.setOnPhotoPageChangeListener(new ProfileView$b(this, profile));
        }
    }

    /* renamed from: a */
    private void m15098a(@NonNull MotionEvent motionEvent) {
        if (this.f12473h && !this.f12474i) {
            motionEvent.setAction(3);
        }
        if (!this.f12473h && this.f12474i) {
            motionEvent.setAction(0);
        }
    }

    /* renamed from: a */
    private void m15100a(@NonNull ProfileView$a profileView$a) {
        this.f12479n.add(profileView$a);
    }

    public View getProfilePhotosView() {
        return this.f12471f.getPhotoViewerContainer();
    }

    @Nullable
    public View getDownArrowView() {
        return this.f12471f.getDownArrowBtn();
    }

    public void setOnExitClickListener(OnExitClickListener onExitClickListener) {
        C2640a.m9987a(this.f12471f, "Basic Info View Cannot be null!");
        this.f12471f.setOnExitClickListener(onExitClickListener);
    }

    public void setOnPhotoPageChangeListener(OnPhotoPageChangeListener onPhotoPageChangeListener) {
        this.f12472g = onPhotoPageChangeListener;
    }

    public ScrollView getScrollableContainer() {
        return this.scrollView;
    }

    /* renamed from: a */
    public void m15105a() {
        this.f12471f.b();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    void onPause() {
        exit();
    }

    /* renamed from: b */
    private void m15101b() {
        for (ProfileView$a a : this.f12479n) {
            a.a();
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m15112b(boolean z) {
        this.f12475j = z;
    }
}
