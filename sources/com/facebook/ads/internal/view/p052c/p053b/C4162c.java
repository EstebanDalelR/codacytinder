package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.widget.TextView;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.view.c.b.c */
public class C4162c extends C3361o {
    /* renamed from: a */
    private final TextView f13298a;
    /* renamed from: b */
    private final String f13299b;
    /* renamed from: c */
    private final C1429s<C3341n> f13300c = new C33521(this);

    /* renamed from: com.facebook.ads.internal.view.c.b.c$1 */
    class C33521 extends C1429s<C3341n> {
        /* renamed from: a */
        final /* synthetic */ C4162c f10161a;

        C33521(C4162c c4162c) {
            this.f10161a = c4162c;
        }

        /* renamed from: a */
        public Class<C3341n> mo1725a() {
            return C3341n.class;
        }

        /* renamed from: a */
        public void m12883a(C3341n c3341n) {
            if (this.f10161a.getVideoView() != null) {
                this.f10161a.f13298a.setText(this.f10161a.m16515a((long) (this.f10161a.getVideoView().getDuration() - this.f10161a.getVideoView().getCurrentPosition())));
            }
        }
    }

    public C4162c(Context context, String str) {
        super(context);
        this.f13298a = new TextView(context);
        this.f13299b = str;
        addView(this.f13298a);
    }

    /* renamed from: a */
    private String m16515a(long j) {
        if (j <= 0) {
            return "00:00";
        }
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes(j);
        j = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        if (this.f13299b.isEmpty()) {
            return String.format("%02d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(j)});
        }
        return this.f13299b.replace("{{REMAINING_TIME}}", String.format("%02d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(j)}));
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4996a(this.f13300c);
        }
    }

    /* renamed from: b */
    protected void mo3340b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4998b(this.f13300c);
        }
        super.mo3340b();
    }

    public void setCountdownTextColor(int i) {
        this.f13298a.setTextColor(i);
    }
}
