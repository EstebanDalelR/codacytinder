package com.tinder.settings.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.presenter.bh;
import com.tinder.settings.targets.ShowMeTarget;
import com.tinder.utils.at;
import com.tinder.views.CustomCheckBox;
import javax.inject.Inject;

public class ShowMeView extends LinearLayout implements ShowMeTarget {
    @Inject
    /* renamed from: a */
    bh f51651a;
    /* renamed from: b */
    private Unbinder f51652b;
    @BindDrawable(2131230943)
    Drawable mCheckMark;
    @BindView(2131362825)
    TextView mLearnMore;
    @BindString(2131821263)
    String mLearnMoreValue;
    @BindView(2131363576)
    CustomCheckBox mShowMeFemale;
    @BindView(2131363577)
    CustomCheckBox mShowMeMale;
    @BindString(2131821506)
    String snackBarErrorMessage;

    public ShowMeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62172b();
    }

    /* renamed from: b */
    private void m62172b() {
        inflate(getContext(), R.layout.view_show_me, this);
        ManagerApp.e().inject(this);
    }

    /* renamed from: a */
    public void m62173a() {
        this.f51651a.m56372a(this.mShowMeMale.isChecked(), this.mShowMeFemale.isChecked());
    }

    @OnCheckedChanged({2131363576})
    public void onMaleCheckChanged(boolean z) {
        if (z) {
            this.mShowMeFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
            return;
        }
        if (!this.mShowMeMale.isChecked()) {
            this.mShowMeMale.setChecked(true);
        }
        this.mShowMeFemale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    @OnCheckedChanged({2131363577})
    public void onFemaleCheckChanged(boolean z) {
        if (z) {
            this.mShowMeMale.setCompoundDrawablesWithIntrinsicBounds(null, null, this.mCheckMark, null);
            return;
        }
        if (!this.mShowMeFemale.isChecked()) {
            this.mShowMeFemale.setChecked(true);
        }
        this.mShowMeMale.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51652b = ButterKnife.a(this);
        Deadshot.take(this, this.f51651a);
        this.mLearnMore.setText(Html.fromHtml(this.mLearnMoreValue));
        this.mLearnMore.setOnClickListener(new C14913f(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m62174a(View view) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ManagerWebServices.URL_LEARN_MORE_GENDER)));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f51652b != null) {
            this.f51652b.unbind();
        }
        Deadshot.drop(this);
    }

    public void initShowMeSelection(boolean z, boolean z2) {
        if (z) {
            this.mShowMeMale.setChecked(true);
        } else {
            this.mShowMeMale.setChecked(false);
        }
        if (z2) {
            this.mShowMeFemale.setChecked(true);
        } else {
            this.mShowMeFemale.setChecked(false);
        }
    }

    public void showErrorMessage() {
        at.m57643a((View) this, this.snackBarErrorMessage);
    }
}
