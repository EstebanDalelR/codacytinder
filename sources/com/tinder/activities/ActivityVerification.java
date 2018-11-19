package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.tinder.R;
import com.tinder.auth.interactor.C8280l;
import com.tinder.auth.model.AuthType;
import com.tinder.base.ActivityBase;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.dialogs.C8867t;
import com.tinder.events.EventLoggedOut;
import com.tinder.fragments.C13309n;
import com.tinder.fragments.FragmentAgeMoreGender;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.model.auth.LogoutFrom$BUTTON;
import com.tinder.presenters.C17741b;
import com.tinder.targets.AuthVerificationTarget;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class ActivityVerification extends ActivityBase implements AuthVerificationTarget {
    @Inject
    /* renamed from: a */
    C2652a f29424a;
    @Inject
    /* renamed from: b */
    ManagerProfile f29425b;
    @Inject
    /* renamed from: c */
    bk f29426c;
    @Inject
    /* renamed from: d */
    ManagerFusedLocation f29427d;
    @Inject
    /* renamed from: e */
    bt f29428e;
    @Inject
    /* renamed from: f */
    LegacyBreadCrumbTracker f29429f;
    @Inject
    /* renamed from: g */
    C17741b f29430g;
    @Inject
    /* renamed from: h */
    AbTestUtility f29431h;
    @Inject
    /* renamed from: i */
    C8280l f29432i;
    /* renamed from: j */
    private boolean f29433j;
    /* renamed from: k */
    private boolean f29434k;
    /* renamed from: l */
    private C8867t f29435l;
    /* renamed from: m */
    private boolean f29436m = false;

    /* renamed from: a */
    public boolean m35100a() {
        return true;
    }

    /* renamed from: e */
    final /* synthetic */ void m35105e() {
        m35094f();
    }

    public ActivityVerification() {
        super(true);
    }

    protected void onCreate(Bundle bundle) {
        ManagerApp.e().inject(this);
        super.onCreate(bundle);
        setContentView(R.layout.standard_activity);
        a(R.id.standard_activity_fragment_container);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new C6164o(this));
        setSupportActionBar(toolbar);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            this.f29433j = bundle.getBoolean("is_age_verification_needed", false);
            this.f29434k = bundle.getBoolean("is_gender_verification_needed", false);
            this.f29436m = bundle.getBoolean("hasrequestedpermission", false);
        }
        m35104d();
    }

    /* renamed from: a */
    final /* synthetic */ void m35096a(View view) {
        onBackPressed();
    }

    protected void onStart() {
        super.onStart();
        this.f29430g.a(this);
    }

    public void onResume() {
        super.onResume();
        this.f29429f.a(this);
    }

    /* renamed from: b */
    public void m35101b() {
        if (this.f29435l == null) {
            this.f29435l = new C8867t(this);
        }
        this.f29435l.show();
    }

    /* renamed from: c */
    public void m35103c() {
        av.a(this.f29435l);
    }

    /* renamed from: d */
    public void m35104d() {
        Fragment fragmentAgeMoreGender;
        ad.a();
        if (this.f29431h.isMoreGenderEnabled()) {
            fragmentAgeMoreGender = new FragmentAgeMoreGender();
        } else {
            fragmentAgeMoreGender = new C13309n();
        }
        if (!this.f29433j) {
            if (!this.f29434k) {
                this.f29426c.K(false);
                this.f29426c.L(false);
                this.f29432i.a(AuthType.FACEBOOK).b(C15756a.b()).a(C15674a.a()).a(new C7286p(this), new C7287q(this));
                return;
            }
        }
        m35093a(fragmentAgeMoreGender, this.f29433j, this.f29434k);
    }

    /* renamed from: a */
    final /* synthetic */ void m35098a(Throwable th) throws Exception {
        C0001a.c(th);
        m35094f();
    }

    /* renamed from: f */
    private void m35094f() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_show_loading", "");
        m35097a(MainActivity.class, bundle);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        finish();
    }

    /* renamed from: a */
    public void m35099a(boolean z) {
        this.f29433j = z;
    }

    /* renamed from: b */
    public void m35102b(boolean z) {
        this.f29434k = z;
    }

    /* renamed from: a */
    public void m35097a(Class cls, @Nullable Bundle bundle) {
        ad.a();
        this.f29426c.n(true);
        Intent intent = new Intent(getApplicationContext(), cls);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().d() < 2) {
            ad.a("Logging out");
            m35095g();
            return;
        }
        ad.a("Popping back stack");
        super.onBackPressed();
        this.f29430g.a(this.f29434k, this.f29433j);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasrequestedpermission", this.f29436m);
    }

    /* renamed from: g */
    private void m35095g() {
        m35101b();
        this.f29424a.a(LogoutFrom$BUTTON.INSTANCE);
    }

    public void onEventMainThread(EventLoggedOut eventLoggedOut) {
        eventLoggedOut = new Intent(this, LoginActivity.class);
        eventLoggedOut.setFlags(32768);
        eventLoggedOut.putExtra("extra_show_intro", "");
        startActivity(eventLoggedOut);
        finish();
        m35103c();
    }

    /* renamed from: a */
    private void m35093a(@NonNull Fragment fragment, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_age_verification_needed", z);
        bundle.putBoolean("is_gender_verification_needed", z2);
        fragment.setArguments(bundle);
        a(fragment);
        getSupportActionBar().setTitle(true);
        this.f29430g.b();
    }
}
