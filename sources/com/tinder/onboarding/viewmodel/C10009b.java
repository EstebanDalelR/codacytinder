package com.tinder.onboarding.viewmodel;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.tinder.utils.ag;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import org.joda.time.LocalDate;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.onboarding.viewmodel.b */
public class C10009b {
    @NonNull
    /* renamed from: a */
    private Map<DateField, ag<Integer>> f32868a;

    /* renamed from: com.tinder.onboarding.viewmodel.b$a */
    private static class C10007a {
        @NonNull
        /* renamed from: a */
        private final Map<DateField, ag<Integer>> f32867a;

        private C10007a() {
            this.f32867a = new LinkedHashMap();
        }

        /* renamed from: a */
        C10007a m41013a(int i, int i2) {
            this.f32867a.put(DateField.YEAR, new ag(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }

        /* renamed from: b */
        C10007a m41015b(int i, int i2) {
            this.f32867a.put(DateField.MONTH, new ag(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }

        /* renamed from: c */
        C10007a m41016c(int i, int i2) {
            this.f32867a.put(DateField.DAY_OF_MONTH, new ag(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }

        @SuppressLint({"DefaultLocale"})
        /* renamed from: a */
        Optional<C10009b> m41014a() {
            if (this.f32867a.size() == 3) {
                return Optional.a(new C10009b());
            }
            C0001a.e("A DateFormat contains %d dateFields", new Object[]{Integer.valueOf(3)});
            return Optional.a();
        }
    }

    /* renamed from: com.tinder.onboarding.viewmodel.b$b */
    public static class C10008b {
        /* renamed from: a */
        public C10009b m41020a() {
            C10007a c10007a = new C10007a();
            m41017a(c10007a);
            m41018b(c10007a);
            m41019c(c10007a);
            return (C10009b) c10007a.m41014a().b();
        }

        /* renamed from: b */
        public Optional<C10009b> m41021b() {
            String[] split = ((SimpleDateFormat) SimpleDateFormat.getDateInstance(3)).toLocalizedPattern().split("/");
            if (split.length != 3) {
                return Optional.a();
            }
            C10007a c10007a = new C10007a();
            for (Object obj : split) {
                if (TextUtils.isEmpty(obj)) {
                    return Optional.a();
                }
                char charAt = obj.charAt(0);
                if (charAt == 'M') {
                    m41017a(c10007a);
                } else if (charAt == 'd') {
                    m41018b(c10007a);
                } else if (charAt == 'y') {
                    m41019c(c10007a);
                }
            }
            return c10007a.m41014a();
        }

        /* renamed from: a */
        private C10007a m41017a(C10007a c10007a) {
            return c10007a.m41015b(1, 12);
        }

        /* renamed from: b */
        private C10007a m41018b(C10007a c10007a) {
            return c10007a.m41016c(1, 31);
        }

        /* renamed from: c */
        private C10007a m41019c(C10007a c10007a) {
            return c10007a.m41013a(LocalDate.a().c(100).d(), LocalDate.a().c(2).d());
        }
    }

    private C10009b(C10007a c10007a) {
        this.f32868a = c10007a.f32867a;
    }

    /* renamed from: a */
    public List<DateField> m41023a() {
        return new ArrayList(this.f32868a.keySet());
    }

    /* renamed from: a */
    public ag<Integer> m41022a(DateField dateField) {
        return (ag) this.f32868a.get(dateField);
    }
}
