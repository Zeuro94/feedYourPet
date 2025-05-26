package com.example.feedyourpet.exceptions;

import java.time.ZonedDateTime;
import java.util.List;

public record ApiError(
        String message,
        int statusCode,
        ZonedDateTime zonedDateTime,
        List<String> errors
) {

}
