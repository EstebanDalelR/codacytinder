package com.tinder.data.profile.adapter;

import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.profile.model.AccountInformation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\n \r*\u0004\u0018\u00010\b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/profile/adapter/AccountInformationAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/profile/model/AccountInformation;", "Lcom/tinder/api/model/common/User;", "dateTimeAdapter", "Lcom/tinder/data/adapter/DateTimeApiAdapter;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/data/adapter/DateTimeApiAdapter;Lkotlin/jvm/functions/Function0;)V", "fromApi", "apiModel", "parseDate", "kotlin.jvm.PlatformType", "apiDate", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.a */
public final class C10913a extends C2646o<AccountInformation, User> {
    /* renamed from: a */
    private final C10738l f35615a;
    /* renamed from: b */
    private final Function0<DateTime> f35616b;

    @Inject
    public C10913a(@NotNull C10738l c10738l, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c10738l, "dateTimeAdapter");
        C2668g.b(function0, "dateTimeProvider");
        this.f35615a = c10738l;
        this.f35616b = function0;
    }

    @NotNull
    /* renamed from: a */
    public AccountInformation m43471a(@NotNull User user) {
        C2668g.b(user, "apiModel");
        DateTime a = m43470a(user.createDate());
        C2668g.a(a, "parseDate(apiModel.createDate())");
        String pingTime = user.pingTime();
        DateTime a2 = pingTime != null ? m43470a(pingTime) : null;
        String phoneNumber = user.phoneNumber();
        user = user.photosProcessing();
        if (user == null) {
            user = Boolean.valueOf(null);
        }
        return new AccountInformation(a, a2, phoneNumber, user.booleanValue());
    }

    /* renamed from: a */
    private final DateTime m43470a(String str) {
        if (str != null) {
            str = this.f35615a.m43129a(str);
            if (str != null) {
                return str;
            }
        }
        return ((DateTime) this.f35616b.invoke()).toDateTime();
    }
}
