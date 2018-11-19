package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;
import com.tinder.domain.common.model.Job;
import java8.util.Objects;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.data.adapter.u */
public class C3925u extends C2646o<Job, com.tinder.api.model.common.Job> {
    /* renamed from: a */
    private final Function0<Boolean> f12276a;

    @Inject
    public C3925u(Function0<Boolean> function0) {
        this.f12276a = function0;
    }

    @Nullable
    /* renamed from: a */
    public Job m14811a(@NonNull com.tinder.api.model.common.Job job) {
        String str = (String) Objects.b(job.companyId(), "");
        String str2 = (String) Objects.b(job.companyName(), "");
        String str3 = (String) Objects.b(job.titleId(), "");
        String str4 = (String) Objects.b(job.titleName(), "");
        boolean booleanValue = ((Boolean) Objects.b(job.isCompanyDisplayed(), this.f12276a.invoke())).booleanValue();
        return Job.builder().companyId(str).companyName(str2).titleId(str3).titleName(str4).companyDisplayed(booleanValue).titleDisplayed(((Boolean) Objects.b(job.isTitleDisplayed(), this.f12276a.invoke())).booleanValue()).build();
    }

    /* renamed from: a */
    public com.tinder.api.model.common.Job m14810a(@Nonnull Job job) {
        Company build = Company.builder().setId(job.companyId()).setName(job.companyName()).setDisplayed(Boolean.valueOf(job.companyDisplayed())).build();
        return com.tinder.api.model.common.Job.builder().setCompany(build).setTitle(Title.builder().setId(job.titleId()).setName(job.titleName()).setDisplayed(Boolean.valueOf(job.titleDisplayed())).build()).build();
    }
}
