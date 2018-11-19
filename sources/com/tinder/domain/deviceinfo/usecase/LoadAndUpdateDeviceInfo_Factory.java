package com.tinder.domain.deviceinfo.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.repository.DeviceInfoRepository;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

public final class LoadAndUpdateDeviceInfo_Factory implements Factory<LoadAndUpdateDeviceInfo> {
    private final Provider<DeviceInfoRepository> deviceInfoRepositoryProvider;
    private final Provider<C15679f> ioSchedulerProvider;
    private final Provider<Logger> loggerProvider;

    public LoadAndUpdateDeviceInfo_Factory(Provider<DeviceInfoRepository> provider, Provider<C15679f> provider2, Provider<Logger> provider3) {
        this.deviceInfoRepositoryProvider = provider;
        this.ioSchedulerProvider = provider2;
        this.loggerProvider = provider3;
    }

    public LoadAndUpdateDeviceInfo get() {
        return provideInstance(this.deviceInfoRepositoryProvider, this.ioSchedulerProvider, this.loggerProvider);
    }

    public static LoadAndUpdateDeviceInfo provideInstance(Provider<DeviceInfoRepository> provider, Provider<C15679f> provider2, Provider<Logger> provider3) {
        return new LoadAndUpdateDeviceInfo((DeviceInfoRepository) provider.get(), (C15679f) provider2.get(), (Logger) provider3.get());
    }

    public static LoadAndUpdateDeviceInfo_Factory create(Provider<DeviceInfoRepository> provider, Provider<C15679f> provider2, Provider<Logger> provider3) {
        return new LoadAndUpdateDeviceInfo_Factory(provider, provider2, provider3);
    }

    public static LoadAndUpdateDeviceInfo newLoadAndUpdateDeviceInfo(DeviceInfoRepository deviceInfoRepository, C15679f c15679f, Logger logger) {
        return new LoadAndUpdateDeviceInfo(deviceInfoRepository, c15679f, logger);
    }
}
