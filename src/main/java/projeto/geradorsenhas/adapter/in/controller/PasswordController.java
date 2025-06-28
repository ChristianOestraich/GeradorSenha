package projeto.geradorsenhas.adapter.in.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projeto.geradorsenhas.application.dto.PasswordDto;
import projeto.geradorsenhas.service.PasswordGeneratorService;

@RestController
public class PasswordController
{
    private final PasswordGeneratorService passwordGeneratorService;

    public PasswordController( PasswordGeneratorService passwordGeneratorService )
    {
        this.passwordGeneratorService = passwordGeneratorService;
    }

    @Operation(
            summary = "Gerar senha segura",
            description = "Gera uma senha segura com o tamanho especificado. O valor padrão é 12 caracteres."
    )
    @GetMapping( "/gerar-senha" )
    public PasswordDto generatePassword
    (
            @Parameter( description = "Tamanho da senha (padrão = 12)" )
            @RequestParam( defaultValue = "12" ) int length
    )
    {
        String password = passwordGeneratorService.generateSecurePassword( length );
        return new PasswordDto( password );
    }
}
