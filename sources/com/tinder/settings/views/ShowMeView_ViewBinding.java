package com.tinder.settings.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomCheckBox;

public class ShowMeView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ShowMeView f51653b;
    /* renamed from: c */
    private View f51654c;
    /* renamed from: d */
    private View f51655d;

    @UiThread
    public ShowMeView_ViewBinding(final ShowMeView showMeView, View view) {
        this.f51653b = showMeView;
        View a = C0761c.a(view, R.id.show_me_male, "field 'mShowMeMale' and method 'onFemaleCheckChanged'");
        showMeView.mShowMeMale = (CustomCheckBox) C0761c.c(a, R.id.show_me_male, "field 'mShowMeMale'", CustomCheckBox.class);
        this.f51654c = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ ShowMeView_ViewBinding f46609b;

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                showMeView.onFemaleCheckChanged(z);
            }
        });
        a = C0761c.a(view, R.id.show_me_female, "field 'mShowMeFemale' and method 'onMaleCheckChanged'");
        showMeView.mShowMeFemale = (CustomCheckBox) C0761c.c(a, R.id.show_me_female, "field 'mShowMeFemale'", CustomCheckBox.class);
        this.f51655d = a;
        ((CompoundButton) a).setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ ShowMeView_ViewBinding f46611b;

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                showMeView.onMaleCheckChanged(z);
            }
        });
        showMeView.mLearnMore = (TextView) C0761c.b(view, R.id.learn_more, "field 'mLearnMore'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        showMeView.mCheckMark = C0432b.a(view, R.drawable.checkmark);
        showMeView.mLearnMoreValue = resources.getString(R.string.lean_more_about_gender_show_me);
        showMeView.snackBarErrorMessage = resources.getString(R.string.oops);
    }

    @CallSuper
    public void unbind() {
        ShowMeView showMeView = this.f51653b;
        if (showMeView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51653b = null;
        showMeView.mShowMeMale = null;
        showMeView.mShowMeFemale = null;
        showMeView.mLearnMore = null;
        ((CompoundButton) this.f51654c).setOnCheckedChangeListener(null);
        this.f51654c = null;
        ((CompoundButton) this.f51655d).setOnCheckedChangeListener(null);
        this.f51655d = null;
    }
}
