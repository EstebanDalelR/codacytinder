package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.typingindicator.repository.TextInputRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/typingindicator/usecase/SendTextInputChange;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "", "textInputRepository", "Lcom/tinder/typingindicator/repository/TextInputRepository;", "(Lcom/tinder/typingindicator/repository/TextInputRepository;)V", "execute", "", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.p */
public final class C17186p implements VoidUseCase<String> {
    /* renamed from: a */
    private final TextInputRepository f52732a;

    @Inject
    public C17186p(@NotNull TextInputRepository textInputRepository) {
        C2668g.b(textInputRepository, "textInputRepository");
        this.f52732a = textInputRepository;
    }

    public /* synthetic */ void execute(Object obj) {
        m63057a((String) obj);
    }

    /* renamed from: a */
    public void m63057a(@NotNull String str) {
        C2668g.b(str, "request");
        this.f52732a.update(str);
    }
}
