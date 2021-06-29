package com.barancewicz.wearfortheweather.model.weatherAPI.location;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoPosition {
    @JsonProperty("Latitude")
    public double latitude;
    @JsonProperty("Longitude")
    public double longitude;

}
