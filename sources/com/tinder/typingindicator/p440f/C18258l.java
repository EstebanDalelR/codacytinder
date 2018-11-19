package com.tinder.typingindicator.p440f;

import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToTypingIndicatorViewModel;", "Lkotlin/Function1;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "typingIndicatorStateToViewModelState", "Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorStateToViewModelState;", "(Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorStateToViewModelState;)V", "invoke", "typingIndicator", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.l */
public final class C18258l implements Function1<TypingIndicator, TypingIndicatorViewModel> {
    /* renamed from: a */
    private final C18254g f56573a;

    @Inject
    public C18258l(@NotNull C18254g c18254g) {
        C2668g.b(c18254g, "typingIndicatorStateToViewModelState");
        this.f56573a = c18254g;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m66152a((TypingIndicator) obj);
    }

    @NotNull
    /* renamed from: a */
    public TypingIndicatorViewModel m66152a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "typingIndicator");
        return new TypingIndicatorViewModel.TypingIndicator(typingIndicator.m57503a(), typingIndicator.m57504b(), this.f56573a.m66144a(typingIndicator.m57506d()));
    }
}
