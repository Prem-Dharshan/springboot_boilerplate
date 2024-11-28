package com.sample.springboot_boilerplate.service;

import com.sample.springboot_boilerplate.dto.OrgDto;
import java.util.List;

public interface OrgService {
    List<OrgDto> listOrgs();
}
