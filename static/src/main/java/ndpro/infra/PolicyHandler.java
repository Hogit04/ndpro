package ndpro.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ndpro.config.kafka.KafkaProcessor;
import ndpro.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    StaticRepository staticRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PetRegistered'"
    )
    public void wheneverPetRegistered_AddStatic(
        @Payload PetRegistered petRegistered
    ) {
        PetRegistered event = petRegistered;
        System.out.println(
            "\n\n##### listener AddStatic : " + petRegistered + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PetModified'"
    )
    public void wheneverPetModified_AddStatic(
        @Payload PetModified petModified
    ) {
        PetModified event = petModified;
        System.out.println(
            "\n\n##### listener AddStatic : " + petModified + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PetDeleted'"
    )
    public void wheneverPetDeleted_AddStatic(@Payload PetDeleted petDeleted) {
        PetDeleted event = petDeleted;
        System.out.println(
            "\n\n##### listener AddStatic : " + petDeleted + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FeedRegistered'"
    )
    public void wheneverFeedRegistered_AddStatic(
        @Payload FeedRegistered feedRegistered
    ) {
        FeedRegistered event = feedRegistered;
        System.out.println(
            "\n\n##### listener AddStatic : " + feedRegistered + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FeedModified'"
    )
    public void wheneverFeedModified_AddStatic(
        @Payload FeedModified feedModified
    ) {
        FeedModified event = feedModified;
        System.out.println(
            "\n\n##### listener AddStatic : " + feedModified + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FeedDeleted'"
    )
    public void wheneverFeedDeleted_AddStatic(
        @Payload FeedDeleted feedDeleted
    ) {
        FeedDeleted event = feedDeleted;
        System.out.println(
            "\n\n##### listener AddStatic : " + feedDeleted + "\n\n"
        );

        // Sample Logic //
        Static.addStatic(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
