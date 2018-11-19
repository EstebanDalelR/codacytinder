package com.tinder.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.events.EventLoggedOut;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.model.SparksEvent;
import com.tinder.model.auth.LogoutFrom$BUTTON;
import com.tinder.module.Default;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;

public class ActivityBanned extends Activity {
    @Inject
    /* renamed from: a */
    C2652a f22659a;
    @Default
    @Inject
    /* renamed from: b */
    C2664c f22660b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f22661c;
    @Inject
    /* renamed from: d */
    LegacyBreadCrumbTracker f22662d;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_banned);
        ManagerApp.e().inject(this);
        ((TextView) findViewById(R.id.report_title)).setText(R.string.reporting_account_under_review_title);
        ((TextView) findViewById(R.id.report_details)).setText(R.string.reporting_account_under_review_details);
        findViewById(R.id.btn_divider).setVisibility(0);
        Button button = (Button) findViewById(R.id.btn_report_one);
        button.setText(getString(R.string.logout));
        button.setOnClickListener(new C6159e(this));
        button.setVisibility(0);
        findViewById(R.id.addtional_info_container).setVisibility(8);
        findViewById(R.id.report_additional_info).setVisibility(8);
        findViewById(R.id.progress_other).setVisibility(8);
        findViewById(R.id.report_types_container).setVisibility(8);
        findViewById(R.id.report_unmatch_container).setVisibility(8);
        findViewById(R.id.report_report_frame).setVisibility(8);
        findViewById(R.id.report_unmatch_frame).setVisibility(8);
        findViewById(R.id.report_checkbox).setVisibility(8);
        findViewById(R.id.warning_beginning).setVisibility(8);
        findViewById(R.id.warning_middle).setVisibility(8);
        findViewById(R.id.warning_end).setVisibility(8);
        bundle = new SparksEvent("Warning.View");
        bundle.put("version", 1);
        bundle.put(ManagerWebServices.PARAM_BANNED, true);
        this.f22661c.a(bundle);
    }

    /* renamed from: a */
    final /* synthetic */ void m26741a(View view) {
        view = new SparksEvent("Warning.Logout");
        view.put("version", 1);
        view.put(ManagerWebServices.PARAM_BANNED, true);
        this.f22661c.a(view);
        this.f22659a.a(LogoutFrom$BUTTON.INSTANCE);
    }

    protected void onResume() {
        super.onResume();
        this.f22662d.a(this);
        this.f22660b.a(this);
    }

    protected void onPause() {
        super.onPause();
        this.f22660b.c(this);
    }

    public void onEventMainThread(EventLoggedOut eventLoggedOut) {
        eventLoggedOut = new Intent(this, LoginActivity.class);
        eventLoggedOut.setFlags(268435456);
        eventLoggedOut.putExtra("extra_show_intro", "");
        startActivity(eventLoggedOut);
        finish();
    }
}
