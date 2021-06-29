package com.barancewicz.wearfortheweather.model.weatherAPI.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature{
    @JsonProperty("Minimum")
    private Minimum minimum;
    @JsonProperty("Maximum")
    private Maximum maximum;
}
