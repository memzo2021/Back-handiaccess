package co.simplon.p25.handiaccess.services;

import java.util.List;

import co.simplon.p25.handiaccess.dtos.LineIdentity;

public interface LineService {

    List<LineIdentity> getIdentities();

}
