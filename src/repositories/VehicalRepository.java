package repositories;

import model.Vehical;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicalRepository {
    private Map<String, Vehical> vehicalRepo = new HashMap<>();
    public Optional<Vehical> findVehicalByNumber(String vehicalNo){
        if(vehicalRepo.containsKey(vehicalNo)){
            return Optional.of(vehicalRepo.get(vehicalNo));
        }else {
            return Optional.empty();
        }
    }


    public void save(Vehical vehical){
        vehicalRepo.put(vehical.getVehicalNo(),vehical);
    }

}