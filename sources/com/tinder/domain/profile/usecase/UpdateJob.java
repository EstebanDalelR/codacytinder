package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.repository.JobRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/profile/usecase/UpdateJob;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/common/model/Job;", "jobRepository", "Lcom/tinder/domain/profile/repository/JobRepository;", "(Lcom/tinder/domain/profile/repository/JobRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateJob implements CompletableUseCase<Job> {
    private final JobRepository jobRepository;

    @Inject
    public UpdateJob(@NotNull JobRepository jobRepository) {
        C2668g.b(jobRepository, "jobRepository");
        this.jobRepository = jobRepository;
    }

    @NotNull
    public C3956a execute(@Nullable Job job) {
        if (job != null) {
            job = this.jobRepository.update(job);
            if (job != null) {
                return job;
            }
        }
        return this.jobRepository.delete();
    }
}
