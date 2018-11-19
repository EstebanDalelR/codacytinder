package com.tinder.chat.view.message;

import android.content.Context;
import android.text.format.DateUtils;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.provider.C8550g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import net.danlew.android.joda.C15881a;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.Weeks;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "(Lcom/tinder/common/provider/TodayDateProvider;)V", "formattedDateAndTime", "Lcom/tinder/chat/view/message/MessageTimestampFormatter$FormattedDateAndTime;", "context", "Landroid/content/Context;", "timestamp", "Lorg/joda/time/DateTime;", "formattedDayOfMonth", "", "kotlin.jvm.PlatformType", "formattedDayOfWeek", "formattedTime", "isWithinAWeekAgo", "", "FormattedDateAndTime", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.message.z */
public final class C8490z {
    /* renamed from: a */
    private final C8550g f30192a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/chat/view/message/MessageTimestampFormatter$FormattedDateAndTime;", "", "date", "", "time", "separator", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getSeparator", "getTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.z$a */
    public static final class C8489a {
        @NotNull
        /* renamed from: a */
        private final String f30189a;
        @NotNull
        /* renamed from: b */
        private final String f30190b;
        @NotNull
        /* renamed from: c */
        private final String f30191c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8489a) {
                    C8489a c8489a = (C8489a) obj;
                    if (C2668g.a(this.f30189a, c8489a.f30189a) && C2668g.a(this.f30190b, c8489a.f30190b) && C2668g.a(this.f30191c, c8489a.f30191c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f30189a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f30190b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f30191c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FormattedDateAndTime(date=");
            stringBuilder.append(this.f30189a);
            stringBuilder.append(", time=");
            stringBuilder.append(this.f30190b);
            stringBuilder.append(", separator=");
            stringBuilder.append(this.f30191c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8489a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            C2668g.b(str, ManagerWebServices.PARAM_DATE);
            C2668g.b(str2, "time");
            C2668g.b(str3, "separator");
            this.f30189a = str;
            this.f30190b = str2;
            this.f30191c = str3;
        }

        @NotNull
        /* renamed from: a */
        public final String m36335a() {
            return this.f30189a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36336b() {
            return this.f30190b;
        }

        @NotNull
        /* renamed from: c */
        public final String m36337c() {
            return this.f30191c;
        }
    }

    @Inject
    public C8490z(@NotNull C8550g c8550g) {
        C2668g.b(c8550g, "todayDateProvider");
        this.f30192a = c8550g;
    }

    @NotNull
    /* renamed from: a */
    public final C8489a m36342a(@NotNull Context context, @NotNull DateTime dateTime) {
        C2668g.b(context, "context");
        C2668g.b(dateTime, "timestamp");
        String b = m36339b(context, dateTime);
        String c = m36340c(context, dateTime);
        if (m36338a(dateTime)) {
            C2668g.a(c, "formattedTime");
            return new C8489a(b, c, " ");
        }
        context = m36341d(context, dateTime);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(b);
        stringBuilder.append(", ");
        stringBuilder.append(context);
        context = stringBuilder.toString();
        C2668g.a(c, "formattedTime");
        return new C8489a(context, c, ", ");
    }

    /* renamed from: b */
    private final String m36339b(Context context, DateTime dateTime) {
        ReadableInstant readableInstant = dateTime;
        if (C15881a.a(readableInstant)) {
            long millis = dateTime.getMillis();
            context = this.f30192a.m36535b();
            C2668g.a(context, "todayDateProvider.dateTime");
            return DateUtils.getRelativeTimeSpanString(millis, context.getMillis(), 86400000, 2).toString();
        }
        context = C15881a.a(context, readableInstant, m36338a(dateTime) != null ? 2 : 32770);
        C2668g.a(context, "DateUtils.formatDateTime…Y)\n                    })");
        return context;
    }

    /* renamed from: c */
    private final String m36340c(Context context, DateTime dateTime) {
        return C15881a.a(context, dateTime, 1);
    }

    /* renamed from: d */
    private final String m36341d(Context context, DateTime dateTime) {
        return C15881a.a(context, dateTime, 65552);
    }

    /* renamed from: a */
    private final boolean m36338a(@NotNull DateTime dateTime) {
        return dateTime.isAfter(this.f30192a.m36535b().b(Weeks.f14114b));
    }
}
