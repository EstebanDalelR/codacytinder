package com.tinder.data.p210b;

import com.tinder.common.logger.Logger;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/data/common/LoggerDataModule;", "", "()V", "provideLogger", "Lcom/tinder/common/logger/Logger;", "provideLogger$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.b.d */
public final class C8620d {
    @NotNull
    @Provides
    /* renamed from: a */
    public final Logger m36766a() {
        return C10749f.f35145a;
    }
}
