package org.softwire.training.models;

import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "locations")
public class Location {

    private int locationId;
    private String siteName;
    private String location;
    private String timeZone;
    private Float latitude;
    private Float longitude;
    private Integer regionId; // Nullable

    @Id
    @Column(name = "location_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Column(name = "latitude")
    public Float getLatitude() { return latitude; }

    public void setLatitude(Float latitude) { this.latitude = latitude; }

    @Column(name = "longitude")
    public Float getLongitude() { return longitude; }

    public void setLongitude(Float longitude) { this.longitude = longitude; }

    @Column(name = "site_name", length = 20, nullable = false)
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Column(name = "location", length = 100, nullable = false)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "time_zone", length = 30, nullable = false)
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Column(name = "region_id")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}
