package com.tinder.feed.view.message;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/view/message/ComposerStatus;", "", "feedItemId", "", "(Ljava/lang/String;)V", "getFeedItemId", "()Ljava/lang/String;", "Closed", "Open", "Lcom/tinder/feed/view/message/ComposerStatus$Closed;", "Lcom/tinder/feed/view/message/ComposerStatus$Open;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.message.a */
public abstract class C9533a {
    @NotNull
    /* renamed from: a */
    private final String f31899a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/feed/view/message/ComposerStatus$Closed;", "Lcom/tinder/feed/view/message/ComposerStatus;", "feedItemId", "", "(Ljava/lang/String;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.a$a */
    public static final class C11762a extends C9533a {
        public C11762a(@NotNull String str) {
            C2668g.b(str, "feedItemId");
            super(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/feed/view/message/ComposerStatus$Open;", "Lcom/tinder/feed/view/message/ComposerStatus;", "feedItemId", "", "(Ljava/lang/String;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.message.a$b */
    public static final class C11763b extends C9533a {
        public C11763b(@NotNull String str) {
            C2668g.b(str, "feedItemId");
            super(str);
        }
    }

    private C9533a(String str) {
        this.f31899a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m39788a() {
        return this.f31899a;
    }
}
