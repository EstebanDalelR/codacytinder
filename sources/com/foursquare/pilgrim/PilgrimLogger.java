package com.foursquare.pilgrim;

import com.foursquare.api.FoursquareLocation;

interface PilgrimLogger {
    /* renamed from: a */
    public static final PilgrimLogger f5244a = new C35061();

    public interface PilgrimLogEntry {
        public static final PilgrimLogEntry DEFAULT = new C35071();

        /* renamed from: com.foursquare.pilgrim.PilgrimLogger$PilgrimLogEntry$1 */
        class C35071 implements PilgrimLogEntry {
            public void addNote(String str) {
            }

            public FoursquareLocation getLocation() {
                return null;
            }

            public String getMotion() {
                return null;
            }

            public String getTrigger() {
                return null;
            }

            public void setBatteryLevel(int i) {
            }

            public void setDidPingServer(boolean z) {
            }

            public void setLocationInfo(FoursquareLocation foursquareLocation) {
            }

            public void setMotionStatus(String str, double d, String str2, String str3) {
            }

            C35071() {
            }
        }

        void addNote(String str);

        FoursquareLocation getLocation();

        String getMotion();

        String getTrigger();

        void setBatteryLevel(int i);

        void setDidPingServer(boolean z);

        void setLocationInfo(FoursquareLocation foursquareLocation);

        void setMotionStatus(String str, double d, String str2, String str3);
    }

    /* renamed from: com.foursquare.pilgrim.PilgrimLogger$1 */
    class C35061 implements PilgrimLogger {
        C35061() {
        }

        /* renamed from: a */
        public PilgrimLogEntry mo2018a() {
            return PilgrimLogEntry.DEFAULT;
        }
    }

    /* renamed from: a */
    PilgrimLogEntry mo2018a();
}
