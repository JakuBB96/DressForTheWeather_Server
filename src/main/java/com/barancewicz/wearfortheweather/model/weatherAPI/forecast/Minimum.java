package com.barancewicz.wearfortheweather.model.weatherAPI.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Minimum{
    @JsonProperty("Value")
    private Integer value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private Integer unitType;
}
