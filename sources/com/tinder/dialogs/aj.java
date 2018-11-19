package com.tinder.dialogs;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tinder.R;
import com.tinder.enums.ReportCause;
import com.tinder.listeners.OnUnMatchReasonSelectedListener;
import com.tinder.utils.ad;

public class aj extends C8872z implements OnTouchListener, OnCheckedChangeListener {
    /* renamed from: F */
    private final float f35989F = 0.25f;
    /* renamed from: G */
    private OnUnMatchReasonSelectedListener f35990G;

    public aj(@NonNull Context context, OnUnMatchReasonSelectedListener onUnMatchReasonSelectedListener) {
        super(context, R.style.Theme.FloatingDialog);
        this.f35990G = onUnMatchReasonSelectedListener;
    }

    /* renamed from: m */
    public void mo9978m() {
        m37643a();
        m37645b();
        m37647d();
        m37648e();
        m37650g();
        m37653j();
        this.b.setText(R.string.reporting_unmatch_title);
        this.c.setText(R.string.reporting_unmatch_details);
        this.f.setText(R.string.reporting_unmatch_button);
        this.f.setOnClickListener(new ak(this));
        this.o.setOnCheckedChangeListener(this);
        this.p.setOnCheckedChangeListener(this);
        this.r.setOnCheckedChangeListener(this);
        this.q.setOnCheckedChangeListener(this);
        this.s.setOnCheckedChangeListener(this);
        this.t.setOnCheckedChangeListener(this);
        this.o.setOnTouchListener(this);
        this.p.setOnTouchListener(this);
        this.r.setOnTouchListener(this);
        this.q.setOnTouchListener(this);
        this.s.setOnTouchListener(this);
        this.t.setOnTouchListener(this);
        this.o.setChecked(true);
    }

    /* renamed from: a */
    final /* synthetic */ void m43846a(View view) {
        String str = null;
        view = this.p.isChecked() != null ? ReportCause.INAPPROPRIATE_MESSAGES : this.q.isChecked() != null ? ReportCause.INAPPROPRIATE_PHOTOS : this.r.isChecked() != null ? ReportCause.OFFLINE_BEHAVIOR : this.s.isChecked() != null ? ReportCause.SPAM : this.t.isChecked() != null ? ReportCause.OTHER : null;
        String obj = this.e.getText().toString();
        OnUnMatchReasonSelectedListener onUnMatchReasonSelectedListener = this.f35990G;
        if (this.t.isChecked()) {
            str = obj;
        }
        onUnMatchReasonSelectedListener.onUnMatchReasonSelected(view, str);
        dismiss();
    }

    /* renamed from: a */
    private void m43845a(@NonNull CompoundButton compoundButton, boolean z) {
        Object obj;
        int i;
        int i2;
        boolean z2 = compoundButton.getId() == R.id.unmatch_type_noreason && z;
        boolean z3 = compoundButton.getId() == R.id.unmatch_type_inappropriate_messages && z;
        boolean z4 = compoundButton.getId() == R.id.unmatch_type_inappropriate_photos && z;
        boolean z5 = compoundButton.getId() == R.id.unmatch_type_bad_offline_behavior && z;
        boolean z6 = compoundButton.getId() == R.id.unmatch_type_spam && z;
        z = compoundButton.getId() == R.id.unmatch_type_other && z;
        if (!(z2 || z3 || z4 || z5 || z6)) {
            if (!z) {
                obj = null;
                if (obj != null) {
                    compoundButton.setOnCheckedChangeListener(null);
                    compoundButton.setChecked(true);
                    compoundButton.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), R.color.tinder_red), Mode.SRC_ATOP);
                    compoundButton.setOnCheckedChangeListener(this);
                }
                this.o.setOnCheckedChangeListener(null);
                this.p.setOnCheckedChangeListener(null);
                this.q.setOnCheckedChangeListener(null);
                this.r.setOnCheckedChangeListener(null);
                this.s.setOnCheckedChangeListener(null);
                this.t.setOnCheckedChangeListener(null);
                this.o.setChecked(z2);
                this.p.setChecked(z3);
                this.q.setChecked(z4);
                this.r.setChecked(z5);
                this.s.setChecked(z6);
                this.t.setChecked(z);
                this.o.setOnCheckedChangeListener(this);
                this.p.setOnCheckedChangeListener(this);
                this.q.setOnCheckedChangeListener(this);
                this.r.setOnCheckedChangeListener(this);
                this.s.setOnCheckedChangeListener(this);
                this.t.setOnCheckedChangeListener(this);
                compoundButton = this.o.getCompoundDrawables()[0];
                Context context = getContext();
                i = R.color.reporting_item;
                compoundButton.setColorFilter(C0432b.c(context, z2 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
                this.p.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z3 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
                this.q.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z4 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
                this.r.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z5 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
                this.s.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z6 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
                compoundButton = this.t.getCompoundDrawables()[0];
                context = getContext();
                if (z) {
                    i = R.color.tinder_red;
                }
                compoundButton.setColorFilter(C0432b.c(context, i), Mode.SRC_ATOP);
                i2 = 8;
                this.u.setVisibility(z2 ? 0 : 8);
                this.v.setVisibility(z3 ? 0 : 8);
                this.w.setVisibility(z4 ? 0 : 8);
                this.x.setVisibility(z5 ? 0 : 8);
                this.y.setVisibility(z6 ? 0 : 8);
                compoundButton = this.z;
                if (z) {
                    i2 = 0;
                }
                compoundButton.setVisibility(i2);
                return;
            }
        }
        obj = 1;
        if (obj != null) {
            this.o.setOnCheckedChangeListener(null);
            this.p.setOnCheckedChangeListener(null);
            this.q.setOnCheckedChangeListener(null);
            this.r.setOnCheckedChangeListener(null);
            this.s.setOnCheckedChangeListener(null);
            this.t.setOnCheckedChangeListener(null);
            this.o.setChecked(z2);
            this.p.setChecked(z3);
            this.q.setChecked(z4);
            this.r.setChecked(z5);
            this.s.setChecked(z6);
            this.t.setChecked(z);
            this.o.setOnCheckedChangeListener(this);
            this.p.setOnCheckedChangeListener(this);
            this.q.setOnCheckedChangeListener(this);
            this.r.setOnCheckedChangeListener(this);
            this.s.setOnCheckedChangeListener(this);
            this.t.setOnCheckedChangeListener(this);
            compoundButton = this.o.getCompoundDrawables()[0];
            Context context2 = getContext();
            i = R.color.reporting_item;
            if (z2) {
            }
            compoundButton.setColorFilter(C0432b.c(context2, z2 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
            if (z3) {
            }
            this.p.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z3 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
            if (z4) {
            }
            this.q.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z4 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
            if (z5) {
            }
            this.r.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z5 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
            if (z6) {
            }
            this.s.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), z6 ? R.color.tinder_red : R.color.reporting_item), Mode.SRC_ATOP);
            compoundButton = this.t.getCompoundDrawables()[0];
            context2 = getContext();
            if (z) {
                i = R.color.tinder_red;
            }
            compoundButton.setColorFilter(C0432b.c(context2, i), Mode.SRC_ATOP);
            i2 = 8;
            if (z2) {
            }
            this.u.setVisibility(z2 ? 0 : 8);
            if (z3) {
            }
            this.v.setVisibility(z3 ? 0 : 8);
            if (z4) {
            }
            this.w.setVisibility(z4 ? 0 : 8);
            if (z5) {
            }
            this.x.setVisibility(z5 ? 0 : 8);
            if (z6) {
            }
            this.y.setVisibility(z6 ? 0 : 8);
            compoundButton = this.z;
            if (z) {
                i2 = 0;
            }
            compoundButton.setVisibility(i2);
            return;
        }
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(true);
        compoundButton.getCompoundDrawables()[0].setColorFilter(C0432b.c(getContext(), R.color.tinder_red), Mode.SRC_ATOP);
        compoundButton.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean z) {
        switch (compoundButton.getId()) {
            case R.id.unmatch_type_bad_offline_behavior:
                m43845a(this.r, z);
                return;
            case R.id.unmatch_type_inappropriate_messages:
                m43845a(this.p, z);
                return;
            case R.id.unmatch_type_inappropriate_photos:
                m43845a(this.q, z);
                return;
            case R.id.unmatch_type_noreason:
                m43845a(this.o, z);
                return;
            case R.id.unmatch_type_other:
                m43845a(this.t, z);
                return;
            case R.id.unmatch_type_spam:
                m43845a(this.s, z);
                return;
            default:
                return;
        }
    }

    public void dismiss() {
        this.o.getCompoundDrawables()[0].clearColorFilter();
        this.p.getCompoundDrawables()[0].clearColorFilter();
        this.q.getCompoundDrawables()[0].clearColorFilter();
        this.r.getCompoundDrawables()[0].clearColorFilter();
        this.s.getCompoundDrawables()[0].clearColorFilter();
        this.t.getCompoundDrawables()[0].clearColorFilter();
        super.dismiss();
    }

    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("motionEvent: ");
        stringBuilder.append(motionEvent.getAction());
        ad.a(stringBuilder.toString());
        switch (motionEvent.getAction()) {
            case null:
                view.setAlpha(0.25f);
                break;
            case 1:
                view.setAlpha(1.0f);
                break;
            case 2:
                view.setAlpha(0.25f);
                break;
            case 3:
                view.setAlpha(1.0f);
                break;
            default:
                break;
        }
        return null;
    }
}
