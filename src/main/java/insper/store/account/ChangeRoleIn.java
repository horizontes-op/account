package insper.store.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ChangeRoleIn(
    String role
) {
    
}
