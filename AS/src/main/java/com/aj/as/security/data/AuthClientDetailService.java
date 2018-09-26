/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aj.as.security.data;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

/**
 *
 * @author ajilal
 */
@Component
public class AuthClientDetailService implements ClientDetailsService{

    @Override
    public ClientDetails loadClientByClientId(String string) throws ClientRegistrationException {
        if("Ajilal".equals(string)){
            return new AuthClient();
        }
        throw new ClientRegistrationException("Client not registered");
    }
    
}
