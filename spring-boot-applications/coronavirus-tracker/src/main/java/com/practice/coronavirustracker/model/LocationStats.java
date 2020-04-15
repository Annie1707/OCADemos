package com.practice.coronavirustracker.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int DiffFromPrevDay;
}
