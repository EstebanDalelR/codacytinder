package com.tinder.data.adapter;

import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;
import com.tinder.api.model.profile.UpdateJobRequestBody;
import com.tinder.domain.common.model.Job;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Lcom/tinder/data/adapter/UpdateJobRequestBodyAdapter;", "", "()V", "toRequestBody", "Lcom/tinder/api/model/profile/UpdateJobRequestBody;", "job", "Lcom/tinder/domain/common/model/Job;", "isCompanyAbsentOrNotDisplayed", "", "isTitleAbsentOrNotDisplayed", "data_release"}, k = 1, mv = {1, 1, 10})
public final class at {
    @NotNull
    /* renamed from: a */
    public final UpdateJobRequestBody m36762a(@NotNull Job job) {
        Title title;
        C2668g.b(job, "job");
        Company company = null;
        if (m36760b(job)) {
            title = null;
        } else {
            title = Title.builder().setId(job.titleId()).setName(job.titleName()).setDisplayed(Boolean.valueOf(job.titleDisplayed())).build();
        }
        if (!m36761c(job)) {
            company = Company.builder().setId(job.companyId()).setName(job.companyName()).setDisplayed(Boolean.valueOf(job.companyDisplayed())).build();
        }
        return new UpdateJobRequestBody(title, company);
    }

    /* renamed from: b */
    private final boolean m36760b(@NotNull Job job) {
        Object obj;
        CharSequence titleId = job.titleId();
        if (titleId != null) {
            if (titleId.length() != 0) {
                obj = null;
                if (obj == null) {
                    return true;
                }
                titleId = job.titleName();
                if (titleId != null) {
                    if (titleId.length() == 0) {
                        obj = null;
                        if (obj == null) {
                            return job.titleDisplayed() != null;
                        } else {
                            return true;
                        }
                    }
                }
                obj = 1;
                if (obj == null) {
                    return true;
                }
                if (job.titleDisplayed() != null) {
                }
            }
        }
        obj = 1;
        if (obj == null) {
            return true;
        }
        titleId = job.titleName();
        if (titleId != null) {
            if (titleId.length() == 0) {
                obj = null;
                if (obj == null) {
                    return true;
                }
                if (job.titleDisplayed() != null) {
                }
            }
        }
        obj = 1;
        if (obj == null) {
            return true;
        }
        if (job.titleDisplayed() != null) {
        }
    }

    /* renamed from: c */
    private final boolean m36761c(@NotNull Job job) {
        Object obj;
        CharSequence companyId = job.companyId();
        if (companyId != null) {
            if (companyId.length() != 0) {
                obj = null;
                if (obj == null) {
                    return true;
                }
                companyId = job.companyName();
                if (companyId != null) {
                    if (companyId.length() == 0) {
                        obj = null;
                        if (obj == null) {
                            return job.companyDisplayed() != null;
                        } else {
                            return true;
                        }
                    }
                }
                obj = 1;
                if (obj == null) {
                    return true;
                }
                if (job.companyDisplayed() != null) {
                }
            }
        }
        obj = 1;
        if (obj == null) {
            return true;
        }
        companyId = job.companyName();
        if (companyId != null) {
            if (companyId.length() == 0) {
                obj = null;
                if (obj == null) {
                    return true;
                }
                if (job.companyDisplayed() != null) {
                }
            }
        }
        obj = 1;
        if (obj == null) {
            return true;
        }
        if (job.companyDisplayed() != null) {
        }
    }
}
