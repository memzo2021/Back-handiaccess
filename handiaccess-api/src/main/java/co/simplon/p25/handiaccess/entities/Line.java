package co.simplon.p25.handiaccess.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lines")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "landingDoor")
    private boolean landingDoor;

    @ManyToMany
    @JoinTable(name = "lines_stations", joinColumns = @JoinColumn(name = "line_id"), inverseJoinColumns = @JoinColumn(name = "station_id"))
    private List<Station> stations;

    public Line() {
    }

    public Long getId() {
	return id;
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

    public boolean isLandingDoor() {
	return landingDoor;
    }

    public void setLanding_door(boolean landingDoor) {
	this.landingDoor = landingDoor;
    }

    @Override
    public String toString() {
	return String.format("{id=%s,number=%s,landingDoor=%s}", id, number, landingDoor);
    }

}
