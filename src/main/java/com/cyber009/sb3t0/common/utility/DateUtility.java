package com.cyber009.sb3t0.common.utility;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtility {
    public static final String DATE_TIME_PATTERN = String.valueOf(DateTimeFormatter.ISO_DATE_TIME);

    public static LocalDateTime getDateTimeUTC() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        return utc.toLocalDateTime();
    }
}
