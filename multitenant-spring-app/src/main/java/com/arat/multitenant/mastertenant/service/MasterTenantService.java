package com.arat.multitenant.mastertenant.service;

import com.arat.multitenant.mastertenant.entity.MasterTenant;

/**
 * @author arat
 */
public interface MasterTenantService {

    MasterTenant findByClientId(Integer clientId);
}
