package org.example.ELDemo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Value("注入")
    private String another;

    public void setAnother(String another) {
        this.another = another;
    }

    public String getAnother() {
        return another;
    }
}
