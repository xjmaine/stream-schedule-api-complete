package io.vega.api.streamsheculeapi.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MutableLiveStream {
    private String id;
    private String title;
    private String description;
    private String url;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

//    public MutableLiveStream(){
//
//    }
}
