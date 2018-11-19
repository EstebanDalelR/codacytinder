package com.tinder.dialogs;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.enums.ReportCause;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.utils.ad;
import com.tinder.utils.av;

@Deprecated
public class aa extends C8872z implements OnClickListener, OnTouchListener {
    /* renamed from: F */
    private TextView f35964F;
    /* renamed from: G */
    private TextView f35965G;
    /* renamed from: H */
    private TextView f35966H;
    /* renamed from: I */
    private TextView f35967I;
    /* renamed from: J */
    private TextView f35968J;
    /* renamed from: K */
    private View f35969K;
    /* renamed from: L */
    private View f35970L;
    /* renamed from: M */
    private View f35971M;
    /* renamed from: N */
    private View f35972N;
    /* renamed from: O */
    private View f35973O;
    /* renamed from: P */
    private View f35974P;
    /* renamed from: Q */
    private ListenerReportUser f35975Q;
    /* renamed from: R */
    private final boolean f35976R;

    public aa(@NonNull Context context, ListenerReportUser listenerReportUser, boolean z) {
        super(context, R.style.Theme.FloatingDialog);
        this.f35975Q = listenerReportUser;
        this.f35976R = z;
        if (z) {
            m43827t();
        }
    }

    /* renamed from: m */
    public void mo9978m() {
        this.f35964F = (TextView) findViewById(R.id.report_type_inappropriate_messages);
        this.f35965G = (TextView) findViewById(R.id.report_type_inappropiate_photos);
        this.f35966H = (TextView) findViewById(R.id.report_type_bad_offline_behavior);
        this.f35967I = (TextView) findViewById(R.id.report_type_spam);
        this.f35968J = (TextView) findViewById(R.id.report_type_other);
        this.f35964F.setOnClickListener(this);
        this.f35965G.setOnClickListener(this);
        this.f35966H.setOnClickListener(this);
        this.f35967I.setOnClickListener(this);
        this.f35968J.setOnClickListener(this);
        this.f35964F.setOnTouchListener(this);
        this.f35965G.setOnTouchListener(this);
        this.f35966H.setOnTouchListener(this);
        this.f35967I.setOnTouchListener(this);
        this.f35968J.setOnTouchListener(this);
        this.f35969K = findViewById(R.id.line_one);
        this.f35970L = findViewById(R.id.line_two);
        this.f35971M = findViewById(R.id.line_three);
        this.f35972N = findViewById(R.id.line_four);
        this.f35973O = findViewById(R.id.line_five);
        this.f35974P = findViewById(R.id.line_six);
        m37652i();
        m43824q();
    }

    /* renamed from: n */
    public void mo9979n() {
        m43833p();
    }

    /* renamed from: o */
    public void m43832o() {
        m37647d();
        m37644a(true);
        m43822c(true);
        m43821b(false);
    }

    /* renamed from: q */
    private void m43824q() {
        this.b.setText(R.string.reporting_report_user_title);
        this.c.setText(R.string.reporting_report_user_details);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.d.setVisibility(8);
        m37647d();
        m37651h();
        m43822c(true);
    }

    /* renamed from: a */
    private void m43820a(int i) {
        this.b.setText(R.string.reporting_report_user_progress_title);
        int i2 = 0;
        m37644a(false);
        m43822c(false);
        m37651h();
        m43821b(true);
        this.j.setVisibility(i == R.id.report_type_inappropriate_messages ? 0 : 4);
        this.k.setVisibility(i == R.id.report_type_inappropiate_photos ? 0 : 4);
        this.l.setVisibility(i == R.id.report_type_bad_offline_behavior ? 0 : 4);
        this.m.setVisibility(i == R.id.report_type_spam ? 0 : 4);
        ProgressBar progressBar = this.n;
        if (i != R.id.report_type_other) {
            i2 = 4;
        }
        progressBar.setVisibility(i2);
        m43823d(true);
    }

    /* renamed from: b */
    private void m43821b(boolean z) {
        float f = 1.0f;
        this.f35964F.setAlpha(z ? 0.25f : 1.0f);
        this.f35965G.setAlpha(z ? 0.25f : 1.0f);
        this.f35966H.setAlpha(z ? 0.25f : 1.0f);
        this.f35967I.setAlpha(z ? 0.25f : 1.0f);
        TextView textView = this.f35968J;
        if (z) {
            f = 0.25f;
        }
        textView.setAlpha(f);
    }

    /* renamed from: c */
    private void m43822c(boolean z) {
        this.f35964F.setEnabled(z);
        this.f35965G.setEnabled(z);
        this.f35966H.setEnabled(z);
        this.f35967I.setEnabled(z);
        this.f35968J.setEnabled(z);
    }

    /* renamed from: d */
    private void m43823d(boolean z) {
        float f = 1.0f;
        this.f35969K.setAlpha(z ? 0.25f : 1.0f);
        this.f35970L.setAlpha(z ? 0.25f : 1.0f);
        this.f35971M.setAlpha(z ? 0.25f : 1.0f);
        this.f35972N.setAlpha(z ? 0.25f : 1.0f);
        this.f35973O.setAlpha(z ? 0.25f : 1.0f);
        View view = this.f35974P;
        if (z) {
            f = 0.25f;
        }
        view.setAlpha(f);
    }

    /* renamed from: p */
    public void m43833p() {
        this.b.setText(R.string.reporting_confirmation_title);
        this.c.setVisibility(8);
        this.f.setText(R.string.reporting_confirmation_button);
        this.e.setVisibility(8);
        this.n.setVisibility(8);
        this.f.setVisibility(0);
        m37650g();
        m37644a(true);
        this.f.setOnClickListener(new ab(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m43829b(View view) {
        dismiss();
        this.c.setVisibility(0);
    }

    /* renamed from: r */
    private void m43825r() {
        m37650g();
        m37649f();
        m37644a(true);
        this.n.setVisibility(8);
        this.f.setVisibility(0);
        this.f.setText(R.string.reporting_report_user_title);
        this.f.setOnClickListener(new ac(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m43828a(View view) {
        av.a(this.f.getWindowToken(), (Activity) this.a);
        m43826s();
        this.f35975Q.onReportUser(ReportCause.OTHER, this.e.getText().toString(), this.f35976R);
    }

    /* renamed from: s */
    private void m43826s() {
        this.b.setText(R.string.reporting_report_user_progress_title);
        this.n.setVisibility(0);
        this.e.setAlpha(0.5f);
    }

    /* renamed from: t */
    private void m43827t() {
        this.f35964F.setVisibility(8);
        this.f35970L.setVisibility(8);
        this.f35966H.setVisibility(8);
        this.f35972N.setVisibility(8);
    }

    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("motionEvent: ");
        stringBuilder.append(motionEvent.getAction());
        ad.a(stringBuilder.toString());
        switch (motionEvent.getAction()) {
            case null:
                view.setAlpha(0.25f);
                return false;
            case 1:
                view.setAlpha(1.0f);
                return false;
            default:
                return false;
        }
    }

    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.report_type_bad_offline_behavior:
                m43820a(view.getId());
                this.f35975Q.onReportUser(ReportCause.OFFLINE_BEHAVIOR, null, this.f35976R);
                return;
            case R.id.report_type_inappropiate_photos:
                m43820a(view.getId());
                this.f35975Q.onReportUser(ReportCause.INAPPROPRIATE_PHOTOS, null, this.f35976R);
                return;
            case R.id.report_type_inappropriate_messages:
                m43820a(view.getId());
                this.f35975Q.onReportUser(ReportCause.INAPPROPRIATE_MESSAGES, null, this.f35976R);
                return;
            case R.id.report_type_other:
                m43825r();
                return;
            case R.id.report_type_spam:
                m43820a(view.getId());
                this.f35975Q.onReportUser(ReportCause.SPAM, null, this.f35976R);
                return;
            default:
                return;
        }
    }
}
