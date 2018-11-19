package com.tinder.recs.view;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.boost.view.BoostButtonView;
import com.tinder.boost.view.BoostButtonView$AnalyticsSource;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.common.p076a.C2640a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.Deadshot;
import com.tinder.gamepad.Gamepad;
import com.tinder.gamepad.model.C9656a;
import com.tinder.gamepad.view.GamepadButton;
import com.tinder.gamepadcounters.C9671a;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.presenter.GamepadPresenter;
import com.tinder.recs.target.GamepadTarget;
import com.tinder.recs.view.extension.LikeButtonExtKt;
import java.util.Set;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;

public class GamepadView extends LinearLayout implements LifecycleObserver, Gamepad, GamepadTarget {
    private static final long GAMEPAD_COUNTER_DELAY_MS = 2500;
    private static final long TOOLTIP_DURATION_MS = 2000;
    private static final int TRANSLATION_Z_DURING_SUPERLIKE = 10;
    @Inject
    AbTestUtility abTestUtility;
    @BindView(2131362601)
    BoostButtonView boostButtonView;
    @BindColor(2131099699)
    int boostEndGradientColor;
    @BindString(2131820682)
    String boostReminderTooltipMessage;
    @BindColor(2131099700)
    int boostStartGradientColor;
    @Nullable
    private ViewGroup contentContainer;
    @Nullable
    private GamepadView$GamepadClickListener gamepadClickListener;
    @Inject
    protected GamepadPresenter gamepadPresenter;
    @Inject
    Lifecycle lifecycle;
    @BindView(2131362603)
    LikeButton likeButton;
    @BindView(2131362604)
    IconGamepadButton passButton;
    @BindView(2131362605)
    IconGamepadButton rewindButton;
    @BindView(2131362606)
    SuperLikeButton superLikeButton;
    @Nullable
    private Animator superlikeAnimator;
    @Inject
    protected TappyConfig tappyConfigProvider;
    private final int[] tempLocation = new int[2];

    public GamepadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        inflate(context, R.layout.recs_gamepad, this);
        setOrientation(null);
        setGravity(17);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.m2675a((View) this);
        this.lifecycle.mo36a(this);
        this.boostButtonView.setAnalyticsSource(BoostButtonView$AnalyticsSource.GAMEPAD);
        this.boostButtonView.getViewTreeObserver().addOnGlobalLayoutListener(new GamepadView$1(this));
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public void onResume() {
        Deadshot.take(this, this.gamepadPresenter);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public void onPause() {
        Deadshot.drop(this);
    }

    @OnClick({2131362604, 2131362603, 2131362606, 2131362605})
    void onGamepadButtonClick(View view) {
        if (this.gamepadClickListener != null) {
            switch (view.getId()) {
                case R.id.gamepad_like:
                    this.gamepadClickListener.onLikeClick();
                    break;
                case R.id.gamepad_pass:
                    this.gamepadClickListener.onPassClick();
                    break;
                case R.id.gamepad_rewind:
                    this.gamepadClickListener.onRewindClick();
                    break;
                case R.id.gamepad_superlike:
                    this.gamepadClickListener.onSuperlikeClick((SuperLikeButton) view);
                    break;
                default:
                    break;
            }
        }
    }

    public void showBoostReminderToolTip() {
        showBoostTooltip(this.boostReminderTooltipMessage);
    }

    private void showBoostTooltip(String str) {
        new C19463a(getContext(), this.boostButtonView).a(AnchorGravity.TOP).a(str).a(true).a(new int[]{this.boostEndGradientColor, this.boostStartGradientColor}).a(-1).a(2000).a().show();
    }

    public void setGamepadClickListener(@NonNull GamepadView$GamepadClickListener gamepadView$GamepadClickListener) {
        this.gamepadClickListener = gamepadView$GamepadClickListener;
    }

    @UiThread
    public boolean isSuperlikeAnimating() {
        return this.superlikeAnimator != null && (this.superlikeAnimator.isStarted() || this.superlikeAnimator.isRunning());
    }

    @UiThread
    public void animateSuperlike(int i) {
        if (!isSuperlikeAnimating()) {
            this.superlikeAnimator = getSuperlikeAnimator(i);
            this.superlikeAnimator.addListener(new GamepadView$2(this));
            this.superlikeAnimator.start();
        }
    }

    @NonNull
    public Animator getSuperlikeAnimator(int i) {
        return this.superLikeButton.createCounterChangeAnimator(i, Math.max(0, i - 1));
    }

    public void setRewindButtonRotation(float f) {
        this.rewindButton.setRotation(f);
    }

    public void rewindButtonOnAnimationStart() {
        this.rewindButton.onAnimationStart();
    }

    public void rewindButtonOnAnimationEnd() {
        this.rewindButton.onAnimationEnd();
    }

    public void updateLikesButton(int i) {
        LikeButtonExtKt.animateLikeMeter(this.likeButton, i);
    }

    public void animateGamepadCounters(C9671a c9671a) {
        this.gamepadPresenter.notifyCounterSeen();
        postDelayed(new GamepadView$$Lambda$0(this, c9671a), GAMEPAD_COUNTER_DELAY_MS);
    }

    final /* synthetic */ void lambda$animateGamepadCounters$0$GamepadView(C9671a c9671a) {
        if (c9671a.c()) {
            this.superLikeButton.animateCounter(c9671a.a());
        }
        if (c9671a.d()) {
            this.boostButtonView.boostButton.animateCounter(c9671a.b(), c9671a.c() ? 100 : 0);
        }
    }

    protected GamepadButton getLikeButton() {
        return this.likeButton;
    }

    protected GamepadButton getSuperlikeButton() {
        return this.superLikeButton;
    }

    protected GamepadButton getPassButton() {
        return this.passButton;
    }

    protected GamepadButton getBoostButtonView() {
        return this.boostButtonView.getBoostButton();
    }

    @NonNull
    private ViewGroup getContentContainer() {
        if (this.contentContainer == null) {
            this.contentContainer = (ViewGroup) ((Activity) getContext()).findViewById(R.id.recs_content_container);
            C2640a.m9986a(this.contentContainer);
        }
        return this.contentContainer;
    }

    private void layoutBoostButton() {
        this.boostButtonView.setBoostEmitterViewXoffset(xOffsetForBoostEmitter());
        this.boostButtonView.setContentContainer(getContentContainer());
        this.boostButtonView.setAnchorContainer(this);
    }

    private int xOffsetForBoostEmitter() {
        this.boostButtonView.getLocationInWindow(this.tempLocation);
        return (int) ((((float) this.tempLocation[0]) - (((float) getWidth()) / 2.0f)) + (((float) this.boostButtonView.getWidth()) / 2.0f));
    }

    public void bind(@NotNull Set<C9656a> set) {
        for (C9656a bindButton : set) {
            bindButton(bindButton);
        }
    }

    private void bindButton(C9656a c9656a) {
        switch (GamepadView$3.$SwitchMap$com$tinder$gamepad$model$GamepadButtonType[c9656a.a().ordinal()]) {
            case 1:
                this.likeButton.bindState(c9656a.b());
                return;
            case 2:
                this.passButton.bindState(c9656a.b());
                return;
            case 3:
                this.superLikeButton.bindState(c9656a.b());
                return;
            case 4:
                this.rewindButton.bindState(c9656a.b());
                return;
            case 5:
                getBoostButtonView().bindState(c9656a.b());
                return;
            default:
                return;
        }
    }

    public void resetScalableButtons() {
        getSuperlikeButton().resetScale();
        getLikeButton().resetScale();
        getPassButton().resetScale();
    }

    public void scaleButton(SwipeDirection swipeDirection, float f) {
        float min = 1.0f - Math.min(1.0f, Math.abs(f));
        switch (GamepadView$3.$SwitchMap$com$tinder$cardstack$model$SwipeDirection[swipeDirection.ordinal()]) {
            case 1:
                getPassButton().setFlooredScale(min);
                getLikeButton().resetScale();
                getSuperlikeButton().resetScale();
                return;
            case 2:
                getLikeButton().setFlooredScale(min);
                getSuperlikeButton().resetScale();
                getPassButton().resetScale();
                return;
            case 3:
                getSuperlikeButton().setFlooredScale(min);
                getLikeButton().resetScale();
                getPassButton().resetScale();
                return;
            default:
                return;
        }
    }
}
