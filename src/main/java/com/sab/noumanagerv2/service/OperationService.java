package com.sab.noumanagerv2.service;

import com.sab.noumanagerv2.entities.AppUser;
import com.sab.noumanagerv2.entities.CatOperation;
import com.sab.noumanagerv2.entities.Operation;
import com.sab.noumanagerv2.entities.OverView;

public interface OperationService {
    Operation saveOperation(Operation ops);
    OverView getOverView(int month,int year, AppUser appUser);
    CatOperation saveCatOperation(CatOperation catOperation);

    
}
