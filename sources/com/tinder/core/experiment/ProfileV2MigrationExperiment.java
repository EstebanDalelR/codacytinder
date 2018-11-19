package com.tinder.core.experiment;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0002J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/core/experiment/ProfileV2MigrationExperiment;", "", "map", "", "Lcom/tinder/core/experiment/ProfileV2MigrationExperiment$Experiment;", "", "(Ljava/util/Map;)V", "component1", "copy", "equals", "other", "get", "experiment", "hashCode", "", "toString", "", "Experiment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileV2MigrationExperiment {
    /* renamed from: a */
    private final Map<Experiment, Boolean> f30361a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/core/experiment/ProfileV2MigrationExperiment$Experiment;", "", "(Ljava/lang/String;I)V", "GENDER", "SPOTIFY", "INSTAGRAM", "DISCOVERY", "PHOTOS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Experiment {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileV2MigrationExperiment) {
                if (C2668g.a(this.f30361a, ((ProfileV2MigrationExperiment) obj).f30361a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map map = this.f30361a;
        return map != null ? map.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileV2MigrationExperiment(map=");
        stringBuilder.append(this.f30361a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProfileV2MigrationExperiment(@NotNull Map<Experiment, Boolean> map) {
        C2668g.b(map, "map");
        this.f30361a = map;
    }

    /* renamed from: a */
    public final boolean m36631a(@NotNull Experiment experiment) {
        C2668g.b(experiment, "experiment");
        Boolean bool = (Boolean) this.f30361a.get(experiment);
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't find ");
        stringBuilder.append(experiment);
        stringBuilder.append(" in the map. ");
        stringBuilder.append("Did you forget to add the experiment without adding it to AbTestUtility?");
        throw new NullPointerException(stringBuilder.toString());
    }
}
