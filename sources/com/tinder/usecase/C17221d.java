package com.tinder.usecase;

import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.profile.model.Tutorial.Select;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.managers.bk;
import io.reactivex.C3956a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/usecase/ConfirmSelectTutorial;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/managers/ManagerSharedPreferences;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.d */
public final class C17221d implements SimpleVoidUseCase {
    /* renamed from: a */
    private final ConfirmTutorialsViewed f52797a;
    /* renamed from: b */
    private final bk f52798b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.d$a */
    static final class C17219a<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C17221d f52795a;

        C17219a(C17221d c17221d) {
            this.f52795a = c17221d;
        }

        public /* synthetic */ void accept(Object obj) {
            m63109a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m63109a(Disposable disposable) {
            this.f52795a.f52798b.E(false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.d$b */
    static final class C17220b implements Action {
        /* renamed from: a */
        public static final C17220b f52796a = new C17220b();

        C17220b() {
        }

        public final void run() {
        }
    }

    @Inject
    public C17221d(@NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull bk bkVar) {
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(bkVar, "sharedPreferences");
        this.f52797a = confirmTutorialsViewed;
        this.f52798b = bkVar;
    }

    public void execute() {
        C3956a b = this.f52797a.execute(Select.INSTANCE).b(new C17219a(this)).b(C15756a.m59010b());
        Action action = C17220b.f52796a;
        Function1 function1 = ConfirmSelectTutorial$execute$3.f59425a;
        if (function1 != null) {
            function1 = new C17222e(function1);
        }
        b.a(action, (Consumer) function1);
    }
}
