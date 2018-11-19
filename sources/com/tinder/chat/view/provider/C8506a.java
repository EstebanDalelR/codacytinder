package com.tinder.chat.view.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.model.C12750s;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.domain.match.usecase.GetMatch;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/tinder/chat/view/provider/ChatContextProvider;", "", "matchId", "", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "matchToChatMatchContext", "Lcom/tinder/chat/view/model/MatchToChatMatchContext;", "(Ljava/lang/String;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/chat/view/model/MatchToChatMatchContext;)V", "sharedObservable", "Lrx/Observable;", "Lcom/tinder/chat/view/model/ChatContext;", "getSharedObservable", "()Lrx/Observable;", "sharedObservable$delegate", "Lkotlin/Lazy;", "observeChatContext", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.a */
public final class C8506a {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30235a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C8506a.class), "sharedObservable", "getSharedObservable()Lrx/Observable;"))};
    /* renamed from: b */
    private final Lazy f30236b = C18451c.a((Function0) new ChatContextProvider$sharedObservable$2(this));
    /* renamed from: c */
    private final String f30237c;
    /* renamed from: d */
    private final GetMatch f30238d;
    /* renamed from: e */
    private final C12750s f30239e;

    /* renamed from: b */
    private final Observable<ChatContext> m36443b() {
        Lazy lazy = this.f30236b;
        KProperty kProperty = f30235a[0];
        return (Observable) lazy.getValue();
    }

    @Inject
    public C8506a(@NotNull String str, @NotNull GetMatch getMatch, @NotNull C12750s c12750s) {
        C2668g.b(str, "matchId");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c12750s, "matchToChatMatchContext");
        this.f30237c = str;
        this.f30238d = getMatch;
        this.f30239e = c12750s;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<ChatContext> m36445a() {
        return m36443b();
    }
}
