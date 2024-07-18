import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.support.TypeBasedParameterResolver;

public class ExtensionProvidedTypeParameterResolver extends TypeBasedParameterResolver<ExtensionProvidedType> {
    @Override
    public ExtensionProvidedType resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new ExtensionProvidedType();
    }
}
