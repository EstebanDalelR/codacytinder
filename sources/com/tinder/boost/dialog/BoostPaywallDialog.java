package com.tinder.boost.dialog;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.boost.presenter.C12628f;
import com.tinder.boost.provider.C10442h;
import com.tinder.boost.target.BoostPaywallTarget;
import com.tinder.boost.view.BoostEmitterView.C8351b;
import com.tinder.boost.view.BoostGaugeView;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.views.PaywallBaseView;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.profile.p365d.C14398a;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;
import javax.inject.Inject;

public class BoostPaywallDialog extends C12627a implements BoostPaywallTarget, PaywallItemSelectListener {
    @Inject
    /* renamed from: a */
    C12628f f43476a;
    @Inject
    /* renamed from: b */
    C10084g f43477b;
    /* renamed from: c */
    private final int f43478c;
    /* renamed from: d */
    private ListenerPaywall f43479d;
    @BindDimen(2131165295)
    int mBoostEmitterYDelta;
    @BindDrawable(2131230867)
    Drawable mBoostGradient;
    @BindString(2131820668)
    String mBoostMe;
    @BindString(2131820672)
    String mDescriptionOutOfBoost;
    @BindView(2131361954)
    BoostGaugeView mGaugeView;
    @BindView(2131362305)
    ViewGroup mMainContainer;
    @BindString(2131820673)
    String mOutOfBoost;
    @BindView(2131363129)
    PaywallBaseView mPaywallView;
    @BindString(2131820670)
    String mTitle;
    @BindString(2131820671)
    String mTitleDescription;

    @OnClick({2131362051})
    public void onCardClick() {
    }

    public void onPaywallItemInFocusTap(C14510e c14510e) {
    }

    public BoostPaywallDialog(@NonNull Activity activity, int i, ListenerPaywall listenerPaywall) {
        super(activity);
        setContentView(R.layout.dialog_boost_paywall);
        ManagerApp.e().inject(this);
        ButterKnife.a(this);
        this.f43478c = i;
        this.f43479d = listenerPaywall;
    }

    protected void onStart() {
        super.onStart();
        this.f43476a.a(this);
        this.f43476a.m49865a(this.f43478c);
    }

    protected void onStop() {
        super.onStop();
        this.f43476a.m49864a();
    }

    public void show() {
        super.show();
        this.f43476a.m49870b();
        this.mPaywallView.setTopContainerBackground(this.mBoostGradient);
        this.mPaywallView.setPaywallColorScheme(ColorScheme.BLUE);
    }

    /* renamed from: a */
    private void m53172a() {
        final View mainIconSpace = this.mPaywallView.getMainIconSpace();
        mainIconSpace.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            /* renamed from: b */
            final /* synthetic */ BoostPaywallDialog f29637b;

            public void onGlobalLayout() {
                mainIconSpace.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Rect rect = new Rect();
                mainIconSpace.getGlobalVisibleRect(rect);
                this.f29637b.mGaugeView.setTranslationY((float) rect.top);
                LayoutParams layoutParams = this.f29637b.mGaugeView.getLayoutParams();
                layoutParams.width = mainIconSpace.getWidth();
                layoutParams.height = mainIconSpace.getHeight();
                this.f29637b.mGaugeView.setLayoutParams(layoutParams);
                this.f29637b.mGaugeView.setVisibility(0);
                this.f29637b.mGaugeView.setRepeats(false);
                this.f29637b.mGaugeView.setGaugeListener(new C10415b(this));
                this.f29637b.mGaugeView.m35593a();
            }

            /* renamed from: a */
            final /* synthetic */ void m35512a() {
                new C8351b().m35556a(this.f29637b.mMainContainer).m35557a(new C10442h()).m35555a(this.f29637b.mGaugeView.getDuration()).m35554a(((int) this.f29637b.mGaugeView.getY()) - this.f29637b.mBoostEmitterYDelta).m35558a(this.f29637b.mGaugeView).m35579a();
            }
        });
    }

    public void dismiss() {
        super.dismiss();
        this.mPaywallView.m41282c();
        this.f43476a.m49872d();
    }

    @OnClick({2131362305})
    public void onWindowBackgroundClick() {
        dismiss();
    }

    @OnClick({2131363130})
    public void onBoostButtonClick() {
        this.f43476a.m49871c();
    }

    @OnClick({2131363790})
    public void onGetTinderPlusClick() {
        dismiss();
        C10076o.m41167a(PlusPaywallSource.BOOST_DIALOG_UPSELL_BUTTON).m41175a(C14398a.a(getContext()));
    }

    public void displayNonSubscriberPaywall(@NonNull List<C14510e> list, int i, boolean z, boolean z2) {
        if (this.f43478c == 4) {
            this.mPaywallView.setTitle(this.mTitle);
        } else {
            PaywallBaseView paywallBaseView = this.mPaywallView;
            if (z) {
                if (z2) {
                    z = this.mOutOfBoost;
                    paywallBaseView.setTitle(z);
                }
            }
            z = this.mTitle;
            paywallBaseView.setTitle(z);
        }
        this.mPaywallView.setDescription(String.format(this.mTitleDescription, new Object[]{Integer.valueOf(i)}));
        this.mPaywallView.setPaywallButtonText(this.mBoostMe);
        this.mPaywallView.m41278a(this.f43477b.m41203a(ProductType.BOOST, list, PaywallItemViewModelColor.BLUE, this));
        m53172a();
    }

    public void displaySubscriberPaywall(@NonNull List<C14510e> list, long j, boolean z, int i) {
        this.mPaywallView.setDescription(this.mDescriptionOutOfBoost);
        this.mPaywallView.setPaywallButtonText(this.mBoostMe);
        this.mPaywallView.m41278a(this.f43477b.m41203a(ProductType.BOOST, list, PaywallItemViewModelColor.BLUE, this));
        list = String.format(this.mTitleDescription, new Object[]{Integer.valueOf(i)});
        if (!(this.f43478c == 1 || this.f43478c == 5)) {
            if (this.f43478c != 2) {
                this.mPaywallView.setTitle(this.mTitle);
                this.mPaywallView.setDescription(list);
                this.mPaywallView.m41276a();
                m53172a();
            }
        }
        this.mPaywallView.setTitle(z ? this.mOutOfBoost : this.mTitle);
        this.mPaywallView.m41277a(j);
        m53172a();
    }

    public void displayFirstTimeSubscriberPaywall(@NonNull String str, @NonNull String str2, int i) {
        i = String.format(this.mTitleDescription, new Object[]{Integer.valueOf(i)});
        this.mPaywallView.setTitle(this.mTitle);
        this.mPaywallView.setDescription(i);
        this.mPaywallView.m41280a(str, str2);
        this.mPaywallView.setPaywallButtonText(this.mBoostMe);
        m53172a();
    }

    public void showTinderPlusUpsellSection(@NonNull String str) {
        this.mPaywallView.m41279a(str);
    }

    public void hideTinderPlusUpsellSection() {
        this.mPaywallView.m41281b();
    }

    public void purchaseBoost() {
        C14510e currentlySelectedOffer = this.mPaywallView.getCurrentlySelectedOffer();
        this.f43479d.onPayClicked(currentlySelectedOffer != null ? currentlySelectedOffer.a() : "");
    }

    public void onPaywallItemSelected(C14510e c14510e, int i) {
        this.f43476a.m49867a(c14510e);
    }
}
