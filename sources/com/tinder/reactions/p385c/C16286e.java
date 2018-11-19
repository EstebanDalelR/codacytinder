package com.tinder.reactions.p385c;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.listeners.ListenerSimple;
import com.tinder.managers.bk;
import com.tinder.managers.bm;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.CompletableEmitter;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/usecase/ConfirmTinderReactionsIntroTutorial;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "managerTutorials", "Lcom/tinder/managers/ManagerTutorials;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/managers/ManagerTutorials;Lcom/tinder/managers/ManagerSharedPreferences;)V", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.c.e */
public final class C16286e implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final bm f50707a;
    /* renamed from: b */
    private final bk f50708b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/CompletableEmitter;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.e$a */
    static final class C18684a<T> implements Action1<CompletableEmitter> {
        /* renamed from: a */
        final /* synthetic */ C16286e f58161a;

        C18684a(C16286e c16286e) {
            this.f58161a = c16286e;
        }

        public /* synthetic */ void call(Object obj) {
            m67115a((CompletableEmitter) obj);
        }

        /* renamed from: a */
        public final void m67115a(final CompletableEmitter completableEmitter) {
            this.f58161a.f50708b.G(true);
            this.f58161a.f50707a.a(ManagerWebServices.PARAM_TUTORIAL_REACTIONS_INTRO, new ListenerSimple() {
                public void onSuccess() {
                    completableEmitter.onCompleted();
                }

                public void onFailure() {
                    completableEmitter.onError(new Exception("Failed to confirm reactions intro tutorial"));
                }
            });
        }
    }

    @Inject
    public C16286e(@NotNull bm bmVar, @NotNull bk bkVar) {
        C2668g.b(bmVar, "managerTutorials");
        C2668g.b(bkVar, "sharedPreferences");
        this.f50707a = bmVar;
        this.f50708b = bkVar;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new C18684a(this));
        C2668g.a(a, "Completable.fromEmitter …\n            })\n        }");
        return a;
    }
}
