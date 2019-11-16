package com.netflix.netflixuser.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 16/11/2019 13:37
 */
@Builder
@Getter
@ToString
public class HelpRequestDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String departament;



}
