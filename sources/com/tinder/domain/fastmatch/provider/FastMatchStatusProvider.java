package com.tinder.domain.fastmatch.provider;

import com.tinder.domain.fastmatch.model.FastMatchStatus;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "", "()V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "kotlin.jvm.PlatformType", "get", "observe", "Lio/reactivex/Observable;", "update", "", "fastMatchStatus", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchStatusProvider {
    private final C19040a<FastMatchStatus> subject = C19040a.a(new FastMatchStatus(0, false, null, 0, null, 31, null));

    @NotNull
    public final FastMatchStatus get() {
        C19040a c19040a = this.subject;
        C2668g.a(c19040a, "subject");
        Object b = c19040a.b();
        C2668g.a(b, "subject.value");
        return (FastMatchStatus) b;
    }

    @NotNull
    public final C3959e<FastMatchStatus> observe() {
        C19040a c19040a = this.subject;
        C2668g.a(c19040a, "subject");
        return c19040a;
    }

    public final void update(@NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        this.subject.onNext(fastMatchStatus);
    }
}
