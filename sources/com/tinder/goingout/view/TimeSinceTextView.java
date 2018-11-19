package com.tinder.goingout.view;

import android.support.annotation.NonNull;
import butterknife.BindString;
import butterknife.ButterKnife;
import com.tinder.goingout.p357a.C13319a;
import com.tinder.goingout.target.TimeSinceTextViewTarget;
import com.tinder.model.DefaultObserver;
import com.tinder.utils.DateUtils;
import com.tinder.views.CustomTextView;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import rx.Subscription;

public class TimeSinceTextView extends CustomTextView implements TimeSinceTextViewTarget {
    @Inject
    /* renamed from: a */
    C13319a f44456a;
    /* renamed from: b */
    private Subscription f44457b;
    @BindString(2131821182)
    String mHoursAgo;
    @BindString(2131821387)
    String mMinutesAgo;

    /* renamed from: com.tinder.goingout.view.TimeSinceTextView$1 */
    class C133221 extends DefaultObserver<Long> {
        /* renamed from: a */
        final /* synthetic */ TimeSinceTextView f42270a;

        C133221(TimeSinceTextView timeSinceTextView) {
            this.f42270a = timeSinceTextView;
        }

        public /* synthetic */ void onNext(Object obj) {
            m51558a((Long) obj);
        }

        /* renamed from: a */
        public void m51558a(Long l) {
            this.f42270a.incrementMinutes(l.intValue());
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44456a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44456a.a();
    }

    public void setStartTime(@NonNull String str) {
        long c = DateUtils.c(str);
        long b = DateUtils.b(str);
        if (this.f44457b != null && this.f44457b.isUnsubscribed() == null) {
            this.f44457b.unsubscribe();
        }
        if (b == 0) {
            m53702a(c, TimeUnit.MINUTES);
            this.f44457b = this.f44456a.m51557a(c).a(new C133221(this));
            return;
        }
        m53702a(b, TimeUnit.HOURS);
    }

    /* renamed from: a */
    private void m53702a(long j, @NonNull TimeUnit timeUnit) {
        if (timeUnit.equals(TimeUnit.HOURS)) {
            setText(String.format(this.mHoursAgo, new Object[]{Long.toString(j)}));
        } else if (timeUnit.equals(TimeUnit.MINUTES) != null) {
            setText(String.format(this.mMinutesAgo, new Object[]{Long.toString(j)}));
        }
    }

    public void incrementMinutes(int i) {
        if (i == 60) {
            m53702a(1, TimeUnit.HOURS);
        } else {
            m53702a((long) i, TimeUnit.MINUTES);
        }
    }
}
