package com.tinder.data.profile.persistence;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import io.reactivex.C3956a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/profile/persistence/PersistProfilePhotos;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "Lcom/tinder/domain/common/model/Photo;", "persistUserFields", "Lcom/tinder/data/profile/persistence/PersistUserFields;", "(Lcom/tinder/data/profile/persistence/PersistUserFields;)V", "execute", "Lio/reactivex/Completable;", "request", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.persistence.b */
public final class C10961b implements CompletableUseCase<List<? extends Photo>> {
    /* renamed from: a */
    private final C8767d f35677a;

    @Inject
    public C10961b(@NotNull C8767d c8767d) {
        C2668g.b(c8767d, "persistUserFields");
        this.f35677a = c8767d;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m43557a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m43557a(@NotNull List<? extends Photo> list) {
        C2668g.b(list, "request");
        return this.f35677a.m37371a((Function1) new PersistProfilePhotos$execute$1(list));
    }
}
