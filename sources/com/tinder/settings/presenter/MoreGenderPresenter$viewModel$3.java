package com.tinder.settings.presenter;

import com.tinder.domain.common.model.Gender;
import com.tinder.settings.presenter.C18075n.C14898a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/tinder/settings/presenter/MoreGenderPresenter$ViewModel;", "p1", "Lcom/tinder/domain/common/model/Gender;", "Lkotlin/ParameterName;", "name", "gender", "p2", "", "showGenderOnProfile", "invoke"}, k = 3, mv = {1, 1, 10})
final class MoreGenderPresenter$viewModel$3 extends FunctionReference implements Function2<Gender, Boolean, C14898a> {
    /* renamed from: a */
    public static final MoreGenderPresenter$viewModel$3 f59402a = new MoreGenderPresenter$viewModel$3();

    MoreGenderPresenter$viewModel$3() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14898a.class);
    }

    public final String getSignature() {
        return "<init>(Lcom/tinder/domain/common/model/Gender;Z)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m68125a((Gender) obj, ((Boolean) obj2).booleanValue());
    }

    @NotNull
    /* renamed from: a */
    public final C14898a m68125a(@NotNull Gender gender, boolean z) {
        C2668g.b(gender, "p1");
        return new C14898a(gender, z);
    }
}
