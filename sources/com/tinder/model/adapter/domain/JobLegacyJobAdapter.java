package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Job.Builder;
import com.tinder.model.Job.Company;
import javax.inject.Inject;

class JobLegacyJobAdapter extends C2645i<Job, com.tinder.model.Job> {
    @Inject
    JobLegacyJobAdapter() {
    }

    @Nullable
    public Job adapt(com.tinder.model.Job job) {
        Builder builder = Job.builder();
        Company company = job.getCompany();
        boolean z = false;
        boolean z2 = company != null && company.isDisplayed();
        builder.companyDisplayed(z2);
        if (company != null) {
            builder.companyName(company.getName()).companyId(company.getId());
        }
        job = job.getTitle();
        if (job != null && job.isDisplayed()) {
            z = true;
        }
        builder.titleDisplayed(z);
        if (job != null) {
            builder.titleId(job.getId()).titleName(job.getName());
        }
        return builder.build();
    }
}
