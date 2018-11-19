package com.tinder.reactions.p385c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.message.ReactionSettingsRepository;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/usecase/ChatBubbleSoundSettingCache;", "", "reactionsSettingsRepository", "Lcom/tinder/domain/message/ReactionSettingsRepository;", "(Lcom/tinder/domain/message/ReactionSettingsRepository;)V", "isSoundEnabled", "", "()Z", "setSoundEnabled", "(Z)V", "soundStateSubscription", "Lrx/Subscription;", "startCaching", "", "stopCaching", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.c.a */
public final class C14597a {
    /* renamed from: a */
    private boolean f46072a;
    /* renamed from: b */
    private Subscription f46073b;
    /* renamed from: c */
    private final ReactionSettingsRepository f46074c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSoundEnabled", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.a$a */
    static final class C18682a<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14597a f58159a;

        C18682a(C14597a c14597a) {
            this.f58159a = c14597a;
        }

        public /* synthetic */ void call(Object obj) {
            m67113a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m67113a(Boolean bool) {
            C14597a c14597a = this.f58159a;
            C2668g.a(bool, "isSoundEnabled");
            c14597a.m55690a(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.a$b */
    static final class C18683b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18683b f58160a = new C18683b();

        C18683b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67114a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67114a(Throwable th) {
            C0001a.c(th, "Couldn't cache chat bubble sound state", new Object[0]);
        }
    }

    @Inject
    public C14597a(@NotNull ReactionSettingsRepository reactionSettingsRepository) {
        C2668g.b(reactionSettingsRepository, "reactionsSettingsRepository");
        this.f46074c = reactionSettingsRepository;
    }

    /* renamed from: a */
    public final void m55690a(boolean z) {
        this.f46072a = z;
    }

    /* renamed from: a */
    public final boolean m55691a() {
        return this.f46072a;
    }

    /* renamed from: b */
    public final void m55692b() {
        this.f46073b = this.f46074c.observeChatBubbleSoundState().a(RxUtils.a()).a(new C18682a(this), C18683b.f58160a);
    }

    /* renamed from: c */
    public final void m55693c() {
        RxUtils.b(this.f46073b);
    }
}
