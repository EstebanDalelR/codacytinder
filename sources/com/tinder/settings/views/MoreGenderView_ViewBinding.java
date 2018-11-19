package com.tinder.settings.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomRadioButton;
import com.tinder.views.CustomSwitch;

public class MoreGenderView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MoreGenderView f51628b;
    /* renamed from: c */
    private View f51629c;
    /* renamed from: d */
    private View f51630d;
    /* renamed from: e */
    private View f51631e;
    /* renamed from: f */
    private View f51632f;

    @UiThread
    public MoreGenderView_ViewBinding(final MoreGenderView moreGenderView, View view) {
        this.f51628b = moreGenderView;
        moreGenderView.mBinaryGenderView = C0761c.a(view, R.id.edit_profile_gender_radios_group, "field 'mBinaryGenderView'");
        moreGenderView.mGenderRadios = (RadioGroup) C0761c.b(view, R.id.edit_profile_gender_radios, "field 'mGenderRadios'", RadioGroup.class);
        moreGenderView.mIncludeMeForSearchContainer = C0761c.a(view, R.id.include_me_in_search, "field 'mIncludeMeForSearchContainer'");
        moreGenderView.mIncludeMeForSearch = (RadioGroup) C0761c.b(view, R.id.edit_profile_include_me_in_search_group, "field 'mIncludeMeForSearch'", RadioGroup.class);
        moreGenderView.mMaleButton = (CustomRadioButton) C0761c.b(view, R.id.gender_male, "field 'mMaleButton'", CustomRadioButton.class);
        moreGenderView.mFemaleButton = (CustomRadioButton) C0761c.b(view, R.id.gender_female, "field 'mFemaleButton'", CustomRadioButton.class);
        View a = C0761c.a(view, R.id.learn_more, "field 'mLearnMore' and method 'onLearnMoreClicked'");
        moreGenderView.mLearnMore = (TextView) C0761c.c(a, R.id.learn_more, "field 'mLearnMore'", TextView.class);
        this.f51629c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ MoreGenderView_ViewBinding f51621b;

            public void doClick(View view) {
                moreGenderView.onLearnMoreClicked();
            }
        });
        moreGenderView.mSearchMale = (CustomRadioButton) C0761c.b(view, R.id.include_me_in_search_male, "field 'mSearchMale'", CustomRadioButton.class);
        moreGenderView.mSearchFemale = (CustomRadioButton) C0761c.b(view, R.id.include_me_in_search_female, "field 'mSearchFemale'", CustomRadioButton.class);
        a = C0761c.a(view, R.id.more_gender_row, "field 'mMoreGender' and method 'onMoreGenderTextClicked'");
        moreGenderView.mMoreGender = a;
        this.f51630d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ MoreGenderView_ViewBinding f51623b;

            public void doClick(View view) {
                moreGenderView.onMoreGenderTextClicked();
            }
        });
        moreGenderView.mMoreGenderValue = (TextView) C0761c.b(view, R.id.more_gender_value, "field 'mMoreGenderValue'", TextView.class);
        a = C0761c.a(view, R.id.remove_more_gender_btn, "field 'mRemoveMoreGenderButton' and method 'onRemoveMoreGenderClicked'");
        moreGenderView.mRemoveMoreGenderButton = (ImageButton) C0761c.c(a, R.id.remove_more_gender_btn, "field 'mRemoveMoreGenderButton'", ImageButton.class);
        this.f51631e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ MoreGenderView_ViewBinding f51625b;

            public void doClick(View view) {
                moreGenderView.onRemoveMoreGenderClicked();
            }
        });
        moreGenderView.mRemoveMoreGenderLoadingIndicator = (ProgressBar) C0761c.b(view, R.id.remove_more_gender_loading_indicator, "field 'mRemoveMoreGenderLoadingIndicator'", ProgressBar.class);
        moreGenderView.mShowGenderSwich = (CustomSwitch) C0761c.b(view, R.id.show_gender_on_profile, "field 'mShowGenderSwich'", CustomSwitch.class);
        a = C0761c.a(view, R.id.gender_more, "method 'onMoreGenderClicked'");
        this.f51632f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ MoreGenderView_ViewBinding f51627b;

            public void doClick(View view) {
                moreGenderView.onMoreGenderClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        moreGenderView.mCheckMark = C0432b.a(view, R.drawable.checkmark);
        moreGenderView.mLearnMoreValue = resources.getString(R.string.lean_more_about_gender);
    }

    @CallSuper
    public void unbind() {
        MoreGenderView moreGenderView = this.f51628b;
        if (moreGenderView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51628b = null;
        moreGenderView.mBinaryGenderView = null;
        moreGenderView.mGenderRadios = null;
        moreGenderView.mIncludeMeForSearchContainer = null;
        moreGenderView.mIncludeMeForSearch = null;
        moreGenderView.mMaleButton = null;
        moreGenderView.mFemaleButton = null;
        moreGenderView.mLearnMore = null;
        moreGenderView.mSearchMale = null;
        moreGenderView.mSearchFemale = null;
        moreGenderView.mMoreGender = null;
        moreGenderView.mMoreGenderValue = null;
        moreGenderView.mRemoveMoreGenderButton = null;
        moreGenderView.mRemoveMoreGenderLoadingIndicator = null;
        moreGenderView.mShowGenderSwich = null;
        this.f51629c.setOnClickListener(null);
        this.f51629c = null;
        this.f51630d.setOnClickListener(null);
        this.f51630d = null;
        this.f51631e.setOnClickListener(null);
        this.f51631e = null;
        this.f51632f.setOnClickListener(null);
        this.f51632f = null;
    }
}
