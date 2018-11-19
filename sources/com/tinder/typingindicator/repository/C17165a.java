package com.tinder.typingindicator.repository;

import com.tinder.base.p172b.C8301a;
import io.reactivex.C3957b;
import io.reactivex.processors.PublishProcessor;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/typingindicator/repository/TextInputDataRepository;", "Lcom/tinder/typingindicator/repository/TextInputRepository;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;)V", "textInputChangeProcessor", "Lio/reactivex/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Flowable;", "update", "", "textInput", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.repository.a */
public final class C17165a implements TextInputRepository {
    /* renamed from: a */
    private final PublishProcessor<String> f52696a = PublishProcessor.m67663q();
    /* renamed from: b */
    private final C8301a f52697b;

    @Inject
    public C17165a(@NotNull C8301a c8301a) {
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        this.f52697b = c8301a;
    }

    public void update(@NotNull String str) {
        C2668g.b(str, "textInput");
        this.f52697b.a();
        this.f52696a.onNext(str);
    }

    @NotNull
    public C3957b<String> observe() {
        C3957b<String> g = this.f52696a.g();
        C2668g.a(g, "textInputChangeProcessor.hide()");
        return g;
    }
}
