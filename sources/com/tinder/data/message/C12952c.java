package com.tinder.data.message;

import android.support.annotation.NonNull;
import com.tinder.data.message.aq.C10832a;
import com.tinder.data.message.aq.C10834c;
import com.tinder.data.model.MessageModel.Message_viewModel;

/* renamed from: com.tinder.data.message.c */
final class C12952c extends C10832a {
    /* renamed from: a */
    private final C10834c f41487a;
    /* renamed from: b */
    private final long f41488b;

    @NonNull
    public /* synthetic */ Message_viewModel message_view() {
        return m50671a();
    }

    C12952c(C10834c c10834c, long j) {
        if (c10834c == null) {
            throw new NullPointerException("Null message_view");
        }
        this.f41487a = c10834c;
        this.f41488b = j;
    }

    @NonNull
    /* renamed from: a */
    public C10834c m50671a() {
        return this.f41487a;
    }

    public long MAX_sent_date() {
        return this.f41488b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LatestMessage{message_view=");
        stringBuilder.append(this.f41487a);
        stringBuilder.append(", MAX_sent_date=");
        stringBuilder.append(this.f41488b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10832a)) {
            return false;
        }
        C10832a c10832a = (C10832a) obj;
        if (!this.f41487a.equals(c10832a.message_view()) || this.f41488b != c10832a.MAX_sent_date()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) ((this.f41487a.hashCode() ^ 1000003) * 1000003)) ^ ((this.f41488b >>> 32) ^ this.f41488b));
    }
}
