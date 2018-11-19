package com.tinder.fragments;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.activities.ActivityVerification;
import com.tinder.dialogs.C8861l;
import com.tinder.dialogs.C8863n;
import com.tinder.enums.Gender;
import com.tinder.listeners.ListenerSelectGender;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: com.tinder.fragments.n */
public class C13309n extends Fragment implements OnDateSetListener, OnClickListener, ListenerSelectGender, ListenerUpdateProfileInfo {
    @NonNull
    /* renamed from: a */
    public static String f42228a = "fragment verifyGenderAge";
    @Inject
    /* renamed from: b */
    ManagerProfile f42229b;
    @Inject
    /* renamed from: c */
    LegacyBreadCrumbTracker f42230c;
    /* renamed from: d */
    private Button f42231d;
    /* renamed from: e */
    private TextView f42232e;
    /* renamed from: f */
    private TextView f42233f;
    /* renamed from: g */
    private EditText f42234g;
    /* renamed from: h */
    private TextView f42235h;
    /* renamed from: i */
    private C8863n f42236i;
    /* renamed from: j */
    private C8861l f42237j;
    /* renamed from: k */
    private Gender f42238k;
    /* renamed from: l */
    private long f42239l;
    /* renamed from: m */
    private boolean f42240m;
    /* renamed from: n */
    private boolean f42241n;

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater = layoutInflater.inflate(R.layout.view_gender_age, viewGroup, false);
        this.f42231d = (Button) layoutInflater.findViewById(R.id.btn_confirm);
        this.f42232e = (TextView) layoutInflater.findViewById(R.id.txt_birthdate);
        this.f42233f = (TextView) layoutInflater.findViewById(R.id.txt_gender);
        this.f42231d = (Button) layoutInflater.findViewById(R.id.btn_confirm);
        this.f42235h = (TextView) layoutInflater.findViewById(R.id.editText_gender);
        this.f42234g = (EditText) layoutInflater.findViewById(R.id.editText_birthdate);
        return layoutInflater;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51534a(view);
    }

    public void onResume() {
        super.onResume();
        this.f42230c.m40475a((Fragment) this);
    }

    /* renamed from: a */
    private void m51534a(View view) {
        av.b(this.f42231d);
        TextView textView = this.f42233f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f42233f.getText());
        stringBuilder.append(":");
        textView.setText(stringBuilder.toString());
        this.f42236i = new C8863n(getActivity(), this);
        this.f42237j = new C8861l(getActivity(), this);
        this.f42231d.setOnClickListener(this);
        av.b(this.f42231d);
        this.f42234g.setOnClickListener(this);
        this.f42235h.setOnClickListener(this);
        this.f42233f.setOnClickListener(this);
        this.f42232e.setOnClickListener(this);
        Bundle arguments = getArguments();
        this.f42240m = arguments.getBoolean("is_age_verification_needed");
        this.f42241n = arguments.getBoolean("is_gender_verification_needed");
        if (!this.f42240m) {
            this.f42234g.setVisibility(8);
            this.f42232e.setVisibility(8);
            view.findViewById(R.id.birthdate_underline).setVisibility(8);
        }
        if (!this.f42241n) {
            this.f42235h.setVisibility(8);
            this.f42233f.setVisibility(8);
            view.findViewById(R.id.gender_underline).setVisibility(8);
        }
        this.f42239l = 0;
        m51536c();
    }

    /* renamed from: a */
    private void m51533a() {
        if (m51535b()) {
            this.f42229b.a(this.f42238k, this.f42239l, this);
        }
    }

    /* renamed from: b */
    private boolean m51535b() {
        boolean z = false;
        if (this.f42240m && this.f42241n) {
            if (!(TextUtils.isEmpty(this.f42234g.getText()) || TextUtils.isEmpty(this.f42235h.getText()))) {
                z = true;
            }
            return z;
        } else if (this.f42240m) {
            return TextUtils.isEmpty(this.f42234g.getText()) ^ true;
        } else {
            if (this.f42241n) {
                return TextUtils.isEmpty(this.f42235h.getText()) ^ true;
            }
            return false;
        }
    }

    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.btn_confirm:
                m51533a();
                return;
            case R.id.editText_birthdate:
            case R.id.txt_birthdate:
                this.f42237j.show();
                return;
            case R.id.editText_gender:
            case R.id.txt_gender:
                this.f42236i.show();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private void m51536c() {
        if (m51535b()) {
            this.f42231d.setEnabled(true);
            this.f42231d.setAlpha(1.0f);
            return;
        }
        this.f42231d.setEnabled(false);
        this.f42231d.setAlpha(0.7f);
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        datePicker = Calendar.getInstance(Locale.getDefault());
        datePicker.set(i, i2, i3);
        this.f42234g.setText(DateFormat.getLongDateFormat(getActivity()).format(datePicker.getTime()));
        i3 = new StringBuilder();
        i3.append("Date set ");
        i3.append(i);
        i3.append(" ");
        i3.append(i2);
        ad.a(i3.toString());
        this.f42239l = datePicker.getTime().getTime();
        m51536c();
    }

    public void onMaleSelected() {
        this.f42235h.setText(R.string.male);
        this.f42238k = Gender.MALE;
        m51536c();
    }

    public void onFemaleSelected() {
        this.f42235h.setText(R.string.female);
        this.f42238k = Gender.FEMALE;
        m51536c();
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
}
