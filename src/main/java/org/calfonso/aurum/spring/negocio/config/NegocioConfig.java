/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio.config;

import org.calfonso.aurum.spring.negocio.MarcadorNegocioComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author cesar
 */
@Configuration
@ComponentScan(basePackageClasses = MarcadorNegocioComponentScan.class) 
public class NegocioConfig {
    
}
