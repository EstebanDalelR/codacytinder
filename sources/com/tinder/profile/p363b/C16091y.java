package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.profile.p363b.aq.C14375a.C14374a;

/* renamed from: com.tinder.profile.b.y */
final class C16091y extends C14375a {
    /* renamed from: a */
    private final String f50032a;
    /* renamed from: b */
    private final Integer f50033b;
    /* renamed from: c */
    private final String f50034c;

    /* renamed from: com.tinder.profile.b.y$a */
    static final class C16090a extends C14374a {
        /* renamed from: a */
        private String f50029a;
        /* renamed from: b */
        private Integer f50030b;
        /* renamed from: c */
        private String f50031c;

        C16090a() {
        }

        /* renamed from: a */
        public C14374a mo11598a(String str) {
            this.f50029a = str;
            return this;
        }

        /* renamed from: a */
        public C14374a mo11597a(Integer num) {
            this.f50030b = num;
            return this;
        }

        /* renamed from: b */
        public C14374a mo11600b(@Nullable String str) {
            this.f50031c = str;
            return this;
        }

        /* renamed from: a */
        public C14375a mo11599a() {
            String str = "";
            if (this.f50029a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" personId");
                str = stringBuilder.toString();
            }
            if (this.f50030b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" cause");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16091y(this.f50029a, this.f50030b, this.f50031c);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16091y(String str, Integer num, @Nullable String str2) {
        this.f50032a = str;
        this.f50033b = num;
        this.f50034c = str2;
    }

    @NonNull
    /* renamed from: a */
    public String mo11601a() {
        return this.f50032a;
    }

    @NonNull
    /* renamed from: b */
    public Integer mo11602b() {
        return this.f50033b;
    }

    @Nullable
    /* renamed from: c */
    public String mo11603c() {
        return this.f50034c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{personId=");
        stringBuilder.append(this.f50032a);
        stringBuilder.append(", cause=");
        stringBuilder.append(this.f50033b);
        stringBuilder.append(", text=");
        stringBuilder.append(this.f50034c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14375a)) {
            return false;
        }
        C14375a c14375a = (C14375a) obj;
        if (this.f50032a.equals(c14375a.mo11601a()) && this.f50033b.equals(c14375a.mo11602b())) {
            if (this.f50034c == null) {
                if (c14375a.mo11603c() == null) {
                    return z;
                }
            } else if (this.f50034c.equals(c14375a.mo11603c()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((this.f50032a.hashCode() ^ 1000003) * 1000003) ^ this.f50033b.hashCode()) * 1000003) ^ (this.f50034c == null ? 0 : this.f50034c.hashCode());
    }
}
