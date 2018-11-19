package com.tinder.recs.data;

import com.tinder.recs.data.CarouselViewImageDownloaderImpl.DownloadRequestManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CarouselViewImageDownloaderImpl_Factory implements Factory<CarouselViewImageDownloaderImpl> {
    private final Provider<DownloadRequestManager> downloadRequestManagerProvider;
    private final Provider<int[]> downloadStatusProvider;
    private final Provider<Integer> maxTargetCountProvider;

    public CarouselViewImageDownloaderImpl_Factory(Provider<DownloadRequestManager> provider, Provider<Integer> provider2, Provider<int[]> provider3) {
        this.downloadRequestManagerProvider = provider;
        this.maxTargetCountProvider = provider2;
        this.downloadStatusProvider = provider3;
    }

    public CarouselViewImageDownloaderImpl get() {
        return provideInstance(this.downloadRequestManagerProvider, this.maxTargetCountProvider, this.downloadStatusProvider);
    }

    public static CarouselViewImageDownloaderImpl provideInstance(Provider<DownloadRequestManager> provider, Provider<Integer> provider2, Provider<int[]> provider3) {
        return new CarouselViewImageDownloaderImpl((DownloadRequestManager) provider.get(), ((Integer) provider2.get()).intValue(), (int[]) provider3.get());
    }

    public static CarouselViewImageDownloaderImpl_Factory create(Provider<DownloadRequestManager> provider, Provider<Integer> provider2, Provider<int[]> provider3) {
        return new CarouselViewImageDownloaderImpl_Factory(provider, provider2, provider3);
    }

    public static CarouselViewImageDownloaderImpl newCarouselViewImageDownloaderImpl(DownloadRequestManager downloadRequestManager, int i, int[] iArr) {
        return new CarouselViewImageDownloaderImpl(downloadRequestManager, i, iArr);
    }
}
