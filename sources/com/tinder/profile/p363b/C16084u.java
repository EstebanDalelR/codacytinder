package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16075g.C14381a;
import com.tinder.profile.p363b.C16075g.C14381a.C14380a;

/* renamed from: com.tinder.profile.b.u */
final class C16084u extends C14381a {
    /* renamed from: a */
    private final Source f50003a;
    /* renamed from: b */
    private final int f50004b;
    /* renamed from: c */
    private final String f50005c;
    /* renamed from: d */
    private final String f50006d;

    /* renamed from: com.tinder.profile.b.u$a */
    static final class C16083a extends C14380a {
        /* renamed from: a */
        private Source f49999a;
        /* renamed from: b */
        private Integer f50000b;
        /* renamed from: c */
        private String f50001c;
        /* renamed from: d */
        private String f50002d;

        C16083a() {
        }

        /* renamed from: a */
        public C14380a mo11565a(Source source) {
            this.f49999a = source;
            return this;
        }

        /* renamed from: a */
        public C14380a mo11564a(int i) {
            this.f50000b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14380a mo11566a(String str) {
            this.f50001c = str;
            return this;
        }

        /* renamed from: b */
        public C14380a mo11568b(String str) {
            this.f50002d = str;
            return this;
        }

        /* renamed from: a */
        public C14381a mo11567a() {
            String str = "";
            if (this.f49999a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (this.f50000b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" from");
                str = stringBuilder.toString();
            }
            if (this.f50001c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.f50002d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" instagramUsername");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16084u(this.f49999a, this.f50000b.intValue(), this.f50001c, this.f50002d);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16084u(Source source, int i, String str, String str2) {
        this.f50003a = source;
        this.f50004b = i;
        this.f50005c = str;
        this.f50006d = str2;
    }

    @NonNull
    /* renamed from: a */
    public Source mo11569a() {
        return this.f50003a;
    }

    @NonNull
    /* renamed from: b */
    public int mo11570b() {
        return this.f50004b;
    }

    @NonNull
    /* renamed from: c */
    public String mo11571c() {
        return this.f50005c;
    }

    @NonNull
    /* renamed from: d */
    public String mo11572d() {
        return this.f50006d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{source=");
        stringBuilder.append(this.f50003a);
        stringBuilder.append(", from=");
        stringBuilder.append(this.f50004b);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f50005c);
        stringBuilder.append(", instagramUsername=");
        stringBuilder.append(this.f50006d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14381a)) {
            return false;
        }
        C14381a c14381a = (C14381a) obj;
        if (!this.f50003a.equals(c14381a.mo11569a()) || this.f50004b != c14381a.mo11570b() || !this.f50005c.equals(c14381a.mo11571c()) || this.f50006d.equals(c14381a.mo11572d()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f50003a.hashCode() ^ 1000003) * 1000003) ^ this.f50004b) * 1000003) ^ this.f50005c.hashCode()) * 1000003) ^ this.f50006d.hashCode();
    }
}
