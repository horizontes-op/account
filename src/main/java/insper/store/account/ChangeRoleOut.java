package insper.store.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ChangeRoleOut(
    String id,
    String name,
    String role
) {
    
}
