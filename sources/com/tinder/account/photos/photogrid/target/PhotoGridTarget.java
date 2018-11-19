package com.tinder.account.photos.photogrid.target;

import com.tinder.account.photos.photogrid.C2626d;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/account/photos/photogrid/target/PhotoGridTarget;", "", "showExternalReadPermissionDenied", "", "showExternalReadPermissionGranted", "showLoadingPhotosError", "showPhotoUploadError", "showPhotos", "photos", "", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "showSmartPhotoSettingsSaveError", "showSmartPhotosDisabled", "showSmartPhotosEnabled", "account_release"}, k = 1, mv = {1, 1, 10})
public interface PhotoGridTarget {
    void showExternalReadPermissionDenied();

    void showExternalReadPermissionGranted();

    void showLoadingPhotosError();

    void showPhotoUploadError();

    void showPhotos(@NotNull List<? extends C2626d> list);

    void showSmartPhotoSettingsSaveError();

    void showSmartPhotosDisabled();

    void showSmartPhotosEnabled();
}
