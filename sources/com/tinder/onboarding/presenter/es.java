package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import com.tinder.onboarding.target.OnboardingDateWidgetTarget;
import com.tinder.onboarding.view.DateWidgetDateValidator;
import com.tinder.onboarding.viewmodel.C10005a;
import com.tinder.onboarding.viewmodel.C10009b;
import com.tinder.onboarding.viewmodel.DateField;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java.util.Locale;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.LocalDate;

@ActivityScope
public class es extends PresenterBase<OnboardingDateWidgetTarget> {
    @NonNull
    /* renamed from: a */
    private final DateWidgetDateValidator f43178a;

    @Inject
    public es(@NonNull DateWidgetDateValidator dateWidgetDateValidator) {
        this.f43178a = dateWidgetDateValidator;
    }

    /* renamed from: a */
    public void m52803a(@NonNull C10009b c10009b) {
        OnboardingDateWidgetTarget onboardingDateWidgetTarget = (OnboardingDateWidgetTarget) H();
        if (onboardingDateWidgetTarget != null) {
            onboardingDateWidgetTarget.setDateFormat(c10009b);
            onboardingDateWidgetTarget.reorderFieldViewsByDateFormat();
        }
    }

    /* renamed from: a */
    public void m52805a(@NonNull LocalDate localDate) {
        OnboardingDateWidgetTarget onboardingDateWidgetTarget = (OnboardingDateWidgetTarget) H();
        if (onboardingDateWidgetTarget != null) {
            onboardingDateWidgetTarget.showDay(String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(localDate.f())}));
            onboardingDateWidgetTarget.showMonth(String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(localDate.e())}));
            onboardingDateWidgetTarget.showYear(String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(localDate.d())}));
        }
    }

    /* renamed from: a */
    public void m52804a(@NonNull String str, int i, int i2) {
        OnboardingDateWidgetTarget onboardingDateWidgetTarget = (OnboardingDateWidgetTarget) H();
        if (onboardingDateWidgetTarget != null) {
            if (str.isEmpty() == null) {
                onboardingDateWidgetTarget.clearFieldValue(i, i2);
            } else if (i2 > 0) {
                onboardingDateWidgetTarget.clearFieldValue(i, i2 - 1);
            } else if (i2 == 0 && i > 0) {
                onboardingDateWidgetTarget.clearFieldLastValue(i - 1);
            }
        }
    }

    /* renamed from: a */
    public void m52801a(int i, int i2, @NonNull DateField dateField, @NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3, C10009b c10009b) {
        if (this.f43178a.validateDate(dateField, c10005a, c10005a2, c10005a3, c10009b) == null) {
            a(new ev(i, i2));
        } else if (m52797a(dateField, c10005a, c10005a2, c10005a3) != null) {
            a(new et(i));
        } else {
            a(new eu(i, i2));
        }
    }

    /* renamed from: a */
    public void m52802a(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3) {
        OnboardingDateWidgetTarget onboardingDateWidgetTarget = (OnboardingDateWidgetTarget) H();
        if (onboardingDateWidgetTarget != null) {
            if (m52799b(c10005a, c10005a2, c10005a3)) {
                onboardingDateWidgetTarget.notifyFieldComplete(Optional.a(m52800c(c10005a, c10005a2, c10005a3)));
            } else {
                onboardingDateWidgetTarget.notifyFieldIncomplete();
            }
        }
    }

    /* renamed from: a */
    private boolean m52797a(@NonNull DateField dateField, @NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3) {
        switch (dateField) {
            case DAY_OF_MONTH:
                return c10005a.m41011c();
            case MONTH:
                return c10005a2.m41011c();
            case YEAR:
                return c10005a3.m41011c();
            default:
                return null;
        }
    }

    /* renamed from: b */
    private boolean m52799b(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3) {
        return (c10005a.m41011c() == null || c10005a2.m41011c() == null || c10005a3.m41011c() == null) ? null : true;
    }

    /* renamed from: c */
    private LocalDate m52800c(@NonNull C10005a c10005a, @NonNull C10005a c10005a2, @NonNull C10005a c10005a3) {
        c10005a = c10005a.m41010b();
        return new LocalDate(c10005a3.m41010b(), c10005a2.m41010b(), c10005a);
    }
}
