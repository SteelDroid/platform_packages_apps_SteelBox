package com.steel.steelbox;

public final class Constants {

    private Constants() {
        // private constructor so nobody can instantiate this class
    }

    /*
     * Strings for max_events
     */
    public static final String MAX_EVENTS_PREF = "pref_max_events";
    public static final String MAX_EVENTS_PROP = "windowsmgr.max_events_per_sec";
    public static final String MAX_EVENTS_PERSIST_PROP = "persist.max_events";
    public static final String MAX_EVENTS_DEFAULT = System.getProperty(MAX_EVENTS_PROP);
}
