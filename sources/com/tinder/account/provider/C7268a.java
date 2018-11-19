package com.tinder.account.provider;

import android.support.annotation.NonNull;
import com.tinder.managers.bk;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.LocalDate;

/* renamed from: com.tinder.account.provider.a */
public class C7268a implements UpdateAccountPasswordLastShownDateProvider {
    @NonNull
    /* renamed from: a */
    private final bk f26167a;

    @Inject
    public C7268a(@NonNull bk bkVar) {
        this.f26167a = bkVar;
    }

    public Optional<LocalDate> lastShownDate() {
        return this.f26167a.ab();
    }

    public void updateLastShownDate(@NonNull LocalDate localDate) {
        this.f26167a.a(localDate);
    }
}
