package com.example;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class GlobalUtilities {

    @Autowired  
    private MessageSource messageSource;

    public String getLocalizedError(String key){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(key, null,"",locale);
    }
}
