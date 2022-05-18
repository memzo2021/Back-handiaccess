package co.simplon.p25.handiaccess.services;

import co.simplon.p25.handiaccess.entities.Station;

public interface StationService {

    /*
     * Station listId(int id);
     * 
     * Station add(Station s);
     * 
     * Station edit(Station s);
     * 
     * Station delete(Long id);
     */

    Station getById(Long id);

}
