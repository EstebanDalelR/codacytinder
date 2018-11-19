package com.evernote.android.job;

import com.evernote.android.job.util.C3142c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.evernote.android.job.c */
class C1135c {
    /* renamed from: a */
    private static final C3142c f2983a = new C3142c("JobCreatorHolder");
    /* renamed from: b */
    private final List<JobCreator> f2984b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void m3804a(JobCreator jobCreator) {
        this.f2984b.add(jobCreator);
    }

    /* renamed from: a */
    public Job m3803a(String str) {
        Job job = null;
        Object obj = null;
        for (JobCreator create : this.f2984b) {
            obj = 1;
            job = create.create(str);
            if (job != null) {
                break;
            }
        }
        if (obj == null) {
            f2983a.m12122c("no JobCreator added");
        }
        return job;
    }

    /* renamed from: a */
    public boolean m3805a() {
        return this.f2984b.isEmpty();
    }
}
