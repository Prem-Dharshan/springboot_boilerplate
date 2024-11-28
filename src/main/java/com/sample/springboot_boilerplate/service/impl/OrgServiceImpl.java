package com.sample.springboot_boilerplate.service.impl;

import com.sample.springboot_boilerplate.Db.OrgHandler;
import com.sample.springboot_boilerplate.dto.OrgDto;
import com.sample.springboot_boilerplate.service.OrgService;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl implements OrgService {

    private final OrgHandler orgHandler;

    public OrgServiceImpl(OrgHandler orgHandler) {
        this.orgHandler = orgHandler;
    }

    @Override
    public List<OrgDto> listOrgs() {
        List<Object[]> orgs = orgHandler.listAllOrgs();

        return orgs.stream()
                .map(org -> new OrgDto(
                        (int) org[0], // Assuming first element is name/id
                        (String) org[1], (String) org[2]))
                .collect(java.util.stream.Collectors.toList());
    }
}
