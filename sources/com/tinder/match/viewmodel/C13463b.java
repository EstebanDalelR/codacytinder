package com.tinder.match.viewmodel;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.match.viewmodel.C12099h.C12098a;
import com.tinder.match.viewmodel.MatchListItemViewModel.Builder;
import java.util.List;

/* renamed from: com.tinder.match.viewmodel.b */
final class C13463b extends C12099h {
    /* renamed from: a */
    private final String f42701a;
    /* renamed from: b */
    private final String f42702b;
    /* renamed from: c */
    private final Attribution f42703c;
    /* renamed from: d */
    private final List<String> f42704d;
    /* renamed from: e */
    private final Match f42705e;
    /* renamed from: f */
    private final boolean f42706f;
    /* renamed from: g */
    private final boolean f42707g;
    /* renamed from: h */
    private final boolean f42708h;
    /* renamed from: i */
    private final String f42709i;

    /* renamed from: com.tinder.match.viewmodel.b$a */
    static final class C13462a extends C12098a {
        /* renamed from: a */
        private String f42692a;
        /* renamed from: b */
        private String f42693b;
        /* renamed from: c */
        private Attribution f42694c;
        /* renamed from: d */
        private List<String> f42695d;
        /* renamed from: e */
        private Match f42696e;
        /* renamed from: f */
        private Boolean f42697f;
        /* renamed from: g */
        private Boolean f42698g;
        /* renamed from: h */
        private Boolean f42699h;
        /* renamed from: i */
        private String f42700i;

        public /* synthetic */ MatchListItemViewModel build() {
            return mo11182a();
        }

        public /* synthetic */ Builder hasInteractedWithView(boolean z) {
            return m51996a(z);
        }

        public /* synthetic */ Builder id(String str) {
            return m51994a(str);
        }

        public /* synthetic */ Builder imageUrls(List list) {
            return m51995a(list);
        }

        public /* synthetic */ Builder isMuted(boolean z) {
            return m51999b(z);
        }

        public /* synthetic */ Builder match(Match match) {
            return m51993a(match);
        }

        public /* synthetic */ Builder matchAttribution(Attribution attribution) {
            return m51992a(attribution);
        }

        public /* synthetic */ Builder name(String str) {
            return m51998b(str);
        }

        C13462a() {
        }

        /* renamed from: a */
        public C12098a m51994a(String str) {
            this.f42692a = str;
            return this;
        }

        /* renamed from: b */
        public C12098a m51998b(String str) {
            this.f42693b = str;
            return this;
        }

        /* renamed from: a */
        public C12098a m51992a(Attribution attribution) {
            this.f42694c = attribution;
            return this;
        }

        /* renamed from: a */
        public C12098a m51995a(List<String> list) {
            this.f42695d = list;
            return this;
        }

        /* renamed from: a */
        public C12098a m51993a(Match match) {
            this.f42696e = match;
            return this;
        }

        /* renamed from: a */
        public C12098a m51996a(boolean z) {
            this.f42697f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C12098a m51999b(boolean z) {
            this.f42698g = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C12098a mo11184c(boolean z) {
            this.f42699h = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C12098a mo11183c(String str) {
            this.f42700i = str;
            return this;
        }

        /* renamed from: a */
        public C12099h mo11182a() {
            String str = "";
            if (this.f42692a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.f42693b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.f42694c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" matchAttribution");
                str = stringBuilder.toString();
            }
            if (this.f42695d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" imageUrls");
                str = stringBuilder.toString();
            }
            if (this.f42696e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" match");
                str = stringBuilder.toString();
            }
            if (this.f42697f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hasInteractedWithView");
                str = stringBuilder.toString();
            }
            if (this.f42698g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isMuted");
                str = stringBuilder.toString();
            }
            if (this.f42699h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isLatestMessageFromMatch");
                str = stringBuilder.toString();
            }
            if (this.f42700i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" latestMessage");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C13463b(this.f42692a, this.f42693b, this.f42694c, this.f42695d, this.f42696e, this.f42697f.booleanValue(), this.f42698g.booleanValue(), this.f42699h.booleanValue(), this.f42700i);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C13463b(String str, String str2, Attribution attribution, List<String> list, Match match, boolean z, boolean z2, boolean z3, String str3) {
        this.f42701a = str;
        this.f42702b = str2;
        this.f42703c = attribution;
        this.f42704d = list;
        this.f42705e = match;
        this.f42706f = z;
        this.f42707g = z2;
        this.f42708h = z3;
        this.f42709i = str3;
    }

    /* renamed from: a */
    public String mo11192a() {
        return this.f42701a;
    }

    /* renamed from: b */
    public String mo11193b() {
        return this.f42702b;
    }

    /* renamed from: c */
    public Attribution mo11194c() {
        return this.f42703c;
    }

    /* renamed from: d */
    public List<String> mo11195d() {
        return this.f42704d;
    }

    /* renamed from: e */
    public Match mo11196e() {
        return this.f42705e;
    }

    /* renamed from: f */
    public boolean mo11197f() {
        return this.f42706f;
    }

    /* renamed from: g */
    public boolean mo11198g() {
        return this.f42707g;
    }

    /* renamed from: h */
    public boolean mo11199h() {
        return this.f42708h;
    }

    /* renamed from: i */
    public String mo11200i() {
        return this.f42709i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchMessageViewModel{id=");
        stringBuilder.append(this.f42701a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f42702b);
        stringBuilder.append(", matchAttribution=");
        stringBuilder.append(this.f42703c);
        stringBuilder.append(", imageUrls=");
        stringBuilder.append(this.f42704d);
        stringBuilder.append(", match=");
        stringBuilder.append(this.f42705e);
        stringBuilder.append(", hasInteractedWithView=");
        stringBuilder.append(this.f42706f);
        stringBuilder.append(", isMuted=");
        stringBuilder.append(this.f42707g);
        stringBuilder.append(", isLatestMessageFromMatch=");
        stringBuilder.append(this.f42708h);
        stringBuilder.append(", latestMessage=");
        stringBuilder.append(this.f42709i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12099h)) {
            return false;
        }
        C12099h c12099h = (C12099h) obj;
        if (!this.f42701a.equals(c12099h.mo11192a()) || !this.f42702b.equals(c12099h.mo11193b()) || !this.f42703c.equals(c12099h.mo11194c()) || !this.f42704d.equals(c12099h.mo11195d()) || !this.f42705e.equals(c12099h.mo11196e()) || this.f42706f != c12099h.mo11197f() || this.f42707g != c12099h.mo11198g() || this.f42708h != c12099h.mo11199h() || this.f42709i.equals(c12099h.mo11200i()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.f42701a.hashCode() ^ 1000003) * 1000003) ^ this.f42702b.hashCode()) * 1000003) ^ this.f42703c.hashCode()) * 1000003) ^ this.f42704d.hashCode()) * 1000003) ^ this.f42705e.hashCode()) * 1000003) ^ (this.f42706f ? 1231 : 1237)) * 1000003) ^ (this.f42707g ? 1231 : 1237)) * 1000003;
        if (this.f42708h) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f42709i.hashCode();
    }
}
