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
public class AdministrativeArea{
    @JsonProperty("LocalizedName")
    public String localizedName;
    @JsonProperty("EnglishName")
    public String englishName;
    @JsonProperty("LocalizedType")
    public String localizedType;
    @JsonProperty("EnglishType")
    public String englishType;
    @JsonProperty("CountryID")
    public String countryID;
}
