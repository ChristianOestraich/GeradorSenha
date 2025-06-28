package projeto.geradorsenhas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Getter
@AllArgsConstructor
public class Password
{
    private String value;

    public String getValue()
    {
        return value;
    }
}
