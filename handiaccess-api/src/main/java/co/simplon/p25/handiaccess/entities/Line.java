package co.simplon.p25.handiaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lines")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "landing_door")
    boolean landing_door;

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

    public boolean isLanding_door() {
	return landing_door;
    }

    public void setLanding_door(boolean landing_door) {
	this.landing_door = landing_door;
    }

    @Override
    public String toString() {
	return String.format("{id=%s,number=%s,landing_door=%s}", id, number, landing_door);
    }

}
