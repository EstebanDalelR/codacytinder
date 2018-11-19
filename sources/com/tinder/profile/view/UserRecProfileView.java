package com.tinder.profile.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnticipateInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.facebook.rebound.C3442e;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.aa;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.ReportCause;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.bp;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.profile.target.UserRecProfileTarget;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.view.RecProfileView;
import com.tinder.recs.view.RecProfileView.GamepadButtonStates;
import com.tinder.utils.av;
import javax.inject.Inject;

public class UserRecProfileView extends RecProfileView<UserRec> implements UserRecProfileTarget {
    @Inject
    /* renamed from: a */
    bp f50308a;
    @Inject
    /* renamed from: b */
    TappyConfig f50309b;
    @NonNull
    /* renamed from: c */
    private final int f50310c;
    @NonNull
    /* renamed from: d */
    private final UserRec f50311d;
    @Nullable
    /* renamed from: e */
    private aa f50312e;
    /* renamed from: f */
    private final ListenerReportUser f50313f;

    /* renamed from: com.tinder.profile.view.UserRecProfileView$1 */
    class C161551 implements ListenerReportUser {
        /* renamed from: a */
        final /* synthetic */ UserRecProfileView f50305a;

        C161551(UserRecProfileView userRecProfileView) {
            this.f50305a = userRecProfileView;
        }

        public void onReportUser(@NonNull ReportCause reportCause, @Nullable String str, boolean z) {
            this.f50305a.f50308a.m55051a(this.f50305a.f50311d, reportCause, str);
        }
    }

    public static class GamePadButtons extends LinearLayout implements ProfileGamepadTarget {
        /* renamed from: a */
        private static final int f50306a = (av.b() / 3);
        @BindView(2131363283)
        ImageButton buttonLike;
        @BindView(2131363284)
        ImageButton buttonPass;
        @BindView(2131363285)
        ImageButton buttonSuperLike;

        /* renamed from: com.tinder.profile.view.UserRecProfileView$GamePadButtons$1 */
        class C177731 extends C3442e {
            /* renamed from: a */
            final /* synthetic */ GamePadButtons f55455a;

            C177731(GamePadButtons gamePadButtons) {
                this.f55455a = gamePadButtons;
            }

            public void onSpringUpdate(@NonNull C1811f c1811f) {
                c1811f = (float) c1811f.c();
                float f = 1.0f - c1811f;
                this.f55455a.buttonPass.setTranslationX(((float) (-GamePadButtons.f50306a)) * f);
                this.f55455a.buttonPass.setRotation(c1811f * 1127481344);
                this.f55455a.buttonSuperLike.setTranslationY(250.0f * f);
                this.f55455a.buttonLike.setTranslationX(((float) GamePadButtons.f50306a) * f);
                this.f55455a.buttonLike.setRotation(f * 180.0f);
            }

            public void onSpringAtRest(C1811f c1811f) {
                c1811f.b(this);
                c1811f.a();
            }

            public void onSpringActivate(C1811f c1811f) {
                this.f55455a.buttonPass.setVisibility(0);
                this.f55455a.buttonLike.setVisibility(0);
                this.f55455a.buttonSuperLike.setVisibility(0);
            }
        }

        public boolean hasOverlappingRendering() {
            return false;
        }

        public void setLikePercentRemaining(int i) {
        }

        public void setEnabled(boolean z) {
            super.setEnabled(z);
            if (z) {
                C9661a.a(this.buttonSuperLike, 1.0f, 0.7f, 200, 200);
                C9661a.a(this.buttonPass, 1.0f, 0.7f, 200, 200);
                C9661a.a(this.buttonLike, 1.0f, 0.7f, 200, 200);
                return;
            }
            this.buttonSuperLike.setOnTouchListener(null);
            this.buttonPass.setOnTouchListener(null);
            this.buttonLike.setOnTouchListener(null);
        }

        public void setSuperlikeClickListener(OnClickListener onClickListener) {
            this.buttonSuperLike.setOnClickListener(onClickListener);
        }

        public void setLikeClickListener(OnClickListener onClickListener) {
            this.buttonLike.setOnClickListener(onClickListener);
        }

        public void setPassClickListener(OnClickListener onClickListener) {
            this.buttonPass.setOnClickListener(onClickListener);
        }

        public void setLikeButtonEnabled(boolean z) {
            this.buttonLike.setEnabled(z);
        }

        public void setPassButtonEnabled(boolean z) {
            this.buttonPass.setEnabled(z);
        }

        public void setSuperlikeButtonEnabled(boolean z) {
            this.buttonSuperLike.setEnabled(z);
        }

        public void setSuperLikeButtonVisible(boolean z) {
            this.buttonSuperLike.setVisibility(z ? false : true);
        }

        public void enterWithAnimation() {
            C1811f a = C9661a.a();
            a.a(0.0d);
            a.c(12.0d);
            a.d(0.001d);
            a.a(C1812g.a(40.0d, 7.0d));
            a.a(new C177731(this));
            a.b(1.0d);
        }

        public void exitWithAnimation() {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.setDuration(120);
            valueAnimator.setInterpolator(new AnticipateInterpolator(1.45f));
            valueAnimator.addUpdateListener(new ad(this));
            valueAnimator.start();
        }

        /* renamed from: a */
        final /* synthetic */ void m61050a(ValueAnimator valueAnimator) {
            valueAnimator = valueAnimator.getAnimatedFraction();
            this.buttonPass.setTranslationX(((float) (-f50306a)) * valueAnimator);
            this.buttonPass.setRotation(-180.0f * valueAnimator);
            this.buttonSuperLike.setTranslationY(250.0f * valueAnimator);
            this.buttonLike.setTranslationX(((float) f50306a) * valueAnimator);
            this.buttonLike.setRotation(valueAnimator * 180.0f);
        }

        public void enterWithoutAnimation() {
            enterWithAnimation();
        }

        public void exitWithoutAnimation() {
            exitWithAnimation();
        }

        public void show() {
            setVisibility(0);
        }

        public void hide() {
            setVisibility(8);
        }
    }

    public class GamePadButtons_ViewBinding implements Unbinder {
        /* renamed from: b */
        private GamePadButtons f50307b;

        @UiThread
        public GamePadButtons_ViewBinding(GamePadButtons gamePadButtons, View view) {
            this.f50307b = gamePadButtons;
            gamePadButtons.buttonPass = (ImageButton) C0761c.b(view, R.id.profile_btn_pass, "field 'buttonPass'", ImageButton.class);
            gamePadButtons.buttonLike = (ImageButton) C0761c.b(view, R.id.profile_btn_like, "field 'buttonLike'", ImageButton.class);
            gamePadButtons.buttonSuperLike = (ImageButton) C0761c.b(view, R.id.profile_btn_superlike, "field 'buttonSuperLike'", ImageButton.class);
        }

        @CallSuper
        public void unbind() {
            GamePadButtons gamePadButtons = this.f50307b;
            if (gamePadButtons == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f50307b = null;
            gamePadButtons.buttonPass = null;
            gamePadButtons.buttonLike = null;
            gamePadButtons.buttonSuperLike = null;
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public /* synthetic */ void bindData(@NonNull Object obj) {
        m61052a((UserRec) obj);
    }

    public UserRecProfileView(@NonNull Context context, @NonNull UserRec userRec, @NonNull int i) {
        super(context);
        this.f50313f = new C161551(this);
        this.f50311d = userRec;
        this.f50310c = i;
        ((ProfileComponentProvider) C14398a.m54830a(context)).provideComponent().inject(this);
        inflate(context, R.layout.profile_user_rec, this);
        setClipChildren(null);
        ButterKnife.a(this);
        Deadshot.take(this, this.f50308a);
        m61052a(userRec);
    }

    public UserRecProfileView(@NonNull Context context, @NonNull UserRec userRec, @NonNull int i, @NonNull GamepadButtonStates gamepadButtonStates) {
        this(context, userRec, i);
        bindGamepadButtonStates(gamepadButtonStates);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public void m61052a(@NonNull UserRec userRec) {
        this.f50308a.m55050a(this.f50311d, this.f50310c);
    }

    public UserRec getBoundData() {
        return this.f50311d;
    }

    public void showProfile(@NonNull Profile profile) {
        getProfileView().a(ProfileScreenSource.RECS);
        getProfileView().a(profile);
    }

    public void showReportDialog() {
        this.f50312e = new aa(getContext(), this.f50313f, true);
        this.f50312e.show();
    }

    public void showReportFailure() {
        if (this.f50312e != null) {
            this.f50312e.o();
        }
    }

    public void showReportSuccessful() {
        if (this.f50312e != null) {
            this.f50312e.n();
        }
    }

    /* renamed from: a */
    public void m61053a(ProfileScreenSource profileScreenSource) {
        this.profileView.a(profileScreenSource);
    }
}
