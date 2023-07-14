package io.vega.api.streamsheculeapi.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class LiveStreamTest {

    @Test
    void create_new_mutable_live_stream(){
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("REST APIs with Spring Boot");
        stream.setDescription("""
                API programming is a fun backend schedule to get things done
                In a way that makes sure all of your applications can talk to each other.
                """);
        stream.setUrl("https://www.twitch.tv/danvega");
        stream.setStartDate(LocalDateTime.of(2023, 7, 11, 0, 0));
        stream.setEndDate(LocalDateTime.of(2023, 7, 12, 0, 0));

        assertNotNull(stream);
        assertEquals("REST APIs with Spring Boot", stream.getTitle());

    }

    @Test
    void create_new_immutable_live_stream(){
        ImmutableLiveStream stream =
        new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "REST APIs with Spring Boot",
                """
                        API programming is a fun backend schedule to get things done
                        In a way that makes sure all of your applications can talk to each other.
                        """,
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2023, 7, 11, 0, 0),
                LocalDateTime.of(2023, 7, 12, 0, 0)

        );

            assertNotNull(stream);
                assertEquals("REST APIs with Spring Boot", stream.getTitle());

    }

    @Test
    void create_new_record_live_stream(){
        LiveStream stream =
                new LiveStream(
                        UUID.randomUUID().toString(),
                        "REST APIs with Spring Boot",
                        """
                                API programming is a fun backend schedule to get things done
                                In a way that makes sure all of your applications can talk to each other.
                                """,
                        "https://www.twitch.tv/danvega",
                        LocalDateTime.of(2023, 7, 11, 0, 0),
                        LocalDateTime.of(2023, 7, 12, 0, 0)

                );

        assertNotNull(stream);
        assertEquals("REST APIs with Spring Boot", stream.title());
        assertTrue(stream.getClass().isRecord());
        assertEquals(6, stream.getClass().getRecordComponents().length);

    }
}

