package com.tinder.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.adapters.C7294i;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.model.JobDisplayType;
import com.tinder.profile.p366e.C14413e;
import com.tinder.profile.presenter.C14431r;
import com.tinder.profile.view.ProfileItemView;
import com.tinder.targets.JobTarget;
import java.util.List;
import javax.inject.Inject;

public class ActivityJob extends ActivitySignedInBase implements JobTarget {
    @Inject
    /* renamed from: a */
    LegacyBreadCrumbTracker f29457a;
    @Inject
    /* renamed from: b */
    C14431r f29458b;
    /* renamed from: c */
    private final C7294i<C14413e, JobItemViewHolder> f29459c = new C79611(this);
    @BindView(2131362809)
    ViewGroup mContainer;
    @BindView(2131362813)
    RecyclerView mRecyclerView;
    @BindView(2131362814)
    Toolbar mToolbar;

    class JobItemViewHolder extends ViewHolder {
        @Nullable
        /* renamed from: a */
        View f26190a;
        /* renamed from: b */
        final /* synthetic */ ActivityJob f26191b;
        @BindView(2131362811)
        ViewStub mContentStub;
        @BindString(2131821433)
        String mNoneText;
        @BindView(2131362810)
        ProfileItemView mProfileItemView;

        JobItemViewHolder(ActivityJob activityJob, ViewGroup viewGroup) {
            this.f26191b = activityJob;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_job_item, viewGroup, false));
            ButterKnife.a(this, this.itemView);
        }

        JobItemViewHolder(ActivityJob activityJob, ViewGroup viewGroup, @LayoutRes int i) {
            this(activityJob, viewGroup);
            this.mContentStub.setLayoutResource(i);
            this.f26190a = this.mContentStub.inflate();
        }

        /* renamed from: a */
        void m31103a(C14413e c14413e) {
            this.mProfileItemView.setText(c14413e.b() == JobDisplayType.NONE ? this.mNoneText : c14413e.c());
            this.mProfileItemView.setCheckVisible(c14413e.d());
            this.itemView.setOnClickListener(new C6162l(this, c14413e));
        }

        /* renamed from: a */
        final /* synthetic */ void m31104a(C14413e c14413e, View view) {
            this.f26191b.f29458b.a(c14413e);
        }
    }

    public class JobItemViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private JobItemViewHolder f26192b;

        @UiThread
        public JobItemViewHolder_ViewBinding(JobItemViewHolder jobItemViewHolder, View view) {
            this.f26192b = jobItemViewHolder;
            jobItemViewHolder.mContentStub = (ViewStub) C0761c.b(view, R.id.job_item_stub, "field 'mContentStub'", ViewStub.class);
            jobItemViewHolder.mProfileItemView = (ProfileItemView) C0761c.b(view, R.id.job_item_profile_item, "field 'mProfileItemView'", ProfileItemView.class);
            jobItemViewHolder.mNoneText = view.getContext().getResources().getString(R.string.none);
        }

        @CallSuper
        public void unbind() {
            JobItemViewHolder jobItemViewHolder = this.f26192b;
            if (jobItemViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f26192b = null;
            jobItemViewHolder.mContentStub = null;
            jobItemViewHolder.mProfileItemView = null;
        }
    }

    /* renamed from: com.tinder.activities.ActivityJob$1 */
    class C79611 extends C7294i<C14413e, JobItemViewHolder> {
        /* renamed from: a */
        final /* synthetic */ ActivityJob f28573a;

        C79611(ActivityJob activityJob) {
            this.f28573a = activityJob;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m33822a((JobItemViewHolder) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m33821a(viewGroup, i);
        }

        /* renamed from: a */
        public JobItemViewHolder m33821a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new JobItemViewHolder(this.f28573a, viewGroup, R.layout.view_job_recycler_spacer);
                case 2:
                    return new C7963b(this.f28573a, viewGroup, R.layout.view_job_none_text);
                default:
                    return new JobItemViewHolder(this.f28573a, viewGroup);
            }
        }

        /* renamed from: a */
        public void m33822a(JobItemViewHolder jobItemViewHolder, int i) {
            jobItemViewHolder.m31103a((C14413e) m31187a(i));
        }

        public int getItemCount() {
            return m31188a().size();
        }

        public int getItemViewType(int i) {
            C14413e c14413e = (C14413e) m31187a(i);
            if (i == 0) {
                return 1;
            }
            return c14413e.b() == JobDisplayType.NONE ? 2 : 0;
        }
    }

    /* renamed from: com.tinder.activities.ActivityJob$a */
    private static class C7962a extends LinearLayoutManager {
        C7962a(Context context) {
            super(context);
        }
    }

    /* renamed from: com.tinder.activities.ActivityJob$b */
    private class C7963b extends JobItemViewHolder {
        /* renamed from: c */
        final /* synthetic */ ActivityJob f28574c;

        C7963b(ActivityJob activityJob, ViewGroup viewGroup, @LayoutRes int i) {
            this.f28574c = activityJob;
            super(activityJob, viewGroup, i);
            if (this.a != null) {
                TextView textView = (TextView) this.a.findViewById(R.id.job_none_text);
                textView.setText(Html.fromHtml(activityJob.getString(R.string.job_isnt_shown)));
                textView.setOnClickListener(new C6163m(this));
            }
        }

        /* renamed from: a */
        final /* synthetic */ void m33823a(View view) {
            this.f28574c.m35125g();
        }
    }

    /* renamed from: a */
    public boolean m35127a() {
        return true;
    }

    /* renamed from: a */
    public static Intent m35120a(Context context) {
        return new Intent(context, ActivityJob.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_job);
        ManagerApp.e().inject(this);
        ButterKnife.a(this);
        m35123e();
        m35122d();
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
    }

    protected void onStart() {
        super.onStart();
        Deadshot.take(this, this.f29458b);
        this.f29458b.a();
    }

    public void onResume() {
        super.onResume();
        this.f29457a.a(this);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    public void onBackPressed() {
        this.f29458b.b();
    }

    public void updateSelectedRow(@Nullable C14413e c14413e, @NonNull C14413e c14413e2) {
        List a = this.f29459c.m31188a();
        if (c14413e != null) {
            this.f29459c.notifyItemChanged(a.indexOf(c14413e));
        }
        this.f29459c.notifyItemChanged(a.indexOf(c14413e2));
    }

    public void showJobs(List<C14413e> list) {
        this.f29459c.m31189a((List) list);
    }

    public void showSavingJobFinished() {
        exitScreen();
    }

    public void showSavingJobError() {
        Snackbar.a(this.mContainer, R.string.failed_save_job, 0).a(R.string.retry, new C6160j(this)).b();
    }

    /* renamed from: b */
    final /* synthetic */ void m35128b(View view) {
        this.f29458b.b();
    }

    public void exitScreen() {
        finish();
    }

    /* renamed from: d */
    private void m35122d() {
        LayoutManager c7962a = new C7962a(this);
        this.mRecyclerView.addItemDecoration(new DividerItemDecoration(this, c7962a.getOrientation()));
        this.mRecyclerView.setLayoutManager(c7962a);
        this.mRecyclerView.setAdapter(this.f29459c);
    }

    /* renamed from: e */
    private void m35123e() {
        this.mToolbar.setNavigationOnClickListener(new C6161k(this));
        m35124f();
    }

    /* renamed from: a */
    final /* synthetic */ void m35126a(View view) {
        onBackPressed();
    }

    /* renamed from: f */
    private void m35124f() {
        setSupportActionBar(this.mToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
    }

    /* renamed from: g */
    private void m35125g() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.gotinder.com/jobs")));
    }
}
