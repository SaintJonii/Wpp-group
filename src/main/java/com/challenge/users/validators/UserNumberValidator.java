package com.challenge.users.validators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class UserNumberValidator {

    private static Logger logger = LoggerFactory.getLogger(UserNumberValidator.class);

     public static void validate(String number){
        if(StringUtils.hasText(number)){
            String msj = String.format( "The number: %s is invalid", number);
            logger.info(msj);
            throw new RuntimeException(msj);
        }
    }

}
