package com.barancewicz.wearfortheweather.model.weatherAPI.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Country{
    @JsonProperty("ID")
    public String iD;
    @JsonProperty("LocalizedName")
    public String localizedName;
    @JsonProperty("EnglishName")
    public String englishName;
}
