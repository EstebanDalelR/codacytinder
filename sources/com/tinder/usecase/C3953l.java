package com.tinder.usecase;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/usecase/StartSponsoredMessagesJob;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "firebaseJobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;)V", "execute", "", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.l */
public final class C3953l implements SimpleVoidUseCase {
    @Deprecated
    /* renamed from: a */
    public static final l$a f12546a = new l$a(null);
    /* renamed from: b */
    private final AbTestUtility f12547b;
    /* renamed from: c */
    private final FirebaseJobDispatcher f12548c;

    @Inject
    public C3953l(@NotNull AbTestUtility abTestUtility, @NotNull FirebaseJobDispatcher firebaseJobDispatcher) {
        C2668g.m10309b(abTestUtility, "abTestUtility");
        C2668g.m10309b(firebaseJobDispatcher, "firebaseJobDispatcher");
        this.f12547b = abTestUtility;
        this.f12548c = firebaseJobDispatcher;
    }

    public void execute() {
        if (this.f12547b.isSponsoredMessageEnabled()) {
            Completable.m10366a((Action0) new l$b(this)).m10386b(Schedulers.io()).m10394b(RxUtils.m10187b());
        }
    }
}
