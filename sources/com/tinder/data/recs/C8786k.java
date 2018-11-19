package com.tinder.data.recs;

import com.tinder.domain.recs.model.ContextualInfo;
import com.tinder.domain.recs.model.ContextualInfo.Default.Empty;
import com.tinder.domain.recs.model.ContextualInfo.Default.ExpectedError;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import com.tinder.domain.recs.model.Rec;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u001f\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults;", "", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo;", "(Ljava/util/List;Lcom/tinder/domain/recs/model/ContextualInfo;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo;", "getRecs", "()Ljava/util/List;", "isKnownEmptyResult", "", "isValid", "ExpectedErrorResponse", "NoMoreRecs", "RecsFromCache", "RecsFromNetwork", "RecsFromNetworkDupesOnly", "UnexpectedError", "UnknownLocation", "Lcom/tinder/data/recs/RecsFetchResults$RecsFromCache;", "Lcom/tinder/data/recs/RecsFetchResults$RecsFromNetwork;", "Lcom/tinder/data/recs/RecsFetchResults$NoMoreRecs;", "Lcom/tinder/data/recs/RecsFetchResults$UnknownLocation;", "Lcom/tinder/data/recs/RecsFetchResults$ExpectedErrorResponse;", "Lcom/tinder/data/recs/RecsFetchResults$UnexpectedError;", "Lcom/tinder/data/recs/RecsFetchResults$RecsFromNetworkDupesOnly;", "engine_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.data.recs.k */
public abstract class C8786k {
    @NotNull
    /* renamed from: a */
    private final List<Rec> f30850a;
    @NotNull
    /* renamed from: b */
    private final ContextualInfo f30851b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$ExpectedErrorResponse;", "Lcom/tinder/data/recs/RecsFetchResults;", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;", "(Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$a */
    public static final class C10993a extends C8786k {
        @NotNull
        /* renamed from: a */
        private final ExpectedError f35727a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10993a) {
                    if (C2668g.a(mo9895c(), ((C10993a) obj).mo9895c())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ExpectedError c = mo9895c();
            return c != null ? c.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ExpectedErrorResponse(contextualInfo=");
            stringBuilder.append(mo9895c());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: c */
        public ExpectedError mo9895c() {
            return this.f35727a;
        }

        public C10993a(@NotNull ExpectedError expectedError) {
            C2668g.b(expectedError, "contextualInfo");
            super(C19301m.a(), expectedError);
            this.f35727a = expectedError;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$NoMoreRecs;", "Lcom/tinder/data/recs/RecsFetchResults;", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "(Ljava/util/List;)V", "getRecs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$b */
    public static final class C10994b extends C8786k {
        @NotNull
        /* renamed from: a */
        private final List<Rec> f35728a;

        public C10994b() {
            this(null, 1, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10994b) {
                    if (C2668g.a(mo9896b(), ((C10994b) obj).mo9896b())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List b = mo9896b();
            return b != null ? b.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NoMoreRecs(recs=");
            stringBuilder.append(mo9896b());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10994b(@NotNull List<? extends Rec> list) {
            C2668g.b(list, "recs");
            super(list, null, 2, null);
            this.f35728a = list;
        }

        public /* synthetic */ C10994b(List list, int i, C15823e c15823e) {
            if ((i & 1) != 0) {
                list = C19301m.a();
            }
            this(list);
        }

        @NotNull
        /* renamed from: b */
        public List<Rec> mo9896b() {
            return this.f35728a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$RecsFromCache;", "Lcom/tinder/data/recs/RecsFetchResults;", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "(Ljava/util/List;)V", "getRecs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$c */
    public static final class C10995c extends C8786k {
        @NotNull
        /* renamed from: a */
        private final List<Rec> f35729a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10995c) {
                    if (C2668g.a(mo9896b(), ((C10995c) obj).mo9896b())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List b = mo9896b();
            return b != null ? b.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsFromCache(recs=");
            stringBuilder.append(mo9896b());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10995c(@NotNull List<? extends Rec> list) {
            C2668g.b(list, "recs");
            super(list, null, 2, null);
            this.f35729a = list;
        }

        @NotNull
        /* renamed from: b */
        public List<Rec> mo9896b() {
            return this.f35729a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$RecsFromNetwork;", "Lcom/tinder/data/recs/RecsFetchResults;", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "(Ljava/util/List;)V", "getRecs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$d */
    public static final class C10996d extends C8786k {
        @NotNull
        /* renamed from: a */
        private final List<Rec> f35730a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10996d) {
                    if (C2668g.a(mo9896b(), ((C10996d) obj).mo9896b())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List b = mo9896b();
            return b != null ? b.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsFromNetwork(recs=");
            stringBuilder.append(mo9896b());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10996d(@NotNull List<? extends Rec> list) {
            C2668g.b(list, "recs");
            super(list, null, 2, null);
            this.f35730a = list;
        }

        @NotNull
        /* renamed from: b */
        public List<Rec> mo9896b() {
            return this.f35730a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$RecsFromNetworkDupesOnly;", "Lcom/tinder/data/recs/RecsFetchResults;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$e */
    public static final class C10997e extends C8786k {
        /* renamed from: a */
        public static final C10997e f35731a = new C10997e();

        private C10997e() {
            super(C19301m.a(), null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$UnexpectedError;", "Lcom/tinder/data/recs/RecsFetchResults;", "contextualInfo", "Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;", "(Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;)V", "getContextualInfo", "()Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$f */
    public static final class C10998f extends C8786k {
        @NotNull
        /* renamed from: a */
        private final UnexpectedError f35732a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10998f) {
                    if (C2668g.a(mo9895c(), ((C10998f) obj).mo9895c())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            UnexpectedError c = mo9895c();
            return c != null ? c.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UnexpectedError(contextualInfo=");
            stringBuilder.append(mo9895c());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @NotNull
        /* renamed from: c */
        public UnexpectedError mo9895c() {
            return this.f35732a;
        }

        public C10998f(@NotNull UnexpectedError unexpectedError) {
            C2668g.b(unexpectedError, "contextualInfo");
            super(C19301m.a(), unexpectedError);
            this.f35732a = unexpectedError;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/data/recs/RecsFetchResults$UnknownLocation;", "Lcom/tinder/data/recs/RecsFetchResults;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.k$g */
    public static final class C10999g extends C8786k {
        /* renamed from: a */
        public static final C10999g f35733a = new C10999g();

        private C10999g() {
            super(C19301m.a(), null, 2, null);
        }
    }

    private C8786k(List<? extends Rec> list, ContextualInfo contextualInfo) {
        this.f30850a = list;
        this.f30851b = contextualInfo;
    }

    @NotNull
    /* renamed from: b */
    public List<Rec> mo9896b() {
        return this.f30850a;
    }

    /* synthetic */ C8786k(List list, ContextualInfo contextualInfo, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            contextualInfo = Empty.INSTANCE;
        }
        this(list, contextualInfo);
    }

    /* renamed from: a */
    public final boolean m37394a() {
        if ((mo9896b().isEmpty() ^ 1) == 0) {
            return mo9895c();
        } else {
            return true;
        }
    }

    /* renamed from: c */
    private final boolean mo9895c() {
        return ((this instanceof C10995c) || (this instanceof C10996d) || (this instanceof C10998f)) ? false : true;
    }
}
