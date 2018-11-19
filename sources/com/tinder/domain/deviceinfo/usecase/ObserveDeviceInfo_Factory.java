package com.tinder.domain.deviceinfo.usecase;

import com.tinder.domain.common.repository.DeviceInfoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveDeviceInfo_Factory implements Factory<ObserveDeviceInfo> {
    private final Provider<DeviceInfoRepository> deviceInfoRepositoryProvider;

    public ObserveDeviceInfo_Factory(Provider<DeviceInfoRepository> provider) {
        this.deviceInfoRepositoryProvider = provider;
    }

    public ObserveDeviceInfo get() {
        return provideInstance(this.deviceInfoRepositoryProvider);
    }

    public static ObserveDeviceInfo provideInstance(Provider<DeviceInfoRepository> provider) {
        return new ObserveDeviceInfo((DeviceInfoRepository) provider.get());
    }

    public static ObserveDeviceInfo_Factory create(Provider<DeviceInfoRepository> provider) {
        return new ObserveDeviceInfo_Factory(provider);
    }

    public static ObserveDeviceInfo newObserveDeviceInfo(DeviceInfoRepository deviceInfoRepository) {
        return new ObserveDeviceInfo(deviceInfoRepository);
    }
}
