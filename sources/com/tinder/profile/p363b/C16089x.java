package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16082r.C14391a;
import com.tinder.profile.p363b.C16082r.C14391a.C14390a;

/* renamed from: com.tinder.profile.b.x */
final class C16089x extends C14391a {
    /* renamed from: a */
    private final Source f50025a;
    /* renamed from: b */
    private final int f50026b;
    /* renamed from: c */
    private final String f50027c;
    /* renamed from: d */
    private final String f50028d;

    /* renamed from: com.tinder.profile.b.x$a */
    static final class C16088a extends C14390a {
        /* renamed from: a */
        private Source f50021a;
        /* renamed from: b */
        private Integer f50022b;
        /* renamed from: c */
        private String f50023c;
        /* renamed from: d */
        private String f50024d;

        C16088a() {
        }

        /* renamed from: a */
        public C14390a mo11589a(Source source) {
            this.f50021a = source;
            return this;
        }

        /* renamed from: a */
        public C14390a mo11588a(int i) {
            this.f50022b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14390a mo11590a(String str) {
            this.f50023c = str;
            return this;
        }

        /* renamed from: b */
        public C14390a mo11592b(String str) {
            this.f50024d = str;
            return this;
        }

        /* renamed from: a */
        public C14391a mo11591a() {
            String str = "";
            if (this.f50021a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (this.f50022b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photoIndex");
                str = stringBuilder.toString();
            }
            if (this.f50023c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.f50024d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" instagramUsername");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16089x(this.f50021a, this.f50022b.intValue(), this.f50023c, this.f50024d);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16089x(Source source, int i, String str, String str2) {
        this.f50025a = source;
        this.f50026b = i;
        this.f50027c = str;
        this.f50028d = str2;
    }

    @NonNull
    /* renamed from: a */
    public Source mo11593a() {
        return this.f50025a;
    }

    @NonNull
    /* renamed from: b */
    public int mo11594b() {
        return this.f50026b;
    }

    @NonNull
    /* renamed from: c */
    public String mo11595c() {
        return this.f50027c;
    }

    @NonNull
    /* renamed from: d */
    public String mo11596d() {
        return this.f50028d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{source=");
        stringBuilder.append(this.f50025a);
        stringBuilder.append(", photoIndex=");
        stringBuilder.append(this.f50026b);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f50027c);
        stringBuilder.append(", instagramUsername=");
        stringBuilder.append(this.f50028d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14391a)) {
            return false;
        }
        C14391a c14391a = (C14391a) obj;
        if (!this.f50025a.equals(c14391a.mo11593a()) || this.f50026b != c14391a.mo11594b() || !this.f50027c.equals(c14391a.mo11595c()) || this.f50028d.equals(c14391a.mo11596d()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f50025a.hashCode() ^ 1000003) * 1000003) ^ this.f50026b) * 1000003) ^ this.f50027c.hashCode()) * 1000003) ^ this.f50028d.hashCode();
    }
}
