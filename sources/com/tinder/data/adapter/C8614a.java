package com.tinder.data.adapter;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u0013R\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/adapter/AdapterModule;", "", "()V", "JOB_SCHOOL_ADAPTER_DEFAULT_NOT_SHOWN_FUNC", "Lkotlin/Function0;", "", "getJOB_SCHOOL_ADAPTER_DEFAULT_NOT_SHOWN_FUNC", "()Lkotlin/jvm/functions/Function0;", "JOB_SCHOOL_ADAPTER_DEFAULT_SHOWN_FUNC", "getJOB_SCHOOL_ADAPTER_DEFAULT_SHOWN_FUNC", "provideDefaultNotShownJobDomainAdapter", "Lcom/tinder/data/adapter/JobDomainApiAdapter;", "provideDefaultNotShownJobDomainAdapter$data_release", "provideDefaultNotShownSchoolDomainAdapter", "Lcom/tinder/data/adapter/SchoolDomainApiAdapter;", "provideDefaultNotShownSchoolDomainAdapter$data_release", "provideDefaultShownJobDomainAdapter", "provideDefaultShownJobDomainAdapter$data_release", "provideDefaultShownSchoolDomainAdapter", "provideDefaultShownSchoolDomainAdapter$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.adapter.a */
public final class C8614a {
    /* renamed from: a */
    public static final C8614a f30472a = new C8614a();

    private C8614a() {
    }

    @DisplayedByDefault
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final C3925u m36756a() {
        C8614a c8614a = f30472a;
        return new C3925u(AdapterModule$JOB_SCHOOL_ADAPTER_DEFAULT_SHOWN_FUNC$1.f43792a);
    }

    @JvmStatic
    @NotNull
    @NotDisplayedByDefault
    @Provides
    /* renamed from: b */
    public static final C3925u m36757b() {
        C8614a c8614a = f30472a;
        return new C3925u(AdapterModule$JOB_SCHOOL_ADAPTER_DEFAULT_NOT_SHOWN_FUNC$1.f43791a);
    }

    @DisplayedByDefault
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: c */
    public static final aj m36758c() {
        C8614a c8614a = f30472a;
        return new aj(AdapterModule$JOB_SCHOOL_ADAPTER_DEFAULT_SHOWN_FUNC$1.f43792a);
    }

    @JvmStatic
    @NotNull
    @NotDisplayedByDefault
    @Provides
    /* renamed from: d */
    public static final aj m36759d() {
        C8614a c8614a = f30472a;
        return new aj(AdapterModule$JOB_SCHOOL_ADAPTER_DEFAULT_NOT_SHOWN_FUNC$1.f43791a);
    }
}
