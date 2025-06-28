package projeto.geradorsenhas.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PasswordGeneratedEvent
{
    private String password;
}
