package com.daffodil.bd.DamoSecurity.registration;


import com.daffodil.bd.DamoSecurity.appuser.AppUser;
import com.daffodil.bd.DamoSecurity.appuser.AppUserRole;
import com.daffodil.bd.DamoSecurity.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private  EmailValidator emailValidator;
    private  AppUserService appUserService;

    public String register(RegistrationRequest request) {
        boolean isValidEmail= emailValidator.
                test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("Email not valid");
        }
        return appUserService.singUpUser(
                new AppUser(request.getFastName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER)

        );

    }
}
