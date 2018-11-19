package com.tinder.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.adapters.SchoolsAdapter;
import com.tinder.adapters.SchoolsAdapter.SchoolItemViewHolder;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.p366e.C14415f;
import com.tinder.profile.presenter.bf;
import com.tinder.targets.SchoolTarget;
import java.util.List;
import javax.inject.Inject;

public class SchoolActivity extends ActivitySignedInBase implements SchoolTarget {
    @Inject
    /* renamed from: a */
    LegacyBreadCrumbTracker f29460a;
    @Inject
    /* renamed from: b */
    bf f29461b;
    /* renamed from: c */
    private SchoolsAdapter f29462c;
    @BindView(2131363503)
    RecyclerView schoolRecyclerView;
    @BindView(2131363504)
    Toolbar toolbar;
    @BindView(2131363502)
    ViewGroup viewGroupContainer;

    /* renamed from: com.tinder.activities.SchoolActivity$a */
    private static class C7964a extends LinearLayoutManager {
        C7964a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    public boolean m35134a() {
        return true;
    }

    /* renamed from: a */
    public static Intent m35129a(Context context) {
        return new Intent(context, SchoolActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.school_activity);
        ButterKnife.a(this);
        ManagerApp.e().inject(this);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        m35130d();
        m35131e();
    }

    /* renamed from: d */
    private void m35130d() {
        this.f29462c = new SchoolsAdapter();
        this.f29462c.m33827a(this.f29461b.a());
        LayoutManager c7964a = new C7964a(this);
        this.schoolRecyclerView.addItemDecoration(new DividerItemDecoration(this, c7964a.getOrientation()));
        this.schoolRecyclerView.setLayoutManager(c7964a);
        this.schoolRecyclerView.setAdapter(this.f29462c);
    }

    /* renamed from: e */
    private void m35131e() {
        this.toolbar.setNavigationOnClickListener(new ai(this));
        m35132f();
    }

    /* renamed from: b */
    final /* synthetic */ void m35135b(View view) {
        onBackPressed();
    }

    /* renamed from: f */
    private void m35132f() {
        setSupportActionBar(this.toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
    }

    protected void onStart() {
        super.onStart();
        Deadshot.take(this, this.f29461b);
        this.f29461b.c();
    }

    public void onResume() {
        super.onResume();
        this.f29460a.a(this);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    public void showSchools(List<C14415f> list) {
        this.f29462c.m31189a((List) list);
    }

    public void updateSelectedRow() {
        List a = this.f29462c.m31188a();
        for (int i = 0; i < a.size(); i++) {
            SchoolItemViewHolder schoolItemViewHolder = (SchoolItemViewHolder) this.schoolRecyclerView.findViewHolderForAdapterPosition(i);
            if (((C14415f) a.get(i)).d()) {
                schoolItemViewHolder.m31170a();
            } else {
                schoolItemViewHolder.m31173b();
            }
        }
    }

    public void showSavingSchoolFinished() {
        exitScreen();
    }

    public void showSavingSchoolError() {
        Snackbar.a(this.viewGroupContainer, R.string.failed_save_school, 0).a(R.string.retry, new aj(this)).b();
    }

    /* renamed from: a */
    final /* synthetic */ void m35133a(View view) {
        this.f29461b.b();
    }

    public void exitScreen() {
        finish();
    }

    public void onBackPressed() {
        this.f29461b.b();
    }
}
