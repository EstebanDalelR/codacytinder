package com.tinder.data.fastmatch.p325b;

import com.tinder.domain.fastmatch.repository.NewCountRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/fastmatch/repository/NewCountDataRepository;", "Lcom/tinder/domain/fastmatch/repository/NewCountRepository;", "()V", "count", "", "subject", "Lrx/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "latestCount", "observeCount", "Lrx/Observable;", "updateCount", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.b.a */
public final class C10769a implements NewCountRepository {
    /* renamed from: a */
    private final PublishSubject<Integer> f35171a = PublishSubject.w();
    /* renamed from: b */
    private int f35172b;

    public void updateCount(int i) {
        if (i > 0 && this.f35172b != i) {
            this.f35172b = i;
            this.f35171a.onNext(Integer.valueOf(i));
        }
    }

    @NotNull
    public Observable<Integer> observeCount() {
        Observable<Integer> e = this.f35171a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    public int latestCount() {
        return this.f35172b;
    }
}
