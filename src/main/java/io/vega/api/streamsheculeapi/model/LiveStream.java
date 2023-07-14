package io.vega.api.streamsheculeapi.model;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record LiveStream(
                        String id,
                        @NotEmpty
                        String title,
                         String description,
                         String url,
                         LocalDateTime startDate,
                         LocalDateTime endDate) {

}
