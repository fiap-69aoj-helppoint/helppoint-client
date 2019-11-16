package com.helppoint.client.service;

import com.helppoint.client.kafka.producer.HelpRequestedProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:46
 */
@Service
public class HelpService {

    @Autowired
    private HelpRequestedProducer helpRequestedProducer;

    public void help(final String departament) {
        helpRequestedProducer.sendMessage(departament);
    }

}
