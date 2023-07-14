package io.vega.api.streamsheculeapi.repository;

import io.vega.api.streamsheculeapi.model.LiveStream;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "REST APIs with Spring Boot",
                """
                API programming is a fun backend schedule to get things done
                In a way that makes sure all of your applications can talk to each other.
                """,
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2023, 7, 11, 0, 0),
                LocalDateTime.of(2023, 7, 12, 0, 0)
        ));
    }

    public List<LiveStream> findAll(){
        return streams;
    }

    public LiveStream findById(String id){
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse(null);
    }
public LiveStream create(LiveStream stream){
        streams.add(stream);
        return stream;
}
    public void update(LiveStream stream, String id){
        LiveStream existing = streams.stream().filter(s->s.id().equals(id))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Stream not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }

    public void delete(String id){
        streams.removeIf(stream -> stream.id().equals(id));
    }
}
