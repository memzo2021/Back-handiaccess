package co.simplon.p25.handiaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stations")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lift")
    private boolean lift;

    @Column(name = "escalator")
    private boolean escalator;

    @Column(name = "call_terminal")
    private boolean callTerminal;

    public Station() {

    }

    public Long getId() {
	return id;
    }

    public boolean isLift() {
	return lift;
    }

    public void setLift(boolean lift) {
	this.lift = lift;
    }

    public boolean isEscalator() {
	return escalator;
    }

    public void setEscalator(boolean escalator) {
	this.escalator = escalator;
    }

    public boolean isCallTerminal() {
	return callTerminal;
    }

    public void setCallTerminal(boolean callTerminal) {
	this.callTerminal = callTerminal;
    }

    @Override
    public String toString() {
	return String.format("{id=%s,name=%s,lift=%s,escalator=%s,callTerminal=%s}", id, lift, escalator, callTerminal);
    }

}
