/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aj.as.security.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

/**
 *
 * @author ajilal
 */
public class AuthClient implements ClientDetails{
    @Override
    public String getClientId() {
        return "client_id";
    }

    @Override
    public Set<String> getResourceIds() {
        return null;
    }

    @Override
    public boolean isSecretRequired() {
        return true;
    }

    @Override
    public String getClientSecret() {
        return "client";
    }

    @Override
    public boolean isScoped() {
        return false;
    }

    @Override
    public Set<String> getScope() {
        return null;
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        HashSet<String> types = new HashSet<>();
        types.add("password");
        types.add("authorization_code");
        types.add("refresh_token");
        return types;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        HashSet<String> uris = new HashSet<>();
        uris.add("http://localhost:8080");
        return uris;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        HashSet<GrantedAuthority> authority = new HashSet<>();
        authority.add(new SimpleGrantedAuthority("ADMIN"));
        return authority;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return 600;
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return 6000;
    }

    @Override
    public boolean isAutoApprove(String string) {
        return true;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        HashMap<String, Object> addData = new HashMap();
        addData.put("organisationId", 10);
        return addData;
    }
    
}
