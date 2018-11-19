package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import com.tinder.R;
import com.tinder.listeners.ListenerAgreeToWarningTerms;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bf;
import com.tinder.model.ReportNotification;
import com.tinder.model.SparksEvent;
import com.tinder.utils.at;
import javax.inject.Inject;

public class ad extends C8872z {
    @Inject
    /* renamed from: F */
    C2652a f35978F;
    @Inject
    /* renamed from: G */
    bf f35979G;
    @Inject
    /* renamed from: H */
    ManagerAnalytics f35980H;
    @Inject
    /* renamed from: I */
    UserMetaManager f35981I;
    /* renamed from: J */
    private ReportNotification f35982J;
    /* renamed from: K */
    private C8867t f35983K;

    /* renamed from: com.tinder.dialogs.ad$1 */
    class C111121 implements ListenerAgreeToWarningTerms {
        /* renamed from: a */
        final /* synthetic */ ad f35977a;

        C111121(ad adVar) {
            this.f35977a = adVar;
        }

        public void onSucess() {
            com.tinder.utils.ad.a("agree success");
            this.f35977a.f35981I.fetchMetaData();
            this.f35977a.f35983K.dismiss();
            this.f35977a.dismiss();
        }

        public void onFailure() {
            com.tinder.utils.ad.a("agree failure");
            this.f35977a.f35983K.dismiss();
            at.a(this.f35977a.f.getRootView(), R.string.reported_warning_accept_agreement_error);
        }
    }

    public ad(@NonNull Context context, ReportNotification reportNotification) {
        super(context, 16973935);
        ManagerApp.e().inject(this);
        setCancelable(false);
        this.f35982J = reportNotification;
        m43835a(this.f35982J);
        this.f35983K = new C8867t(context);
    }

    /* renamed from: m */
    public void mo9978m() {
        this.d.setText(R.string.reported_warning_agreement);
        this.f.setText(R.string.reported_warning_button);
        this.f.setVisibility(0);
        this.c.setVisibility(8);
        m37655l();
        m37646c();
        m37650g();
        m37648e();
        m37644a(false);
        this.d.setOnCheckedChangeListener(new ae(this));
        this.f.setOnClickListener(new af(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m43838a(CompoundButton compoundButton, boolean z) {
        m37644a(z);
    }

    /* renamed from: a */
    final /* synthetic */ void m43837a(View view) {
        if (this.d.isChecked() != null) {
            this.f35983K.show();
            view = new SparksEvent("Warning.Acknowledge");
            view.put("warningLevel", this.f35982J.tier);
            view.put("version", 1);
            this.f35980H.m40477a(view);
            this.f35979G.m40507a(new C111121(this));
        }
    }

    public void show() {
        super.show();
        SparksEvent sparksEvent = new SparksEvent("Warning.View");
        sparksEvent.put("warningLevel", this.f35982J.tier);
        sparksEvent.put("version", 1);
        this.f35980H.m40477a(sparksEvent);
    }

    /* renamed from: a */
    private void m43835a(@NonNull ReportNotification reportNotification) {
        if ((reportNotification.tier > 0 ? 1 : null) != null) {
            this.b.setText(R.string.reported_multiple_warnings_title);
            this.C.setText(R.string.reported_multiple_warnings_details);
            this.C.setVisibility(0);
            m43836b(reportNotification);
            this.E.setText(R.string.reported_multiple_warnings_consequences);
            this.E.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        this.b.setText(R.string.reported_warning_v2_title);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        this.c.setText(R.string.reported_warning_v2_details);
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.c.setLinkTextColor(C0432b.c(getContext(), R.color.reporting_item));
        this.c.setHighlightColor(C0432b.c(getContext(), R.color.transparent));
        this.c.setVisibility(0);
    }

    /* renamed from: b */
    private void m43836b(@NonNull ReportNotification reportNotification) {
        if (reportNotification.reasons != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer num : reportNotification.reasons) {
                if (stringBuilder.length() > 1) {
                    stringBuilder.append("<br />");
                }
                stringBuilder.append("&#8226");
                stringBuilder.append(' ');
                stringBuilder.append(bf.m40503a(this.a, num.intValue()));
            }
            this.D.setText(Html.fromHtml(stringBuilder.toString()));
            this.D.setVisibility(0);
        }
    }
}
