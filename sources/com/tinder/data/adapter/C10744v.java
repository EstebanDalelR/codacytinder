package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto.C14277q;
import com.tinder.data.generated.proto.TinderProto.C14279r;
import com.tinder.data.generated.proto.TinderProto.C14279r.C14278a;
import com.tinder.domain.common.model.Job;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.data.adapter.v */
public class C10744v implements ColumnAdapter<List<Job>, byte[]> {
    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m43145a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43146a((List) obj);
    }

    @NonNull
    /* renamed from: a */
    public List<Job> m43145a(byte[] bArr) {
        List<Job> arrayList;
        List<Job> emptyList = Collections.emptyList();
        try {
            bArr = C14279r.m54278a(bArr);
            int jobsCount = bArr.getJobsCount();
            arrayList = new ArrayList(jobsCount);
            int i = 0;
            while (i < jobsCount) {
                try {
                    C14277q jobs = bArr.getJobs(i);
                    arrayList.add(Job.builder().companyId(jobs.getCompanyId()).companyName(jobs.getCompanyName()).companyDisplayed(jobs.getCompanyDisplayed()).titleId(jobs.getTitleId()).titleName(jobs.getTitleName()).titleDisplayed(jobs.getTitleDisplayed()).build());
                    i++;
                } catch (InvalidProtocolBufferException e) {
                    bArr = e;
                }
            }
        } catch (InvalidProtocolBufferException e2) {
            bArr = e2;
            arrayList = emptyList;
            C0001a.c(bArr, "Error decoding Jobs", new Object[0]);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public byte[] m43146a(@NonNull List<Job> list) {
        C14278a a = C14279r.m54277a();
        for (Job job : list) {
            a.m54276a((C14277q) C14277q.m54261a().m54255a(job.companyId()).m54257b(job.companyName()).m54256a(job.companyDisplayed()).m54259c(job.titleId()).m54260d(job.titleName()).m54258b(job.titleDisplayed()).build());
        }
        return ((C14279r) a.build()).toByteArray();
    }
}
