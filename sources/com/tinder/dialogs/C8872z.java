package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.utils.av;

/* renamed from: com.tinder.dialogs.z */
public abstract class C8872z extends Dialog {
    /* renamed from: F */
    private static float f31045F = 0.88f;
    /* renamed from: A */
    protected View f31046A;
    /* renamed from: B */
    protected View f31047B;
    /* renamed from: C */
    protected TextView f31048C;
    /* renamed from: D */
    protected TextView f31049D;
    /* renamed from: E */
    protected TextView f31050E;
    /* renamed from: a */
    protected Context f31051a;
    /* renamed from: b */
    protected TextView f31052b;
    /* renamed from: c */
    protected TextView f31053c;
    /* renamed from: d */
    protected CheckBox f31054d;
    /* renamed from: e */
    protected EditText f31055e;
    /* renamed from: f */
    protected Button f31056f;
    /* renamed from: g */
    protected ScrollView f31057g;
    /* renamed from: h */
    protected RelativeLayout f31058h;
    /* renamed from: i */
    protected RelativeLayout f31059i;
    /* renamed from: j */
    protected ProgressBar f31060j;
    /* renamed from: k */
    protected ProgressBar f31061k;
    /* renamed from: l */
    protected ProgressBar f31062l;
    /* renamed from: m */
    protected ProgressBar f31063m;
    /* renamed from: n */
    protected ProgressBar f31064n;
    /* renamed from: o */
    protected CheckBox f31065o;
    /* renamed from: p */
    protected CheckBox f31066p;
    /* renamed from: q */
    protected CheckBox f31067q;
    /* renamed from: r */
    protected CheckBox f31068r;
    /* renamed from: s */
    protected CheckBox f31069s;
    /* renamed from: t */
    protected CheckBox f31070t;
    /* renamed from: u */
    protected ImageView f31071u;
    /* renamed from: v */
    protected ImageView f31072v;
    /* renamed from: w */
    protected ImageView f31073w;
    /* renamed from: x */
    protected ImageView f31074x;
    /* renamed from: y */
    protected ImageView f31075y;
    /* renamed from: z */
    protected ImageView f31076z;

    /* renamed from: m */
    public abstract void mo9978m();

    public C8872z(@NonNull Context context, int i) {
        super(context, i);
        getWindow().getAttributes().windowAnimations = R.style.dialog_up_down_animation;
        this.f31051a = context;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R.layout.dialog_report);
        this.f31052b = (TextView) findViewById(R.id.report_title);
        this.f31053c = (TextView) findViewById(R.id.report_details);
        this.f31056f = (Button) findViewById(R.id.btn_report_one);
        this.f31054d = (CheckBox) findViewById(R.id.report_checkbox);
        this.f31055e = (EditText) findViewById(R.id.report_additional_info);
        this.f31059i = (RelativeLayout) findViewById(R.id.addtional_info_container);
        this.f31058h = (RelativeLayout) findViewById(R.id.report_types_container);
        this.f31047B = findViewById(R.id.report_report_frame);
        this.f31046A = findViewById(R.id.report_unmatch_frame);
        this.f31060j = (ProgressBar) findViewById(R.id.progress_offensive);
        this.f31061k = (ProgressBar) findViewById(R.id.progress_inappropriate);
        this.f31062l = (ProgressBar) findViewById(R.id.progress_bad_offline_behavior);
        this.f31063m = (ProgressBar) findViewById(R.id.progress_spam);
        this.f31064n = (ProgressBar) findViewById(R.id.progress_other);
        this.f31057g = (ScrollView) findViewById(R.id.report_unmatch_container);
        this.f31065o = (CheckBox) findViewById(R.id.unmatch_type_noreason);
        this.f31067q = (CheckBox) findViewById(R.id.unmatch_type_inappropriate_photos);
        this.f31066p = (CheckBox) findViewById(R.id.unmatch_type_inappropriate_messages);
        this.f31068r = (CheckBox) findViewById(R.id.unmatch_type_bad_offline_behavior);
        this.f31069s = (CheckBox) findViewById(R.id.unmatch_type_spam);
        this.f31070t = (CheckBox) findViewById(R.id.unmatch_type_other);
        this.f31071u = (ImageView) findViewById(R.id.checkmark_noreason);
        this.f31072v = (ImageView) findViewById(R.id.checkmark_offensive);
        this.f31073w = (ImageView) findViewById(R.id.checkmark_inappropriate_photos);
        this.f31074x = (ImageView) findViewById(R.id.checkmark_bad_offline_behavior);
        this.f31075y = (ImageView) findViewById(R.id.checkmark_spam);
        this.f31076z = (ImageView) findViewById(R.id.checkmark_other);
        this.f31048C = (TextView) findViewById(R.id.warning_beginning);
        this.f31049D = (TextView) findViewById(R.id.warning_middle);
        this.f31050E = (TextView) findViewById(R.id.warning_end);
        ((LinearLayout) findViewById(R.id.report_container)).getLayoutTransition().setAnimateParentHierarchy(false);
        mo9979n();
        mo9978m();
    }

    /* renamed from: a */
    protected void m37643a() {
        findViewById(R.id.report_icon).setVisibility(8);
        findViewById(R.id.transparent_top_portion).setVisibility(8);
    }

    /* renamed from: b */
    protected void m37645b() {
        this.f31054d.setVisibility(8);
    }

    /* renamed from: c */
    protected void m37646c() {
        this.f31054d.setVisibility(0);
    }

    /* renamed from: a */
    protected void m37644a(boolean z) {
        this.f31056f.setAlpha(z ? 1.0f : 0.25f);
        this.f31056f.setEnabled(z);
    }

    /* renamed from: d */
    protected void m37647d() {
        this.f31060j.setVisibility(8);
        this.f31061k.setVisibility(8);
        this.f31062l.setVisibility(8);
        this.f31063m.setVisibility(8);
        this.f31064n.setVisibility(8);
    }

    /* renamed from: e */
    protected void m37648e() {
        this.f31059i.setVisibility(8);
        this.f31055e.setVisibility(8);
        this.f31064n.setVisibility(8);
    }

    /* renamed from: f */
    protected void m37649f() {
        this.f31059i.setVisibility(0);
        this.f31055e.setVisibility(0);
        this.f31055e.requestFocus();
        av.a(this.f31051a, this.f31055e);
    }

    /* renamed from: g */
    protected void m37650g() {
        this.f31058h.setVisibility(8);
        this.f31047B.setVisibility(8);
    }

    /* renamed from: h */
    protected void m37651h() {
        this.f31058h.setVisibility(0);
        this.f31047B.setVisibility(0);
    }

    /* renamed from: i */
    protected void m37652i() {
        this.f31057g.setVisibility(8);
        this.f31046A.setVisibility(8);
    }

    /* renamed from: j */
    protected void m37653j() {
        this.f31057g.setVisibility(0);
        this.f31046A.setVisibility(0);
    }

    /* renamed from: k */
    protected void m37654k() {
        this.f31048C.setVisibility(8);
        this.f31049D.setVisibility(8);
        this.f31050E.setVisibility(8);
    }

    /* renamed from: l */
    protected void m37655l() {
        this.f31048C.setVisibility(0);
        this.f31049D.setVisibility(0);
        this.f31050E.setVisibility(0);
    }

    /* renamed from: n */
    private void mo9979n() {
        Window window = getWindow();
        window.getAttributes().width = (int) av.a(f31045F);
        window.setGravity(17);
        m37645b();
        m37647d();
        m37648e();
        m37650g();
        m37652i();
        m37648e();
        m37654k();
    }
}
