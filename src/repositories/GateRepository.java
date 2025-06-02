package repositories;

import enums.GateStatus;
import model.Gate;
import model.Operator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateRepo = new HashMap<>();

    public GateRepository(){
        Gate gate = new Gate(2L, new Operator("Ravi"), GateStatus.OPEN);
        gateRepo.put(gate.getGateNo(), gate);
    }

    public Optional<Gate> findByGateId(Long Id){
        if(gateRepo.containsKey(Id)){
            return Optional.of(gateRepo.get(Id));
        }else {
            return Optional.empty();
        }
    }



}
