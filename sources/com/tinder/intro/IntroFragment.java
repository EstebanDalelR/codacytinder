package com.tinder.intro;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0432b;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView.BufferType;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.facebook.CallbackManager;
import com.tinder.R;
import com.tinder.auth.view.LoginButtonGroupView;
import com.tinder.auth.view.LoginButtonGroupView.OnScreenLaunchListener;
import com.tinder.fragments.as;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.smsauth.sdk.C14987c;
import com.tinder.utils.C15366q;
import com.tinder.utils.CustomFont.Font;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;
import javax.inject.Inject;

public class IntroFragment extends Fragment implements OnScreenLaunchListener, IntroTarget {
    @Inject
    /* renamed from: a */
    LegacyBreadCrumbTracker f42329a;
    @Inject
    /* renamed from: b */
    C13345b f42330b;
    @Inject
    /* renamed from: c */
    CallbackManager f42331c;
    /* renamed from: d */
    private Unbinder f42332d;
    /* renamed from: e */
    private IntroFragment$IntroCallbacks f42333e;
    /* renamed from: f */
    private float f42334f;
    /* renamed from: g */
    private float f42335g;
    /* renamed from: h */
    private C15366q f42336h;
    /* renamed from: i */
    private AbsoluteSizeSpan f42337i;
    /* renamed from: j */
    private C15366q f42338j;
    /* renamed from: k */
    private AbsoluteSizeSpan f42339k;
    /* renamed from: l */
    private CharSequence f42340l;
    @BindView(2131361901)
    LoginButtonGroupView mAuthV2LoginButtonGroup;
    @BindView(2131362016)
    ViewGroup mButtonsGroup;
    @BindView(2131362326)
    CustomTextView mDisclaimerContent;
    @BindView(2131361899)
    ImageView mDisclaimerDismissButton;
    @BindView(2131362755)
    ViewGroup mIntroCarousel;
    @BindDimen(2131165850)
    float mPaddingTop;
    @BindView(2131362760)
    CirclePageIndicator mPageIndicator;
    @BindView(2131363961)
    ViewPager mViewPager;

    /* renamed from: com.tinder.intro.IntroFragment$2 */
    class C97202 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ IntroFragment f32320a;

        C97202(IntroFragment introFragment) {
            this.f32320a = introFragment;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f32320a.mDisclaimerDismissButton.setTranslationY(this.f32320a.f42334f);
            this.f32320a.mDisclaimerDismissButton.animate().setListener(null);
        }
    }

    /* renamed from: com.tinder.intro.IntroFragment$1 */
    class C133441 extends C2887d {
        /* renamed from: a */
        final /* synthetic */ IntroFragment f42328a;

        C133441(IntroFragment introFragment) {
            this.f42328a = introFragment;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f42328a.f42330b.m51632a(i);
        }
    }

    /* renamed from: a */
    public static IntroFragment m51623a() {
        return new IntroFragment();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
        if (context instanceof IntroFragment$IntroCallbacks) {
            this.f42333e = (IntroFragment$IntroCallbacks) context;
            context = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(context);
            this.f42334f = (float) context.heightPixels;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Host activity should implement ");
        stringBuilder.append(IntroFragment$IntroCallbacks.class.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(R.layout.view_intro, viewGroup, false);
        this.f42332d = ButterKnife.a(this, layoutInflater);
        this.mViewPager.addOnPageChangeListener(new C133441(this));
        this.f42336h = new C15366q(getContext(), Font.BOLD);
        this.f42337i = new AbsoluteSizeSpan(18, true);
        this.f42338j = new C15366q(getContext(), Font.LIGHT);
        this.f42339k = new AbsoluteSizeSpan(16, true);
        this.f42340l = m51625d();
        this.mDisclaimerContent.setText(this.f42340l, BufferType.SPANNABLE);
        this.mDisclaimerContent.setTranslationY(this.f42334f);
        this.mDisclaimerDismissButton.setTranslationY(this.f42334f);
        return layoutInflater;
    }

    public void onStart() {
        super.onStart();
        this.f42330b.a(this);
        this.f42330b.m51633b();
        this.mAuthV2LoginButtonGroup.setOnScreenLaunchListener(this);
        this.mAuthV2LoginButtonGroup.setFBLoginButtonFragment(this);
    }

    public void onResume() {
        super.onResume();
        this.f42329a.m40475a((Fragment) this);
    }

    public void onLaunchAccountKit(Intent intent) {
        this.f42333e.onStartAccountKitActivityForResult(intent);
    }

    public void onLaunchSmsAuth(C14987c c14987c) {
        this.f42333e.onStartSmsAuthActivityForResult(c14987c);
    }

    public void onLaunchWebView(as asVar) {
        this.f42333e.onShowWebViewFragment(asVar);
    }

    public void setupPagerAdapter() {
        C0600i c11874d = new C11874d(getContext());
        this.mViewPager.setAdapter(c11874d);
        this.mViewPager.setOffscreenPageLimit(c11874d.getCount());
    }

    public void setUpPagerIndicator(@ColorRes int i, @ColorRes int i2) {
        Context context = getContext();
        this.mPageIndicator.setFillColor(C0432b.c(context, i));
        this.mPageIndicator.setPageColor(C0432b.c(context, i2));
        this.mPageIndicator.setViewPager(this.mViewPager);
        this.mPageIndicator.setCurrentItem(0);
    }

    public void showFBDisclaimerContent() {
        this.mDisclaimerContent.setText(this.f42340l, BufferType.SPANNABLE);
        m51626e();
        m51627f();
    }

    public void showDisclaimerDismissButton() {
        this.f42335g = this.mButtonsGroup.getY();
        this.mDisclaimerDismissButton.setTranslationY(this.f42335g);
        this.mDisclaimerDismissButton.setAlpha(0.0f);
        this.mDisclaimerDismissButton.animate().alpha(1.0f).translationY(this.mPaddingTop).setDuration(400).start();
    }

    public void onFBDisclaimerTextClicked() {
        this.f42330b.m51634c();
    }

    @OnClick({2131361899})
    public void onDisclaimerContentDismissed() {
        this.f42330b.m51635d();
    }

    public void showViewPager() {
        m51624a(this.mIntroCarousel, 0.0f);
        m51624a(this.mPageIndicator, 0.0f);
    }

    public void hideDisclaimerContent() {
        m51624a(this.mButtonsGroup, 0.0f);
        m51624a(this.mDisclaimerContent, this.f42334f);
        this.mDisclaimerDismissButton.animate().alpha(0.0f).translationY(this.f42335g).setDuration(400).setListener(new C97202(this)).start();
    }

    public void showDisclaimerText() {
        this.mAuthV2LoginButtonGroup.m42166a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f42331c.onActivityResult(i, i2, intent);
    }

    public void onDestroyView() {
        super.onDestroyView();
        m51628g();
        if (this.f42332d != null) {
            this.f42332d.unbind();
        }
        this.f42330b.a();
    }

    /* renamed from: b */
    public void m51629b() {
        this.mAuthV2LoginButtonGroup.onRealFBLoginButtonClicked();
    }

    /* renamed from: c */
    public boolean m51630c() {
        return this.f42330b.m51636e();
    }

    /* renamed from: d */
    private CharSequence m51625d() {
        CharSequence spannableStringBuilder = new SpannableStringBuilder(getString(R.string.auth_fb_disclaimer_title));
        int length = spannableStringBuilder.length();
        int i = 0;
        spannableStringBuilder.setSpan(this.f42336h, 0, length, 33);
        spannableStringBuilder.setSpan(this.f42337i, 0, length, 33);
        String[] stringArray = getContext().getResources().getStringArray(R.array.auth_fb_disclaimer_content);
        int length2 = stringArray.length;
        while (i < length2) {
            spannableStringBuilder.append("\n\n").append(stringArray[i]);
            i++;
        }
        length++;
        spannableStringBuilder.setSpan(this.f42338j, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.f42339k, length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private void m51624a(@NonNull View view, float f) {
        view.animate().translationY(f).setDuration(400).start();
    }

    /* renamed from: e */
    private void m51626e() {
        m51624a(this.mIntroCarousel, (float) (-this.mIntroCarousel.getBottom()));
        m51624a(this.mPageIndicator, (float) (-this.mPageIndicator.getBottom()));
    }

    /* renamed from: f */
    private void m51627f() {
        m51624a(this.mButtonsGroup, -(((float) this.mViewPager.getHeight()) - this.mPaddingTop));
        this.mDisclaimerContent.setAlpha(0.0f);
        this.mDisclaimerContent.animate().translationY(this.f42334f - ((float) this.mViewPager.getHeight())).alpha(1.0f).setDuration(400).start();
    }

    /* renamed from: g */
    private void m51628g() {
        ViewCompat.m(this.mIntroCarousel).b();
        ViewCompat.m(this.mPageIndicator).b();
        ViewCompat.m(this.mButtonsGroup).b();
        ViewCompat.m(this.mDisclaimerContent).b();
        ViewCompat.m(this.mDisclaimerDismissButton).b();
    }
}
