package com.tinder.typingindicator.provider;

import com.tinder.typingindicator.p440f.C18258l;
import com.tinder.typingindicator.usecase.C17183m;
import com.tinder.typingindicator.usecase.C17183m.C15330a;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.C17191a;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/typingindicator/provider/TypingIndicatorViewModelProvider;", "", "observeTypingIndicator", "Lcom/tinder/typingindicator/usecase/ObserveTypingIndicator;", "typingIndicatorToTypingIndicatorViewModel", "Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToTypingIndicatorViewModel;", "(Lcom/tinder/typingindicator/usecase/ObserveTypingIndicator;Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToTypingIndicatorViewModel;)V", "observe", "Lio/reactivex/Flowable;", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "matchId", "", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.provider.a */
public final class C15327a {
    /* renamed from: a */
    private final C17183m f47539a;
    /* renamed from: b */
    private final C18258l f47540b;

    @Inject
    public C15327a(@NotNull C17183m c17183m, @NotNull C18258l c18258l) {
        C2668g.b(c17183m, "observeTypingIndicator");
        C2668g.b(c18258l, "typingIndicatorToTypingIndicatorViewModel");
        this.f47539a = c17183m;
        this.f47540b = c18258l;
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<TypingIndicatorViewModel> m57510a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f47539a.m63053a(new C15330a(str)).f(new C17164b(new TypingIndicatorViewModelProvider$observe$1(this.f47540b))).c(C17191a.f52755a).d();
        C2668g.a(str, "observeTypingIndicator\n …  .distinctUntilChanged()");
        return str;
    }
}
