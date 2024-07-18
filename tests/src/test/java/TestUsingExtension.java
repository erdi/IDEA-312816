import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUsingExtension {

    private ExtensionProvidedType extensionProvidedTypeInstance;

    @BeforeEach
    void setup(ExtensionProvidedType extensionProvidedTypeInstance) {
        this.extensionProvidedTypeInstance = extensionProvidedTypeInstance;
    }

    @Test
    void test() {
        assertThat(extensionProvidedTypeInstance).isNotNull();
    }
}
