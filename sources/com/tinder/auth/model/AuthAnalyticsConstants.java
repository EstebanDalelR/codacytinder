package com.tinder.auth.model;

public class AuthAnalyticsConstants {

    public static class Value {

        public enum AuthFrom {
            LOGIN_BUTTON(1),
            COLD_START(2),
            REAUTH(3),
            FOREGROUND_NO_TOKEN(4);
            
            private final int value;

            private AuthFrom(int i) {
                this.value = i;
            }

            public int getValue() {
                return this.value;
            }
        }

        public enum LocationPermissionType {
            UNDETERMINED(0),
            IN_USE(1),
            ALWAYS(2),
            NEVER(4);
            
            private final int value;

            private LocationPermissionType(int i) {
                this.value = i;
            }

            public int getValue() {
                return this.value;
            }
        }
    }
}
