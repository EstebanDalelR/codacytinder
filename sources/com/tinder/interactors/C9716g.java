package com.tinder.interactors;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Job;
import com.tinder.model.JobDisplayType;

/* renamed from: com.tinder.interactors.g */
public class C9716g {
    /* renamed from: a */
    public boolean m40212a(@Nullable Job job, @NonNull Job job2, @NonNull JobDisplayType jobDisplayType) {
        boolean z = false;
        if (job == null) {
            if (jobDisplayType != JobDisplayType.NONE) {
                z = true;
            }
            return z;
        } else if (job.equals(job2) == null) {
            return true;
        } else {
            if (m40211a(job) != jobDisplayType) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    private JobDisplayType m40211a(@NonNull Job job) {
        boolean companyDisplayed = job.companyDisplayed();
        job = job.titleDisplayed();
        if (companyDisplayed && job != null) {
            return JobDisplayType.COMPANY_AND_TITLE;
        }
        if (companyDisplayed) {
            return JobDisplayType.COMPANY;
        }
        if (job != null) {
            return JobDisplayType.TITLE;
        }
        return JobDisplayType.NONE;
    }
}
