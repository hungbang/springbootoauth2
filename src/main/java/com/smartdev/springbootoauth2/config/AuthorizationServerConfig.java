package com.smartdev.springbootoauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.Arrays;

@Configuration
@EnableAuthorizationServer
@EnableResourceServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Value("${authorization.clientid.value}")
    private String clientId;
    @Value("${authorization.grant.type}")
    private String grantType;
    @Value("${authorization.scope.read}")
    private String scopeRead;
    @Value("${authorization.scope.write}")
    private String scopeWrite;
    @Value("${authorization.resources.ids}")
    private String resourcesIds;
    @Value("${security.signkey.value}")
    private String signingKey;

    @Autowired
    private JwtAccessTokenConverter accessTokenConverter;
    @Autowired
    private TokenStore tokenStore;
    @Autowired
    private AuthenticationManager autheticationManager;


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(clientId)
                .secret(signingKey)
                .authorizedGrantTypes(grantType)
                .scopes(scopeRead, scopeWrite)
                .resourceIds(resourcesIds);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(accessTokenConverter));
        endpoints.tokenStore(tokenStore)
                .accessTokenConverter(accessTokenConverter)
                .tokenEnhancer(tokenEnhancerChain)
                .authenticationManager(autheticationManager);
    }
}
