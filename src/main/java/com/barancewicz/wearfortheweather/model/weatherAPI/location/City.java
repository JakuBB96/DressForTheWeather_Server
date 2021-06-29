package com.barancewicz.wearfortheweather.model.weatherAPI.location;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.TimeZone;
@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

    @JsonProperty("Version")
    public int version;
    @JsonProperty("Key")
    public String key;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("LocalizedName")
    public String localizedName;
    @JsonProperty("EnglishName")
    public String englishName;
    @JsonProperty("PrimaryPostalCode")
    public String primaryPostalCode;
    @JsonProperty("Region")
    public Region region;
    @JsonProperty("Country")
    public Country country;
    @JsonProperty("AdministrativeArea")
    public AdministrativeArea administrativeArea;
    @JsonProperty("GeoPosition")
    public GeoPosition geoPosition;
    @JsonProperty("SupplementalAdminAreas")
    public List<SupplementalAdminArea> supplementalAdminAreas;

}
