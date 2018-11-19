package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.C17545a;
import kotlin.collections.C17554o;
import kotlin.collections.C18453b;
import kotlin.collections.C19299w;
import kotlin.internal.C15814b;
import kotlin.internal.C15815c;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.sequences.C19155k;
import kotlin.text.MatchResult.C15871a;
import kotlin.text.MatchResult.C15872b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.text.f */
final class C17637f implements MatchResult {
    /* renamed from: a */
    private final MatchResult f54825a = this.f54828d.toMatchResult();
    @NotNull
    /* renamed from: b */
    private final MatchGroupCollection f54826b = ((MatchGroupCollection) new C19157b(this));
    /* renamed from: c */
    private List<String> f54827c;
    /* renamed from: d */
    private final Matcher f54828d;
    /* renamed from: e */
    private final CharSequence f54829e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "(Lkotlin/text/MatcherMatchResult;)V", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.text.f$a */
    public static final class C19156a extends C18453b<String> {
        /* renamed from: b */
        final /* synthetic */ C17637f f59358b;

        C19156a(C17637f c17637f) {
            this.f59358b = c17637f;
        }

        /* renamed from: a */
        public int m68048a(String str) {
            return super.indexOf(str);
        }

        /* renamed from: b */
        public int m68050b(String str) {
            return super.lastIndexOf(str);
        }

        /* renamed from: c */
        public boolean m68051c(String str) {
            return super.contains(str);
        }

        public final boolean contains(Object obj) {
            return obj instanceof String ? m68051c((String) obj) : null;
        }

        public /* synthetic */ Object get(int i) {
            return m68049a(i);
        }

        public final int indexOf(Object obj) {
            return obj instanceof String ? m68048a((String) obj) : -1;
        }

        public final int lastIndexOf(Object obj) {
            return obj instanceof String ? m68050b((String) obj) : -1;
        }

        /* renamed from: a */
        public int mo13772a() {
            return this.f59358b.f54825a.groupCount() + 1;
        }

        @NotNull
        /* renamed from: a */
        public String m68049a(int i) {
            i = this.f59358b.f54825a.group(i);
            return i != 0 ? i : "";
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "(Lkotlin/text/MatcherMatchResult;)V", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.text.f$b */
    public static final class C19157b extends C17545a<C15876e> implements MatchNamedGroupCollection {
        /* renamed from: a */
        final /* synthetic */ C17637f f59359a;

        public boolean isEmpty() {
            return false;
        }

        C19157b(C17637f c17637f) {
            this.f59359a = c17637f;
        }

        /* renamed from: a */
        public boolean m68053a(C15876e c15876e) {
            return super.contains(c15876e);
        }

        public final boolean contains(Object obj) {
            return obj != null ? obj instanceof C15876e : true ? m68053a((C15876e) obj) : null;
        }

        /* renamed from: a */
        public int mo13772a() {
            return this.f59359a.f54825a.groupCount() + 1;
        }

        @NotNull
        public Iterator<C15876e> iterator() {
            return C19155k.m68032e(C19299w.m68846r(C17554o.m64196a((Collection) this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
        }

        @Nullable
        public C15876e get(int i) {
            MatchResult a = this.f59359a.f54825a;
            C2668g.a(a, "matchResult");
            C18461c a2 = C15877g.m59933b(a, i);
            if (a2.m66914e().intValue() < 0) {
                return null;
            }
            i = this.f59359a.f54825a.group(i);
            C2668g.a(i, "matchResult.group(index)");
            return new C15876e(i, a2);
        }

        @Nullable
        public C15876e get(@NotNull String str) {
            C2668g.b(str, "name");
            C15814b c15814b = C15815c.f49017a;
            MatchResult a = this.f59359a.f54825a;
            C2668g.a(a, "matchResult");
            return c15814b.m59835a(a, str);
        }
    }

    public C17637f(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        C2668g.b(matcher, "matcher");
        C2668g.b(charSequence, "input");
        this.f54828d = matcher;
        this.f54829e = charSequence;
    }

    @NotNull
    public C15872b getDestructured() {
        return C15871a.m59913a(this);
    }

    @NotNull
    public C18461c getRange() {
        MatchResult matchResult = this.f54825a;
        C2668g.a(matchResult, "matchResult");
        return C15877g.m59932b(matchResult);
    }

    @NotNull
    public String getValue() {
        String group = this.f54825a.group();
        C2668g.a(group, "matchResult.group()");
        return group;
    }

    @NotNull
    public MatchGroupCollection getGroups() {
        return this.f54826b;
    }

    @NotNull
    public List<String> getGroupValues() {
        if (this.f54827c == null) {
            this.f54827c = new C19156a(this);
        }
        List<String> list = this.f54827c;
        if (list == null) {
            C2668g.a();
        }
        return list;
    }

    @Nullable
    public MatchResult next() {
        int end = this.f54825a.end() + (this.f54825a.end() == this.f54825a.start() ? 1 : 0);
        return end <= this.f54829e.length() ? C15877g.m59934b(this.f54828d, end, this.f54829e) : null;
    }
}
