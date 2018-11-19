package com.tinder.intro;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.auth.view.LoginButtonGroupView;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;

public class IntroFragment_ViewBinding implements Unbinder {
    /* renamed from: b */
    private IntroFragment f38710b;
    /* renamed from: c */
    private View f38711c;

    @UiThread
    public IntroFragment_ViewBinding(final IntroFragment introFragment, View view) {
        this.f38710b = introFragment;
        introFragment.mIntroCarousel = (ViewGroup) C0761c.b(view, R.id.intro_carousel, "field 'mIntroCarousel'", ViewGroup.class);
        introFragment.mViewPager = (ViewPager) C0761c.b(view, R.id.viewPager_intro, "field 'mViewPager'", ViewPager.class);
        introFragment.mPageIndicator = (CirclePageIndicator) C0761c.b(view, R.id.intro_indicator, "field 'mPageIndicator'", CirclePageIndicator.class);
        introFragment.mButtonsGroup = (ViewGroup) C0761c.b(view, R.id.button_group, "field 'mButtonsGroup'", ViewGroup.class);
        introFragment.mAuthV2LoginButtonGroup = (LoginButtonGroupView) C0761c.b(view, R.id.auth_v2_buttons, "field 'mAuthV2LoginButtonGroup'", LoginButtonGroupView.class);
        View a = C0761c.a(view, R.id.auth_disclaimer_dismiss, "field 'mDisclaimerDismissButton' and method 'onDisclaimerContentDismissed'");
        introFragment.mDisclaimerDismissButton = (ImageView) C0761c.c(a, R.id.auth_disclaimer_dismiss, "field 'mDisclaimerDismissButton'", ImageView.class);
        this.f38711c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ IntroFragment_ViewBinding f38709b;

            public void doClick(View view) {
                introFragment.onDisclaimerContentDismissed();
            }
        });
        introFragment.mDisclaimerContent = (CustomTextView) C0761c.b(view, R.id.disclaimer_text_content, "field 'mDisclaimerContent'", CustomTextView.class);
        introFragment.mPaddingTop = view.getContext().getResources().getDimension(R.dimen.padding_xlarge);
    }

    @CallSuper
    public void unbind() {
        IntroFragment introFragment = this.f38710b;
        if (introFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38710b = null;
        introFragment.mIntroCarousel = null;
        introFragment.mViewPager = null;
        introFragment.mPageIndicator = null;
        introFragment.mButtonsGroup = null;
        introFragment.mAuthV2LoginButtonGroup = null;
        introFragment.mDisclaimerDismissButton = null;
        introFragment.mDisclaimerContent = null;
        this.f38711c.setOnClickListener(null);
        this.f38711c = null;
    }
}
