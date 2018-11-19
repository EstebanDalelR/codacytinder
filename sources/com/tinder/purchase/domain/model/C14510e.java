package com.tinder.purchase.domain.model;

import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.model.C16223a.C16220a;
import com.tinder.purchase.domain.model.C16225b.C16224a;
import io.reactivex.annotations.NonNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.purchase.domain.model.e */
public abstract class C14510e {

    /* renamed from: com.tinder.purchase.domain.model.e$a */
    public static abstract class C14507a {
        /* renamed from: a */
        public abstract C14507a mo11827a(@Nullable TimeInterval timeInterval);

        /* renamed from: a */
        public abstract C14507a mo11828a(@NonNull ProductType productType);

        /* renamed from: a */
        public abstract C14507a mo11829a(@NonNull PurchaseType purchaseType);

        /* renamed from: a */
        public abstract C14507a mo11830a(@Nullable C14509b c14509b);

        /* renamed from: a */
        public abstract C14507a mo11831a(@NonNull C14514j c14514j);

        /* renamed from: a */
        public abstract C14507a mo11832a(@Nullable Integer num);

        /* renamed from: a */
        public abstract C14507a mo11833a(@NonNull String str);

        /* renamed from: a */
        public abstract C14507a mo11834a(boolean z);

        /* renamed from: a */
        public abstract C14510e mo11835a();

        /* renamed from: b */
        public abstract C14507a mo11836b(@NonNull C14514j c14514j);

        /* renamed from: b */
        public abstract C14507a mo11837b(@NonNull Integer num);

        /* renamed from: b */
        public abstract C14507a mo11838b(boolean z);
    }

    /* renamed from: com.tinder.purchase.domain.model.e$b */
    public static abstract class C14509b {

        /* renamed from: com.tinder.purchase.domain.model.e$b$a */
        public static abstract class C14508a {
            /* renamed from: a */
            public abstract C14508a mo11850a(@NonNull C14514j c14514j);

            /* renamed from: a */
            public abstract C14508a mo11851a(@NonNull Integer num);

            /* renamed from: a */
            public abstract C14508a mo11852a(@Nullable Long l);

            /* renamed from: a */
            public abstract C14508a mo11853a(@NonNull String str);

            /* renamed from: a */
            public abstract C14508a mo11854a(boolean z);

            /* renamed from: a */
            public abstract C14509b mo11855a();

            /* renamed from: b */
            public abstract C14508a mo11856b(@NonNull C14514j c14514j);

            /* renamed from: b */
            public abstract C14508a mo11857b(@Nullable Long l);

            /* renamed from: b */
            public abstract C14508a mo11858b(@Nullable String str);

            /* renamed from: c */
            public abstract C14508a mo11859c(@Nullable String str);
        }

        @NonNull
        /* renamed from: a */
        public abstract String mo11860a();

        @NonNull
        /* renamed from: b */
        public abstract Integer mo11861b();

        @NonNull
        /* renamed from: c */
        public abstract C14514j mo11862c();

        @NonNull
        /* renamed from: d */
        public abstract C14514j mo11863d();

        @Nullable
        /* renamed from: e */
        public abstract String mo11864e();

        @Nullable
        /* renamed from: f */
        public abstract String mo11865f();

        @Nullable
        /* renamed from: g */
        public abstract Long mo11866g();

        @Nullable
        /* renamed from: h */
        public abstract Long mo11867h();

        /* renamed from: i */
        public abstract boolean mo11868i();

        /* renamed from: j */
        public static C14508a m55402j() {
            return new C16224a();
        }

        /* renamed from: a */
        public static C14508a m55401a(@NonNull C14509b c14509b) {
            return new C16224a(c14509b);
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract String mo11839a();

    @NonNull
    /* renamed from: b */
    public abstract ProductType mo11840b();

    @NonNull
    /* renamed from: c */
    public abstract PurchaseType mo11841c();

    @NonNull
    /* renamed from: d */
    public abstract C14514j mo11842d();

    @Nullable
    /* renamed from: e */
    public abstract TimeInterval mo11843e();

    @Nullable
    /* renamed from: f */
    public abstract Integer mo11844f();

    @Nullable
    /* renamed from: g */
    public abstract C14509b mo11845g();

    /* renamed from: h */
    public abstract boolean mo11846h();

    /* renamed from: i */
    public abstract boolean mo11847i();

    @NonNull
    /* renamed from: j */
    public abstract C14514j mo11848j();

    @NonNull
    /* renamed from: k */
    public abstract Integer mo11849k();

    /* renamed from: l */
    public static C14507a m55413l() {
        return new C16220a();
    }

    /* renamed from: a */
    public static C14507a m55412a(@NonNull C14510e c14510e) {
        return new C16220a(c14510e);
    }
}
