package com.tinder.match;

import android.content.Context;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tinder/match/DeleteSponsoredMessageJobService;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "getMatchRepository$Tinder_release", "()Lcom/tinder/domain/match/repository/MatchRepository;", "setMatchRepository$Tinder_release", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "onStartJob", "", "parameters", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteSponsoredMessageJobService extends JobService {
    @Inject
    @NotNull
    /* renamed from: a */
    public MatchRepository f39135a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.DeleteSponsoredMessageJobService$a */
    static final class C14052a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ DeleteSponsoredMessageJobService f44562a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f44563b;

        C14052a(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService, JobParameters jobParameters) {
            this.f44562a = deleteSponsoredMessageJobService;
            this.f44563b = jobParameters;
        }

        public final void call() {
            this.f44562a.b(this.f44563b, false);
        }
    }

    /* renamed from: b */
    public boolean m48121b(@Nullable JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    public boolean m48120a(@Nullable JobParameters jobParameters) {
        if (jobParameters == null) {
            return null;
        }
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        MatchRepository matchRepository = this.f39135a;
        if (matchRepository == null) {
            C2668g.b("matchRepository");
        }
        matchRepository.deleteExpiredSponsoredMatches().e(new C14052a(this, jobParameters));
        return true;
    }
}
