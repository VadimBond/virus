package com.bvv.virus.models;

public class Location {

  private String state;
  private String country;
  private int latestTotalCases;

  @Override
  public String toString() {
    return "Location{" +
      "state='" + state + '\'' +
      ", country='" + country + '\'' +
      ", latestTotalCases=" + latestTotalCases +
      '}';
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getLatestTotalCases() {
    return latestTotalCases;
  }

  public void setLatestTotalCases(int latestTotalCases) {
    this.latestTotalCases = latestTotalCases;
  }
}
