package com.tinder.data.message;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.message.aq.C10833b;
import com.tinder.data.message.aq.C10834c;
import com.tinder.data.model.GifModel;
import com.tinder.data.model.MessageModel;
import com.tinder.data.model.ReactionModel;

/* renamed from: com.tinder.data.message.e */
final class C12954e extends C10834c {
    /* renamed from: a */
    private final C10833b f41500a;
    /* renamed from: b */
    private final C10835f f41501b;
    /* renamed from: c */
    private final az f41502c;

    @Nullable
    public /* synthetic */ GifModel gif() {
        return m50673b();
    }

    @NonNull
    public /* synthetic */ MessageModel message() {
        return m50672a();
    }

    @Nullable
    public /* synthetic */ ReactionModel reaction() {
        return m50674c();
    }

    C12954e(C10833b c10833b, @Nullable C10835f c10835f, @Nullable az azVar) {
        if (c10833b == null) {
            throw new NullPointerException("Null message");
        }
        this.f41500a = c10833b;
        this.f41501b = c10835f;
        this.f41502c = azVar;
    }

    @NonNull
    /* renamed from: a */
    public C10833b m50672a() {
        return this.f41500a;
    }

    @Nullable
    /* renamed from: b */
    public C10835f m50673b() {
        return this.f41501b;
    }

    @Nullable
    /* renamed from: c */
    public az m50674c() {
        return this.f41502c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageView{message=");
        stringBuilder.append(this.f41500a);
        stringBuilder.append(", gif=");
        stringBuilder.append(this.f41501b);
        stringBuilder.append(", reaction=");
        stringBuilder.append(this.f41502c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.data.message.aq.C10834c;
        r2 = 0;
        if (r1 == 0) goto L_0x0048;
    L_0x0009:
        r5 = (com.tinder.data.message.aq.C10834c) r5;
        r1 = r4.f41500a;
        r3 = r5.message();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x0017:
        r1 = r4.f41501b;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.gif();
        if (r1 != 0) goto L_0x0046;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.f41501b;
        r3 = r5.gif();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x002e:
        r1 = r4.f41502c;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r5 = r5.reaction();
        if (r5 != 0) goto L_0x0046;
    L_0x0038:
        goto L_0x0047;
    L_0x0039:
        r1 = r4.f41502c;
        r5 = r5.reaction();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0047;
    L_0x0046:
        r0 = 0;
    L_0x0047:
        return r0;
    L_0x0048:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((this.f41500a.hashCode() ^ 1000003) * 1000003) ^ (this.f41501b == null ? 0 : this.f41501b.hashCode())) * 1000003;
        if (this.f41502c != null) {
            i = this.f41502c.hashCode();
        }
        return hashCode ^ i;
    }
}
