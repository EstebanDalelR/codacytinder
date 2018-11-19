package com.tinder.core.experiment;

import java.util.Map;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007\b\u0007¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/tinder/core/experiment/CanIGetYoEmailExperimentProvider;", "Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;", "Lcom/tinder/core/experiment/CanIGetYoEmailExperimentProvider$Variant;", "()V", "control", "getControl", "()Lcom/tinder/core/experiment/CanIGetYoEmailExperimentProvider$Variant;", "experimentName", "", "getExperimentName", "()Ljava/lang/String;", "targetedCountries", "", "getTargetedCountries", "()Ljava/util/Set;", "variants", "", "", "getVariants", "()Ljava/util/Map;", "Variant", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CanIGetYoEmailExperimentProvider implements AuthExperimentDetailsProvider<Variant> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/core/experiment/CanIGetYoEmailExperimentProvider$Variant;", "", "analyticsName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsName", "()Ljava/lang/String;", "CONTROL", "VARIANT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Variant {
        ;
        
        @NotNull
        private final String analyticsName;

        protected Variant(String str) {
            C2668g.b(str, "analyticsName");
            this.analyticsName = str;
        }

        @NotNull
        public final String getAnalyticsName() {
            return this.analyticsName;
        }
    }

    @NotNull
    public String getExperimentName() {
        return "YouGotMail";
    }

    public /* synthetic */ Object getControl() {
        return m43041a();
    }

    @NotNull
    public Map<Variant, Integer> getVariants() {
        return ae.a(new Pair[]{C15811g.a(Variant.VARIANT, Integer.valueOf(4)), C15811g.a(Variant.CONTROL, Integer.valueOf(12))});
    }

    @NotNull
    public Set<String> getTargetedCountries() {
        return ak.a();
    }

    @NotNull
    /* renamed from: a */
    public Variant m43041a() {
        return Variant.CONTROL;
    }
}
