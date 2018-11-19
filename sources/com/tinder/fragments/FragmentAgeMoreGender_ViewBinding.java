package com.tinder.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.views.MoreGenderView;

public class FragmentAgeMoreGender_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FragmentAgeMoreGender f38618b;

    @UiThread
    public FragmentAgeMoreGender_ViewBinding(FragmentAgeMoreGender fragmentAgeMoreGender, View view) {
        this.f38618b = fragmentAgeMoreGender;
        fragmentAgeMoreGender.mBtnConfirm = (Button) C0761c.b(view, R.id.btn_confirm, "field 'mBtnConfirm'", Button.class);
        fragmentAgeMoreGender.mLabelBday = (TextView) C0761c.b(view, R.id.txt_birthdate, "field 'mLabelBday'", TextView.class);
        fragmentAgeMoreGender.mLabelGender = (TextView) C0761c.b(view, R.id.txt_gender, "field 'mLabelGender'", TextView.class);
        fragmentAgeMoreGender.mEditTextBirthdate = (TextView) C0761c.b(view, R.id.editText_birthdate, "field 'mEditTextBirthdate'", TextView.class);
        fragmentAgeMoreGender.mMoreGenderView = (MoreGenderView) C0761c.b(view, R.id.more_gender_view, "field 'mMoreGenderView'", MoreGenderView.class);
    }

    @CallSuper
    public void unbind() {
        FragmentAgeMoreGender fragmentAgeMoreGender = this.f38618b;
        if (fragmentAgeMoreGender == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38618b = null;
        fragmentAgeMoreGender.mBtnConfirm = null;
        fragmentAgeMoreGender.mLabelBday = null;
        fragmentAgeMoreGender.mLabelGender = null;
        fragmentAgeMoreGender.mEditTextBirthdate = null;
        fragmentAgeMoreGender.mMoreGenderView = null;
    }
}
