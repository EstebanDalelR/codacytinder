package com.tinder.profile.p366e;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.domain.common.model.Job;
import com.tinder.model.JobDisplayType;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.e.e */
public class C14413e {
    /* renamed from: a */
    private Job f45618a;
    /* renamed from: b */
    private JobDisplayType f45619b;
    /* renamed from: c */
    private boolean f45620c;
    /* renamed from: d */
    private String f45621d;

    /* renamed from: com.tinder.profile.e.e$1 */
    static /* synthetic */ class C144111 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45616a = new int[JobDisplayType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.model.JobDisplayType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45616a = r0;
            r0 = f45616a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.model.JobDisplayType.COMPANY_AND_TITLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f45616a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.model.JobDisplayType.COMPANY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f45616a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.model.JobDisplayType.TITLE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.profile.e.e.1.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.profile.e.e$a */
    public static class C14412a {
        /* renamed from: a */
        private final Resources f45617a;

        @Inject
        public C14412a(Resources resources) {
            this.f45617a = resources;
        }

        @NonNull
        /* renamed from: a */
        public C14413e m54864a(@NonNull JobDisplayType jobDisplayType, @NonNull Job job) {
            if (jobDisplayType == JobDisplayType.NONE) {
                throw new IllegalArgumentException("Use createNone for None type");
            }
            C14413e c14413e = new C14413e();
            c14413e.f45618a = job;
            c14413e.f45619b = jobDisplayType;
            boolean z = false;
            switch (C144111.f45616a[jobDisplayType.ordinal()]) {
                case 1:
                    c14413e.f45621d = this.f45617a.getString(R.string.job_at, new Object[]{job.titleName(), job.companyName()});
                    if (!(job.companyDisplayed() == null || job.titleDisplayed() == null)) {
                        z = true;
                    }
                    c14413e.f45620c = z;
                    break;
                case 2:
                    c14413e.f45621d = job.companyName().trim();
                    if (job.companyDisplayed() != null && (job.titleId() == null || (job.titleId() != null && job.titleDisplayed() == null))) {
                        z = true;
                    }
                    c14413e.f45620c = z;
                    break;
                case 3:
                    c14413e.f45621d = job.titleName().trim();
                    if (job.titleDisplayed() != null && (job.companyId() == null || (job.companyId() != null && job.companyDisplayed() == null))) {
                        z = true;
                    }
                    c14413e.f45620c = z;
                    break;
                default:
                    break;
            }
            return c14413e;
        }

        /* renamed from: a */
        public C14413e m54863a() {
            C14413e c14413e = new C14413e();
            c14413e.f45619b = JobDisplayType.NONE;
            c14413e.f45621d = this.f45617a.getString(R.string.none);
            return c14413e;
        }
    }

    /* renamed from: a */
    public Job m54869a() {
        return this.f45618a;
    }

    /* renamed from: b */
    public JobDisplayType m54871b() {
        return this.f45619b;
    }

    /* renamed from: c */
    public String m54872c() {
        return this.f45621d;
    }

    /* renamed from: d */
    public boolean m54873d() {
        return this.f45620c;
    }

    /* renamed from: a */
    public void m54870a(boolean z) {
        this.f45620c = z;
        if (this.f45619b == JobDisplayType.COMPANY) {
            this.f45618a = this.f45618a.toBuilder().companyDisplayed(true).titleDisplayed(false).build();
        } else if (this.f45619b == JobDisplayType.COMPANY_AND_TITLE) {
            this.f45618a = this.f45618a.toBuilder().companyDisplayed(true).titleDisplayed(true).build();
        } else if (this.f45619b == JobDisplayType.TITLE) {
            this.f45618a = this.f45618a.toBuilder().titleDisplayed(true).companyDisplayed(false).build();
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C14413e c14413e = (C14413e) obj;
                if (this.f45619b != c14413e.f45619b) {
                    return false;
                }
                if (this.f45621d != null) {
                    z = this.f45621d.equals(c14413e.f45621d);
                } else if (c14413e.f45621d != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f45619b != null ? this.f45619b.hashCode() : 0) * 31;
        if (this.f45621d != null) {
            i = this.f45621d.hashCode();
        }
        return hashCode + i;
    }
}
