package com.tinder.places.settings.target;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.places.viewmodel.C14353d;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000eH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000eH&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000eH&JF\u0010\u001f\u001a\u00020\u00032<\u0010 \u001a8\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00030!H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H&¨\u0006-"}, d2 = {"Lcom/tinder/places/settings/target/PlacesSettingsTarget;", "", "add", "", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "closeTelemetryDialog", "enterEditPlacesUi", "exitEditPlacesUi", "openBrowserWindow", "url", "", "openMapboxTelemetryDialog", "telemetryEnabled", "", "remove", "id", "setDeleteButtonEnabled", "visible", "setDeleteButtonVisibility", "setEditButtonVisibility", "setFeatureSwitchChecked", "enabled", "setFeatureToggleEnabled", "setFemaleGenderPreference", "setMaleGenderPreference", "setNeutralGenderPreference", "setPlacesListEditable", "editable", "setPlacesListExpanded", "expanded", "showDeletePlacesDialog", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "confirmed", "", "placeIds", "showDisableConfirmationDialog", "showDisabledUI", "showEnabledUI", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesSettingsTarget {
    void add(@NotNull C14353d c14353d);

    void closeTelemetryDialog();

    void enterEditPlacesUi();

    void exitEditPlacesUi();

    void openBrowserWindow(@NotNull String str);

    void openMapboxTelemetryDialog(boolean z);

    void remove(@NotNull String str);

    void setDeleteButtonEnabled(boolean z);

    void setDeleteButtonVisibility(boolean z);

    void setEditButtonVisibility(boolean z);

    void setFeatureSwitchChecked(boolean z);

    void setFeatureToggleEnabled(boolean z);

    void setFemaleGenderPreference();

    void setMaleGenderPreference();

    void setNeutralGenderPreference();

    void setPlacesListEditable(boolean z);

    void setPlacesListExpanded(boolean z);

    void showDeletePlacesDialog(@NotNull Function2<? super Boolean, ? super List<String>, C15813i> function2);

    void showDisableConfirmationDialog();

    void showDisabledUI();

    void showEnabledUI();

    void showErrorDialog(@NotNull PlacesApiException placesApiException);
}
