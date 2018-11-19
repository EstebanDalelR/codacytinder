package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlin/text/MatchResult;", "", "destructured", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "Destructured", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
public interface MatchResult {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: kotlin.text.MatchResult$a */
    public static final class C15871a {
        @NotNull
        /* renamed from: a */
        public static C15872b m59913a(MatchResult matchResult) {
            return new C15872b(matchResult);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\nJ\t\u0010\t\u001a\u00020\bH\nJ\t\u0010\n\u001a\u00020\bH\nJ\t\u0010\u000b\u001a\u00020\bH\nJ\t\u0010\f\u001a\u00020\bH\nJ\t\u0010\r\u001a\u00020\bH\nJ\t\u0010\u000e\u001a\u00020\bH\nJ\t\u0010\u000f\u001a\u00020\bH\nJ\t\u0010\u0010\u001a\u00020\bH\nJ\t\u0010\u0011\u001a\u00020\bH\nJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "match", "Lkotlin/text/MatchResult;", "(Lkotlin/text/MatchResult;)V", "getMatch", "()Lkotlin/text/MatchResult;", "component1", "", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "toList", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.text.MatchResult$b */
    public static final class C15872b {
        @NotNull
        /* renamed from: a */
        private final MatchResult f49047a;

        public C15872b(@NotNull MatchResult matchResult) {
            C2668g.b(matchResult, "match");
            this.f49047a = matchResult;
        }

        @NotNull
        /* renamed from: a */
        public final MatchResult m59914a() {
            return this.f49047a;
        }
    }

    @NotNull
    C15872b getDestructured();

    @NotNull
    List<String> getGroupValues();

    @NotNull
    MatchGroupCollection getGroups();

    @NotNull
    C18461c getRange();

    @NotNull
    String getValue();

    @Nullable
    MatchResult next();
}
