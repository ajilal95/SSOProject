/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aj.as.security.data;

import org.springframework.security.core.token.Token;
import org.springframework.security.core.token.TokenService;

/**
 *
 * @author ajilal
 */
public class AuthTokenService implements TokenService{

    @Override
    public Token allocateToken(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Token verifyToken(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
