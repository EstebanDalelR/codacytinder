package com.tinder.messageads.p350g;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.repository.MessageAdSettingsRepository;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/messageads/usecase/SaveMessageAdMatchSettings;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "messageAdSettingsRepository", "Lcom/tinder/messageads/repository/MessageAdSettingsRepository;", "(Lcom/tinder/messageads/repository/MessageAdSettingsRepository;)V", "execute", "", "request", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.g.c */
public final class C12130c implements VoidUseCase<C9912b> {
    /* renamed from: a */
    private final MessageAdSettingsRepository f39353a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.g.c$a */
    static final class C12128a implements Action {
        /* renamed from: a */
        public static final C12128a f39351a = new C12128a();

        C12128a() {
        }

        public final void run() {
            C0001a.b("MessageAdMatchSettings successfully saved to MessageAdSettingsRepository.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.g.c$b */
    static final class C12129b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12129b f39352a = new C12129b();

        C12129b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48269a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48269a(Throwable th) {
            C0001a.c(th, "Failed to save MessageAdMatchSettings to MessageAdSettingsRepository.", new Object[0]);
        }
    }

    @Inject
    public C12130c(@NotNull MessageAdSettingsRepository messageAdSettingsRepository) {
        C2668g.b(messageAdSettingsRepository, "messageAdSettingsRepository");
        this.f39353a = messageAdSettingsRepository;
    }

    public /* synthetic */ void execute(Object obj) {
        m48270a((C9912b) obj);
    }

    /* renamed from: a */
    public void m48270a(@NotNull C9912b c9912b) {
        C2668g.b(c9912b, "request");
        this.f39353a.save(c9912b).b(C15756a.b()).a(C12128a.f39351a, C12129b.f39352a);
    }
}
