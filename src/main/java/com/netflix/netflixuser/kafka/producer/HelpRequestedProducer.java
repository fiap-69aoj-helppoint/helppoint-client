package com.netflix.netflixuser.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 10/11/2019 14:47
 */
@Service
public class HelpRequestedProducer {

    private static final Logger logger = LoggerFactory.getLogger(HelpRequestedProducer.class);
    private static final String TOPIC = "female_clothing_department";

    @Autowired
    private KafkaTemplate<String, String> helpRequestedKafkaTemplate;

    public void sendMessage(String departament) {
        logger.info(String.format("Producing %s, departament: %s", TOPIC, departament));
        this.helpRequestedKafkaTemplate.send(TOPIC, departament);
    }

}
