package com.tinder.superlike.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.view.p011a.C2890b;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.facebook.ads.AdError;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.facebook.rebound.C3442e;
import com.tinder.R;
import com.tinder.common.p192e.p193a.C10659a.C8531a;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.views.PaywallBaseView;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.profile.p365d.C14398a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.superlike.p489d.C18189a;
import com.tinder.superlike.target.SuperlikePaywallTarget;
import com.tinder.utils.C15374w;
import com.tinder.utils.an;
import com.tinder.utils.av;
import java.util.List;
import javax.inject.Inject;

public class SuperlikePaywallDialog extends AppCompatDialog implements PaywallItemSelectListener, SuperlikePaywallTarget {
    @Inject
    /* renamed from: a */
    C18189a f56397a;
    @Inject
    /* renamed from: b */
    C10084g f56398b;
    /* renamed from: c */
    private final int f56399c;
    /* renamed from: d */
    private final ListenerPaywall f56400d;
    @BindString(2131821961)
    String depletedTitleText;
    @BindString(2131821960)
    String descriptionText;
    /* renamed from: e */
    private final C10075b f56401e;
    /* renamed from: f */
    private C1811f f56402f;
    @BindString(2131821959)
    String likelyMatchDescriptionText;
    @BindView(2131362315)
    View mainContainer;
    @BindView(2131363129)
    PaywallBaseView paywallBaseView;
    @BindView(2131363221)
    ImageView recImage;
    @BindString(2131821962)
    String refillNowDescriptionText;
    @BindString(2131821963)
    String refillNowWithNameText;
    @BindString(2131821964)
    String standOutTitleText;
    @BindDrawable(2131231948)
    Drawable superlikeGradient;
    @BindView(2131363717)
    View superlikeIconView;
    @BindView(2131363721)
    View superlikeStar;
    @BindView(2131363720)
    View superlikeStarSpace;
    @BindString(2131821966)
    String upsellTitleText;

    public void onPaywallItemInFocusTap(C14510e c14510e) {
    }

    public SuperlikePaywallDialog(@NonNull Context context, int i, ListenerPaywall listenerPaywall, C10075b c10075b) {
        super(context, R.style.PlusPaywallDialog);
        supportRequestWindowFeature(1);
        setContentView(R.layout.dialog_superlike_paywall);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setCanceledOnTouchOutside(true);
        ManagerApp.e().inject(this);
        ButterKnife.a(this);
        this.f56399c = i;
        this.f56400d = listenerPaywall;
        this.f56401e = c10075b;
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(i);
        getWindow().setLayout(-1, -1);
        getWindow().setGravity(17);
    }

    protected void onStart() {
        super.onStart();
        this.f56397a.a(this);
        this.f56397a.m65947a(this.f56399c, this.f56401e);
    }

    protected void onStop() {
        super.onStop();
        this.f56397a.a();
    }

    public void show() {
        super.show();
        final View mainIconSpace = this.paywallBaseView.getMainIconSpace();
        mainIconSpace.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog f46918b;

            public void onGlobalLayout() {
                mainIconSpace.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Rect rect = new Rect();
                mainIconSpace.getGlobalVisibleRect(rect);
                this.f46918b.f56397a.m65945a(rect.top);
            }
        });
        this.superlikeStarSpace.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog f46920b;

            public void onGlobalLayout() {
                mainIconSpace.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Rect rect = new Rect();
                this.f46920b.superlikeStarSpace.getGlobalVisibleRect(rect);
                this.f46920b.f56397a.m65946a(rect.top, rect.height());
            }
        });
        this.f56397a.m65949b();
    }

    public void dismiss() {
        super.dismiss();
        if (this.f56402f != null) {
            this.f56402f.a();
        }
        this.paywallBaseView.c();
        this.f56397a.m65950c();
    }

    public void displayPaywall(@NonNull List<C14510e> list, @NonNull ColorScheme colorScheme, @NonNull PaywallItemViewModelColor paywallItemViewModelColor) {
        this.paywallBaseView.setPaywallColorScheme(colorScheme);
        this.paywallBaseView.setTopContainerBackground(this.superlikeGradient);
        this.paywallBaseView.setPaywallButtonText(this.upsellTitleText);
        this.paywallBaseView.a(this.f56398b.a(ProductType.SUPERLIKE, list, paywallItemViewModelColor, this));
    }

    public void showDefaultHeader() {
        this.paywallBaseView.setTitle(this.standOutTitleText);
        this.paywallBaseView.setDescription(this.likelyMatchDescriptionText);
    }

    public void showOutOfSuperlikesHeader(@NonNull String str) {
        this.paywallBaseView.setTitle(this.depletedTitleText);
        if (TextUtils.isEmpty(str)) {
            this.paywallBaseView.setDescription(this.refillNowDescriptionText);
            return;
        }
        this.paywallBaseView.setDescription(String.format(this.refillNowWithNameText, new Object[]{str}));
    }

    public void startCountdownTimer(long j) {
        this.paywallBaseView.a(j);
    }

    public void hideCountdownTimer() {
        this.paywallBaseView.a();
    }

    public void showTinderPlusUpsellSection(@NonNull String str) {
        this.paywallBaseView.a(str);
    }

    public void hideTinderPlusUpsellSection() {
        this.paywallBaseView.b();
    }

    public void showStarIcon(int i) {
        this.superlikeIconView.setTranslationY((float) i);
        av.a(new View[]{this.superlikeIconView, this.superlikeStar});
        av.c(new View[]{this.recImage});
    }

    public void startStarAnimation(int i, int i2) {
        this.superlikeStar.setTranslationY((float) i);
        av.a(new View[]{this.superlikeStar});
        m65955a(i, i2);
    }

    public void hideStarAnimation() {
        av.c(new View[]{this.superlikeStar});
    }

    public void displayUserImage(int i, @NonNull String str) {
        C0994i.b(getContext()).a(str).a(R.drawable.group_add_placeholder).a(new Transformation[]{new C8531a(getContext()).a().b()}).a(this.recImage);
        this.recImage.setTranslationY((float) i);
        av.a(new View[]{this.recImage});
        av.b(new View[]{this.superlikeIconView});
        av.c(new View[]{this.superlikeStar});
    }

    public void onPaywallItemSelected(C14510e c14510e, int i) {
        this.f56397a.m65948a(c14510e);
    }

    @OnClick({2131363790})
    public void onGetTinderPlusClick() {
        dismiss();
        C10076o.a(PlusPaywallSource.SUPERLIKE_DIALOG_UPSELL).a(this.f56401e).a(C14398a.m54830a(getContext()));
    }

    @OnClick({2131363130})
    public void onGetSuperlikeClick() {
        C14510e currentlySelectedOffer = this.paywallBaseView.getCurrentlySelectedOffer();
        this.f56400d.onPayClicked(currentlySelectedOffer != null ? currentlySelectedOffer.mo11839a() : "");
    }

    @OnClick({2131362315})
    public void onBackgroundClick() {
        dismiss();
    }

    /* renamed from: a */
    private void m65955a(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        i2 = (int) (((double) i2) * -1.5d);
        ValueAnimator b = m65956b(i, i2);
        ValueAnimator a = m65951a();
        i = m65957b(i, i2, m65952a(animatorSet));
        animatorSet.playSequentially(new Animator[]{b, a, i});
        animatorSet.setStartDelay(AdError.NETWORK_ERROR_CODE);
        animatorSet.start();
    }

    /* renamed from: b */
    private ValueAnimator m65956b(int i, int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(500);
        valueAnimator.setIntValues(new int[]{0, 1});
        valueAnimator.setInterpolator(new C2890b());
        valueAnimator.addUpdateListener(new C15076a(this, i, i2));
        return valueAnimator;
    }

    /* renamed from: a */
    final /* synthetic */ void m65958a(int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator = valueAnimator.getAnimatedFraction();
        this.superlikeStar.setTranslationY(((float) i) + (((float) i2) * valueAnimator));
        av.c(this.superlikeStar, (valueAnimator * 1045220557) + 1065353216);
    }

    /* renamed from: a */
    private ValueAnimator m65951a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(500);
        valueAnimator.setInterpolator(new C2890b());
        valueAnimator.setIntValues(new int[]{0, 1});
        valueAnimator.addUpdateListener(new C15077b(this));
        return valueAnimator;
    }

    /* renamed from: a */
    final /* synthetic */ void m65960a(ValueAnimator valueAnimator) {
        this.superlikeStar.setRotationY(valueAnimator.getAnimatedFraction() * 180.0f);
    }

    /* renamed from: a */
    private ValueAnimator m65952a(final AnimatorSet animatorSet) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, 1});
        valueAnimator.setStartDelay(75);
        valueAnimator.addListener(new an(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog f52042b;

            /* renamed from: com.tinder.superlike.dialog.SuperlikePaywallDialog$3$1 */
            class C181901 extends C3442e {
                /* renamed from: a */
                final /* synthetic */ C168893 f56396a;

                C181901(C168893 c168893) {
                    this.f56396a = c168893;
                }

                public void onSpringUpdate(C1811f c1811f) {
                    av.c(this.f56396a.f52042b.superlikeIconView, (float) c1811f.c());
                    av.c(this.f56396a.f52042b.superlikeStar, (float) c1811f.c());
                }

                public void onSpringAtRest(C1811f c1811f) {
                    av.c(this.f56396a.f52042b.superlikeIconView, 1.0f);
                    animatorSet.setStartDelay(1000);
                    animatorSet.start();
                }
            }

            public void onAnimationStart(Animator animator) {
                this.f52042b.f56402f = C9661a.a();
                this.f52042b.f56402f.c(100.0d);
                this.f52042b.f56402f.a(C1812g.b(20.0d, 23.0d));
                this.f52042b.f56402f.a(0.75d);
                this.f52042b.f56402f.a(new C181901(this));
                this.f52042b.f56402f.b(1.0d);
            }
        });
        animatorSet = new ValueAnimator();
        animatorSet.setIntValues(new int[]{0, 1});
        animatorSet.setDuration(100);
        animatorSet.addUpdateListener(new C15078c(this, valueAnimator));
        return animatorSet;
    }

    /* renamed from: a */
    final /* synthetic */ void m65961a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        av.c(this.superlikeIconView, C15374w.m57701a(valueAnimator2.getAnimatedFraction(), 0.0f, 1.0f, 1.0f, 0.75f));
        av.c(this.superlikeStar, C15374w.m57701a(valueAnimator2.getAnimatedFraction(), 0.0f, 1.0f, 1.0f, 0.75f));
        valueAnimator.start();
    }

    /* renamed from: b */
    private ValueAnimator m65957b(int i, int i2, ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setInterpolator(new AccelerateInterpolator());
        valueAnimator2.setIntValues(new int[]{0, 1});
        valueAnimator2.setDuration(300);
        valueAnimator2.addUpdateListener(new C15079d(this, i, i2, valueAnimator));
        return valueAnimator2;
    }

    /* renamed from: a */
    final /* synthetic */ void m65959a(int i, int i2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        valueAnimator2 = valueAnimator2.getAnimatedFraction();
        this.superlikeStar.setTranslationY(((float) (i + i2)) - (((float) i2) * valueAnimator2));
        av.c(this.superlikeStar, ((1.0f - valueAnimator2) * 0.2f) + 1.0f);
        if (valueAnimator2 >= 1063675494) {
            valueAnimator.start();
        }
    }
}
