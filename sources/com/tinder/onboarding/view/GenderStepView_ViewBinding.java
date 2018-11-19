package com.tinder.onboarding.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomRadioButton;
import com.tinder.views.CustomSwitch;

public class GenderStepView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private GenderStepView f39528b;
    /* renamed from: c */
    private View f39529c;
    /* renamed from: d */
    private View f39530d;
    /* renamed from: e */
    private View f39531e;
    /* renamed from: f */
    private View f39532f;
    /* renamed from: g */
    private View f39533g;
    /* renamed from: h */
    private View f39534h;
    /* renamed from: i */
    private View f39535i;
    /* renamed from: j */
    private View f39536j;

    @UiThread
    public GenderStepView_ViewBinding(final GenderStepView genderStepView, View view) {
        this.f39528b = genderStepView;
        genderStepView.binaryGenderLayout = (ViewGroup) C0761c.b(view, R.id.binary_gender_layout, "field 'binaryGenderLayout'", ViewGroup.class);
        genderStepView.moreGenderLayout = (ViewGroup) C0761c.b(view, R.id.more_gender_layout, "field 'moreGenderLayout'", ViewGroup.class);
        View a = C0761c.a(view, R.id.gender_female_selection_button, "field 'femaleSelectionButton' and method 'onBinaryGenderSelected'");
        genderStepView.femaleSelectionButton = (CustomButton) C0761c.c(a, R.id.gender_female_selection_button, "field 'femaleSelectionButton'", CustomButton.class);
        this.f39529c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39513b;

            public void doClick(View view) {
                genderStepView.onBinaryGenderSelected(view);
            }
        });
        a = C0761c.a(view, R.id.gender_male_selection_button, "field 'maleSelectionButton' and method 'onBinaryGenderSelected'");
        genderStepView.maleSelectionButton = (CustomButton) C0761c.c(a, R.id.gender_male_selection_button, "field 'maleSelectionButton'", CustomButton.class);
        this.f39530d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39515b;

            public void doClick(View view) {
                genderStepView.onBinaryGenderSelected(view);
            }
        });
        a = C0761c.a(view, R.id.more_gender_selection_button, "field 'customGenderButton' and method 'onMoreGenderClicked'");
        genderStepView.customGenderButton = a;
        this.f39531e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39517b;

            public void doClick(View view) {
                genderStepView.onMoreGenderClicked();
            }
        });
        a = C0761c.a(view, R.id.onboarding_gender_continue_button, "field 'continueButton' and method 'onContinueButtonClicked'");
        genderStepView.continueButton = (CustomButton) C0761c.c(a, R.id.onboarding_gender_continue_button, "field 'continueButton'", CustomButton.class);
        this.f39532f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39519b;

            public void doClick(View view) {
                genderStepView.onContinueButtonClicked();
            }
        });
        genderStepView.moreGenderValue = (TextView) C0761c.b(view, R.id.more_gender_value, "field 'moreGenderValue'", TextView.class);
        genderStepView.showGenderOnProfile = (CustomSwitch) C0761c.b(view, R.id.show_gender_on_profile, "field 'showGenderOnProfile'", CustomSwitch.class);
        genderStepView.includeMeForSearch = (RadioGroup) C0761c.b(view, R.id.edit_profile_include_me_in_search_group, "field 'includeMeForSearch'", RadioGroup.class);
        a = C0761c.a(view, R.id.include_me_in_search_male, "field 'searchMale' and method 'onIncludeMeInSearchItemClicked'");
        genderStepView.searchMale = (CustomRadioButton) C0761c.c(a, R.id.include_me_in_search_male, "field 'searchMale'", CustomRadioButton.class);
        this.f39533g = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39521b;

            public void doClick(View view) {
                genderStepView.onIncludeMeInSearchItemClicked(view);
            }
        });
        a = C0761c.a(view, R.id.include_me_in_search_female, "field 'searchFemale' and method 'onIncludeMeInSearchItemClicked'");
        genderStepView.searchFemale = (CustomRadioButton) C0761c.c(a, R.id.include_me_in_search_female, "field 'searchFemale'", CustomRadioButton.class);
        this.f39534h = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39523b;

            public void doClick(View view) {
                genderStepView.onIncludeMeInSearchItemClicked(view);
            }
        });
        a = C0761c.a(view, R.id.learn_more, "field 'learnMoreTextView' and method 'onLearnMoreClicked'");
        genderStepView.learnMoreTextView = (TextView) C0761c.c(a, R.id.learn_more, "field 'learnMoreTextView'", TextView.class);
        this.f39535i = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39525b;

            public void doClick(View view) {
                genderStepView.onLearnMoreClicked();
            }
        });
        a = C0761c.a(view, R.id.remove_more_gender_btn, "method 'onMoreGenderClicked'");
        this.f39536j = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ GenderStepView_ViewBinding f39527b;

            public void doClick(View view) {
                genderStepView.onMoreGenderClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        genderStepView.genderSelectedTextColor = C0432b.c(view, R.color.onboarding_gengder_selected_color);
        genderStepView.genderUnselectedTextColor = C0432b.c(view, R.color.onboarding_name_field_underline_hint);
        genderStepView.genderSelectedBackground = C0432b.a(view, R.drawable.onboarding_gender_selection_button_selected);
        genderStepView.genderUnselectedBackground = C0432b.a(view, R.drawable.onboarding_gender_selection_button_unselected);
        genderStepView.checkMark = C0432b.a(view, R.drawable.checkmark);
        genderStepView.learnMoreValue = resources.getString(R.string.lean_more_about_gender);
        genderStepView.genderValue = resources.getString(R.string.gender);
    }

    @CallSuper
    public void unbind() {
        GenderStepView genderStepView = this.f39528b;
        if (genderStepView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39528b = null;
        genderStepView.binaryGenderLayout = null;
        genderStepView.moreGenderLayout = null;
        genderStepView.femaleSelectionButton = null;
        genderStepView.maleSelectionButton = null;
        genderStepView.customGenderButton = null;
        genderStepView.continueButton = null;
        genderStepView.moreGenderValue = null;
        genderStepView.showGenderOnProfile = null;
        genderStepView.includeMeForSearch = null;
        genderStepView.searchMale = null;
        genderStepView.searchFemale = null;
        genderStepView.learnMoreTextView = null;
        this.f39529c.setOnClickListener(null);
        this.f39529c = null;
        this.f39530d.setOnClickListener(null);
        this.f39530d = null;
        this.f39531e.setOnClickListener(null);
        this.f39531e = null;
        this.f39532f.setOnClickListener(null);
        this.f39532f = null;
        this.f39533g.setOnClickListener(null);
        this.f39533g = null;
        this.f39534h.setOnClickListener(null);
        this.f39534h = null;
        this.f39535i.setOnClickListener(null);
        this.f39535i = null;
        this.f39536j.setOnClickListener(null);
        this.f39536j = null;
    }
}
