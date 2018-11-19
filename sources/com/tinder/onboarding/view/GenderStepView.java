package com.tinder.onboarding.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.dialogs.DialogError;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.CustomGenderSelectedListener;
import com.tinder.onboarding.activities.OnboardingActivity.OnBackPressedListener;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.by;
import com.tinder.onboarding.target.GenderStepTarget;
import com.tinder.utils.av;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomRadioButton;
import com.tinder.views.CustomSwitch;
import javax.inject.Inject;

public class GenderStepView extends RelativeLayout implements CustomGenderSelectedListener, OnBackPressedListener, OnboardingViewVisibleListener, GenderStepTarget {
    @Inject
    /* renamed from: a */
    InputMethodManager f43238a;
    @Inject
    /* renamed from: b */
    by f43239b;
    @BindView(2131361929)
    ViewGroup binaryGenderLayout;
    @BindDrawable(2131230943)
    Drawable checkMark;
    @BindView(2131363060)
    CustomButton continueButton;
    @BindView(2131362970)
    View customGenderButton;
    @BindView(2131362609)
    CustomButton femaleSelectionButton;
    @BindDrawable(2131231512)
    Drawable genderSelectedBackground;
    @BindColor(2131100039)
    int genderSelectedTextColor;
    @BindDrawable(2131231513)
    Drawable genderUnselectedBackground;
    @BindColor(2131100044)
    int genderUnselectedTextColor;
    @BindString(2131821115)
    String genderValue;
    @BindView(2131362368)
    RadioGroup includeMeForSearch;
    @BindView(2131362825)
    TextView learnMoreTextView;
    @BindString(2131821262)
    String learnMoreValue;
    @BindView(2131362611)
    CustomButton maleSelectionButton;
    @BindView(2131362966)
    ViewGroup moreGenderLayout;
    @BindView(2131362971)
    TextView moreGenderValue;
    @BindView(2131362729)
    CustomRadioButton searchFemale;
    @BindView(2131362730)
    CustomRadioButton searchMale;
    @BindView(2131363575)
    CustomSwitch showGenderOnProfile;

    public GenderStepView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.view_onboarding_gender, this);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f43239b.a(this);
        this.f43239b.m52724b();
        this.learnMoreTextView.setText(Html.fromHtml(this.learnMoreValue));
        onIncludeMeInSearchItemClicked(this.searchMale);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43239b.a();
    }

    public void customGenderSelected(String str) {
        this.f43239b.m52720a(str);
    }

    @OnClick({2131362609, 2131362611})
    public void onBinaryGenderSelected(View view) {
        this.f43239b.m52714a(view.getId() == R.id.gender_female_selection_button ? Value.FEMALE : Value.MALE);
    }

    @OnClick({2131362970, 2131363452})
    public void onMoreGenderClicked() {
        ((OnboardingActivity) getContext()).m54549b();
    }

    @OnClick({2131363060})
    public void onContinueButtonClicked() {
        boolean z = false;
        if ((this.moreGenderLayout.getVisibility() == 0 ? 1 : null) != null) {
            if (this.searchMale.getCompoundDrawables()[2] != null) {
                z = true;
            }
            this.f43239b.m52722a(z, this.showGenderOnProfile.isChecked());
            return;
        }
        this.f43239b.m52727c();
    }

    @OnClick({2131362825})
    public void onLearnMoreClicked() {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ManagerWebServices.URL_LEARN_MORE_GENDER)));
    }

    @OnClick({2131362730, 2131362729})
    public void onIncludeMeInSearchItemClicked(View view) {
        switch (view.getId()) {
            case R.id.include_me_in_search_female:
                this.searchFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.checkMark, null);
                this.searchMale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                return;
            case R.id.include_me_in_search_male:
                this.searchMale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.checkMark, null);
                this.searchFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                return;
            default:
                this.searchFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.searchMale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                return;
        }
    }

    public void toggleGenderSelection(@NonNull Value value) {
        if (Value.FEMALE == value) {
            m52900a(this.femaleSelectionButton, true);
            m52900a(this.maleSelectionButton, false);
        } else if (Value.MALE == value) {
            m52900a(this.maleSelectionButton, true);
            m52900a(this.femaleSelectionButton, false);
        }
    }

    public boolean onBackPressed() {
        return this.f43239b.m52723a(this.moreGenderLayout.getVisibility());
    }

    public void enabledContinueButton() {
        this.continueButton.setEnabled(true);
    }

    public void enableCustomGenderOption() {
        this.customGenderButton.setEnabled(true);
        av.a(new View[]{this.customGenderButton});
    }

    public void disableCustomGenderOption() {
        this.customGenderButton.setEnabled(false);
        av.b(new View[]{this.customGenderButton});
    }

    public void showCustomGenderView(@NonNull String str) {
        av.c(new View[]{this.binaryGenderLayout});
        av.a(new View[]{this.moreGenderLayout});
        setBackgroundColor(C0432b.c(getContext(), R.color.gray_background_light));
        this.moreGenderValue.setText(str);
    }

    public void showBinaryGenderView() {
        av.c(new View[]{this.moreGenderLayout});
        av.a(new View[]{this.binaryGenderLayout});
        setBackgroundColor(C0432b.c(getContext(), R.color.white));
    }

    public void showGenderTitle() {
        ((OnboardingActivity) getContext()).setTitle(this.genderValue);
    }

    public void hideGenderTitle() {
        ((OnboardingActivity) getContext()).hideTitle();
    }

    public void setIncludeMeInSearchesForMen() {
        this.includeMeForSearch.check(R.id.include_me_in_search_male);
    }

    public void setIncludeMeInSearchesForWomen() {
        this.includeMeForSearch.check(R.id.include_me_in_search_female);
    }

    public void setShowMyGender(boolean z) {
        this.showGenderOnProfile.setChecked(z);
    }

    /* renamed from: a */
    private void m52900a(TextView textView, boolean z) {
        textView.setBackground(z ? this.genderSelectedBackground : this.genderUnselectedBackground);
        textView.setTextColor(z ? this.genderSelectedTextColor : this.genderUnselectedTextColor);
    }

    public void onVisibilityChanged(boolean z) {
        this.f43239b.m52721a(z, this.moreGenderLayout.getVisibility());
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    public void showGenericErrorDialog() {
        DialogError a = DialogError.m37618a(getContext()).m37613a((int) R.string.oops).m37616a();
        a.setOnDismissListener(C10000f.f32859a);
        a.show();
    }

    public void hideSoftInput() {
        this.f43238a.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public void showInvalidCustomGenderDialog() {
        DialogError a = DialogError.m37618a(getContext()).m37613a((int) R.string.oops).m37617b((int) R.string.more_gender_invalid_char_error).m37616a();
        a.setOnDismissListener(C10001g.f32860a);
        a.show();
    }
}
