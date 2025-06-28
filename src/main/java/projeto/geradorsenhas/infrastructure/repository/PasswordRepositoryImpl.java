package projeto.geradorsenhas.infrastructure.repository;

import projeto.geradorsenhas.domain.repository.PasswordRepository;

public class PasswordRepositoryImpl implements PasswordRepository
{
    @Override
    public void save( String password )
    {
        System.out.println( "Password saved: " + password );
    }
}
