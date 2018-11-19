package com.tinder.model.adapter.legacy;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.api.model.common.Job;
import com.tinder.model.Job.Company;
import com.tinder.model.Job.Title;
import java.util.ArrayList;
import java.util.List;

public class LegacyJobAdapter {
    public List<Job> fromLegacyJobList(@NonNull List<com.tinder.model.Job> list) {
        List<Job> arrayList = new ArrayList();
        for (com.tinder.model.Job fromLegacyJob : list) {
            arrayList.add(fromLegacyJob(fromLegacyJob));
        }
        return arrayList;
    }

    public com.tinder.model.Job createJobFromApi(@Nullable Job job) {
        if (job == null) {
            return null;
        }
        com.tinder.model.Job job2 = new com.tinder.model.Job();
        boolean z = false;
        if (!TextUtils.isEmpty(job.companyId())) {
            Company company = new Company();
            company.setId(job.companyId());
            company.setName(!TextUtils.isEmpty(job.companyName()) ? job.companyName() : "");
            company.setDisplayed(job.isCompanyDisplayed() != null ? job.isCompanyDisplayed().booleanValue() : false);
            job2.setCompany(company);
        }
        if (!TextUtils.isEmpty(job.titleId())) {
            Title title = new Title();
            title.setId(job.titleId());
            title.setName(!TextUtils.isEmpty(job.titleName()) ? job.titleName() : "");
            if (job.isTitleDisplayed() != null) {
                z = job.isTitleDisplayed().booleanValue();
            }
            title.setDisplayed(z);
            job2.setTitle(title);
        }
        return job2;
    }

    private Job fromLegacyJob(@Nullable com.tinder.model.Job job) {
        if (job == null) {
            return Job.builder().build();
        }
        Job.Title title = null;
        Job.Company buildCompany = job.mCompany != null ? buildCompany(job.mCompany) : null;
        if (job.mTitle != null) {
            title = buildTitle(job.mTitle);
        }
        return Job.builder().setCompany(buildCompany).setTitle(title).build();
    }

    private Job.Title buildTitle(@NonNull Title title) {
        return Job.Title.builder().setId(title.getId()).setDisplayed(Boolean.valueOf(title.isDisplayed())).setName(title.getName()).build();
    }

    private Job.Company buildCompany(@NonNull Company company) {
        return Job.Company.builder().setId(company.getId()).setDisplayed(Boolean.valueOf(company.isDisplayed())).setName(company.getName()).build();
    }
}
