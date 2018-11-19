package com.tinder;

import android.os.CountDownTimer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.C19315a;
import org.joda.time.format.C19316b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/GoldCountdownTimer;", "Landroid/os/CountDownTimer;", "millisToFinish", "", "timerUpdater", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "formattedString", "", "(JLkotlin/jvm/functions/Function1;)V", "formatter", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "onFinish", "onTick", "tickTimeInMillis", "gold_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.a */
public final class C6149a extends CountDownTimer {
    /* renamed from: a */
    private final C19316b f22653a = C19315a.a("HH:mm:ss");
    /* renamed from: b */
    private final Function1<String, C15813i> f22654b;

    public void onFinish() {
    }

    public C6149a(long j, @NotNull Function1<? super String, C15813i> function1) {
        C2668g.b(function1, "timerUpdater");
        super(j, 1000);
        this.f22654b = function1;
    }

    public void onTick(long j) {
        Function1 function1 = this.f22654b;
        j = this.f22653a.a(new DateTime(j).a(DateTimeZone.f8461a));
        C2668g.a(j, "formatter.print(DateTime…thZone(DateTimeZone.UTC))");
        function1.invoke(j);
    }
}
