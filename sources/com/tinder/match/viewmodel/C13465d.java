package com.tinder.match.viewmodel;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.match.viewmodel.C12102k.C12101a;
import com.tinder.match.viewmodel.MatchListItemViewModel.Builder;
import java.util.List;

/* renamed from: com.tinder.match.viewmodel.d */
final class C13465d extends C12102k {
    /* renamed from: a */
    private final String f42717a;
    /* renamed from: b */
    private final String f42718b;
    /* renamed from: c */
    private final Attribution f42719c;
    /* renamed from: d */
    private final List<String> f42720d;
    /* renamed from: e */
    private final Match f42721e;
    /* renamed from: f */
    private final boolean f42722f;
    /* renamed from: g */
    private final boolean f42723g;

    /* renamed from: com.tinder.match.viewmodel.d$a */
    static final class C13464a extends C12101a {
        /* renamed from: a */
        private String f42710a;
        /* renamed from: b */
        private String f42711b;
        /* renamed from: c */
        private Attribution f42712c;
        /* renamed from: d */
        private List<String> f42713d;
        /* renamed from: e */
        private Match f42714e;
        /* renamed from: f */
        private Boolean f42715f;
        /* renamed from: g */
        private Boolean f42716g;

        public /* synthetic */ MatchListItemViewModel build() {
            return mo11201a();
        }

        public /* synthetic */ Builder hasInteractedWithView(boolean z) {
            return m52015a(z);
        }

        public /* synthetic */ Builder id(String str) {
            return m52013a(str);
        }

        public /* synthetic */ Builder imageUrls(List list) {
            return m52014a(list);
        }

        public /* synthetic */ Builder isMuted(boolean z) {
            return m52018b(z);
        }

        public /* synthetic */ Builder match(Match match) {
            return m52012a(match);
        }

        public /* synthetic */ Builder matchAttribution(Attribution attribution) {
            return m52011a(attribution);
        }

        public /* synthetic */ Builder name(String str) {
            return m52017b(str);
        }

        C13464a() {
        }

        /* renamed from: a */
        public C12101a m52013a(String str) {
            this.f42710a = str;
            return this;
        }

        /* renamed from: b */
        public C12101a m52017b(String str) {
            this.f42711b = str;
            return this;
        }

        /* renamed from: a */
        public C12101a m52011a(Attribution attribution) {
            this.f42712c = attribution;
            return this;
        }

        /* renamed from: a */
        public C12101a m52014a(List<String> list) {
            this.f42713d = list;
            return this;
        }

        /* renamed from: a */
        public C12101a m52012a(Match match) {
            this.f42714e = match;
            return this;
        }

        /* renamed from: a */
        public C12101a m52015a(boolean z) {
            this.f42715f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C12101a m52018b(boolean z) {
            this.f42716g = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C12102k mo11201a() {
            String str = "";
            if (this.f42710a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.f42711b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.f42712c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" matchAttribution");
                str = stringBuilder.toString();
            }
            if (this.f42713d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" imageUrls");
                str = stringBuilder.toString();
            }
            if (this.f42714e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" match");
                str = stringBuilder.toString();
            }
            if (this.f42715f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hasInteractedWithView");
                str = stringBuilder.toString();
            }
            if (this.f42716g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isMuted");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C13465d(this.f42710a, this.f42711b, this.f42712c, this.f42713d, this.f42714e, this.f42715f.booleanValue(), this.f42716g.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C13465d(String str, String str2, Attribution attribution, List<String> list, Match match, boolean z, boolean z2) {
        this.f42717a = str;
        this.f42718b = str2;
        this.f42719c = attribution;
        this.f42720d = list;
        this.f42721e = match;
        this.f42722f = z;
        this.f42723g = z2;
    }

    /* renamed from: a */
    public String mo11192a() {
        return this.f42717a;
    }

    /* renamed from: b */
    public String mo11193b() {
        return this.f42718b;
    }

    /* renamed from: c */
    public Attribution mo11194c() {
        return this.f42719c;
    }

    /* renamed from: d */
    public List<String> mo11195d() {
        return this.f42720d;
    }

    /* renamed from: e */
    public Match mo11196e() {
        return this.f42721e;
    }

    /* renamed from: f */
    public boolean mo11197f() {
        return this.f42722f;
    }

    /* renamed from: g */
    public boolean mo11198g() {
        return this.f42723g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NewMatchViewModel{id=");
        stringBuilder.append(this.f42717a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f42718b);
        stringBuilder.append(", matchAttribution=");
        stringBuilder.append(this.f42719c);
        stringBuilder.append(", imageUrls=");
        stringBuilder.append(this.f42720d);
        stringBuilder.append(", match=");
        stringBuilder.append(this.f42721e);
        stringBuilder.append(", hasInteractedWithView=");
        stringBuilder.append(this.f42722f);
        stringBuilder.append(", isMuted=");
        stringBuilder.append(this.f42723g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12102k)) {
            return false;
        }
        C12102k c12102k = (C12102k) obj;
        if (!this.f42717a.equals(c12102k.mo11192a()) || !this.f42718b.equals(c12102k.mo11193b()) || !this.f42719c.equals(c12102k.mo11194c()) || !this.f42720d.equals(c12102k.mo11195d()) || !this.f42721e.equals(c12102k.mo11196e()) || this.f42722f != c12102k.mo11197f() || this.f42723g != c12102k.mo11198g()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.f42717a.hashCode() ^ 1000003) * 1000003) ^ this.f42718b.hashCode()) * 1000003) ^ this.f42719c.hashCode()) * 1000003) ^ this.f42720d.hashCode()) * 1000003) ^ this.f42721e.hashCode()) * 1000003) ^ (this.f42722f ? 1231 : 1237)) * 1000003;
        if (this.f42723g) {
            i = 1231;
        }
        return hashCode ^ i;
    }
}
