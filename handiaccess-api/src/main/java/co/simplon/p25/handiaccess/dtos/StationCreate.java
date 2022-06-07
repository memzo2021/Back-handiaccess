package co.simplon.p25.handiaccess.dtos;

public class StationCreate {
    private String name;
    private boolean lift;
    private boolean escalator;
    private boolean callTerminal;
    private Long lineId;

    public StationCreate() {
	super();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
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

    public Long getLineId() {
	return lineId;
    }

    public void setLineId(Long lineId) {
	this.lineId = lineId;
    }

}
