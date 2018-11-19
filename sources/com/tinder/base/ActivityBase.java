package com.tinder.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.dialogs.DialogError;
import com.tinder.dialogs.ad;
import com.tinder.events.EventLocationSet;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerFusedLocation.ListenerLocationChanged;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bf;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.model.ReportNotification;
import com.tinder.module.Default;
import com.tinder.utils.AppLifeCycleTracker;
import com.tinder.utils.AppLifeCycleTracker.LifeCycleHelperInterface;
import de.greenrobot.event.C2664c;
import java.util.List;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public abstract class ActivityBase extends AppCompatActivity {
    @Inject
    /* renamed from: A */
    bt f14853A;
    @Inject
    /* renamed from: B */
    af f14854B;
    @Default
    @Inject
    /* renamed from: C */
    C2664c f14855C;
    @Inject
    /* renamed from: D */
    ManagerAnalytics f14856D;
    /* renamed from: E */
    protected boolean f14857E;
    /* renamed from: F */
    protected boolean f14858F;
    /* renamed from: a */
    private boolean f14859a;
    @Nullable
    protected C8310h a_;
    @Nullable
    /* renamed from: b */
    private ad f14860b;
    /* renamed from: c */
    private FrameLayout f14861c;
    /* renamed from: d */
    private final boolean f14862d;
    @Inject
    /* renamed from: w */
    bk f14863w;
    @Inject
    /* renamed from: x */
    C2652a f14864x;
    @Inject
    /* renamed from: y */
    UserMetaManager f14865y;
    @Inject
    /* renamed from: z */
    ManagerFusedLocation f14866z;

    /* renamed from: a */
    public boolean m18700a() {
        return false;
    }

    /* renamed from: h */
    protected int m18705h() {
        return R.layout.view_activity_base;
    }

    public ActivityBase() {
        this.a_ = null;
        this.f14862d = false;
    }

    public ActivityBase(boolean z) {
        this.a_ = null;
        this.f14862d = z;
    }

    protected void onCreate(Bundle bundle) {
        ManagerApp.m14858e().inject(this);
        super.onCreate(bundle);
        bundle = getSupportActionBar();
        if (!(m18700a() || bundle == null)) {
            bundle.hide();
        }
        setContentView(m18705h());
        this.f14861c = (FrameLayout) findViewById(R.id.frameLayout_activity_base);
        this.a_ = new C8310h(this);
        m18692a((int) R.id.frameLayout_activity_base);
    }

    public void setContentView(int i) {
        if (this.f14861c == null) {
            super.setContentView(i);
        } else {
            ((LayoutInflater) getSystemService("layout_inflater")).inflate(i, this.f14861c, true);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 9000) {
            if (i == 10000) {
                switch (i2) {
                    case -1:
                        m18694a(null);
                        break;
                    case 0:
                        m18707j();
                        break;
                    default:
                        break;
                }
            }
        } else {
            this.f14866z.m14905j();
            if (i2 == -1) {
                this.f14866z.m14890a();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onPause() {
        super.onPause();
        this.f14857E = false;
        if (this.f14862d && this.f14858F) {
            this.f14866z.m14902g();
        }
    }

    protected void onResume() {
        super.onResume();
        this.f14857E = true;
        this.f14858F = this.f14853A.b();
        if (this.f14862d && this.f14858F) {
            this.f14866z.m14896b(this);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f14855C.m10255a((Object) this, 1);
    }

    protected void onStop() {
        super.onStop();
        this.f14855C.m10259c(this);
    }

    public void onEvent(EventLocationSet eventLocationSet) {
        AppLifeCycleTracker.m10173a((LifeCycleHelperInterface) getApplicationContext()).m10177a();
    }

    /* renamed from: i */
    public void m18706i() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
    }

    /* renamed from: a */
    protected void m18692a(int i) {
        if (findViewById(i) != null && this.a_ != null) {
            this.a_.a(i);
        }
    }

    /* renamed from: a */
    public void m18695a(Fragment fragment) {
        try {
            if (this.a_ != null) {
                this.a_.b(fragment);
            }
        } catch (Throwable e) {
            com.tinder.utils.ad.m10193a("Failed to add fragment to back stack", e);
        }
    }

    /* renamed from: a */
    public void m18697a(Fragment fragment, String str, int i, int i2, int i3, int i4) {
        try {
            if (this.a_ != null && !fragment.isAdded()) {
                this.a_.a(fragment, str, i, i2, i3, i4);
            }
        } catch (Fragment fragment2) {
            C0001a.m29c(fragment2);
        }
    }

    /* renamed from: b */
    public void m18702b(Fragment fragment) {
        try {
            if (this.a_ != null && !fragment.isAdded()) {
                this.a_.a(fragment);
            }
        } catch (Fragment fragment2) {
            C0001a.m30c(fragment2, "Failed to addFragment", new Object[0]);
        }
    }

    /* renamed from: a */
    public void m18696a(Fragment fragment, String str) {
        try {
            if (this.a_ != null && !fragment.isAdded()) {
                this.a_.a(fragment, str);
            }
        } catch (Fragment fragment2) {
            C0001a.m30c(fragment2, "Failed to addFragment", new Object[0]);
        }
    }

    /* renamed from: c */
    public void m18703c(Fragment fragment) {
        try {
            if (this.a_ != null) {
                this.a_.c(fragment);
            }
        } catch (Throwable e) {
            com.tinder.utils.ad.m10193a("Failed to replace fragment", e);
        }
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void finish() {
        super.finish();
    }

    /* renamed from: a */
    protected void m18693a(Activity activity, ListenerLocationChanged listenerLocationChanged) {
        this.f14866z.m14892a(activity, listenerLocationChanged);
    }

    /* renamed from: a */
    protected void m18698a(ListenerLocationChanged listenerLocationChanged) {
        this.f14866z.m14894a(listenerLocationChanged);
    }

    protected void t_() {
        if (!m18701a((Activity) this)) {
            new Handler().postDelayed(new ActivityBase$1(this, this), 10000);
        }
    }

    /* renamed from: a */
    public void m18694a(@Nullable Location location) {
        if (!m18708k() || location == null) {
            t_();
        } else {
            this.f14854B.a(location);
        }
    }

    /* renamed from: j */
    public void m18707j() {
        if (!this.f14859a) {
            m18694a(null);
        }
    }

    /* renamed from: a */
    protected boolean m18701a(Activity activity) {
        return this.f14866z.m14895a(activity);
    }

    /* renamed from: k */
    protected boolean m18708k() {
        return this.f14866z.m14897b();
    }

    /* renamed from: l */
    public boolean m18709l() {
        return this.f14864x.m10128d() && this.f14858F;
    }

    /* renamed from: a */
    public void m18699a(@NonNull List<ReportNotification> list) {
        for (ReportNotification reportNotification : list) {
            if (!(reportNotification == null || TextUtils.isEmpty(reportNotification.type))) {
                Object toLowerCase = reportNotification.type.toLowerCase();
                if (TextUtils.equals(ManagerWebServices.PARAM_BANNED, toLowerCase.toLowerCase())) {
                    bf.a(this);
                } else if (TextUtils.equals("warning", toLowerCase)) {
                    if (this.f14860b == null) {
                        this.f14860b = bf.a(this, reportNotification);
                        this.f14860b.setOnDismissListener(new C8300a(this));
                        this.f14860b.show();
                    }
                } else if (TextUtils.equals("photoremoval", toLowerCase.toLowerCase()) && reportNotification.showReport) {
                    new DialogError(this, R.string.photo_removed_title, R.string.photo_removed_details).show();
                    reportNotification.showReport = false;
                }
            }
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m18704d(DialogInterface dialogInterface) {
        this.f14860b = null;
    }
}
