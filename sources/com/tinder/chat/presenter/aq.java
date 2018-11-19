package com.tinder.chat.presenter;

import com.tinder.chat.target.TypingIndicatorItemTarget;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.chat.view.provider.C8506a;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/tinder/chat/presenter/TypingIndicatorItemPresenter;", "", "chatContextProvider", "Lcom/tinder/chat/view/provider/ChatContextProvider;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "(Lcom/tinder/chat/view/provider/ChatContextProvider;Lcom/tinder/common/reactivex/schedulers/Schedulers;)V", "matchAvatarUrlSubscription", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/chat/target/TypingIndicatorItemTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/TypingIndicatorItemTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/TypingIndicatorItemTarget;)V", "drop", "", "drop$Tinder_release", "loadMatchAvatar", "loadMatchAvatar$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aq {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TypingIndicatorItemTarget f30022a;
    /* renamed from: b */
    private Disposable f30023b;
    /* renamed from: c */
    private final C8506a f30024c;
    /* renamed from: d */
    private final Schedulers f30025d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chatContext", "Lcom/tinder/chat/view/model/ChatContext;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.aq$a */
    static final class C10545a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10545a f34290a = new C10545a();

        C10545a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42638a((ChatContext) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m42638a(@NotNull ChatContext chatContext) {
            C2668g.b(chatContext, "chatContext");
            return (String) C19301m.f(chatContext.getAvatarUrls());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.aq$b */
    static final class C10546b<T> implements Consumer<String> {
        /* renamed from: a */
        final /* synthetic */ aq f34291a;

        C10546b(aq aqVar) {
            this.f34291a = aqVar;
        }

        public /* synthetic */ void accept(Object obj) {
            m42639a((String) obj);
        }

        /* renamed from: a */
        public final void m42639a(String str) {
            TypingIndicatorItemTarget a = this.f34291a.m36108a();
            C2668g.a(str, "url");
            a.bindAvatar(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.aq$c */
    static final class C10547c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10547c f34292a = new C10547c();

        C10547c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42640a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42640a(Throwable th) {
            C0001a.c(th, "Failed to get match avatar url for typing indicator", new Object[0]);
        }
    }

    @Inject
    public aq(@NotNull C8506a c8506a, @NotNull Schedulers schedulers) {
        C2668g.b(c8506a, "chatContextProvider");
        C2668g.b(schedulers, "schedulers");
        this.f30024c = c8506a;
        this.f30025d = schedulers;
    }

    @NotNull
    /* renamed from: a */
    public final TypingIndicatorItemTarget m36108a() {
        TypingIndicatorItemTarget typingIndicatorItemTarget = this.f30022a;
        if (typingIndicatorItemTarget == null) {
            C2668g.b("target");
        }
        return typingIndicatorItemTarget;
    }

    @Take
    /* renamed from: b */
    public final void m36109b() {
        this.f30023b = RxJavaInteropExtKt.toV2Observable(this.f30024c.m36445a()).map(C10545a.f34290a).subscribeOn(this.f30025d.io()).observeOn(this.f30025d.mainThread()).subscribe(new C10546b(this), C10547c.f34292a);
    }

    @Drop
    /* renamed from: c */
    public final void m36110c() {
        Disposable disposable = this.f30023b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
