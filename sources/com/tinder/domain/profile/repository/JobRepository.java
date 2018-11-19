package com.tinder.domain.profile.repository;

import com.tinder.domain.common.model.Job;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/repository/JobRepository;", "", "delete", "Lio/reactivex/Completable;", "load", "Lio/reactivex/Observable;", "", "Lcom/tinder/domain/common/model/Job;", "update", "job", "updateForSmsUser", "jobs", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface JobRepository {
    @NotNull
    C3956a delete();

    @NotNull
    C3959e<List<Job>> load();

    @NotNull
    C3956a update(@NotNull Job job);

    @NotNull
    C3956a updateForSmsUser(@NotNull List<? extends Job> list);
}
