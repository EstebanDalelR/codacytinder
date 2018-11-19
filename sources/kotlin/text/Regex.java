package kotlin.text;

import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.C18456j;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020+H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
public final class Regex implements Serializable {
    /* renamed from: a */
    public static final C15874a f49051a = new C15874a();
    /* renamed from: b */
    private final Pattern f49052b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    private static final class Serialized implements Serializable {
        /* renamed from: a */
        public static final C15873a f49048a = new C15873a();
        private static final long serialVersionUID = 0;
        @NotNull
        /* renamed from: b */
        private final String f49049b;
        /* renamed from: c */
        private final int f49050c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C15873a {
            private C15873a() {
            }
        }

        public Serialized(@NotNull String str, int i) {
            C2668g.b(str, "pattern");
            this.f49049b = str;
            this.f49050c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f49049b, this.f49050c);
            C2668g.a(compile, "Pattern.compile(pattern, flags)");
            return new Regex(compile);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.text.Regex$a */
    public static final class C15874a {
        /* renamed from: a */
        private final int m59915a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        private C15874a() {
        }

        @NotNull
        /* renamed from: a */
        public final Regex m59917a(@NotNull String str) {
            C2668g.b(str, "literal");
            return new Regex(str, RegexOption.LITERAL);
        }
    }

    @Nullable
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ MatchResult m59918a(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m59920a(charSequence, i);
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern) {
        C2668g.b(pattern, "nativePattern");
        this.f49052b = pattern;
    }

    public Regex(@NotNull String str) {
        C2668g.b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C2668g.a(compile, "Pattern.compile(pattern)");
        this(compile);
    }

    public Regex(@NotNull String str, @NotNull RegexOption regexOption) {
        C2668g.b(str, "pattern");
        C2668g.b(regexOption, "option");
        Pattern compile = Pattern.compile(str, f49051a.m59915a((int) regexOption.getValue()));
        C2668g.a(compile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(compile);
    }

    /* renamed from: a */
    public final boolean m59921a(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "input");
        return this.f49052b.matcher(charSequence).matches();
    }

    @Nullable
    /* renamed from: a */
    public final MatchResult m59920a(@NotNull CharSequence charSequence, int i) {
        C2668g.b(charSequence, "input");
        Matcher matcher = this.f49052b.matcher(charSequence);
        C2668g.a(matcher, "nativePattern.matcher(input)");
        return C15877g.m59934b(matcher, i, charSequence);
    }

    @Nullable
    /* renamed from: b */
    public final MatchResult m59923b(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "input");
        Matcher matcher = this.f49052b.matcher(charSequence);
        C2668g.a(matcher, "nativePattern.matcher(input)");
        return C15877g.m59935b(matcher, charSequence);
    }

    @NotNull
    /* renamed from: a */
    public final String m59919a(@NotNull CharSequence charSequence, @NotNull String str) {
        C2668g.b(charSequence, "input");
        C2668g.b(str, "replacement");
        charSequence = this.f49052b.matcher(charSequence).replaceAll(str);
        C2668g.a(charSequence, "nativePattern.matcher(in…).replaceAll(replacement)");
        return charSequence;
    }

    @NotNull
    /* renamed from: b */
    public final List<String> m59922b(@NotNull CharSequence charSequence, int i) {
        C2668g.b(charSequence, "input");
        if ((i >= 0 ? 1 : null) == null) {
            charSequence = new StringBuilder();
            charSequence.append("Limit must be non-negative, but was ");
            charSequence.append(i);
            charSequence.append(46);
            throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
        }
        Pattern pattern = this.f49052b;
        if (i == 0) {
            i = -1;
        }
        charSequence = pattern.split(charSequence, i);
        C2668g.a(charSequence, "nativePattern.split(inpu…imit == 0) -1 else limit)");
        return C18456j.m66903a((Object[]) charSequence);
    }

    @NotNull
    public String toString() {
        String pattern = this.f49052b.toString();
        C2668g.a(pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f49052b.pattern();
        C2668g.a(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.f49052b.flags());
    }
}
