package com.tinder.application;

import com.tinder.chat.activity.ChatActivity;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.chat.injection.components.ChatActivitySubcomponent.Builder;
import com.tinder.chat.injection.p188a.C8440a;
import com.tinder.reactions.p382a.p383a.C14578a;
import dagger.internal.C15521i;

final class a$f implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33516a;
    /* renamed from: b */
    private C8440a f33517b;
    /* renamed from: c */
    private C14578a f33518c;
    /* renamed from: d */
    private String f33519d;
    /* renamed from: e */
    private ChatActivity f33520e;

    private a$f(C4423a c4423a) {
        this.f33516a = c4423a;
    }

    public /* synthetic */ Builder chatActivity(ChatActivity chatActivity) {
        return m41811a(chatActivity);
    }

    public /* synthetic */ Builder matchId(String str) {
        return m41812a(str);
    }

    public ChatActivitySubcomponent build() {
        if (this.f33517b == null) {
            this.f33517b = new C8440a();
        }
        if (this.f33518c == null) {
            this.f33518c = new C14578a();
        }
        StringBuilder stringBuilder;
        if (this.f33519d == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f33520e != null) {
            return new a$g(this.f33516a, this, null);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(ChatActivity.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public a$f m41812a(String str) {
        this.f33519d = (String) C15521i.a(str);
        return this;
    }

    /* renamed from: a */
    public a$f m41811a(ChatActivity chatActivity) {
        this.f33520e = (ChatActivity) C15521i.a(chatActivity);
        return this;
    }
}
