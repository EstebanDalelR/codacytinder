package com.tinder.paywall.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.support.v4.widget.Space;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.paywall.viewmodels.C10085h;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.utils.DateUtils;
import com.tinder.utils.av;
import java.util.concurrent.TimeUnit;

public class PaywallBaseView extends FrameLayout {
    /* renamed from: a */
    private CountDownTimer f33043a;
    @BindView(2131363134)
    TextView mDescriptionText;
    @BindView(2131363790)
    View mGetTinderPlusBtn;
    @BindView(2131363136)
    TextView mInfoTitleDescriptionText;
    @BindView(2131363137)
    TextView mInfoTitleText;
    @BindView(2131362688)
    Space mMainIconSpace;
    @BindView(2131363130)
    Button mPaywallButton;
    @BindView(2131363144)
    PaywallItemGroupView mPaywallItems;
    @BindView(2131363159)
    TextView mTimer;
    @BindView(2131363791)
    View mTinderPlusUpsellDivider;
    @BindView(2131363161)
    TextView mTitleText;
    @BindView(2131363162)
    View mTopContainer;
    @BindView(2131363927)
    TextView mUpsellButtonDescription;
    @BindView(2131363928)
    TextView mUpsellButtonTitle;

    public enum ColorScheme {
        RED(R.drawable.selector_oval_tinder_gradient, R.drawable.social_stroke_button_selector, R.color.tinder_plus_upsell_red),
        BLUE(R.drawable.selector_oval_blue_gradient, R.drawable.selector_tinder_plus_upsell_superlike_button, R.color.tinder_plus_upsell_blue);
        
        @DrawableRes
        private int mPaywallButtonSelector;
        @DrawableRes
        private int mUpsellButtonSelector;
        @ColorRes
        private int mUpsellTextColor;

        private ColorScheme(int i, int i2, @DrawableRes int i3) {
            this.mPaywallButtonSelector = i;
            this.mUpsellButtonSelector = i2;
            this.mUpsellTextColor = i3;
        }

        @DrawableRes
        public int getPaywallButtonSelector() {
            return this.mPaywallButtonSelector;
        }

        @DrawableRes
        public int getUpsellButtonSelector() {
            return this.mUpsellButtonSelector;
        }

        @ColorRes
        public int getUpsellTextColor() {
            return this.mUpsellTextColor;
        }
    }

    public PaywallBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.paywall_view, this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setTitle(@NonNull String str) {
        this.mTitleText.setText(str);
    }

    public void setDescription(@NonNull String str) {
        this.mDescriptionText.setText(str);
    }

    public void setPaywallButtonText(@NonNull String str) {
        this.mPaywallButton.setText(str);
    }

    public void setTopContainerBackground(Drawable drawable) {
        this.mTopContainer.setBackground(drawable);
    }

    public void setPaywallColorScheme(ColorScheme colorScheme) {
        Drawable a = C0432b.a(getContext(), colorScheme.getUpsellButtonSelector());
        Drawable a2 = C0432b.a(getContext(), colorScheme.getPaywallButtonSelector());
        colorScheme = getResources().getColor(colorScheme.getUpsellTextColor());
        this.mGetTinderPlusBtn.setBackground(a);
        this.mPaywallButton.setBackground(a2);
        this.mUpsellButtonTitle.setTextColor(colorScheme);
        this.mUpsellButtonDescription.setTextColor(colorScheme);
    }

    /* renamed from: a */
    public void m41277a(long j) {
        av.a(new View[]{this.mTimer});
        long b = DateUtils.b(j);
        this.f33043a = new CountDownTimer(this, b, b <= 87300000 ? 1000 : 3600000) {
            /* renamed from: a */
            boolean f33041a = null;
            /* renamed from: b */
            final /* synthetic */ PaywallBaseView f33042b;

            public void onTick(long j) {
                if (j <= 86400000) {
                    this.f33042b.setTimerText(j);
                } else {
                    j = (int) (j / 86400000);
                    this.f33042b.mTimer.setText(this.f33042b.getContext().getResources().getQuantityString(R.plurals.days_remaining, j, new Object[]{Integer.valueOf(j)}));
                }
                this.f33041a = true;
            }

            public void onFinish() {
                if (this.f33041a) {
                    this.f33042b.mTimer.setText("00:00:00");
                    new Handler().postDelayed(new C10105c(this), 1000);
                    return;
                }
                this.f33042b.m41276a();
            }

            /* renamed from: a */
            final /* synthetic */ void m41274a() {
                this.f33042b.m41276a();
            }
        };
        this.f33043a.start();
    }

    /* renamed from: a */
    public void m41276a() {
        av.c(new View[]{this.mTimer});
    }

    /* renamed from: a */
    public void m41280a(@NonNull String str, @NonNull String str2) {
        av.c(new View[]{this.mTimer, this.mPaywallItems});
        av.a(new View[]{this.mInfoTitleText, this.mInfoTitleDescriptionText, this.mDescriptionText, this.mTitleText});
        this.mInfoTitleText.setText(str);
        this.mInfoTitleDescriptionText.setText(str2);
    }

    /* renamed from: a */
    public void m41279a(@NonNull String str) {
        av.a(new View[]{this.mGetTinderPlusBtn, this.mTinderPlusUpsellDivider});
        this.mUpsellButtonDescription.setText(str);
    }

    /* renamed from: a */
    public void m41278a(@NonNull C10085h c10085h) {
        av.c(new View[]{this.mInfoTitleText, this.mInfoTitleDescriptionText, this.mTimer});
        av.a(new View[]{this.mPaywallItems, this.mDescriptionText, this.mTitleText});
        this.mPaywallItems.setViewModel(c10085h);
    }

    /* renamed from: b */
    public void m41281b() {
        av.c(new View[]{this.mGetTinderPlusBtn, this.mTinderPlusUpsellDivider});
    }

    public C14510e getCurrentlySelectedOffer() {
        return this.mPaywallItems.getCurrentOffer();
    }

    public View getMainIconSpace() {
        return this.mMainIconSpace;
    }

    /* renamed from: c */
    public void m41282c() {
        if (this.f33043a != null) {
            this.f33043a.cancel();
        }
    }

    private void setTimerText(long j) {
        this.mTimer.setText(String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1))}));
    }
}
