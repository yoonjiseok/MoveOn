package com.example.moveon.web.dto.PixelDTO.naverapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Area {

    private String name;

}