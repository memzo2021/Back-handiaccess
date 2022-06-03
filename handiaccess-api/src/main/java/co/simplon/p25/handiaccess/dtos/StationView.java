package co.simplon.p25.handiaccess.dtos;

public interface StationView {

    public Long getId();

    public boolean isLift();

    public boolean isEscalator();

    public String getName();

    public boolean isCallTerminal();

    public int getLineNumber();

    public boolean isLineLandingDoor();

}
