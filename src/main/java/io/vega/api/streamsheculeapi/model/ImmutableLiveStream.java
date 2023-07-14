package io.vega.api.streamsheculeapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

//@EqualsAndHashCode(callSuper = true)
//@Data
public record ImmutableLiveStream(String id, String title, String description, String url, LocalDateTime startDate,
                                  LocalDateTime endDate) {
    public String getTitle() {
        return title;
    }
}
