package co.simplon.p25.handiaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    boolean lift;

    @Column(name = "escalator")
    boolean escalator;

    @Column(name = "call terminal")
    boolean call_terminal;

    @ManyToOne
    @JoinColumn(name = "ligne_id")
    private Line ligne;

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

    public boolean isCall_terminal() {
	return call_terminal;
    }

    public void setCall_terminal(boolean call_terminal) {
	this.call_terminal = call_terminal;
    }

    public Line getLigne() {
	return ligne;
    }

    public void setLigne(Line ligne) {
	this.ligne = ligne;
    }

    @Override
    public String toString() {
	return String.format("{id=%s,name=%s,lift=%s,escalator=%s,call_terminal=%s}", id, lift, escalator,
		call_terminal);
    }

}
