package com.tinder.settings.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.activity.GenderSearchActivity;
import com.tinder.settings.presenter.C18075n;
import com.tinder.settings.targets.MoreGenderTarget;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.CustomRadioButton;
import com.tinder.views.CustomSwitch;
import javax.inject.Inject;

public class MoreGenderView extends LinearLayout implements MoreGenderTarget {
    @Inject
    /* renamed from: a */
    C18075n f51617a;
    /* renamed from: b */
    private Unbinder f51618b;
    @NonNull
    /* renamed from: c */
    private Value f51619c = Value.UNKNOWN;
    @BindView(2131362366)
    View mBinaryGenderView;
    @BindDrawable(2131230943)
    Drawable mCheckMark;
    @BindView(2131362608)
    CustomRadioButton mFemaleButton;
    @BindView(2131362365)
    RadioGroup mGenderRadios;
    @BindView(2131362368)
    RadioGroup mIncludeMeForSearch;
    @BindView(2131362728)
    View mIncludeMeForSearchContainer;
    @BindView(2131362825)
    TextView mLearnMore;
    @BindString(2131821262)
    String mLearnMoreValue;
    @BindView(2131362610)
    CustomRadioButton mMaleButton;
    @BindView(2131362968)
    View mMoreGender;
    @BindView(2131362971)
    TextView mMoreGenderValue;
    @BindView(2131363452)
    ImageButton mRemoveMoreGenderButton;
    @BindView(2131363453)
    ProgressBar mRemoveMoreGenderLoadingIndicator;
    @BindView(2131362729)
    CustomRadioButton mSearchFemale;
    @BindView(2131362730)
    CustomRadioButton mSearchMale;
    @BindView(2131363575)
    CustomSwitch mShowGenderSwich;

    public MoreGenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.view_more_gender, this);
        ManagerApp.a(getContext()).h().inject(this);
    }

    public void setGender(Value value) {
        value = value == Value.MALE ? R.id.gender_male : R.id.gender_female;
        this.mGenderRadios.setOnCheckedChangeListener(new C14911b(this));
        this.mGenderRadios.check(value);
    }

    /* renamed from: b */
    final /* synthetic */ void m62167b(RadioGroup radioGroup, int i) {
        m62163a(i);
    }

    @OnClick({2131362612})
    void onMoreGenderClicked() {
        getContext().startActivity(GenderSearchActivity.m68648a(getContext()));
    }

    @OnClick({2131362968})
    void onMoreGenderTextClicked() {
        getContext().startActivity(GenderSearchActivity.m68648a(getContext()));
    }

    @OnClick({2131363452})
    void onRemoveMoreGenderClicked() {
        this.f51617a.m65596c();
    }

    @OnClick({2131362825})
    void onLearnMoreClicked() {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ManagerWebServices.URL_LEARN_MORE_GENDER)));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51618b = ButterKnife.a(this);
        this.f51617a.a(this);
        m62164a();
        this.mLearnMore.setText(Html.fromHtml(this.mLearnMoreValue));
        this.f51617a.m65597d();
    }

    /* renamed from: a */
    public void m62164a() {
        if (this.f51617a.G()) {
            this.f51617a.m65595b();
        }
    }

    public void setShowGenderOnProfile(boolean z) {
        this.mShowGenderSwich.setChecked(z);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f51618b != null) {
            this.f51618b.unbind();
        }
        this.f51617a.m65593a();
    }

    public void showBinaryGenderView() {
        av.a(new View[]{this.mBinaryGenderView});
        av.c(new View[]{this.mMoreGender});
    }

    public void showMoreGender(String str) {
        av.a(new View[]{this.mMoreGender});
        this.mMoreGenderValue.setText(str);
    }

    public void showIncludeMeInSearchView(Value value) {
        av.a(new View[]{this.mIncludeMeForSearchContainer});
        value = value == Value.MALE ? R.id.include_me_in_search_male : R.id.include_me_in_search_female;
        this.mIncludeMeForSearch.setOnCheckedChangeListener(new C14912c(this));
        this.mIncludeMeForSearch.check(value);
    }

    /* renamed from: a */
    final /* synthetic */ void m62165a(RadioGroup radioGroup, int i) {
        m62163a(i);
    }

    public void hideIncludeMeInSearchView() {
        av.c(new View[]{this.mIncludeMeForSearchContainer});
    }

    public void hideBinaryGenderView() {
        av.c(new View[]{this.mBinaryGenderView});
    }

    public void hideMoreGenderView() {
        av.c(new View[]{this.mMoreGender});
    }

    public void showRemoveMoreGenderLoadingIndicator() {
        this.mRemoveMoreGenderLoadingIndicator.setVisibility(0);
        this.mRemoveMoreGenderButton.setVisibility(8);
    }

    public void dismissRemoveMoreGenderLoadingIndicator() {
        this.mRemoveMoreGenderLoadingIndicator.setVisibility(8);
        this.mRemoveMoreGenderButton.setVisibility(0);
    }

    public void showRemoveMoreGenderErrorMessage() {
        at.m57641a(getRootView(), (int) R.string.failed_update_profile);
    }

    /* renamed from: b */
    public void m62166b() {
        this.f51617a.m65594a(this.f51619c, this.mShowGenderSwich.isChecked());
    }

    /* renamed from: a */
    private void m62163a(int i) {
        switch (i) {
            case R.id.gender_female:
                this.mFemaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
                this.mMaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.f51619c = Value.FEMALE;
                return;
            case R.id.gender_male:
                this.mMaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
                this.mFemaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.f51619c = Value.MALE;
                return;
            case R.id.include_me_in_search_female:
                this.mSearchFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
                this.mSearchMale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.f51619c = Value.FEMALE;
                return;
            case R.id.include_me_in_search_male:
                this.mSearchMale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
                this.mSearchFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.f51619c = Value.MALE;
                return;
            default:
                this.mFemaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                this.mMaleButton.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                return;
        }
    }
}
