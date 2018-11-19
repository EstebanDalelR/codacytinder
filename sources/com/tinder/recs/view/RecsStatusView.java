package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C3018c;
import com.tinder.R;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import com.tinder.deadshot.Deadshot;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.presenter.RecsStatusPresenter;
import com.tinder.recs.target.RecsStatusTarget;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.views.CustomButton;
import java.util.Iterator;
import java.util.LinkedList;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class RecsStatusView extends RelativeLayout implements LifecycleObserver, RecsStatusTarget {
    private static final float ALPHA_BEG = 0.095f;
    private static final float ALPHA_END = 0.0f;
    private static final long ANIM_DURATION_MS = 4000;
    private static final String EMPTY_STRING = "";
    private static final long RING_STAGGER_MS = 600;
    private static final float SCALE_BEG = 1.0f;
    private static final float SCALE_END = 5.0f;
    private boolean animating;
    @NonNull
    private final LinkedList<AnimatorSet> animatorSets = new LinkedList();
    @BindDimen(2131166249)
    int detailFontSize;
    @BindString(2131820919)
    String discoverySettingsAction;
    @BindDimen(2131165683)
    int imageSize;
    @Inject
    Lifecycle lifecycle;
    @BindView(2131363435)
    TextView messageView;
    @BindString(2131821727)
    String passportAction;
    @NonNull
    private final AccelerateDecelerateInterpolator pingInterpolator = new AccelerateDecelerateInterpolator();
    @Inject
    RecsStatusPresenter presenter;
    @BindView(2131363436)
    ImageView ring1;
    @BindView(2131363437)
    ImageView ring2;
    @BindView(2131363433)
    CustomButton settingsButton;
    @BindDimen(2131166113)
    int thumbStrokeWidth;
    @BindView(2131363439)
    ImageView thumbView;
    @BindDimen(2131166248)
    int titleFontSize;

    public boolean hasOverlappingRendering() {
        return false;
    }

    public RecsStatusView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        inflate(context, R.layout.recs_status, this);
        ButterKnife.m2675a((View) this);
        this.lifecycle.mo36a(this);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public void onResume() {
        Deadshot.take(this, this.presenter);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public void onPause() {
        Deadshot.drop(this);
    }

    public void showPlaceholderImage(@DrawableRes int i) {
        loadImage(C0994i.m3486b(getContext()).m11772a(Integer.valueOf(i)));
    }

    public void showPhotoUrl(@NonNull String str) {
        loadImage(C0994i.m3486b(getContext()).m11774a(str).m11843a(new C8531a(getContext()).a((float) this.thumbStrokeWidth).a(-1).b()));
    }

    public void showStatusViewWithNoAnimation() {
        setVisibility(0);
        C0001a.m25b("Set RecsStatusView visibility to VISIBLE", new Object[0]);
    }

    public void showViewWithAnimation(@DrawableRes int i) {
        showStatusViewWithNoAnimation();
        startPingAnimation(i);
    }

    public void hide() {
        cancelPingAnimation();
        setVisibility(8);
        C0001a.m25b("setting RecsStatusView visibility to GONE", new Object[0]);
    }

    public void showMessage(String str) {
        this.messageView.setText(str);
    }

    public void showRadarAnimation(@DrawableRes int i) {
        startPingAnimation(i);
    }

    public void hideRadarAnimation() {
        cancelPingAnimation();
    }

    public void showSettingsEnableView() {
        this.settingsButton.setVisibility(0);
        this.settingsButton.setText(this.discoverySettingsAction);
        this.settingsButton.setBackgroundDrawable(C0432b.m1640a(getContext(), (int) R.drawable.button_rounded_gradient));
    }

    public void showPassportEnableView() {
        this.settingsButton.setVisibility(0);
        this.settingsButton.setText(this.passportAction);
        this.settingsButton.setBackgroundDrawable(C0432b.m1640a(getContext(), (int) R.drawable.auth_v2_fb_login_button_background));
    }

    public void navigateToSettings() {
        getContext().startActivity(SettingsActivity.a(getContext()));
    }

    public void showSettingsDialog() {
        SettingsShortcutDialog settingsShortcutDialog = new SettingsShortcutDialog(getContext());
        settingsShortcutDialog.setAnalyticsType(Type.CARD_STACK);
        settingsShortcutDialog.show();
    }

    public void hideSettingsButton() {
        this.settingsButton.setVisibility(8);
    }

    public void clearMessage() {
        this.messageView.setText("");
    }

    public void launchPaywallFlow(C10076o c10076o) {
        c10076o.a(getContext());
    }

    @OnClick({2131363433})
    void updateDiscoveryPreferences() {
        this.presenter.handleSettingsUpdateButtonClick();
    }

    public void startPingAnimation(@DrawableRes int i) {
        if (!this.animating) {
            this.ring1.setImageResource(i);
            this.ring2.setImageResource(i);
            this.animating = true;
            this.ring1.setVisibility(0);
            this.ring2.setVisibility(0);
            startPingForRing(this.ring1, 0);
            startPingForRing(this.ring2, RING_STAGGER_MS);
        }
    }

    public void cancelPingAnimation() {
        Iterator it = this.animatorSets.iterator();
        while (it.hasNext()) {
            ((AnimatorSet) it.next()).cancel();
            it.remove();
        }
        this.animating = false;
    }

    private void startPingForRing(ImageView imageView, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(imageView);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{SCALE_BEG, SCALE_END});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setDuration(ANIM_DURATION_MS);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{SCALE_BEG, SCALE_END});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setDuration(ANIM_DURATION_MS);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, View.ALPHA, new float[]{ALPHA_BEG, 0.0f});
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(1);
        ofFloat3.setDuration(ANIM_DURATION_MS);
        animatorSet.setInterpolator(this.pingInterpolator);
        animatorSet.setStartDelay(j);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.addListener(new RecsStatusView$1(this, imageView));
        animatorSet.start();
        this.animatorSets.add(animatorSet);
    }

    private void loadImage(C3018c c3018c) {
        c3018c.m11830a(this.imageSize, this.imageSize).mo1236a(this.thumbView);
    }
}
