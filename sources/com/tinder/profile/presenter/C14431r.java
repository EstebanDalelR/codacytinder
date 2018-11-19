package com.tinder.profile.presenter;

import android.text.TextUtils;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.profile.repository.JobRepository;
import com.tinder.domain.profile.usecase.UpdateJob;
import com.tinder.interactors.C9716g;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.JobDisplayType;
import com.tinder.model.SparksEvent;
import com.tinder.profile.p366e.C14413e;
import com.tinder.profile.p366e.C14413e.C14412a;
import com.tinder.targets.JobTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.profile.presenter.r */
public class C14431r {
    @DeadshotTarget
    /* renamed from: a */
    JobTarget f45718a;
    /* renamed from: b */
    private final C9716g f45719b;
    /* renamed from: c */
    private final C14412a f45720c;
    /* renamed from: d */
    private final JobRepository f45721d;
    /* renamed from: e */
    private final UpdateJob f45722e;
    /* renamed from: f */
    private final ManagerAnalytics f45723f;
    /* renamed from: g */
    private final C17356a f45724g = new C17356a();
    /* renamed from: h */
    private C14413e f45725h;
    /* renamed from: i */
    private Job f45726i;

    @Inject
    public C14431r(C9716g c9716g, C14412a c14412a, JobRepository jobRepository, UpdateJob updateJob, ManagerAnalytics managerAnalytics) {
        this.f45719b = c9716g;
        this.f45720c = c14412a;
        this.f45721d = jobRepository;
        this.f45722e = updateJob;
        this.f45723f = managerAnalytics;
    }

    /* renamed from: a */
    public void m55094a() {
        m55093e();
    }

    /* renamed from: e */
    private void m55093e() {
        this.f45724g.add(this.f45721d.load().map(new C16117s(this)).map(new C16118t(this)).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16119u(this), C16120v.f50194a));
    }

    /* renamed from: c */
    final /* synthetic */ List m55100c(List list) throws Exception {
        List linkedList = new LinkedList();
        for (Job job : list) {
            if (!(TextUtils.isEmpty(job.companyId()) || TextUtils.isEmpty(job.titleId()))) {
                m55091a(linkedList, this.f45720c.m54864a(JobDisplayType.COMPANY_AND_TITLE, job));
            }
            if (!TextUtils.isEmpty(job.titleId())) {
                m55091a(linkedList, this.f45720c.m54864a(JobDisplayType.TITLE, job));
            }
            if (!TextUtils.isEmpty(job.companyId())) {
                m55091a(linkedList, this.f45720c.m54864a(JobDisplayType.COMPANY, job));
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    final /* synthetic */ List m55098b(List list) throws Exception {
        C14413e a = this.f45720c.m54863a();
        if (this.f45725h == null) {
            a.m54870a(true);
            this.f45725h = a;
        }
        list.add(a);
        return list;
    }

    /* renamed from: a */
    final /* synthetic */ void m55097a(List list) throws Exception {
        this.f45718a.showJobs(list);
    }

    /* renamed from: a */
    private void m55091a(List<C14413e> list, C14413e c14413e) {
        list.add(c14413e);
        m55092b(c14413e);
    }

    /* renamed from: b */
    private void m55092b(C14413e c14413e) {
        if (c14413e.m54873d()) {
            this.f45725h = c14413e;
            this.f45726i = c14413e.m54869a();
        }
    }

    /* renamed from: a */
    public void m55096a(C14413e c14413e) {
        C14413e c14413e2 = this.f45725h;
        if (c14413e2 != null) {
            c14413e2.m54870a(false);
        }
        c14413e.m54870a(true);
        this.f45725h = c14413e;
        this.f45718a.updateSelectedRow(c14413e2, c14413e);
    }

    /* renamed from: b */
    public void m55099b() {
        if (this.f45725h == null) {
            this.f45718a.exitScreen();
            return;
        }
        Job a = this.f45725h.m54869a();
        JobDisplayType b = this.f45725h.m54871b();
        if (this.f45719b.a(this.f45726i, a, b)) {
            m55089a(a, b);
        } else {
            this.f45718a.showSavingJobFinished();
        }
    }

    /* renamed from: a */
    private void m55089a(Job job, JobDisplayType jobDisplayType) {
        this.f45723f.a(new SparksEvent(this.f45726i == null ? "Job.Set" : "Job.Change"));
        this.f45724g.add(this.f45722e.execute(jobDisplayType != JobDisplayType.NONE ? job : null).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16121w(this), new C16122x(this, job)));
    }

    /* renamed from: d */
    final /* synthetic */ void m55102d() throws Exception {
        this.f45718a.showSavingJobFinished();
    }

    /* renamed from: a */
    final /* synthetic */ void m55095a(Job job, Throwable th) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error updating user's job: ");
        stringBuilder.append(job);
        C0001a.b(th, stringBuilder.toString(), new Object[0]);
        this.f45718a.showSavingJobError();
    }

    @Drop
    /* renamed from: c */
    void m55101c() {
        this.f45724g.m63446a();
    }
}
