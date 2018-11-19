package com.tinder.profiletab.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.R;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.deadshot.Deadshot;
import com.tinder.loops.activity.MediaSelectorActivity;
import com.tinder.loops.analytics.TutorialAction;
import com.tinder.profile.activities.CurrentUserProfileActivity;
import com.tinder.profiletab.injector.ProfileTabViewInjector$Factory;
import com.tinder.profiletab.p368b.C14461a;
import com.tinder.profiletab.p370d.C14470b;
import com.tinder.profiletab.presenter.C14476x;
import com.tinder.profiletab.target.ProfileTabTarget;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001-\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002FGB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000205H\u0016J\b\u0010<\u001a\u000205H\u0016J\b\u0010=\u001a\u000205H\u0016J\b\u0010>\u001a\u000205H\u0016J\b\u0010?\u001a\u000205H\u0014J\b\u0010@\u001a\u000205H\u0003J\b\u0010A\u001a\u000205H\u0016J\b\u0010B\u001a\u000205H\u0016J\b\u0010C\u001a\u000205H\u0016J\b\u0010D\u001a\u000205H\u0016J\b\u0010E\u001a\u000205H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020-X\u0004¢\u0006\u0004\n\u0002\u0010.R\u001b\u0010/\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b1\u00102¨\u0006H"}, d2 = {"Lcom/tinder/profiletab/view/ProfileTabView;", "Lcom/tinder/profiletab/view/CurveBackgroundLayout;", "Lcom/tinder/profiletab/target/ProfileTabTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "buttonSeparator", "Landroid/view/View;", "getButtonSeparator", "()Landroid/view/View;", "buttonSeparator$delegate", "Lkotlin/Lazy;", "infoEditButton", "Lcom/tinder/profiletab/view/ProfileTabCircularIconLabelView;", "getInfoEditButton", "()Lcom/tinder/profiletab/view/ProfileTabCircularIconLabelView;", "infoEditButton$delegate", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle$Tinder_release", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle$Tinder_release", "(Landroid/arch/lifecycle/Lifecycle;)V", "mediaButton", "Lcom/tinder/profiletab/view/ProfileTabCircularMediaIconLabelView;", "getMediaButton", "()Lcom/tinder/profiletab/view/ProfileTabCircularMediaIconLabelView;", "mediaButton$delegate", "presenter", "Lcom/tinder/profiletab/presenter/ProfileTabPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/profiletab/presenter/ProfileTabPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/profiletab/presenter/ProfileTabPresenter;)V", "profileAddLoopsTooltip", "Lcom/tinder/profiletab/tooltip/ProfileAddLoopsTooltip;", "getProfileAddLoopsTooltip$Tinder_release", "()Lcom/tinder/profiletab/tooltip/ProfileAddLoopsTooltip;", "setProfileAddLoopsTooltip$Tinder_release", "(Lcom/tinder/profiletab/tooltip/ProfileAddLoopsTooltip;)V", "tooltipView", "userInfoClickListener", "com/tinder/profiletab/view/ProfileTabView$userInfoClickListener$1", "Lcom/tinder/profiletab/view/ProfileTabView$userInfoClickListener$1;", "userInfoView", "Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView;", "getUserInfoView", "()Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView;", "userInfoView$delegate", "bindUserInfoViewModel", "", "viewModel", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "dismissTooltip", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "hideMediaButton", "navigateToCurrentUser", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "onPause", "resetEditButtonToOriginalUi", "showEditProfile", "showMediaSelector", "showProfileAddLoopsToolTip", "startEditButtonAnimation", "Companion", "UserInfoView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileTabView extends CurveBackgroundLayout implements LifecycleObserver, ProfileTabTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f12482a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(ProfileTabView.class), "userInfoView", "getUserInfoView()Lcom/tinder/profiletab/view/ProfileTabView$UserInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(ProfileTabView.class), "buttonSeparator", "getButtonSeparator()Landroid/view/View;")), C15825i.a(new PropertyReference1Impl(C15825i.a(ProfileTabView.class), "infoEditButton", "getInfoEditButton()Lcom/tinder/profiletab/view/ProfileTabCircularIconLabelView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(ProfileTabView.class), "mediaButton", "getMediaButton()Lcom/tinder/profiletab/view/ProfileTabCircularMediaIconLabelView;"))};
    /* renamed from: e */
    public static final ProfileTabView$a f12483e = new ProfileTabView$a(null);
    @Inject
    @NotNull
    /* renamed from: b */
    public C14476x f12484b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Lifecycle f12485c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C14461a f12486d;
    /* renamed from: f */
    private final Lazy f12487f = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileTabView$$special$$inlined$bindView$1(this, R.id.profile_tab_user_info));
    /* renamed from: g */
    private final Lazy f12488g = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileTabView$$special$$inlined$bindView$2(this, R.id.buttonSeparator));
    /* renamed from: h */
    private final Lazy f12489h = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileTabView$$special$$inlined$bindView$3(this, R.id.profile_tab_user_info_edit_button));
    /* renamed from: i */
    private final Lazy f12490i = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileTabView$$special$$inlined$bindView$4(this, R.id.profile_tab_user_info_media_button));
    /* renamed from: j */
    private View f12491j;
    /* renamed from: k */
    private final ProfileTabView$c f12492k;

    private final View getButtonSeparator() {
        Lazy lazy = this.f12488g;
        KProperty kProperty = f12482a[1];
        return (View) lazy.getValue();
    }

    private final ProfileTabCircularIconLabelView getInfoEditButton() {
        Lazy lazy = this.f12489h;
        KProperty kProperty = f12482a[2];
        return (ProfileTabCircularIconLabelView) lazy.getValue();
    }

    private final ProfileTabCircularMediaIconLabelView getMediaButton() {
        Lazy lazy = this.f12490i;
        KProperty kProperty = f12482a[3];
        return (ProfileTabCircularMediaIconLabelView) lazy.getValue();
    }

    private final ProfileTabView$UserInfoView getUserInfoView() {
        Lazy lazy = this.f12487f;
        KProperty kProperty = f12482a[0];
        return (ProfileTabView$UserInfoView) lazy.getValue();
    }

    public ProfileTabView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f12492k = new ProfileTabView$c(this, context);
        ((ProfileTabViewInjector$Factory) context).createProfileTabInjector(this).inject(this);
    }

    @NotNull
    public final C14476x getPresenter$Tinder_release() {
        C14476x c14476x = this.f12484b;
        if (c14476x == null) {
            C2668g.m10310b("presenter");
        }
        return c14476x;
    }

    public final void setPresenter$Tinder_release(@NotNull C14476x c14476x) {
        C2668g.m10309b(c14476x, "<set-?>");
        this.f12484b = c14476x;
    }

    @NotNull
    public final Lifecycle getLifecycle$Tinder_release() {
        Lifecycle lifecycle = this.f12485c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle$Tinder_release(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f12485c = lifecycle;
    }

    @NotNull
    public final C14461a getProfileAddLoopsTooltip$Tinder_release() {
        C14461a c14461a = this.f12486d;
        if (c14461a == null) {
            C2668g.m10310b("profileAddLoopsTooltip");
        }
        return c14461a;
    }

    public final void setProfileAddLoopsTooltip$Tinder_release(@NotNull C14461a c14461a) {
        C2668g.m10309b(c14461a, "<set-?>");
        this.f12486d = c14461a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Lifecycle lifecycle = this.f12485c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14476x c14476x = this.f12484b;
        if (c14476x == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c14476x);
        getUserInfoView().setListener(this.f12492k);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        getUserInfoView().setListener(null);
        C14461a c14461a = this.f12486d;
        if (c14461a == null) {
            C2668g.m10310b("profileAddLoopsTooltip");
        }
        c14461a.a();
    }

    public void bindUserInfoViewModel(@NotNull C14470b c14470b) {
        C2668g.m10309b(c14470b, "viewModel");
        getUserInfoView().a(c14470b);
    }

    public void resetEditButtonToOriginalUi() {
        getInfoEditButton().d();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    private final void onPause() {
        new Handler(Looper.getMainLooper()).postDelayed(new ProfileTabView$b(this), 100);
    }

    public void navigateToCurrentUser() {
        getContext().startActivity(new Intent(getContext(), CurrentUserProfileActivity.class));
    }

    public void hideMediaButton() {
        getMediaButton().setVisibility(8);
        getButtonSeparator().setVisibility(0);
    }

    public void showProfileAddLoopsToolTip() {
        if (this.f12491j == null) {
            C14461a c14461a = this.f12486d;
            if (c14461a == null) {
                C2668g.m10310b("profileAddLoopsTooltip");
            }
            View a = c14461a.a(getMediaButton(), new ProfileTabView$showProfileAddLoopsToolTip$1(this));
            addView(a);
            this.f12491j = a;
        }
    }

    public void showEditProfile() {
        getContext().startActivity(new Intent(getContext(), ActivityEditProfile.class));
    }

    public void showMediaSelector() {
        getContext().startActivity(new Intent(getContext(), MediaSelectorActivity.class));
    }

    public void startEditButtonAnimation() {
        getInfoEditButton().setColor(R.color.tinder_red);
        getInfoEditButton().setDrawable(R.drawable.profile_tab_ic_edit_white);
        getInfoEditButton().a(1.1f, 700);
    }

    public void dismissTooltip(@NotNull TutorialAction tutorialAction) {
        C2668g.m10309b(tutorialAction, "tooltipAction");
        View view = this.f12491j;
        if (view != null && view.isShown()) {
            removeView(this.f12491j);
            C14476x c14476x = this.f12484b;
            if (c14476x == null) {
                C2668g.m10310b("presenter");
            }
            c14476x.a(tutorialAction);
        }
    }
}
