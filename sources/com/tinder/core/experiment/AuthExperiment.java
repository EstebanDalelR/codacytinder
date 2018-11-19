package com.tinder.core.experiment;

import com.tinder.common.provider.C2643c;
import com.tinder.common.provider.C8550g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002#$B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\u0010\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/tinder/core/experiment/AuthExperiment;", "VARIANT", "", "timelineProvider", "Lcom/tinder/core/experiment/AuthExperiment$AuthExperimentTimelineProvider;", "detailsProvider", "Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;", "localeProvider", "Lcom/tinder/common/provider/DefaultLocaleProvider;", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "deviceVariantMapper", "Lcom/tinder/core/experiment/DeviceVariantMapper;", "(Lcom/tinder/core/experiment/AuthExperiment$AuthExperimentTimelineProvider;Lcom/tinder/core/experiment/AuthExperimentDetailsProvider;Lcom/tinder/common/provider/DefaultLocaleProvider;Lcom/tinder/common/provider/TodayDateProvider;Lcom/tinder/core/experiment/DeviceVariantMapper;)V", "ended", "", "()Z", "experimentName", "", "getExperimentName", "()Ljava/lang/String;", "isInTargetedCountries", "started", "timeLine", "Lcom/tinder/core/experiment/AuthExperiment$ExperimentTimeline;", "getTimeLine", "()Lcom/tinder/core/experiment/AuthExperiment$ExperimentTimeline;", "todayDateTime", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "getTodayDateTime", "()Lorg/joda/time/DateTime;", "userVariant", "getUserVariant", "()Ljava/lang/Object;", "AuthExperimentTimelineProvider", "ExperimentTimeline", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AuthExperiment<VARIANT> {
    @NotNull
    /* renamed from: a */
    private final String f30355a = this.f30357c.getExperimentName();
    /* renamed from: b */
    private final AuthExperimentTimelineProvider f30356b;
    /* renamed from: c */
    private final AuthExperimentDetailsProvider<VARIANT> f30357c;
    /* renamed from: d */
    private final C2643c f30358d;
    /* renamed from: e */
    private final C8550g f30359e;
    /* renamed from: f */
    private final C8593g<VARIANT> f30360f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/core/experiment/AuthExperiment$AuthExperimentTimelineProvider;", "", "get", "Lcom/tinder/core/experiment/AuthExperiment$ExperimentTimeline;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface AuthExperimentTimelineProvider {
        @NotNull
        C8591a get();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tinder/core/experiment/AuthExperiment$ExperimentTimeline;", "", "startDateTime", "Lorg/joda/time/DateTime;", "endDateTime", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getEndDateTime", "()Lorg/joda/time/DateTime;", "getStartDateTime", "component1", "component2", "copy", "equals", "", "other", "hasEnded", "dateTime", "hasStarted", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.core.experiment.AuthExperiment$a */
    public static final class C8591a {
        @NotNull
        /* renamed from: a */
        private final DateTime f30353a;
        @NotNull
        /* renamed from: b */
        private final DateTime f30354b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8591a) {
                    C8591a c8591a = (C8591a) obj;
                    if (C2668g.a(this.f30353a, c8591a.f30353a) && C2668g.a(this.f30354b, c8591a.f30354b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            DateTime dateTime = this.f30353a;
            int i = 0;
            int hashCode = (dateTime != null ? dateTime.hashCode() : 0) * 31;
            DateTime dateTime2 = this.f30354b;
            if (dateTime2 != null) {
                i = dateTime2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ExperimentTimeline(startDateTime=");
            stringBuilder.append(this.f30353a);
            stringBuilder.append(", endDateTime=");
            stringBuilder.append(this.f30354b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8591a(@NotNull DateTime dateTime, @NotNull DateTime dateTime2) {
            C2668g.b(dateTime, "startDateTime");
            C2668g.b(dateTime2, "endDateTime");
            this.f30353a = dateTime;
            this.f30354b = dateTime2;
        }

        /* renamed from: a */
        public final boolean m36623a(@NotNull DateTime dateTime) {
            C2668g.b(dateTime, "dateTime");
            return dateTime.isAfter(this.f30353a);
        }

        /* renamed from: b */
        public final boolean m36624b(@NotNull DateTime dateTime) {
            C2668g.b(dateTime, "dateTime");
            return dateTime.isAfter(this.f30354b);
        }
    }

    @Inject
    public AuthExperiment(@NotNull AuthExperimentTimelineProvider authExperimentTimelineProvider, @NotNull AuthExperimentDetailsProvider<VARIANT> authExperimentDetailsProvider, @NotNull C2643c c2643c, @NotNull C8550g c8550g, @NotNull C8593g<VARIANT> c8593g) {
        C2668g.b(authExperimentTimelineProvider, "timelineProvider");
        C2668g.b(authExperimentDetailsProvider, "detailsProvider");
        C2668g.b(c2643c, "localeProvider");
        C2668g.b(c8550g, "todayDateProvider");
        C2668g.b(c8593g, "deviceVariantMapper");
        this.f30356b = authExperimentTimelineProvider;
        this.f30357c = authExperimentDetailsProvider;
        this.f30358d = c2643c;
        this.f30359e = c8550g;
        this.f30360f = c8593g;
    }

    /* renamed from: e */
    private final C8591a m36625e() {
        return this.f30356b.get();
    }

    /* renamed from: f */
    private final DateTime m36626f() {
        return this.f30359e.m36535b();
    }

    /* renamed from: a */
    public final boolean m36627a() {
        if (this.f30357c.getTargetedCountries().isEmpty()) {
            return true;
        }
        return this.f30357c.getTargetedCountries().contains(this.f30358d.a().getCountry());
    }

    @JvmName(name = "started")
    /* renamed from: b */
    public final boolean m36628b() {
        C8591a e = m36625e();
        DateTime f = m36626f();
        C2668g.a(f, "todayDateTime");
        return e.m36623a(f);
    }

    @JvmName(name = "ended")
    /* renamed from: c */
    public final boolean m36629c() {
        C8591a e = m36625e();
        DateTime f = m36626f();
        C2668g.a(f, "todayDateTime");
        return e.m36624b(f);
    }

    /* renamed from: d */
    public final VARIANT m36630d() {
        if (m36627a() && m36628b() && !m36629c()) {
            return this.f30360f.m36685a(this.f30357c);
        }
        return this.f30357c.getControl();
    }
}
