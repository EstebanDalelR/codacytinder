package com.tinder.fragments;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.activities.ActivityVerification;
import com.tinder.dialogs.C8861l;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.settings.views.MoreGenderView;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;

public class FragmentAgeMoreGender extends Fragment implements OnDateSetListener, OnClickListener, ListenerUpdateProfileInfo {
    @NonNull
    /* renamed from: a */
    public static String f42177a = "fragment_verifyGenderAge";
    @Inject
    /* renamed from: b */
    ManagerProfile f42178b;
    @Inject
    /* renamed from: c */
    LegacyBreadCrumbTracker f42179c;
    /* renamed from: d */
    private C8861l f42180d;
    /* renamed from: e */
    private long f42181e;
    /* renamed from: f */
    private boolean f42182f;
    /* renamed from: g */
    private boolean f42183g;
    /* renamed from: h */
    private Unbinder f42184h;
    @BindView(2131361994)
    Button mBtnConfirm;
    @BindView(2131362361)
    TextView mEditTextBirthdate;
    @BindView(2131363880)
    TextView mLabelBday;
    @BindView(2131363890)
    TextView mLabelGender;
    @BindView(2131362972)
    MoreGenderView mMoreGenderView;

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater = layoutInflater.inflate(R.layout.view_more_gender_age, viewGroup, false);
        this.f42184h = ButterKnife.a(this, layoutInflater);
        this.mEditTextBirthdate.setHint(((SimpleDateFormat) SimpleDateFormat.getDateInstance(3)).toLocalizedPattern());
        return layoutInflater;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51480a(view);
    }

    public void onResume() {
        super.onResume();
        this.f42179c.m40475a((Fragment) this);
        this.mMoreGenderView.a();
    }

    /* renamed from: a */
    private void m51480a(View view) {
        av.b(this.mBtnConfirm);
        view = this.mLabelGender;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mLabelGender.getText());
        stringBuilder.append(":");
        view.setText(stringBuilder.toString());
        this.f42180d = new C8861l(getActivity(), this);
        this.mBtnConfirm.setOnClickListener(this);
        av.b(this.mBtnConfirm);
        this.mEditTextBirthdate.setOnClickListener(this);
        this.mLabelBday.setOnClickListener(this);
        view = getArguments();
        this.f42182f = view.getBoolean("is_age_verification_needed");
        this.f42183g = view.getBoolean("is_gender_verification_needed");
        if (this.f42182f == null) {
            av.c(new View[]{this.mEditTextBirthdate, this.mLabelBday});
        } else {
            av.a(new View[]{this.mEditTextBirthdate, this.mLabelBday});
        }
        if (this.f42183g == null) {
            av.c(new View[]{this.mMoreGenderView, this.mLabelGender});
        }
        this.f42181e = 0;
        m51482c();
    }

    /* renamed from: a */
    private void m51479a() {
        if (m51481b()) {
            if (this.f42183g) {
                this.mMoreGenderView.b();
            }
            this.f42178b.a(this.f42181e, this);
        }
    }

    /* renamed from: b */
    private boolean m51481b() {
        if (this.f42182f) {
            return TextUtils.isEmpty(this.mEditTextBirthdate.getText()) ^ true;
        }
        return true;
    }

    public void onClick(@NonNull View view) {
        view = view.getId();
        if (view == R.id.btn_confirm) {
            m51479a();
        } else if (view == R.id.editText_birthdate || view == R.id.txt_birthdate) {
            this.f42180d.show();
        }
    }

    /* renamed from: c */
    private void m51482c() {
        if (m51481b()) {
            this.mBtnConfirm.setEnabled(true);
            this.mBtnConfirm.setAlpha(1.0f);
            return;
        }
        this.mBtnConfirm.setEnabled(false);
        this.mBtnConfirm.setAlpha(0.7f);
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        datePicker = Calendar.getInstance(Locale.getDefault());
        datePicker.set(i, i2, i3);
        this.mEditTextBirthdate.setText(DateUtils.a(getActivity()).format(datePicker.getTime()));
        i3 = new StringBuilder();
        i3.append("Date set ");
        i3.append(i);
        i3.append(" ");
        i3.append(i2);
        ad.a(i3.toString());
        this.f42181e = datePicker.getTime().getTime();
        m51482c();
    }

    public void onProfileUpdateSuccess() {
        if (getActivity() != null) {
            at.a(getActivity(), R.string.updated_profile);
            ActivityVerification activityVerification = (ActivityVerification) getActivity();
            activityVerification.b(false);
            activityVerification.a(false);
            activityVerification.d();
        }
    }

    public void onProfileUpdateFailed() {
        if (getActivity() != null) {
            at.a(getActivity(), R.string.error_profile_info_update);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f42184h != null) {
            this.f42184h.unbind();
        }
    }
}
