package com.tinder.profiletab.presenter;

import com.tinder.domain.profile.model.Tutorial;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileTabPresenter$confirmTutorialsViewed$1 extends Lambda implements Function1<Throwable, C15813i> {
    /* renamed from: a */
    final /* synthetic */ Tutorial f58010a;

    ProfileTabPresenter$confirmTutorialsViewed$1(Tutorial tutorial) {
        this.f58010a = tutorial;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67058a((Throwable) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67058a(@NotNull Throwable th) {
        C2668g.b(th, "it");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error executing ConfirmTutorialsViewed for tutorial ");
        stringBuilder.append(this.f58010a);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }
}
