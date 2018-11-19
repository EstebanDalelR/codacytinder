package com.tinder.chat.view.action;

import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "", "showMenu", "", "info", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$MenuContextualInfo;", "MenuContextualInfo", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ChatContextualMenuDisplayAction {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;", "", "(Ljava/lang/String;I)V", "INBOUND_TEXT_MESSAGE", "OUTBOUND_TEXT_MESSAGE", "INBOUND_GIF_MESSAGE", "OUTBOUND_GIF_MESSAGE", "INBOUND_REACTION_MESSAGE", "OUTBOUND_REACTION_MESSAGE", "INBOUND_ACTIVITY_MESSAGE", "OUTBOUND_ACTIVITY_MESSAGE", "INBOUND_IMAGE_MESSAGE", "OUTBOUND_IMAGE_MESSAGE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$MenuContextualInfo;", "", "messageId", "", "messageText", "type", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "contentSource", "contentUrl", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "()Z", "getMessageId", "getMessageIndex", "()I", "getMessageText", "getType", "()Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.ChatContextualMenuDisplayAction$a */
    public static final class C8455a {
        @NotNull
        /* renamed from: a */
        private final String f30102a;
        @NotNull
        /* renamed from: b */
        private final String f30103b;
        @NotNull
        /* renamed from: c */
        private final Type f30104c;
        /* renamed from: d */
        private final boolean f30105d;
        /* renamed from: e */
        private final int f30106e;
        @NotNull
        /* renamed from: f */
        private final String f30107f;
        /* renamed from: g */
        private final boolean f30108g;
        @Nullable
        /* renamed from: h */
        private final String f30109h;
        @Nullable
        /* renamed from: i */
        private final String f30110i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8455a) {
                C8455a c8455a = (C8455a) obj;
                if (C2668g.a(this.f30102a, c8455a.f30102a) && C2668g.a(this.f30103b, c8455a.f30103b) && C2668g.a(this.f30104c, c8455a.f30104c)) {
                    if ((this.f30105d == c8455a.f30105d ? 1 : null) != null) {
                        if ((this.f30106e == c8455a.f30106e ? 1 : null) != null && C2668g.a(this.f30107f, c8455a.f30107f)) {
                            return (this.f30108g == c8455a.f30108g ? 1 : null) != null && C2668g.a(this.f30109h, c8455a.f30109h) && C2668g.a(this.f30110i, c8455a.f30110i);
                        }
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f30102a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f30103b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Type type = this.f30104c;
            hashCode = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
            int i2 = this.f30105d;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (((hashCode + i2) * 31) + this.f30106e) * 31;
            str2 = this.f30107f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            i2 = this.f30108g;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            str2 = this.f30109h;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30110i;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MenuContextualInfo(messageId=");
            stringBuilder.append(this.f30102a);
            stringBuilder.append(", messageText=");
            stringBuilder.append(this.f30103b);
            stringBuilder.append(", type=");
            stringBuilder.append(this.f30104c);
            stringBuilder.append(", isFailed=");
            stringBuilder.append(this.f30105d);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f30106e);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f30107f);
            stringBuilder.append(", isLiked=");
            stringBuilder.append(this.f30108g);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f30109h);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f30110i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8455a(@NotNull String str, @NotNull String str2, @NotNull Type type, boolean z, int i, @NotNull String str3, boolean z2, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "messageId");
            C2668g.b(str2, "messageText");
            C2668g.b(type, "type");
            C2668g.b(str3, "contentId");
            this.f30102a = str;
            this.f30103b = str2;
            this.f30104c = type;
            this.f30105d = z;
            this.f30106e = i;
            this.f30107f = str3;
            this.f30108g = z2;
            this.f30109h = str4;
            this.f30110i = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m36182a() {
            return this.f30102a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36183b() {
            return this.f30103b;
        }

        @NotNull
        /* renamed from: c */
        public final Type m36184c() {
            return this.f30104c;
        }

        /* renamed from: d */
        public final boolean m36185d() {
            return this.f30105d;
        }

        /* renamed from: e */
        public final int m36186e() {
            return this.f30106e;
        }

        @NotNull
        /* renamed from: f */
        public final String m36187f() {
            return this.f30107f;
        }

        /* renamed from: g */
        public final boolean m36188g() {
            return this.f30108g;
        }

        public /* synthetic */ C8455a(String str, String str2, Type type, boolean z, int i, String str3, boolean z2, String str4, String str5, int i2, C15823e c15823e) {
            int i3 = i2;
            this(str, str2, type, (i3 & 8) != 0 ? false : z, i, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? false : z2, (i3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? (String) null : str4, (i3 & 256) != 0 ? (String) null : str5);
        }

        @Nullable
        /* renamed from: h */
        public final String m36189h() {
            return this.f30109h;
        }

        @Nullable
        /* renamed from: i */
        public final String m36190i() {
            return this.f30110i;
        }
    }

    void showMenu(@NotNull C8455a c8455a);
}
