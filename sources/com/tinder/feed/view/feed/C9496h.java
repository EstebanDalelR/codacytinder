package com.tinder.feed.view.feed;

import android.content.Context;
import android.text.format.DateUtils;
import com.tinder.R;
import com.tinder.common.provider.C8550g;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import net.danlew.android.joda.C15881a;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import org.joda.time.format.C19315a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\u0015\u001a\u00020\u0016*\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/feed/FeedTimestampFormatter;", "", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "(Lcom/tinder/common/provider/TodayDateProvider;)V", "formattedDate", "", "context", "Landroid/content/Context;", "timestampInLong", "", "dateTime", "Lorg/joda/time/DateTime;", "formattedDateSendComment", "formattedDayOfMonth", "kotlin.jvm.PlatformType", "timestamp", "formattedDayOfWeek", "formattedDayOfWeekInAMonth", "formattedHourMin12HourClock", "formattedMonthAndDayOfYear", "isWithinAWeekAgo", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.h */
public final class C9496h {
    /* renamed from: a */
    private final C8550g f31813a;

    @Inject
    public C9496h(@NotNull C8550g c8550g) {
        C2668g.b(c8550g, "todayDateProvider");
        this.f31813a = c8550g;
    }

    @NotNull
    /* renamed from: a */
    public final String m39726a(@NotNull Context context, long j) {
        C2668g.b(context, "context");
        return m39720b(context, new DateTime(j));
    }

    @NotNull
    /* renamed from: a */
    public final String m39727a(@NotNull Context context, @NotNull DateTime dateTime) {
        C2668g.b(context, "context");
        C2668g.b(dateTime, "dateTime");
        String c = m39723c(dateTime);
        if (m39721b(dateTime)) {
            context = new StringBuilder();
            context.append("");
            context.append(m39724d(dateTime));
            context.append(' ');
            context.append(c);
            return context.toString();
        }
        context = context.getResources().getString(R.string.feed_at_timestamp, new Object[]{m39725e(dateTime), c});
        C2668g.a(context, "context.resources.getStr…           formattedTime)");
        return context;
    }

    /* renamed from: b */
    private final String m39720b(Context context, DateTime dateTime) {
        String a = m39719a(dateTime);
        if (m39721b(dateTime)) {
            return a;
        }
        a = m39722c(context, dateTime);
        C2668g.a(a, "formattedDayOfMonth");
        return a;
    }

    /* renamed from: a */
    private final String m39719a(DateTime dateTime) {
        long millis = dateTime.getMillis();
        dateTime = this.f31813a.m36535b();
        C2668g.a(dateTime, "todayDateProvider.dateTime");
        return DateUtils.getRelativeTimeSpanString(millis, dateTime.getMillis(), 1000, 2).toString();
    }

    /* renamed from: c */
    private final String m39722c(Context context, DateTime dateTime) {
        return C15881a.a(context, dateTime, 65552);
    }

    /* renamed from: b */
    private final boolean m39721b(@NotNull DateTime dateTime) {
        return dateTime.isAfter(this.f31813a.m36535b().b(Weeks.f14114b));
    }

    /* renamed from: c */
    private final String m39723c(DateTime dateTime) {
        dateTime = C19315a.a("h:mm a").a(dateTime);
        C2668g.a(dateTime, "timePattern.print(dateTime)");
        if (dateTime == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        dateTime = dateTime.toLowerCase();
        C2668g.a(dateTime, "(this as java.lang.String).toLowerCase()");
        return dateTime;
    }

    /* renamed from: d */
    private final String m39724d(DateTime dateTime) {
        dateTime = dateTime.e().a(Locale.getDefault());
        C2668g.a(dateTime, "dayOfWeek.getAsText(Locale.getDefault())");
        return dateTime;
    }

    /* renamed from: e */
    private final String m39725e(DateTime dateTime) {
        String a = dateTime.c().a(Locale.getDefault());
        dateTime = dateTime.d().f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(a);
        stringBuilder.append(' ');
        stringBuilder.append(dateTime);
        return stringBuilder.toString();
    }
}
