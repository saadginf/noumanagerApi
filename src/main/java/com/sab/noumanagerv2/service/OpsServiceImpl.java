package com.sab.noumanagerv2.service;

import java.time.LocalDate;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.sab.noumanagerv2.dao.CatDepenseDao;
import com.sab.noumanagerv2.dao.OpsRepo;
import com.sab.noumanagerv2.entities.AppUser;
import com.sab.noumanagerv2.entities.CatOperation;
import com.sab.noumanagerv2.entities.Operation;
import com.sab.noumanagerv2.entities.OverView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class OpsServiceImpl implements OperationService {
    @Autowired
    OpsRepo opsRepo;
    @Autowired
    CatDepenseDao catDepenseDao;
    
    @Override
    public Operation saveOperation(Operation ops) {
        // TODO Auto-generated method stub
        return opsRepo.save(ops);
    }

    

    @Override
    public CatOperation saveCatOperation(CatOperation catOperation) {
        // TODO Auto-generated method stub
        return saveCatOperation(catOperation);
    }



    @Override
    public OverView getOverView(int month, int year, AppUser appUser) {
        // TODO Auto-generated method stub

        LocalDate initial = LocalDate.of(year, month, 1);
        LocalDate startLocal = initial.withDayOfMonth(1);
        LocalDate endLocal = initial.withDayOfMonth(initial.lengthOfMonth());
        
        Date startDate = convertToDateViaInstant(startLocal);
        Date enDate = convertToDateViaInstant(endLocal);

        System.out.println(startDate);
        System.out.println(enDate);

        List<Operation> ops =opsRepo.findByDateBetween(startDate, enDate);

       
        double spent = 0;
        double income = 0;

        for (Operation operation : ops) {
            if (operation.isIsDepense()) {
                spent = spent + operation.getValue();
            }else {
                income = income + operation.getValue();
            }
            
        }
        double toSpend=income - spent;
        OverView oView= new OverView();
        oView.setIncome(income);
        oView.setSpent(spent);
        oView.setToSpend(toSpend);
        oView.setOperations(ops);
        return oView;
    }
    public Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
          .atZone(ZoneId.systemDefault())
          .toInstant());
    }
    
}
