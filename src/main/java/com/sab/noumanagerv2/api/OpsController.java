package com.sab.noumanagerv2.api;

import com.sab.noumanagerv2.entities.CatOperation;
import com.sab.noumanagerv2.entities.Operation;
import com.sab.noumanagerv2.service.OperationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/ops")
public class OpsController {
    @Autowired
    OperationService oService;

    @PostMapping(value = "/cat")
    public CatOperation saveCatOperation(@RequestBody CatOperation e) {
        // TODO: process POST request
        return oService.saveCatOperation(e);
    }
    @PostMapping(value = "")
    public Operation saveOperation(@RequestBody Operation e) {
        // TODO: process POST request
        return oService.saveOperation(e);
    }
}
