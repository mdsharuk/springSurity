package com.daffodil.bd.DamoSecurity.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String fastName;
    private final String lastName;
    private final String email;
    private final String password ;
}
