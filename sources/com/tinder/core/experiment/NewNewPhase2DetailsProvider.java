package com.tinder.core.experiment;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007\b\u0007¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider;", "Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "()V", "control", "getControl", "()Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "experimentName", "", "getExperimentName", "()Ljava/lang/String;", "targetedCountries", "", "getTargetedCountries", "()Ljava/util/Set;", "variants", "", "", "getVariants", "()Ljava/util/Map;", "Variant", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NewNewPhase2DetailsProvider implements AuthExperimentDetailsProvider<Variant> {
    @NotNull
    /* renamed from: a */
    private final String f35064a;
    @NotNull
    /* renamed from: b */
    private final Map<Variant, Integer> f35065b;
    @NotNull
    /* renamed from: c */
    private final Set<String> f35066c;
    @NotNull
    /* renamed from: d */
    private final Variant f35067d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "CONTROL", "REMOVE_NATIVE", "PROFILE_COMPLETENESS", "SWIPE_COVERAGE", "ALL_VARIANTS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Variant {
        ;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant$ALL_VARIANTS;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        static final class ALL_VARIANTS extends Variant {
            ALL_VARIANTS(String str, int i) {
                super(str, i);
            }

            @NotNull
            public C8596l getExperiment(@NotNull C8596l c8596l) {
                C2668g.b(c8596l, "leanplumExperiment");
                return new C8596l(c8596l.m36692a(), c8596l.m36693b(), c8596l.m36694c(), c8596l.m36695d(), false);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant$CONTROL;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        static final class CONTROL extends Variant {
            CONTROL(String str, int i) {
                super(str, i);
            }

            @NotNull
            public C8596l getExperiment(@NotNull C8596l c8596l) {
                C2668g.b(c8596l, "leanplumExperiment");
                return new C8596l(false, false, false, false, false);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant$PROFILE_COMPLETENESS;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        static final class PROFILE_COMPLETENESS extends Variant {
            PROFILE_COMPLETENESS(String str, int i) {
                super(str, i);
            }

            @NotNull
            public C8596l getExperiment(@NotNull C8596l c8596l) {
                C2668g.b(c8596l, "leanplumExperiment");
                return new C8596l(c8596l.m36692a(), false, false, false, false);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant$REMOVE_NATIVE;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        static final class REMOVE_NATIVE extends Variant {
            REMOVE_NATIVE(String str, int i) {
                super(str, i);
            }

            @NotNull
            public C8596l getExperiment(@NotNull C8596l c8596l) {
                C2668g.b(c8596l, "leanplumExperiment");
                return new C8596l(false, false, false, c8596l.m36695d(), false);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant$SWIPE_COVERAGE;", "Lcom/tinder/core/experiment/NewNewPhase2DetailsProvider$Variant;", "(Ljava/lang/String;I)V", "getExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "leanplumExperiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        static final class SWIPE_COVERAGE extends Variant {
            SWIPE_COVERAGE(String str, int i) {
                super(str, i);
            }

            @NotNull
            public C8596l getExperiment(@NotNull C8596l c8596l) {
                C2668g.b(c8596l, "leanplumExperiment");
                return new C8596l(false, c8596l.m36693b(), c8596l.m36694c(), false, false);
            }
        }

        @NotNull
        public abstract C8596l getExperiment(@NotNull C8596l c8596l);
    }

    public /* synthetic */ Object getControl() {
        return m43042a();
    }

    @NotNull
    public String getExperimentName() {
        return this.f35064a;
    }

    @NotNull
    public Map<Variant, Integer> getVariants() {
        return this.f35065b;
    }

    @NotNull
    public Set<String> getTargetedCountries() {
        return this.f35066c;
    }

    @NotNull
    /* renamed from: a */
    public Variant m43042a() {
        return this.f35067d;
    }
}
