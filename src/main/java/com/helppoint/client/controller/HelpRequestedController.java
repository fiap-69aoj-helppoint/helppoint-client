package com.helppoint.client.controller;

import com.helppoint.client.dto.HelpRequestDto;
import com.helppoint.client.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:45
 */
@RestController
@RequestMapping("/")
public class HelpRequestedController {

    @Autowired
    private HelpService helpService;

    @PostMapping(value = "help")
    public ResponseEntity<HttpStatus> helpRequested(@Valid @RequestBody final HelpRequestDto helpRequestDto) {
        helpService.help(helpRequestDto.getDepartament());
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
