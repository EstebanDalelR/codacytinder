package com.tinder.chat.view.provider;

import android.support.v7.util.DiffUtil.DiffResult;
import com.facebook.ads.AdError;
import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.usecase.ObserveMessages;
import com.tinder.domain.message.usecase.ObserveMessages.Request;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.typingindicator.provider.C15327a;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func4;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cBE\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider;", "", "observeMessages", "Lcom/tinder/domain/message/usecase/ObserveMessages;", "userGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "chatItemsDiffCalculator", "Lcom/tinder/chat/view/provider/ChatItemsDiffCalculator;", "chatItemsBuilderProvider", "Ljavax/inject/Provider;", "Lcom/tinder/chat/view/provider/ChatItemsBuilder;", "config", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$Config;", "chatContextProvider", "Lcom/tinder/chat/view/provider/ChatContextProvider;", "typingIndicatorViewModelProvider", "Lcom/tinder/typingindicator/provider/TypingIndicatorViewModelProvider;", "(Lcom/tinder/domain/message/usecase/ObserveMessages;Lcom/tinder/domain/meta/gateway/MetaGateway;Lcom/tinder/chat/view/provider/ChatItemsDiffCalculator;Ljavax/inject/Provider;Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$Config;Lcom/tinder/chat/view/provider/ChatContextProvider;Lcom/tinder/typingindicator/provider/TypingIndicatorViewModelProvider;)V", "emptyChatItemsUpdate", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$ChatItemsUpdate;", "observeChatUpdatesForMatchId", "Lrx/Observable;", "matchId", "", "observeTypingIndicatorViewModels", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "ChatItemsUpdate", "CombinedChatUpdate", "Config", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.provider.q */
public final class C8514q {
    /* renamed from: a */
    private final C8511a f30252a = new C8511a(C19301m.a(), this.f30255d.m36474a(C19301m.a(), C19301m.a()));
    /* renamed from: b */
    private final ObserveMessages f30253b;
    /* renamed from: c */
    private final MetaGateway f30254c;
    /* renamed from: d */
    private final C8517t f30255d;
    /* renamed from: e */
    private final Provider<C8516r> f30256e;
    /* renamed from: f */
    private final C8513c f30257f;
    /* renamed from: g */
    private final C8506a f30258g;
    /* renamed from: h */
    private final C15327a f30259h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$ChatItemsUpdate;", "", "chatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "(Ljava/util/List;Landroid/support/v7/util/DiffUtil$DiffResult;)V", "getChatItems", "()Ljava/util/List;", "getDiffResult", "()Landroid/support/v7/util/DiffUtil$DiffResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$a */
    public static final class C8511a {
        @NotNull
        /* renamed from: a */
        private final List<ChatItem> f30245a;
        @NotNull
        /* renamed from: b */
        private final DiffResult f30246b;

        @NotNull
        /* renamed from: c */
        public final List<ChatItem> m36460c() {
            return this.f30245a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8511a) {
                    C8511a c8511a = (C8511a) obj;
                    if (C2668g.a(this.f30245a, c8511a.f30245a) && C2668g.a(this.f30246b, c8511a.f30246b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.f30245a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            DiffResult diffResult = this.f30246b;
            if (diffResult != null) {
                i = diffResult.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatItemsUpdate(chatItems=");
            stringBuilder.append(this.f30245a);
            stringBuilder.append(", diffResult=");
            stringBuilder.append(this.f30246b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8511a(@NotNull List<? extends ChatItem> list, @NotNull DiffResult diffResult) {
            C2668g.b(list, "chatItems");
            C2668g.b(diffResult, "diffResult");
            this.f30245a = list;
            this.f30246b = diffResult;
        }

        @NotNull
        /* renamed from: a */
        public final List<ChatItem> m36458a() {
            return this.f30245a;
        }

        @NotNull
        /* renamed from: b */
        public final DiffResult m36459b() {
            return this.f30246b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$CombinedChatUpdate;", "", "messages", "", "Lcom/tinder/domain/message/Message;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "chatContext", "Lcom/tinder/chat/view/model/ChatContext;", "typingIndicatorViewModel", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "(Ljava/util/List;Lcom/tinder/domain/meta/model/CurrentUser;Lcom/tinder/chat/view/model/ChatContext;Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;)V", "getChatContext", "()Lcom/tinder/chat/view/model/ChatContext;", "getCurrentUser", "()Lcom/tinder/domain/meta/model/CurrentUser;", "getMessages", "()Ljava/util/List;", "getTypingIndicatorViewModel", "()Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$b */
    private static final class C8512b {
        @NotNull
        /* renamed from: a */
        private final List<Message> f30247a;
        @NotNull
        /* renamed from: b */
        private final CurrentUser f30248b;
        @NotNull
        /* renamed from: c */
        private final ChatContext f30249c;
        @NotNull
        /* renamed from: d */
        private final TypingIndicatorViewModel f30250d;

        @NotNull
        /* renamed from: a */
        public final List<Message> m36461a() {
            return this.f30247a;
        }

        @NotNull
        /* renamed from: b */
        public final CurrentUser m36462b() {
            return this.f30248b;
        }

        @NotNull
        /* renamed from: c */
        public final ChatContext m36463c() {
            return this.f30249c;
        }

        @NotNull
        /* renamed from: d */
        public final TypingIndicatorViewModel m36464d() {
            return this.f30250d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8512b) {
                    C8512b c8512b = (C8512b) obj;
                    if (C2668g.a(this.f30247a, c8512b.f30247a) && C2668g.a(this.f30248b, c8512b.f30248b) && C2668g.a(this.f30249c, c8512b.f30249c) && C2668g.a(this.f30250d, c8512b.f30250d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.f30247a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            CurrentUser currentUser = this.f30248b;
            hashCode = (hashCode + (currentUser != null ? currentUser.hashCode() : 0)) * 31;
            ChatContext chatContext = this.f30249c;
            hashCode = (hashCode + (chatContext != null ? chatContext.hashCode() : 0)) * 31;
            TypingIndicatorViewModel typingIndicatorViewModel = this.f30250d;
            if (typingIndicatorViewModel != null) {
                i = typingIndicatorViewModel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CombinedChatUpdate(messages=");
            stringBuilder.append(this.f30247a);
            stringBuilder.append(", currentUser=");
            stringBuilder.append(this.f30248b);
            stringBuilder.append(", chatContext=");
            stringBuilder.append(this.f30249c);
            stringBuilder.append(", typingIndicatorViewModel=");
            stringBuilder.append(this.f30250d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8512b(@NotNull List<? extends Message> list, @NotNull CurrentUser currentUser, @NotNull ChatContext chatContext, @NotNull TypingIndicatorViewModel typingIndicatorViewModel) {
            C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
            C2668g.b(currentUser, "currentUser");
            C2668g.b(chatContext, "chatContext");
            C2668g.b(typingIndicatorViewModel, "typingIndicatorViewModel");
            this.f30247a = list;
            this.f30248b = currentUser;
            this.f30249c = chatContext;
            this.f30250d = typingIndicatorViewModel;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$Config;", "", "messagesPageSize", "", "(I)V", "getMessagesPageSize", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$c */
    public static final class C8513c {
        /* renamed from: a */
        private final int f30251a;

        public C8513c() {
            this(0, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8513c) {
                if ((this.f30251a == ((C8513c) obj).f30251a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f30251a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Config(messagesPageSize=");
            stringBuilder.append(this.f30251a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8513c(int i) {
            this.f30251a = i;
        }

        public /* synthetic */ C8513c(int i, int i2, C15823e c15823e) {
            if ((i2 & 1) != 0) {
                i = AdError.NETWORK_ERROR_CODE;
            }
            this(i);
        }

        /* renamed from: a */
        public final int m36465a() {
            return this.f30251a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/ChatItem;", "<name for destructuring parameter 0>", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$CombinedChatUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$d */
    static final class C12764d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8516r f41145a;
        /* renamed from: b */
        final /* synthetic */ String f41146b;

        C12764d(C8516r c8516r, String str) {
            this.f41145a = c8516r;
            this.f41146b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50217a((C8512b) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<ChatItem> m50217a(C8512b c8512b) {
            return this.f41145a.m36473a(c8512b.m36461a(), c8512b.m36462b(), c8512b.m36463c(), this.f41146b, c8512b.m36464d());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$ChatItemsUpdate;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", "newChatItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$e */
    static final class C12765e<T1, T2, R> implements Func2<R, T, R> {
        /* renamed from: a */
        final /* synthetic */ C8514q f41147a;

        C12765e(C8514q c8514q) {
            this.f41147a = c8514q;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m50218a((C8511a) obj, (List) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C8511a m50218a(C8511a c8511a, List<? extends ChatItem> list) {
            c8511a = c8511a.m36460c();
            C2668g.a(list, "newChatItems");
            return new C8511a(list, this.f41147a.f30255d.m36474a(c8511a, list));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t2\u000e\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bH\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$CombinedChatUpdate;", "messages", "", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "chatContext", "Lcom/tinder/chat/view/model/ChatContext;", "typingIndicatorViewModel", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.q$f */
    static final class C12766f<T1, T2, T3, T4, R> implements Func4<T1, T2, T3, T4, R> {
        /* renamed from: a */
        public static final C12766f f41148a = new C12766f();

        C12766f() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3, Object obj4) {
            return m50219a((List) obj, (CurrentUser) obj2, (ChatContext) obj3, (TypingIndicatorViewModel) obj4);
        }

        @NotNull
        /* renamed from: a */
        public final C8512b m50219a(List<? extends Message> list, CurrentUser currentUser, ChatContext chatContext, TypingIndicatorViewModel typingIndicatorViewModel) {
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            C2668g.a(currentUser, "currentUser");
            C2668g.a(chatContext, "chatContext");
            C2668g.a(typingIndicatorViewModel, "typingIndicatorViewModel");
            return new C8512b(list, currentUser, chatContext, typingIndicatorViewModel);
        }
    }

    @Inject
    public C8514q(@NotNull ObserveMessages observeMessages, @NotNull MetaGateway metaGateway, @NotNull C8517t c8517t, @NotNull Provider<C8516r> provider, @NotNull C8513c c8513c, @NotNull C8506a c8506a, @NotNull C15327a c15327a) {
        C2668g.b(observeMessages, "observeMessages");
        C2668g.b(metaGateway, "userGateway");
        C2668g.b(c8517t, "chatItemsDiffCalculator");
        C2668g.b(provider, "chatItemsBuilderProvider");
        C2668g.b(c8513c, "config");
        C2668g.b(c8506a, "chatContextProvider");
        C2668g.b(c15327a, "typingIndicatorViewModelProvider");
        this.f30253b = observeMessages;
        this.f30254c = metaGateway;
        this.f30255d = c8517t;
        this.f30256e = provider;
        this.f30257f = c8513c;
        this.f30258g = c8506a;
        this.f30259h = c15327a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C8511a> m36468a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = Observable.a(this.f30253b.execute(new Request(str, this.f30257f.m36465a())), this.f30254c.observeCurrentUser(), this.f30258g.m36445a(), m36467b(str), C12766f.f41148a).m().k(new C12764d((C8516r) this.f30256e.get(), str)).b(this.f30252a, new C12765e(this)).b(1);
        C2668g.a(str, "messagesWithUserObservab…  })\n            .skip(1)");
        return str;
    }

    /* renamed from: b */
    private final Observable<TypingIndicatorViewModel> m36467b(String str) {
        str = this.f30259h.a(str).p();
        C2668g.a(str, "typingIndicatorViewModel…          .toObservable()");
        return RxJavaInteropExtKt.toV1Observable((ObservableSource) str, BackpressureStrategy.LATEST);
    }
}
