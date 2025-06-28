package projeto.geradorsenhas.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class PasswordGeneratorService
{
    public String generateSecurePassword( int length )
    {
        return RandomStringUtils.random( length, 33, 122, true, true );
    }
}
