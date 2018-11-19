package com.tinder.chat.view.provider;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.injection.scope.ChatActivityScope;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;", "", "()V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$ReactionChatItem;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "", "reactionChatItem", "From", "ReactionChatItem", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
public final class ReactionChatItemClickedProvider {
    /* renamed from: a */
    private final C19785a<C8505a> f30234a = C19785a.w();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$From;", "", "(Ljava/lang/String;I)V", "SENDER", "RECEIVER", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum From {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$ReactionChatItem;", "", "reactionId", "", "from", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$From;", "(Ljava/lang/String;Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$From;)V", "getFrom", "()Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$From;", "getReactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.ReactionChatItemClickedProvider$a */
    public static final class C8505a {
        @NotNull
        /* renamed from: a */
        private final String f30232a;
        @NotNull
        /* renamed from: b */
        private final From f30233b;

        @NotNull
        /* renamed from: a */
        public final String m36437a() {
            return this.f30232a;
        }

        @NotNull
        /* renamed from: b */
        public final From m36438b() {
            return this.f30233b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8505a) {
                    C8505a c8505a = (C8505a) obj;
                    if (C2668g.a(this.f30232a, c8505a.f30232a) && C2668g.a(this.f30233b, c8505a.f30233b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f30232a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            From from = this.f30233b;
            if (from != null) {
                i = from.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ReactionChatItem(reactionId=");
            stringBuilder.append(this.f30232a);
            stringBuilder.append(", from=");
            stringBuilder.append(this.f30233b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8505a(@NotNull String str, @NotNull From from) {
            C2668g.b(str, "reactionId");
            C2668g.b(from, ManagerWebServices.PARAM_FROM);
            this.f30232a = str;
            this.f30233b = from;
        }
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C8505a> m36439a() {
        Observable<C8505a> e = this.f30234a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public final void m36440a(@NotNull C8505a c8505a) {
        C2668g.b(c8505a, "reactionChatItem");
        this.f30234a.onNext(c8505a);
    }
}
